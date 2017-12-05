package com.example.admincogitel.black_mirror;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.login.*;
import com.facebook.login.widget.LoginButton;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.widget.LoginButton;
import com.facebook.*;

/**
 * Created by admincogitel on 24/11/2017.
 */

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_home);
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
        TextView bm = (TextView) findViewById(R.id.accueil);
        setFont(bm, "Arista.ttf");
        Button button = (Button) findViewById(R.id.mainbutton);
        Button loginButton = (LoginButton) findViewById(R.id.login_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), MainActivity.class);
                startActivity(i);
            }


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
/*
    CallbackManager callbackManager = CallbackManager.Factory.create();  

    @Override 
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {  
        super.onCreateView(inflater, container, savedInstanceState);
        final View view = inflater.inflate(R.layout.splash, container, false); 
        FacebookSdk.sdkInitialize(getApplicationContext());   
        LoginButton loginButton = view.findViewById(R.id.login_button); 
        loginButton.setReadPermissions("email");  
        //Callback registration 
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() { 

            @Override
            public void onSuccess(LoginResult loginResult) { 
                Intent i = new Intent(view.getContext(), MainActivity.class); 
                startActivity(i); 
            }  

            @Override
            public void onCancel() { 
                status = "Échec de la connexion"; 
                displayStatus(); 
            }  

            @Override
            public void onError(FacebookException exception) { 
                status = "Échec de la connexion"; 
                displayStatus(); 
            } 
        }); 
    }  


    int order = 0; 
    String status = "";
     

    public void displayStatus() { 
        order++; 
        String message = String.valueOf(order) + ": " + status; 
        //t.setText(status); 
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show(); 
    }*/
}