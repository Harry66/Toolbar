package com.syy.toolbar;

import android.app.Activity;
import android.graphics.Color;
import android.net.Network;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * 1.一定要设置在setContentView()前边
         * 2.如果activity继承的是AppCompatActivity,
         *   supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
         *   setSupportActionBar(mToolbar);
         * 3.如果activity继承的是Activity,
         *   requestWindowFeature(Window.FEATURE_NO_TITLE);
         *   setActionBar();该方法中的参数是android.widget.Toolbar，而不是v7包中的Toolbar。
         */
        setContentView(R.layout.activity_main);
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mToolbar.setNavigationIcon(R.mipmap.menu);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        getSupportActionBar().setDisplayShowTitleEnabled(false);
//        getSupportActionBar().setTitle("T");
        mToolbar.setLogo(R.mipmap.ic_launcher);
        mToolbar.setTitle("标题");
        mToolbar.setTitleTextColor(Color.WHITE);
        mToolbar.setSubtitle("副标题");
        mToolbar.setSubtitleTextColor(Color.WHITE);
//        mToolbar.addView(LayoutInflater.from(this).inflate(R.layout.tv,null));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.m1:
                Toast.makeText(this,"1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.m2:
                Toast.makeText(this,"2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.m3:
                Toast.makeText(this,"3",Toast.LENGTH_SHORT).show();
                break;
            case R.id.m4:
                Toast.makeText(this,"4",Toast.LENGTH_SHORT).show();
                break;
            case R.id.m5:
                Toast.makeText(this,"5",Toast.LENGTH_SHORT).show();
                break;
            case R.id.m6:
                Toast.makeText(this,"6",Toast.LENGTH_SHORT).show();
                break;
            case R.id.m7:
                Toast.makeText(this,"7",Toast.LENGTH_SHORT).show();
                break;
            case R.id.m8:
                Toast.makeText(this,"8",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
