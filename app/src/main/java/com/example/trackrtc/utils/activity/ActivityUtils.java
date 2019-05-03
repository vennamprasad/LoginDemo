package com.example.trackrtc.utils.activity;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

/**
 * The type Activity utils.
 */
public class ActivityUtils {

    /**
     * Hides the activity's action bar
     *
     * @param activity the activity
     */
    public static void hideActionBar(Activity activity) {
        // Call before calling setContentView();
        if (activity != null) {
            activity.getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
            if (activity.getActionBar() != null) {
                activity.getActionBar().hide();
            }
        }
    }

    /**
     * Sets the activity in Fullscreen mode
     *
     * @param activity the activity
     */
    public static void setFullScreen(Activity activity) {
        // Call before calling setContentView();
        activity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                        WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    private ActivityUtils() {
        throw new UnsupportedOperationException(
                "Should not create instance of Util class. Please use as static..");
    }
}