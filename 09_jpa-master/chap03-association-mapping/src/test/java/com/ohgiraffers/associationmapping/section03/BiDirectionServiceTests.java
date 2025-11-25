package com.ohgiraffers.associationmapping.section03;

import com.ohgiraffers.associationmapping.section03.bidirection.BidirectionService;
import com.ohgiraffers.associationmapping.section03.bidirection.Category;
import com.ohgiraffers.associationmapping.section03.bidirection.Menu;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
public class BiDirectionServiceTests {

    @Autowired
    private BidirectionService bidirectionService;

    @DisplayName("양방향 연관관계 조회 - 메뉴에서 카테고리 조회")
    @Test
    void findMenuWithCategoryTest() {
        // given
        int menuCode = 10;

        // when
        Menu menu = bidirectionService.findMenu(menuCode);

        // then
        assertNotNull(menu);
        System.out.println("=== 메뉴 정보 ===");
        System.out.println("메뉴 코드: " + menu.getMenuCode());
        System.out.println("메뉴 이름: " + menu.getMenuName());
        System.out.println("메뉴 가격: " + menu.getMenuPrice());

        // 양방향: 메뉴 -> 카테고리
        assertNotNull(menu.getCategory());
        System.out.println("\n=== 카테고리 정보 (메뉴에서 접근) ===");
        System.out.println("카테고리 코드: " + menu.getCategory().getCategoryCode());
        System.out.println("카테고리 이름: " + menu.getCategory().getCategoryName());
    }

    @DisplayName("양방향 연관관계 조회 - 카테고리에서 메뉴 리스트 조회")
    @Test
    void findCategoryWithMenusTest() {
        // given
        int categoryCode = 4;

        // when
        Category category = bidirectionService.findCategory(categoryCode);

        // then
        assertNotNull(category);
        System.out.println("=== 카테고리 정보 ===");
        System.out.println("카테고리 코드: " + category.getCategoryCode());
        System.out.println("카테고리 이름: " + category.getCategoryName());

        // 양방향: 카테고리 -> 메뉴 리스트
        assertNotNull(category.getMenuList());
        System.out.println("\n=== 메뉴 리스트 (카테고리에서 접근) ===");
        System.out.println("메뉴 개수: " + category.getMenuList().size());

        category.getMenuList().forEach(menu -> {
            System.out.println("  - " + menu.getMenuName() +
                    " (" + menu.getMenuPrice() + "원)");
        });
    }

    @DisplayName("양방향 연관관계 - 메뉴 -> 카테고리 -> 메뉴 리스트 순환 참조")
    @Test
    void circularReferenceTest() {
        // given
        int menuCode = 10;

        // when
        Menu menu = bidirectionService.findMenu(menuCode);

        // then
        assertNotNull(menu);
        System.out.println("=== 1단계: 메뉴 조회 ===");
        System.out.println("메뉴: " + menu.getMenuName());

        // 메뉴 -> 카테고리
        Category category = menu.getCategory();
        assertNotNull(category);
        System.out.println("\n=== 2단계: 메뉴에서 카테고리 접근 ===");
        System.out.println("카테고리: " + category.getCategoryName());

        // 카테고리 -> 메뉴 리스트
        assertNotNull(category.getMenuList());
        System.out.println("\n=== 3단계: 카테고리에서 메뉴 리스트 접근 ===");
        System.out.println("해당 카테고리의 전체 메뉴 수: " + category.getMenuList().size());

        // 같은 카테고리의 다른 메뉴들 출력
        category.getMenuList().stream()
                .filter(m -> m.getMenuCode() != menuCode)
                .limit(3)
                .forEach(m -> System.out.println("  - " + m.getMenuName()));
    }

    @DisplayName("양방향 연관관계 - JOIN FETCH로 N+1 문제 해결")
    @Test
    void joinFetchTest() {
        // given
        int categoryCode = 4;

        // when
        Category category = bidirectionService.findCategoryWithMenus(categoryCode);

        // then
        assertNotNull(category);
        assertNotNull(category.getMenuList());

        System.out.println("=== JOIN FETCH 결과 ===");
        System.out.println("카테고리: " + category.getCategoryName());
        System.out.println("메뉴 수: " + category.getMenuList().size());

        // 추가 쿼리 없이 메뉴 정보 접근 가능
        category.getMenuList().forEach(menu -> {
            System.out.println("  - " + menu.getMenuName());
        });
    }

    @DisplayName("양방향 연관관계 - CASCADE 테스트")
    @Test
    void cascadeTest() {
        // given
        Category newCategory = new Category();
        newCategory.setCategoryCode(999);
        newCategory.setCategoryName("신규 카테고리");
        newCategory.setRefCategoryCode(null);

        Menu newMenu = new Menu();
        newMenu.setMenuCode(9999);
        newMenu.setMenuName("신규 메뉴");
        newMenu.setMenuPrice(15000);
        newMenu.setCategory(newCategory);  // 카테고리 연결
        newMenu.setOrderableStatus("Y");

        // when
        // CASCADE.PERSIST로 인해 메뉴 저장 시 카테고리도 함께 저장됨
        Menu savedMenu = bidirectionService.saveMenu(newMenu);

        // then
        assertNotNull(savedMenu);
        assertNotNull(savedMenu.getCategory());

        System.out.println("=== CASCADE 저장 결과 ===");
        System.out.println("저장된 메뉴: " + savedMenu.getMenuName());
        System.out.println("함께 저장된 카테고리: " + savedMenu.getCategory().getCategoryName());
    }

    @DisplayName("양방향 연관관계 - LAZY 로딩 테스트")
    @Test
    void lazyLoadingTest() {
        // given
        int menuCode = 10;

        // when
        Menu menu = bidirectionService.findMenu(menuCode);

        // then
        assertNotNull(menu);
        System.out.println("=== 메뉴 조회 완료 ===");
        System.out.println("메뉴: " + menu.getMenuName());

        // LAZY 로딩: 이 시점에 카테고리 조회 쿼리 실행됨
        System.out.println("\n=== 카테고리 접근 시점 ===");
        System.out.println("카테고리: " + menu.getCategory().getCategoryName());
    }

    @DisplayName("양방향 연관관계 - 특정 가격대 메뉴 필터링")
    @Test
    void filterMenusByPriceTest() {
        // given
        int categoryCode = 4;
        int minPrice = 10000;

        // when
        Category category = bidirectionService.findCategory(categoryCode);

        // then
        assertNotNull(category);
        assertNotNull(category.getMenuList());

        System.out.println("=== " + category.getCategoryName() + " 카테고리 ===");
        System.out.println(minPrice + "원 이상의 메뉴:");

        long count = category.getMenuList().stream()
                .filter(menu -> menu.getMenuPrice() >= minPrice)
                .peek(menu -> System.out.println("  - " + menu.getMenuName() +
                        ": " + menu.getMenuPrice() + "원"))
                .count();

        System.out.println("총 " + count + "개");
    }
}