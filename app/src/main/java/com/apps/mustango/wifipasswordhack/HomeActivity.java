package com.apps.mustango.wifipasswordhack;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    ImageView imageViewHome;
    Button buttonStartNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        imageViewHome=(ImageView) findViewById(R.id.home_image);
       // imageViewHome.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.wifizone));
        imageViewHome.setImageResource(R.drawable.wifizone);

        buttonStartNow=(Button) findViewById(R.id.home_button);
        buttonStartNow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i=new Intent(HomeActivity.this,WiFiNetworks.class);
                startActivity(i);
            }
        });
    }
}
