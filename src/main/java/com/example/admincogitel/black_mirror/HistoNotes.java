package com.example.admincogitel.black_mirror;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by admincogitel on 24/11/2017.
 */

public class HistoNotes extends Activity {

    String[] myStringArray = new String[]{
            "Guillaume vous a mis 1 étoile",
            "Alexandre vous a mis 3 étoiles",
            "Théo vous a mis 4 étoiles",
            "Hugo vous a mis 4 étoiles",
            "Julien vous a mis 2 étoiles",
            "Yann vous a mis 3 étoiles",
            "Juliette vous a mis 5 étoiles",
            "Chloé vous a mis 0 étoiles",
            "Lucas vous a mis 1 étoiles",
            "Nicolas vous a mis 5 étoiles",
            "Florestan vous a mis 4 étoiles",
            "Marin vous a mis 4 étoiles",
            "Antoine vous a mis 3 étoiles",
            "Grégoire vous a mis 5 étoiles",
            "Alix vous a mis 5 étoiles",
            "Carla vous a mis 0 étoiles",
            "Romain vous a mis 5 étoiles",
            "Audrey vous a mis 4 étoiles",

};


    private ListView mListView;
    private ArrayAdapter mArrayAdapter;

    @Override
    protected void onCreate(Bundle SavedInstance){
        super.onCreate(SavedInstance);
        setContentView(R.layout.activity_histo);
        mListView=(ListView)findViewById(R.id.myListView);

        mArrayAdapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1, myStringArray);

        if (mListView!=null){
            mListView.setAdapter(mArrayAdapter);
        }
    }
}
