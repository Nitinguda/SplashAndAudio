



package edu.niu.cs.z1760203.splashandaudio;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    // Initializing variables to hold screen objects
    private Button drumsBtn, ukuBtn;
    private MediaPlayer drumsMP,ukuMP;


    // defining the onCreate method
    // Called when the activity is first created.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connecting the initialized variables with the screen objects
        drumsBtn = (Button)findViewById(R.id.drumsButton);
        ukuBtn = (Button)findViewById(R.id.ukuleleButton);

        drumsMP = new MediaPlayer();
        drumsMP = MediaPlayer.create(this, R.raw.drums);

        ukuMP = new MediaPlayer();
        ukuMP = MediaPlayer.create(getApplicationContext(), R.raw.ukulele);


    }//end of onCreate

    public void playDrums(View view){
        //if drums mp3 is playing, then it should be paused and text on the button should be changed
         if (drumsMP.isPlaying()){
             drumsMP.pause();
             drumsBtn.setText("Play drums song");
         }
         //if the drums is not playing
         //if the ukulele mp3 is playing, pause it and change the button for ukulele
         //start the drums mp3
         //change text on drums button to pause
        else
         {
             if(ukuMP.isPlaying()) {
             ukuMP.pause();
             ukuBtn.setText("Play Ukulele Song");
             }

             drumsMP.start();
             drumsBtn.setText("Pause Drums Song");
         }

    }//drums ends here

    public void playUkulele(View view){
        if(ukuMP.isPlaying()) {
            ukuMP.pause();
            ukuBtn.setText("Play Ukulele Song");
        }
        else{
            if (drumsMP.isPlaying()){
                drumsMP.pause();
                drumsBtn.setText("Play drums song");
            }

            ukuMP.start();
            ukuBtn.setText("Pause Ukulele Song");
        }



    }//end of playUkulele



}//end of MainActivity
