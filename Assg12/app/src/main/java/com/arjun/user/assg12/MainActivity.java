package com.arjun.user.assg12;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost=getTabHost();
        TabHost.TabSpec videospec=tabHost.newTabSpec("Videos");
        videospec.setIndicator("Videos");
        Intent videosIntent=new Intent(this,VideoActivity.class);
        videospec.setContent(videosIntent);

        TabHost.TabSpec songspec=tabHost.newTabSpec("Song");
        songspec.setIndicator("Song");
        Intent songIntent=new Intent(this,SongActivity.class);
        songspec.setContent(songIntent);
//
        TabHost.TabSpec photospec=tabHost.newTabSpec("Photos");
        photospec.setIndicator("Photos");
        Intent photoIntent=new Intent(this,PhotoActivity.class);
        photospec.setContent(photoIntent);

        tabHost.addTab(photospec);
        tabHost.addTab(videospec);
        tabHost.addTab(songspec);

    }
}
