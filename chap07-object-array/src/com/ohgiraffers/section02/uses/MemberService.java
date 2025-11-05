package com.ohgiraffers.section02.uses;

import java.util.Scanner;

public class MemberService {

    private final Scanner sc = new Scanner(System.in);

    public void signUpMembers() {
        Member[] members = new Member[5];
        members[0] = new Member(1, "user01", "pass01", "홍길동", 20, '남');
        members[1] = new Member(2, "user02", "pass02", "유관순", 21, '여');
        members[2] = new Member(3, "user03", "pass03", "이순신", 30, '남');
        members[3] = new Member(4, "user04", "pass04", "신사임당", 45, '여');
        members[4] = new Member(5, "user05", "pass05", "윤봉길", 28, '남');

        if (MemberRepository.store(members)) {
            System.out.println("총 " + members.length + "명의 회원 등록을 성공했습니다.");
        } else {
            System.out.println("정원이 초과되어 등록에 실패했습니다.");
        }
    }

    public void showAllMembers() {
        Member[] allMembers = MemberRepository.findAllMembers();

        System.out.println("===== 전체 회원 목록 =====");
        for (Member member : allMembers) {
            if (member != null) {
                System.out.println(member.getInformation());
            }
        }
    }

    public void searchMembersById() {
        System.out.print("검색할 회원 아이디를 입력하세요: ");
        String inputId = sc.next();

        Member foundMember = MemberRepository.findMemberById(inputId);

        if (foundMember != null) {
            System.out.println("회원 정보를 찾았습니다:");
            System.out.println(foundMember.getInformation());
        } else {
            System.out.println("해당 아이디의 회원이 없습니다.");
        }
    }
}
