package com.volksoftech.ptsmart.act;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.github.jksiezni.permissive.PermissionsGrantedListener;
import com.github.jksiezni.permissive.PermissionsRefusedListener;
import com.github.jksiezni.permissive.Permissive;
import com.tapadoo.alerter.Alerter;
import com.volksoftech.ptsmart.Constants;
import com.volksoftech.ptsmart.R;
import es.dmoral.toasty.Toasty;

import java.io.File;
import java.io.FileOutputStream;

import static com.volksoftech.ptsmart.Constants.*;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        setDirectoryApproach();
        Toasty.info(this, "Welcome", Toast.LENGTH_SHORT, true).show();
        Thread splash = new Thread() {
            public void run() {
                try {
                    sleep(4 * 1000);
                    new Permissive.Request(Manifest.permission.ACCESS_COARSE_LOCATION,
                            Manifest.permission.ACCESS_FINE_LOCATION,
                            Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE,
                            Manifest.permission.CAMERA).whenPermissionsGranted(new PermissionsGrantedListener() {
                        @Override
                        public void onPermissionsGranted(String[] permissions) throws SecurityException {
                            startActivity(new Intent(Splash.this, MainActivity.class));
                            finish();
                        }
                    }).whenPermissionsRefused(new PermissionsRefusedListener() {
                        @Override
                        public void onPermissionsRefused(String[] permissions) {

                        }
                    }).execute(Splash.this);
                } catch (Exception e) {
                    Alerter.create(Splash.this)
                            .setText(e.getMessage())
                            .show();
                }
            }
        };
        splash.start();
    }

    public void setDirectoryApproach() {

        createDirectories();
    }

    private void createDirectories() {
        Root_Path = getFilesDir().getPath();
        //DB
        try {
            String rootPath = Root_Path + "/" + DB_FOLDER_NAME + "/";
            File root = new File(rootPath);
            if (!root.exists()) {
                root.mkdirs();
            }
            File f = new File(rootPath + DB_Name);
            if (!f.exists()) {
                f.createNewFile();
                FileOutputStream out = new FileOutputStream(f);
                out.flush();
                out.close();
            }
            Constants.DB_PATH = f.getAbsolutePath();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //
        File image = new File(Root_Path, IMAGE_FOLDER_NAME);
        if (!image.exists()) {
            image.mkdirs();
        }
        Constants.IMAGE_FOLDER_PATH = image.getPath();

    }

}