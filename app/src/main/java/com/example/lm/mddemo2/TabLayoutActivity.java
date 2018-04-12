package com.example.lm.mddemo2;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class TabLayoutActivity extends AppCompatActivity {

    private TabLayout tab;
    private ViewPager vp_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        initView();
    }

    private void initView() {
        tab = (TabLayout) findViewById(R.id.tab);
        vp_content = (ViewPager) findViewById(R.id.vp_content);

        tab.addTab(tab.newTab().setText("tab1"));
        tab.addTab(tab.newTab().setText("tab2"));
        tab.addTab(tab.newTab().setText("tab3"));
        tab.addTab(tab.newTab().setText("tab4"));
    }
}
