package com.example.admincogitel.black_mirror;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.monprofil); //(Button) = Typecast; on convertit la vue en bouton.
        Button button1 = (Button)findViewById(R.id.utilisateur);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(view.getContext(), MonProfil.class);
                startActivity(i);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(view.getContext(), ProfilVisiteur.class);
                startActivity(i);
            };
        });

    }
}
