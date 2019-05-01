

package com.volksoftech.ptsmart.utils.service;

import android.app.ActivityManager;
import android.content.Context;

public class ServiceUtils {

    /**
     * Check if the service is running in the device.
     *
     * @param context      the context
     * @param serviceClass the service class
     * @return boolean boolean
     */
    public static boolean isServiceRunning(Context context, Class<?> serviceClass) {
        try {
            ActivityManager manager =
                    (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
            for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(
                    Integer.MAX_VALUE)) {
                if (serviceClass.getName().equals(service.service.getClassName())) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    private ServiceUtils() {
        throw new UnsupportedOperationException(
                "Should not create instance of Util class. Please use as static..");
    }
}
