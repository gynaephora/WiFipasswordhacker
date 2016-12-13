package com.apps.mustango.wifipasswordhack;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by mustango on 08.12.2016.
 */

public class WiFiNetworks extends AppCompatActivity {

    ArrayList<WiFiConnection> connections=new ArrayList<WiFiConnection>();
    WiFiConnectionBox wiFiConnectionBoxAdapter;
    Random r=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wifinetworks);

        loadData();
        wiFiConnectionBoxAdapter=new WiFiConnectionBox(this,connections);

        ListView listView=(ListView) findViewById(R.id.listvMain);
        listView.setAdapter(wiFiConnectionBoxAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent i=new Intent(WiFiNetworks.this,LoaderActivity.class);
                startActivity(i);
            }
        });

    }

    void loadData(){

        WifiManager manager = (WifiManager) getSystemService(Context.WIFI_SERVICE);
        List<WifiConfiguration> list = manager.getConfiguredNetworks();
        if(list!=null){
            int n1=list.size();
            for(int i=0; i<n1;i++){
                WiFiConnection wf=new WiFiConnection();
                wf.setWiFiName("gg");
                Log.i("SSID",list.get(i).SSID);
             //   wf.setWiFiName("1256");
                connections.add(wf);
            }

        }else{
        int n=r.nextInt(7-2)+2;
        for(int i=0; i<n;i++){
            WiFiConnection wf=new WiFiConnection();
            connections.add(wf);
        }
        }
            }

}
