package com.example.trackrtc.act;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.example.trackrtc.R;
import com.example.trackrtc.frag.History;
import com.example.trackrtc.frag.Notifications;
import com.example.trackrtc.frag.Profile;
import com.example.trackrtc.frag.Search;
import com.google.android.material.bottomnavigation.BottomNavigationView;


//implement the interface OnNavigationItemSelectedListener in your activity class
public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
        //loading the default fragment
        loadFragment(new Search());
        //getting bottom navigation view and attaching the listener
        BottomNavigationView navigation = findViewById(R.id.btm_navigation);
        navigation.setOnNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.search:
                fragment = new Search();
                break;

            case R.id.notifications:
                fragment = new Notifications();
                break;

            case R.id.history:
                fragment = new History();
                break;

            case R.id.profile:
                fragment = new Profile();
                break;
        }

        return loadFragment(fragment);
    }

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}