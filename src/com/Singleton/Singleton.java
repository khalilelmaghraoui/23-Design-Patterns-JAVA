package com.Singleton;

public class Singleton {
    private static Singleton instance = null;

    private Singleton()
    {
      //  instance = new Singleton();
    }

    public static Singleton getInstance()
    {
        if(instance==null)
            instance=new Singleton();
        return instance;
    }
}
