package com.example.lm.mddemo2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private FloatingActionButton fab_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        fab_edit = (FloatingActionButton) findViewById(R.id.fab_edit);

        fab_edit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fab_edit:
                Snackbar.make(v, "这是一个Snackbar", Snackbar.LENGTH_SHORT).setAction("取消", new View.OnClickListener(){

                @Override
                public void onClick(View view) {
                    Toast.makeText(Main2Activity.this, "你点击了取消", Toast.LENGTH_SHORT).show();
                }
            }).show();
                break;
        }
    }
}
