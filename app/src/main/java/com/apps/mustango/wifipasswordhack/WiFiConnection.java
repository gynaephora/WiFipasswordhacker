package com.apps.mustango.wifipasswordhack;

import java.util.Random;

/**
 * Created by mustango on 08.12.2016.
 */

public class WiFiConnection {

    private String mWiFiName;
    private String mWiFiKey;
    private int mLevelSygnal;

    RandomWiFiName rwn=new RandomWiFiName();
    RandomWiFiKey rwk=new RandomWiFiKey();
    Random rand=new Random();

    public WiFiConnection(){

        mWiFiName=rwn.getmWiFiName();
        mWiFiKey=rwk.getmWiFiKey();
        mLevelSygnal=rand.nextInt(2);
    }
    public String getWiFiName(){return mWiFiName;}
    public String getWiFiKey(){return mWiFiKey;}
    public int getLevelSygnal(){return mLevelSygnal;}



    void setWiFiName(String wifiname){mWiFiName=wifiname;}
    void setWiFiKey(String wifikey){mWiFiKey=wifikey;}
    void setLevelSygnal(int levelsygnal){mLevelSygnal=levelsygnal;}
}
