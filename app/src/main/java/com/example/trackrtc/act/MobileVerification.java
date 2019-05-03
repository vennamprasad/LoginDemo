package com.example.trackrtc.act;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import com.example.trackrtc.R;
import com.example.trackrtc.databinding.ActivityMobileVerificationBinding;
import es.dmoral.toasty.Toasty;
import maes.tech.intentanim.CustomIntent;

public class MobileVerification extends AppCompatActivity {
    ActivityMobileVerificationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_mobile_verification);
        assert getSupportActionBar() != null;   //null check
        CustomIntent.customType(MobileVerification.this, "fadein-to-fadeout");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
        binding.editNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MobileVerification.this, EditMobile.class));
            }
        });
        binding.forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.success(getApplicationContext(), "Welcome", Toast.LENGTH_LONG, true).cancel();
                startActivity(new Intent(MobileVerification.this, HomeActivity.class));
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
