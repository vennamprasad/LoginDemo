

package com.volksoftech.ptsmart.utils.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
public class WebViewUtils {

    /**
     * Enable java script.
     *
     * @param webView the web view
     * @param enabled the enabled
     */
    @SuppressLint("SetJavaScriptEnabled")
    public static void enableJavaScript(WebView webView, boolean enabled) {
        if (webView != null) {
            webView.getSettings().setJavaScriptEnabled(enabled);
        }
    }

    /**
     * Enable web view debugging.
     *
     * @param enabled the enabled
     */
    public static void enableWebViewDebugging(boolean enabled) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            WebView.setWebContentsDebuggingEnabled(enabled);
        }
    }

    /**
     * Sync cookie with system browser.
     *
     * @param context the context
     */
    @SuppressWarnings("deprecation")
    public static void syncCookieWithSystemBrowser(Context context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            CookieManager.getInstance().flush();
        } else {
            CookieSyncManager.createInstance(context);
            CookieSyncManager.getInstance().startSync();
            CookieSyncManager.getInstance().sync();
        }
    }

    private WebViewUtils() {
        throw new UnsupportedOperationException(
                "Should not create instance of Util class. Please use as static..");
    }
}
