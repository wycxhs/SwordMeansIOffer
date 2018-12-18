package com.wyc.sword.one;

/**
 * 避免了并发时导致的安全问题
 * 采用懒加载,节省了内存空间
 */
class Singleton {
    private Singleton(){}

    static class SingletonInnerClass{
        static Singleton instance = new Singleton();
    }

    Singleton getInstance(){
        return SingletonInnerClass.instance;
    }
}
