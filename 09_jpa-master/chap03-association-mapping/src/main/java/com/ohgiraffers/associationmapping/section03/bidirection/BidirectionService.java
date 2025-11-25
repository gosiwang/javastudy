package com.ohgiraffers.associationmapping.section03.bidirection;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BidirectionService {

    private final BidirectionRepository bidirectionRepository;

    public BidirectionService(BidirectionRepository bidirectionRepository) {
        this.bidirectionRepository = bidirectionRepository;
    }

    // 메뉴 조회 (카테고리 정보 포함)
    @Transactional(readOnly = true)
    public Menu findMenu(int menuCode) {
        return bidirectionRepository.findMenuByMenuCode(menuCode);
    }

    // 카테고리 조회 (메뉴 리스트 포함)
    @Transactional(readOnly = true)
    public Category findCategory(int categoryCode) {
        return bidirectionRepository.findCategoryByCategoryCode(categoryCode);
    }

    // 메뉴와 카테고리 함께 조회
    @Transactional(readOnly = true)
    public Menu findMenuWithCategory(int menuCode) {
        return bidirectionRepository.findMenuWithCategory(menuCode);
    }

    // 카테고리와 메뉴 리스트 함께 조회
    @Transactional(readOnly = true)
    public Category findCategoryWithMenus(int categoryCode) {
        return bidirectionRepository.findCategoryWithMenus(categoryCode);
    }

    // 메뉴 저장 (cascade 테스트)
    @Transactional
    public Menu saveMenu(Menu menu) {
        return bidirectionRepository.saveMenu(menu);
    }

    // 카테고리 저장
    @Transactional
    public Category saveCategory(Category category) {
        return bidirectionRepository.saveCategory(category);
    }
}