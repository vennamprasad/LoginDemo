package com.volksoftech.ptsmart.act;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.volksoftech.ptsmart.R;
import es.dmoral.toasty.Toasty;
import org.jetbrains.annotations.Nullable;

public class SignupActivity extends AppCompatActivity {
    SharedPreferences sharedpreferences;
    public static final String MyPREFERENCES = "MyPrefs";
    public static final String username = "usernameKey";
    public static final String password = "passwordKey";
    public static final String email = "emailKey";


    private Button signup;
    private EditText nameed;
    private EditText emailed;
    private EditText passed;
    private TextView closetxt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sinup_page);
        initViews();
        closetxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nameed.getText().toString().length() > 0 && passed.getText().toString().length() > 0) {
                    sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
                    SharedPreferences pref = getApplicationContext().getSharedPreferences(MyPREFERENCES, 0); // 0 - for private mode
                    SharedPreferences.Editor editor = pref.edit();
                    editor.putString(username, nameed.getText().toString());
                    editor.putString(password, passed.getText().toString());
                    editor.putString(email, emailed.getText().toString());
                    editor.apply();
                    onBackPressed();

                } else {
                    Toasty.warning(getApplicationContext(), "Enter all fields", Toast.LENGTH_SHORT, true).show();
                }

            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }

    public void initViews() {
        TextView nametx = findViewById(R.id.nametxt);
        closetxt = findViewById(R.id.closetxt);
        signup = findViewById(R.id.signup);
        TextView statictx = findViewById(R.id.textView);
        TextView termstx = findViewById(R.id.textView2);
        nameed = findViewById(R.id.nameEdittxt);
        TextView emailtx = findViewById(R.id.emailtxt);
        emailed = findViewById(R.id.emailEdittxt);
        TextView passtx = findViewById(R.id.passtxt);
        passed = findViewById(R.id.passEdittxt);
    }
}
