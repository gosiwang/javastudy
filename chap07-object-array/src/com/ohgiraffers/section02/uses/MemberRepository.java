package com.ohgiraffers.section02.uses;

public class MemberRepository {

    private final static Member[] members;
    private static int count;

    static {
        members = new Member[10];
        count = 0;
    }

    public static boolean store(Member[] newMembers) {
        if (count + newMembers.length > members.length) {
            return false; // 정원 초과
        }

        for (Member newMember : newMembers) {
            members[count++] = newMember;
        }
        return true;
    }

    public static Member[] findAllMembers() {
        return members;
    }

    public static Member findMemberById(String id) {
        for (Member member : members) {
            if (member != null && member.getId().equals(id)) {
                return member;
            }
        }
        return null;
    }
}
