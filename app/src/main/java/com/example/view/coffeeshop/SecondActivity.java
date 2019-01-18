package com.example.view.coffeeshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
       t= findViewById(R.id.t1);
       String s=getIntent().getStringExtra("cost").toString();
       String s1=getIntent().getStringExtra("name").toString();
       t.setText("COFFEE ORDERED:\n"+s1+"\n TOTAL COST:"+s+"/-");
    }
}
