package com.volksoftech.ptsmart.act;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.volksoftech.ptsmart.R;

public class LoadListShimmerExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shimmer);
        ShimmerFrameLayout mShimmerViewContainer = findViewById(R.id.shimmer_view_container);
        mShimmerViewContainer.startShimmerAnimation();
    }
}
