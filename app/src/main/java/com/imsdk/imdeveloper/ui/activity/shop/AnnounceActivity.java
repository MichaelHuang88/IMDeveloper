package com.imsdk.imdeveloper.ui.activity.shop;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.imsdk.imdeveloper.R;

/**
 * Created by Michael-huang on 2016/9/19.
 */
public class AnnounceActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_announce);
    }
}
