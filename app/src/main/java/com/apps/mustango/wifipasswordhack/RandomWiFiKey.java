package com.apps.mustango.wifipasswordhack;

import java.util.Random;

/**
 * Created by mustango on 08.12.2016.
 */

public class RandomWiFiKey {

    private String mWiFiKey;
    String[] typeWiFiKey={"WPA/WPA2 PSK","WEP","WPA-PSK WPA-EAP"};
    Random r=new Random();

    public RandomWiFiKey(){
           setmWiFiKey();
    }

    void setmWiFiKey(){
        int n=r.nextInt(3);
        mWiFiKey=typeWiFiKey[n];
    }

    String getmWiFiKey(){return mWiFiKey;}
}
