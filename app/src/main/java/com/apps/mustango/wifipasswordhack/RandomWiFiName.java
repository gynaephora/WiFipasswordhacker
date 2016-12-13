package com.apps.mustango.wifipasswordhack;

import java.util.Random;

/**
 * Created by mustango on 08.12.2016.
 */

public class RandomWiFiName {

    private String mWiFiName;
    String[] typeWiFiKey={"0","1","2","3","4","5","6","7","8","9","a","b",
            "c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r",
            "s","t","u","v","w","x","y","z"};
    Random r=new Random();


    public RandomWiFiName(){
        setmWiFiName();
    }

    void setmWiFiName(){
        String wifiname=typeWiFiKey[r.nextInt(35)];
        int sum=r.nextInt(3)+5;
        for(int i=1;i<sum;i++){
            int n=r.nextInt(35);
            wifiname=wifiname+typeWiFiKey[n];
        }
        mWiFiName=wifiname;
    }

    String getmWiFiName(){
        return mWiFiName;
    }
}
