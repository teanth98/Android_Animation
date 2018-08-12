package com.androidtutorialpoint.imagezoom;
//import android.R;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

//import com.androidtutorialpoint.R;

public class MainActivity extends AppCompatActivity
{
    //private TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void clickEvent(View v)
    {
        final ImageView zoom= findViewById(R.id.imageView);
        final TextView txt=findViewById(R.id.textView1);

        final Animation zoomAnimation= AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom);

        zoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //final Animation zoomAnimation= AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom);
                zoom.startAnimation(zoomAnimation);
                Toast.makeText(getBaseContext(), "You have clicked Like" , Toast.LENGTH_SHORT ).show();

            }
        });
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //final Animation zoomAnimation= AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom);
                zoom.startAnimation(zoomAnimation);
                Toast.makeText(getBaseContext(), "You have clicked Like" , Toast.LENGTH_SHORT ).show();

            }
        });

    }
}

