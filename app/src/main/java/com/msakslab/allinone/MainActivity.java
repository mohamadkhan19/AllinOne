package com.msakslab.allinone;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        //* *EDIT* *
        ListView listview = (ListView) findViewById(R.id.listView1);
        listview.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> l, View v, int position, long id) {
        Log.i("HelloListView", "You clicked Item: " + id + " at position:" + position);
        Intent intent = new Intent();

        switch (position) {
            case 0:
                intent.setClass(this, App1_HelloWorld.class);
                startActivity(intent);
                break;
            case 1:
                intent.setClass(this, App2_DragAndDrop.class);
                startActivity(intent);
                break;
            case 2:
                intent.setClass(this, App3_Notification.class);
                startActivity(intent);
                break;
            case 3:
                intent.setClass(this, App4_GetLocation.class);
                startActivity(intent);
                break;
            case 4:
                intent.setClass(this, App5_SendEmail.class);
                startActivity(intent);
                break;
            case 5:
                intent.setClass(this, App6_SendSMS.class);
                startActivity(intent);
                break;
            case 6:
                intent.setClass(this, App7_Call.class);
                startActivity(intent);
                break;
            case 7:
                intent.setClass(this, App8_Animation.class);
                startActivity(intent);
                break;
            case 8:
                intent.setClass(this, App9_TextToSpeech.class);
                startActivity(intent);
                break;
            case 9:
                intent.setClass(this, App10_AlertDialouge.class);
                startActivity(intent);
                break;
            case 10:
                intent.setClass(this, App11_Services.class);
                startActivity(intent);
                break;
            case 11:
                intent.setClass(this, App12_Bluetooth.class);
                startActivity(intent);
                break;
            case 12:
                intent.setClass(this, App13_Camera.class);
                startActivity(intent);
                break;
            case 13:
                intent.setClass(this, App14_Facebook.class);
                startActivity(intent);
                break;
            /*case 1:
                statement2;
                break;*/
        }
    }
}
