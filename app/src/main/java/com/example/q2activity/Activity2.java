package com.example.q2activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity2 extends AppCompatActivity {

    TextView txt_msgview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_2);
        txt_msgview=(TextView) findViewById(R.id.txtmsg_ans);
        Intent intent=getIntent();
        String name="msg";
        String str=intent.getStringExtra(name);

        txt_msgview.setText(str);


    }
}