package com.blstream.studybox;

import android.content.pm.ApplicationInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean isDebuggable;
private TextView textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = (TextView) findViewById(R.id.textview);

        ApplicationInfo ai = getApplication().getApplicationInfo();

        if(ai != null) {
            isDebuggable = (ai.flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0;
        }

        if (isDebuggable) {
            textview.setText("DEBUG");
        } else {
            textview.setText("RELEASE");
        }

    }
}
