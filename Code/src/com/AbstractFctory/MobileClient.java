package com.AbstractFctory;

public class MobileClient  {
    Iandroid androidPhone;
    Iios IosPhone;

    public MobileClient(Imobile facotry){
        androidPhone = facotry.GetAndroidPhone();
        IosPhone = facotry.GetIosPhone();

    }

    public Iandroid getAndroidPhone() {
        return androidPhone;
    }

    public String setAndroidPhone(Iandroid androidPhone) {
        return androidPhone.getModelDetails();
    }

    public String getIosPhone() {
        return IosPhone.getModelDetails();
    }

}
