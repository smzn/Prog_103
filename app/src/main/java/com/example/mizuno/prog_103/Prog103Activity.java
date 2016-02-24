package com.example.mizuno.prog_103;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Prog103Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog103);

        ImageButton b1 = (ImageButton) findViewById(R.id.imageButton);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                music();

            }
        });
    }
    private void music(){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.meow);
        mp.start();
    }
}
