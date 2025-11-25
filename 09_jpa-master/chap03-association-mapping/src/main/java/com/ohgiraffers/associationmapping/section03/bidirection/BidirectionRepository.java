package com.ohgiraffers.associationmapping.section03.bidirection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class BidirectionRepository {

    @PersistenceContext
    private EntityManager entityManager;

    // 메뉴 코드로 메뉴 조회 (카테고리 포함)
    public Menu findMenuByMenuCode(int menuCode) {
        return entityManager.find(Menu.class, menuCode);
    }

    // 카테고리 코드로 카테고리 조회 (메뉴 리스트 포함)
    public Category findCategoryByCategoryCode(int categoryCode) {
        return entityManager.find(Category.class, categoryCode);
    }

    // 메뉴와 카테고리를 함께 조회 (JOIN FETCH)
    public Menu findMenuWithCategory(int menuCode) {
        String jpql = "SELECT m FROM bidirection_menu m " +
                "JOIN FETCH m.category " +
                "WHERE m.menuCode = :menuCode";

        return entityManager.createQuery(jpql, Menu.class)
                .setParameter("menuCode", menuCode)
                .getSingleResult();
    }

    // 카테고리와 메뉴 리스트를 함께 조회 (JOIN FETCH)
    public Category findCategoryWithMenus(int categoryCode) {
        String jpql = "SELECT c FROM bidirection_category c " +
                "LEFT JOIN FETCH c.menuList " +
                "WHERE c.categoryCode = :categoryCode";

        return entityManager.createQuery(jpql, Category.class)
                .setParameter("categoryCode", categoryCode)
                .getSingleResult();
    }

    // 메뉴와 카테고리 저장 (cascade 테스트용)
    public Menu saveMenu(Menu menu) {
        entityManager.persist(menu);
        return menu;
    }

    // 카테고리 저장
    public Category saveCategory(Category category) {
        entityManager.persist(category);
        return category;
    }
}