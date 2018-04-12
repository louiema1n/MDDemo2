package com.example.lm.mddemo2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TabLayoutActivity extends AppCompatActivity {

    private TabLayout tab;
    private ViewPager vp_content;

    private String[] titleArray = {"Musics", "Videos", "Photos", "Files"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        initView();
        initData();
    }

    private void initData() {
        // 页面集合
    }

    private void initView() {
        tab = (TabLayout) findViewById(R.id.tab);
        vp_content = (ViewPager) findViewById(R.id.vp_content);

        vp_content.setAdapter(new TabPagerAdapter());

        tab.setupWithViewPager(vp_content);
//        tab.addTab(tab.newTab().setText("tab1"));
//        tab.addTab(tab.newTab().setText("tab2"));
//        tab.addTab(tab.newTab().setText("tab3"));
//        tab.addTab(tab.newTab().setText("tab4"));
    }


    private class TabPagerAdapter extends PagerAdapter {
        @Override
        public int getCount() {
            return titleArray.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            TextView textView = new TextView(TabLayoutActivity.this);
            textView.setText(titleArray[position]);
            textView.setGravity(Gravity.CENTER);
            container.addView(textView, ViewPager.LayoutParams.MATCH_PARENT, ViewPager.LayoutParams.WRAP_CONTENT);
            return textView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

        /**
         * 重写该方法 设置tab标题
         * @param position
         * @return
         */
        @Override
        public CharSequence getPageTitle(int position) {
            return titleArray[position];
        }
    }
}
