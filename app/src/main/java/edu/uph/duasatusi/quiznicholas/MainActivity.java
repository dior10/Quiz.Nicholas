package edu.uph.duasatusi.quiznicholas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout supabutton;

        setContentView(R.layout.activity_main);
        supabutton = (LinearLayout) findViewById(R.id.linear1);
        supabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("BUTTON", "Buttun supa di click");
                
                Intent intent =
                        new Intent(MainActivity.this,
                                Profil.class);
                startActivity(intent);


            }
        });

    }


}