package com.AbstractFctory;

import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
        Imobile samasung = new Samsung();

        MobileClient samsungClient = new MobileClient(samasung);
        System.out.println(samsungClient.getAndroidPhone());
        System.out.println(samsungClient.getIosPhone());

    }

}
