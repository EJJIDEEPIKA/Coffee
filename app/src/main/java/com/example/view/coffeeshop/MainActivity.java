package com.example.view.coffeeshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
CheckBox c1,c2,c3,c4;
Spinner s1,s2,s3,s4;
int s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        s1=findViewById(R.id.s1);
        s2=findViewById(R.id.s2);
        s3=findViewById(R.id.s3);
        s4=findViewById(R.id.s4);
    }

    public void submit(View view) {
        Intent i=new Intent(this,SecondActivity.class);
        int c=0;
        String ss="";
        if(c1.isChecked()){
            s=150;
            ss=ss+(c1.getText()+" -- "+s1.getSelectedItem()+"\n");
            c+=(s*Integer.parseInt(s1.getSelectedItem().toString()));
        }
        if(c2.isChecked()){
            s=250;
            ss=ss+(c2.getText()+" -- "+s2.getSelectedItem()+"\n");
            c+=(s*Integer.parseInt(s2.getSelectedItem().toString()));
        }
        if(c3.isChecked()){
            s=350;
            ss=ss+(c3.getText()+" -- "+s3.getSelectedItem()+"\n");
            c+=(s*Integer.parseInt(s3.getSelectedItem().toString()));
        }
        if(c4.isChecked()){
            s=450;
            ss=ss+(c4.getText()+" -- "+s4.getSelectedItem()+"\n");
            c+=(s*Integer.parseInt(s4.getSelectedItem().toString()));
        }
     i.putExtra("name",ss);
     i.putExtra("cost",String.valueOf(c));
        startActivity(i);

    }
}
