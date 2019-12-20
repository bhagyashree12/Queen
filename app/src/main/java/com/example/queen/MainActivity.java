package com.example.queen;

import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;//this is main menu
    Toolbar toolbar;//toolbar is requires as it contains the hamburger sign by which we can acces the navigation view
    ActionBarDrawerToggle actionBarDrawerToggle;//this is required to move back and forth from navigation bar to the home or normal page
    NavigationView navigationView;//this will contain the list of the menu required to shoe in the menu
    RecyclerView recyclerView;

    Button b1;
    Button b2;
    Button b3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpToolbar();

        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);



       // actionBar.setTitle(Html.fromHtml("<font color='#ff0000'>ActionBarTitle </font>"));


        // recycleView();
    }


    private void setUpToolbar() {

        drawerLayout = findViewById(R.id.drawerlayout);
        toolbar = findViewById(R.id.toolbar);
        //toolbar.setTitleTextColor(Color.RED);

        setSupportActionBar(toolbar);//to make it backward compatible and set the no action bar in the style.xml and this tells android to conside this toolbar as main toolebar

        navigationView = findViewById(R.id.navigation_menu);
        navigationView.setNavigationItemSelectedListener(this);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.action_bar_title));

        actionBarDrawerToggle.syncState();

    }

    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START))
            drawerLayout.closeDrawer(GravityCompat.START);
        else {
            super.onBackPressed();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.home:

                Intent i = new Intent(getApplicationContext(), Home.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, "this is home", Toast.LENGTH_SHORT).show();
                break;

            case R.id.Queen_Music:
                Intent j = new Intent(getApplicationContext(), Music.class);
                startActivity(j);
                Toast.makeText(MainActivity.this, "this is music", Toast.LENGTH_SHORT).show();
                break;



            case R.id.website:

                Intent l = new Intent(getApplicationContext(), Website.class);
                startActivity(l);
                Toast.makeText(MainActivity.this, "this is website", Toast.LENGTH_SHORT).show();
                break;

        }


        return true;//so that the menu item is selected
    }


    //    private void recycleView(){
//        recyclerView=findViewById(R.id.recylce_view);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this ));
//        String[] data={"freddie","roger","brian","jonh"};
//        recyclerView.setAdapter(new RecycleviewAdapter(data));
//
//    }


    public void home(View v){

        Intent intent = new Intent(getApplicationContext(), Home.class);



        ActivityOptionsCompat options =

                ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this,
                        b1,   // Starting view
                        ViewCompat.getTransitionName(b1)//i could have use the name of transiotion direclty but since i have used the same name i am using this
                );

        startActivity(intent, options.toBundle());


    }

    public void music(View v){

        Intent intent = new Intent(getApplicationContext(), Music.class);
        ActivityOptionsCompat options =

                ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this,
                        b2,   // Starting view
                        ViewCompat.getTransitionName(b2)//i could have use the name of transiotion direclty but since i have used the same name i am using this
                );

        startActivity(intent, options.toBundle());
    }

    public void website(View v){

        Intent intent = new Intent(getApplicationContext(), Website.class);
        ActivityOptionsCompat options =

                ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this,
                        b3,   // Starting view
                        ViewCompat.getTransitionName(b3)//i could have use the name of transiotion direclty but since i have used the same name i am using this
                );

        startActivity(intent, options.toBundle());

    }




}
