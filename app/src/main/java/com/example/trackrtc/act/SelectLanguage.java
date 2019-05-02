package com.example.trackrtc.act;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.trackrtc.R;

public class SelectLanguage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_language);
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
