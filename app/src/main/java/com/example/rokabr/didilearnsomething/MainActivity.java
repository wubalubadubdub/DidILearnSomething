package com.example.rokabr.didilearnsomething;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity {

    /* Since this launcher Activity does more than just host a fragment
    (it also has a TextView), we set its layout and create a fragment
     instance in the OnCreate method and add it to the FragmentManager
     */

    private Button mActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        if (fragment == null) {

            fragment = new SlagFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }

        mActivityButton = (Button) findViewById(R.id.launch_activity_button);
        mActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ButtonLaunchedActivity.class);
                startActivity(intent);
            }
        });

    }



}
