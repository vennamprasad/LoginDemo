package com.example.trackrtc.act;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.example.trackrtc.R;

public class LoadListShimmerExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shimmer);
        Thread thread=new Thread(){
            public void run(){
                try {
                    sleep(4000);
                    startActivity(new Intent(LoadListShimmerExample.this, MainActivity.class));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }; thread.start();
        ShimmerFrameLayout mShimmerViewContainer = findViewById(R.id.shimmer_view_container);
        mShimmerViewContainer.startShimmerAnimation();

    }
}
