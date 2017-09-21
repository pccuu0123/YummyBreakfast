package com.example.shine.yummybreakfast;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private static final String Tab="MainActivity";

    private SectionPageAdapter sectionPageAdapter;

    private ViewPager myViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Yummy早點");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Log.d(Tab,"onCreate: Starting");

        sectionPageAdapter = new SectionPageAdapter(getSupportFragmentManager());

        myViewPager =(ViewPager)findViewById(R.id.container);
        setupViewPager(myViewPager);

        TabLayout tabLayout =(TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(myViewPager);



        //側滑菜單
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        //在打開和關閉Drawer的時候，ActionBar的返回圖標會有動畫效果。
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    //針對Fragment去使用，返回前一個頁面
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    //按下手機的 Menu 時會觸發的動作
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    //按下跳出來的 Menu 選項時會觸發的動作
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();
        Intent it = new Intent();

        if (id == R.id.orders) {
            it.setClass(MainActivity.this,Orders.class);
            startActivity(it);
        } else if (id == R.id.history) {
            it.setClass(MainActivity.this,History.class);
            startActivity(it);
        } else if (id == R.id.members) {
            it.setClass(MainActivity.this,Members.class);
            startActivity(it);
        } else if (id == R.id.news) {
            it.setClass(MainActivity.this,News.class);
            startActivity(it);
        } else if (id == R.id.shopim) {
            it.setClass(MainActivity.this,Shopim.class);
            startActivity(it);
        } else if (id == R.id.systemim) {
            it.setClass(MainActivity.this,Systemim.class);
            startActivity(it);
        }else if (id == R.id.preferential) {
            it.setClass(MainActivity.this,Preferential.class);
            startActivity(it);
        }else if (id == R.id.login){
            it.setClass(MainActivity.this,Login.class);
            startActivity(it);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void setupViewPager(ViewPager viewPager){
        SectionPageAdapter adapter = new SectionPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new HotDessert(),"熱門餐點");
        adapter.addFragment(new MainMeal(),"套餐");
        adapter.addFragment(new SetMeal(),"主餐");
        adapter.addFragment(new ViceMeal(),"副餐");
        viewPager.setAdapter(adapter);

    }
}
