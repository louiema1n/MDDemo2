package com.example.lm.mddemo2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    private FloatingActionButton fab_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        this.getWindow().setStatusBarColor(Color.TRANSPARENT);

        setContentView(R.layout.activity_main3);
        initView();
    }

    private void initView() {
        fab_add = (FloatingActionButton) findViewById(R.id.fab_add);

        fab_add.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fab_add:
                startActivity(new Intent(this, Main2Activity.class));
                break;
        }
    }
}
