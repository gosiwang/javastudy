package com.ohgiraffers.section06.sigleton;

public class EagerSingletone {

    private static EagerSingletone eager = new EagerSingletone();

    private EagerSingletone() {}

    public static EagerSingletone getInstance() {
        return eager;
    }
}
