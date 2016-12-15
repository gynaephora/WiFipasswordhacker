package com.apps.mustango.wifipasswordhack;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.mikhaellopez.circularprogressbar.CircularProgressBar;

import java.util.Hashtable;

/**
 * Created by mustango on 08.12.2016.
 */

public class LoaderActivity extends AppCompatActivity {

    Hashtable connectFlags;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loader_activity);

       // TextView text_loader=(TextView) findViewById(R.id.text_loader);


        CircularProgressBar circularProgressBar = (CircularProgressBar)findViewById(R.id.yourCircularProgressbar);
        circularProgressBar.setColor(ContextCompat.getColor(this, R.color.progressBarColor));
        circularProgressBar.setBackgroundColor(ContextCompat.getColor(this, R.color.backgroundProgressBarColor));
        circularProgressBar.setProgressBarWidth(getResources().getDimension(R.dimen.progressBarWidth));
        circularProgressBar.setBackgroundProgressBarWidth(getResources().getDimension(R.dimen.backgroundProgressBarWidth));
        int animationDuration = 7000; // 2500ms = 2,5s
        circularProgressBar.setProgressWithAnimation(100, animationDuration); // Default duration = 1500ms
       // SystemClock.sleep(7000);
        onClick();
    }

    public void onClick() {
        AlertDialog.Builder builder = new AlertDialog.Builder(LoaderActivity.this);
        builder.setTitle("GET Wi-Fi PASSWORD")
                .setMessage("Please download one of sponsor’s app and you will get the password to WiFi network")
                .setCancelable(false)
                .setNegativeButton("ОК",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                dialog.cancel();
                                Intent i=new Intent(LoaderActivity.this,TapjoyEasyApp.class);
                                startActivity(i);
                              //  onClick2();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void onClick2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(LoaderActivity.this);
        builder.setTitle("Success")
                .setMessage("Thank you for completing the offer. You will be connected in 5 minutes")
                .setCancelable(false)
                .setNegativeButton("ОК",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
