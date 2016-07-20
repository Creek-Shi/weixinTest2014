package com.example.shixiaochuan.weixintest2014;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button logginButton = (Button) findViewById(R.id.main_login_btn);
        //登录按钮监听
        logginButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent (LoginActivity.this,Login.class);
                startActivity(intent);
            }
        });
    }
}
