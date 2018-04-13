package com.example.lm.mddemo2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button cdl;
    private Button fab;
    private Button tabl;
    private Button til;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        cdl = (Button) findViewById(R.id.cdl);
        fab = (Button) findViewById(R.id.fab);

        cdl.setOnClickListener(this);
        fab.setOnClickListener(this);
        tabl = (Button) findViewById(R.id.tabl);
        tabl.setOnClickListener(this);
        til = (Button) findViewById(R.id.til);
        til.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cdl:
                startActivity(new Intent(this, Main3Activity.class));
                break;
            case R.id.fab:
                startActivity(new Intent(this, Main2Activity.class));
                break;
            case R.id.tabl:
                startActivity(new Intent(this, TabLayoutActivity.class));
                break;
            case R.id.til:
                startActivity(new Intent(this, TextInputLayoutActivity.class));
                break;
        }
    }
}
