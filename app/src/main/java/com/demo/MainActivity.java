package com.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public class ListNode{
        
    }


    public void login_phone(){
        Toast.makeText(this, "手机登录", Toast.LENGTH_SHORT).show();
    }
}
