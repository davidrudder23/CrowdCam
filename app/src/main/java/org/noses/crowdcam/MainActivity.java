package org.noses.crowdcam;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import org.noses.crowdcam.liveVideoBroadcaster.*;

public class MainActivity extends AppCompatActivity {


    public static final String RTMP_BASE_URL = "rtmp://10.0.2.2/LiveApp/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    public void openVideoBroadcaster(View view) {
        Intent i = new Intent(this, LiveVideoBroadcasterActivity.class);
        startActivity(i);
    }
}