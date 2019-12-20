package com.example.queen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        final ImageView imageView=findViewById(R.id.spash_image);

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Splash.this,MainActivity.class);
                ActivityOptionsCompat options =

                        ActivityOptionsCompat.makeSceneTransitionAnimation(Splash.this,
                                imageView,   // Starting view
                                ViewCompat.getTransitionName(imageView)//i could have use the name of transiotion direclty but since i have used the same name i am using this
                        );

                startActivity(intent, options.toBundle());


                //startActivity(intent);


            }
        },1000);





    }
}
