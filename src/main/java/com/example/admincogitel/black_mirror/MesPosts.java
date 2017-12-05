package com.example.admincogitel.black_mirror;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by admincogitel on 17/11/2017.
 */

public class MesPosts extends Activity {

    String[] myStringArray = new String[]{
            "Coucou",
            "Je m'appelle Julie"
    };


    private ListView mListView;
    private ArrayAdapter mArrayAdapter;
    public String mPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesposts);
        final TextView mPost = (TextView) findViewById(R.id.editPost);
        Button postButton = (Button) findViewById(R.id.postbutton);
        final TextView postText = (TextView) findViewById(R.id.editText);
        mListView = (ListView) findViewById(R.id.postListView);
        mArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, myStringArray);
        if (mListView != null) {
            mListView.setAdapter(mArrayAdapter);
        }
        postButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mArrayAdapter.add(postText);
                if (mListView != null) {
                    mListView.setAdapter(mArrayAdapter);
                }
            }

        });
    }
}



