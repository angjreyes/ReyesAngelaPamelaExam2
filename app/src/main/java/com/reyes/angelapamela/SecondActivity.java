package com.reyes.angelapamela;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void process (View v){
        Intent i=null, chooser=null;
        if (v.getId() == R.id.b1){
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.b2){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.6175,120.9874"));
            chooser = Intent.createChooser(i, "Select application");
            startActivity(chooser);
        }
    }
}
