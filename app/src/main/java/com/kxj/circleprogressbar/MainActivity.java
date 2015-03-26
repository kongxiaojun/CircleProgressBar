package com.kxj.circleprogressbar;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;


public class MainActivity extends ActionBarActivity {


    private CircleProgressBar circleProgressBar;

    private Handler mHandler;

    int progress = 1;

    int max = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        circleProgressBar = (CircleProgressBar) findViewById(R.id.circleProgressBar);
//        circleProgressBar.setRadius(100);
        circleProgressBar.setMax(max);

        mHandler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                switch (msg.what) {
                    case 1:
                        if (progress <= max) {
                            circleProgressBar.setProgress(progress++);
                            mHandler.sendEmptyMessageDelayed(1, 1000);
                        }
                        break;
                }
            }
        };

        mHandler.sendEmptyMessage(1);
    }

}
