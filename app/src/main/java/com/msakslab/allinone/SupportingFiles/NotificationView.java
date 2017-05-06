package com.msakslab.allinone.SupportingFiles;

/**
 * Created by shafa on 4/26/2017.
 */

import android.os.Bundle;
import android.app.Activity;
import com.msakslab.allinone.R;

public class NotificationView extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);
    }
}