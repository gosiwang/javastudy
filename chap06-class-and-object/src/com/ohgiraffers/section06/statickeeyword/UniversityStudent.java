package com.ohgiraffers.section06.statickeeyword;

public class UniversityStudent {
    private int personalLockerCount;
    public static int sharedLockerCount;
    private static int sharedLockerCound;;

    public int getPersonalLockerCount() {
        return this.personalLockerCount;
    }
    public int getSharedLockerCount() {
        return  UniversityStudent.sharedLockerCount;
    }

    public void increasePersonallLockerCount() {
        this.sharedLockerCount++;
    }
    public void increaseSharedLockerCount() {
        UniversityStudent.sharedLockerCount++;
    }
}
