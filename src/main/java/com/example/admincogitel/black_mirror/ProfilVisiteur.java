package com.example.admincogitel.black_mirror;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

/**
 * Created by admincogitel on 17/11/2017.
 */

public class ProfilVisiteur extends Activity {

    @Override
    protected void onCreate(Bundle SavedInstance){
        super.onCreate(SavedInstance);
        setContentView(R.layout.activity_visiting);
        Button noterButton = (Button)findViewById(R.id.noter);
        noterButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(view.getContext(), NoterVisiteur.class);
                startActivity(i);
            }
        });

    }
}
