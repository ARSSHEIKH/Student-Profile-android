package com.example.profileproject1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.ProgressDialog;
import android.content.pm.SigningInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

//    private ProgressDialog progress;
    ProgressBar progressBar;
    Button btn_Signin;
    FragmentManager fm = getSupportFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_Signin = findViewById(R.id.btnSignin);
        progressBar = findViewById(R.id.progressBar);

        btn_Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fm.beginTransaction().replace(R.id.frameLay_Main, new AddProfile()).addToBackStack(null).commit();
//                Intent i = new Intent(this,NewActivity.class);
            }
        });
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {

                fm.beginTransaction().replace(R.id.frameLay_Main, new AddProfile()).addToBackStack(null).commit();

            }
        }, 5000);
    }













//    @Override
//    protected void onStart() {
//        super.onStart();
//        FragmentManager fm=getSupportFragmentManager();
//
//        final long totalProgressTime = 1000000000;
//        final Thread t = new Thread() {
//            @Override
//            public void run() {
//                int jumpTime = 0;
//
//                while(jumpTime < totalProgressTime) {
//                    try {
//                        sleep(2000000000);
//                        jumpTime += 1;
//                        progressBar.setProgress(jumpTime);
//                    } catch (InterruptedException e) {
//                        // TODO Auto-generated catch block
//                        e.printStackTrace();
//                    }
//                }
//            }
//        };
//        t.start();
//        fm.beginTransaction().replace(R.id.frameLay_Main, new AddProfile()).addToBackStack(null).commit();
//    }

}