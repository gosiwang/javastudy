package com.ohgiraffers.section06.statickeeyword;

public class CampusActivity {
    private int personalLockerCount;

    public void openPersonalLockerCount()
    {
        this.personalLockerCount++;
        System.out.println("개인 사물함을 열었습니다. 사용횟수: "+this.personalLockerCount);

    }
    public static void LibraryAnnouncement()
    {
        System.out.println();
    }

}
