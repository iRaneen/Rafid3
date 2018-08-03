package com.hajjhackathon.rafid.rafid3;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button helth;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout=(DrawerLayout)findViewById(R.id.drawerLayout);
        mToggle =new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

/*
        helth = findViewById(R.id.health);
        helth.setOnClickListener(new View.OnClickListener(){
@Override
            public void onClick(View v){
                Intent intent =new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });*/



    }



    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.health:
                Intent intent =new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent);
                break;
            case R.id.home:
                Intent intent2 =new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent2);
                break;

                default:
            return true;
        }

        return false;

    }


}
