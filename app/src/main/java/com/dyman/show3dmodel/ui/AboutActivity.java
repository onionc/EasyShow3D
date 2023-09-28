package com.dyman.show3dmodel.ui;

import android.os.Handler;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.widget.Toolbar;

import com.dyman.show3dmodel.R;
import com.dyman.show3dmodel.config.MyConfig;

public class AboutActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        initToolbar();
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_activity_about);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        finish();
                    }
                }, MyConfig.POST_DELAYED_TIME);
            }
        });
    }
}
