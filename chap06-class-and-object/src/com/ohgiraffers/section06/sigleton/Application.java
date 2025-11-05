package com.ohgiraffers.section06.sigleton;

public class Application {
    public static void main(String[] args) {


        EagerSingletone eager1 = EagerSingletone.getInstance();
        EagerSingletone eager2 = EagerSingletone.getInstance();

        System.out.println(eager1.hashCode());
        System.out.println(eager2.hashCode());
        System.out.println(eager1==eager2);

        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();
    }
}
