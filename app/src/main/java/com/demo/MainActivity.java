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
        public ListNode(int a){}
    }


    public void login_phone_bug(String s){
        Toast.makeText(this, "手机登录bug"+s, Toast.LENGTH_SHORT).show();
    }


    public void login_phone(){
        Toast.makeText(this, "手机登录", Toast.LENGTH_SHORT).show();
    }

    public void bugfix_login(){
        Toast.makeText(this, "修复手机登录bug", Toast.LENGTH_SHORT).show();
    }
}
