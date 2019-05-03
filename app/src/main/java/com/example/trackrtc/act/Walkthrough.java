package com.example.trackrtc.act;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import com.example.trackrtc.R;
import com.example.trackrtc.databinding.ActivityWalkthroughBinding;
import maes.tech.intentanim.CustomIntent;

public class Walkthrough extends AppCompatActivity {
    ActivityWalkthroughBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_walkthrough);
        CustomIntent.customType(Walkthrough.this, "fadein-to-fadeout");
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
        binding.tvNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Walkthrough.this, MobileVerification.class));
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
