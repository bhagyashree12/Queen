package com.example.queen;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

public class Home extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        final ImageView fred = findViewById(R.id.img1);
        final ImageView brian = findViewById(R.id.img2);
        final ImageView roger = findViewById(R.id.img3);
        final ImageView john = findViewById(R.id.img4);


        fred.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Freddie.class);
                ActivityOptionsCompat options =

                        ActivityOptionsCompat.makeSceneTransitionAnimation(Home.this,
                                fred,   // Starting view
                                ViewCompat.getTransitionName(fred)//i could have use the name of transiotion direclty but since i have used the same name i am using this
                        );

                startActivity(intent, options.toBundle());


            }
        });

        brian.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Brian.class);
                ActivityOptionsCompat options =

                        ActivityOptionsCompat.makeSceneTransitionAnimation(Home.this,
                                brian,   // Starting view
                                ViewCompat.getTransitionName(brian)//i could have use the name of transiotion direclty but since i have used the same name i am using this
                        );

                startActivity(intent, options.toBundle());


            }
        });
        roger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Roger.class);
                ActivityOptionsCompat options =

                        ActivityOptionsCompat.makeSceneTransitionAnimation(Home.this,
                                roger,   // Starting view
                                ViewCompat.getTransitionName(roger)//i could have use the name of transiotion direclty but since i have used the same name i am using this
                        );

                startActivity(intent, options.toBundle());


            }
        });
        john.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), John.class);
                ActivityOptionsCompat options =

                        ActivityOptionsCompat.makeSceneTransitionAnimation(Home.this,
                                john,   // Starting view
                                ViewCompat.getTransitionName(john)//i could have use the name of transiotion direclty but since i have used the same name i am using this
                        );

                startActivity(intent, options.toBundle());


            }
        });


    }
}


