package com.example.trackrtc.act;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import com.example.trackrtc.R;
import com.example.trackrtc.databinding.ActivityMobileVerificationBinding;

public class MobileVerification extends AppCompatActivity {
    ActivityMobileVerificationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_mobile_verification);
        binding.editNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MobileVerification.this, EditMobile.class));
            }
        });
        binding.forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MobileVerification.this, HomeActivity.class));
            }
        });
    }
}
