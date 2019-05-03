package com.example.trackrtc.act;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import com.example.trackrtc.R;
import com.example.trackrtc.databinding.ActivityWalkthroughBinding;

public class Walkthrough extends AppCompatActivity {
    ActivityWalkthroughBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_walkthrough);
        binding.tvNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Walkthrough.this, MobileVerification.class));
            }
        });
    }
}
