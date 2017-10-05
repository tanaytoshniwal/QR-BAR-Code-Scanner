package com.example.alphabat69.paytm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView printCode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        printCode=(TextView)findViewById(R.id.printCode);
        String str=ScannedCode.code;
        printCode.setText(str);
    }
}