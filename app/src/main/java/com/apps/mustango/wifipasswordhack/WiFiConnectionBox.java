package com.apps.mustango.wifipasswordhack;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mustango on 08.12.2016.
 */

public class WiFiConnectionBox extends BaseAdapter{

    Context mContext;
    LayoutInflater layoutInflater;
    ArrayList<WiFiConnection> mWiFiConnection;

    WiFiConnectionBox(Context context,ArrayList<WiFiConnection> connections){

        mContext=context;
        mWiFiConnection=connections;
        layoutInflater=(LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    //count of elements
    @Override
    public int getCount(){
        return mWiFiConnection.size();
    }

    //element by position
    @Override
    public Object getItem(int position){
        return mWiFiConnection.get(position);
    }

    //position id
    @Override
    public long getItemId(int position){
        return position;
    }

    //list item
    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View view=convertView;
        if (view==null){
            view=layoutInflater.inflate(R.layout.wifi_list_item,parent,false);
        }
        WiFiConnection wfc=new WiFiConnection();
        ((TextView) view.findViewById(R.id.connection_name)).setText(wfc.getWiFiName());
        ((TextView) view.findViewById(R.id.connection_key)).setText(wfc.getWiFiKey());
         if(wfc.getLevelSygnal()==1){
        ((ImageView) view.findViewById(R.id.imageView)).setImageResource(R.drawable.level1);
         }else
        ((ImageView) view.findViewById(R.id.imageView)).setImageResource(R.drawable.level2);
        return view;
    }
}
