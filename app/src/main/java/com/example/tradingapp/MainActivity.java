package com.example.tradingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public View emailid, password, forgotpass;
    public Button button;
    Animation topAnim,bottomAnim;
    TextView logo,slogan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        logo=findViewById(R.id.textView);
        slogan=findViewById(R.id.textView2);

        logo.setAnimation(bottomAnim);
        slogan.setAnimation(bottomAnim);

//        button = (Button) findViewById(R.id.signin);
//        button.setOnClickListener(new View.OnClickListener() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,login.class);
                startActivity(intent);
            }
        },3000);

//        @Override
//            public void onClick(View v) {
//                if(button!=null)
//                {
//                    Intent intent = new Intent(login.this, watchlist.class);
//                    startActivity(intent);
//                }
//                else{
//                    Toast.makeText(getApplicationContext(), "Please fill", Toast.LENGTH_SHORT).show();
//                }
//        });
    }
}