package com.tes.vi.gotobrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvLink = (TextView)findViewById(R.id.tvLink);
        tvLink.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
