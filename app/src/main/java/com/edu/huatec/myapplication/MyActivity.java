package com.edu.huatec.myapplication;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyActivity extends AppCompatActivity {
    @BindView(R.id.open)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        ButterKnife.bind(this);

        SharedPreferences my_sp = getSharedPreferences("my_sp", MODE_PRIVATE);
        String input1=my_sp.getString("input1_key","");
        String input2=my_sp.getString("input2_key","");
        textView.setText(input1+input2);
    }
}
