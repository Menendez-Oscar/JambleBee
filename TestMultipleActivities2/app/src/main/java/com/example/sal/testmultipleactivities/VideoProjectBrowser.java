package com.example.sal.testmultipleactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class VideoProjectBrowser extends Activity {

    Button goToMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_project_browser);
        goToMain = (Button) findViewById(R.id.go_to_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_video_project_browser, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        switch(item.getItemId()) {
//            case R.id.menu_browser_action_editor:
//                startActivity(new Intent(VideoProjectBrowser.this, VideoProjectEditor.class));
//                // switch activity
//                return true;
//            case R.id.menu_browser_action_main:
//                //startActivity(new Intent(VideoProjectBrowser.this, MainActivity.class));
//                finish();
//                // switch activity
//                return true;
//            default:
//                break;
//        }
        return super.onOptionsItemSelected(item);
    }

    public void onCaptureClick(View view) {
        switch (view.getId()){
            case R.id.go_to_main:
                //Kill the current activity
                finish();
            default:
                break;

        }
    }
}
