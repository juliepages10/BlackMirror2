package com.example.admincogitel.black_mirror;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by admincogitel on 17/11/2017.
 */

public class MonProfil extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        Button button = (Button)findViewById(R.id.newsfeed); //(Button) = Typecast; on convertit la vue en bouton.
        Button button2 = (Button)findViewById(R.id.stats);
        Button button3 = (Button)findViewById(R.id.posts);
        Button buttonHisto = (Button)findViewById(R.id.histo);
        Button buttonNotes =(Button)findViewById(R.id.notes);
        TextView noteText = (TextView)findViewById(R.id.noteTexte);
        TextView histoText = (TextView)findViewById(R.id.historique);
        setFont(noteText,"Lato-Light.ttf");
        setFont(histoText,"Lato-Light.ttf");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(view.getContext(), MainActivity.class);
                startActivity(i);
            };
        });
        button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view){
            Intent i = new Intent(view.getContext(), MesStats.class);
            startActivity(i);
        };
    });

        buttonHisto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(view.getContext(), HistoNotes.class);
                startActivity(i);
            }
        });

        buttonNotes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(view.getContext(), MesNotes.class);
                startActivity(i);
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(view.getContext(), MesPosts.class);
                startActivity(i);
            };
        });

    }

    public void setFont(TextView textView, String fontName) {
        if (fontName != null) {
            try {
                Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/" + fontName);
                textView.setTypeface(typeface);
            } catch (Exception e) {
                Log.e("FONT", fontName + " not found", e);
            }
        }
    }
}

