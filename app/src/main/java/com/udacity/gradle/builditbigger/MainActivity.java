package com.udacity.gradle.builditbigger;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view)



    {

       // Joker joker = new Joker();


        new EndpointAsyncTask().execute(this);
        //Toast.makeText(this, "derp", Toast.LENGTH_SHORT).show();

        /*
        // Create Intent to launch JokeFactory Activity
        Intent intent = new Intent(this, DisplayJokeActivity.class);
        // Put the string in the envelope
        intent.putExtra(getString(R.string.jokeEnvelope), joker.tellJoke());
        startActivity(intent);*/

}}

   //https://android-developers.googleblog.com/2014/06/new-ways-to-connect-your-app-to-the-cloud-android-studio.html
//https://cloud.google.com/endpoints/docs/frameworks/java/get-started-frameworks-java
//https://www.google.com/events/io/schedule/session/0bc7756d-d9d6-e311-b297-00155d5066d7

//https://stackoverflow.com/questions/46954624/how-to-setup-gce-development-server-using-android-studio-3-0
//https://github.com/GoogleCloudPlatform/endpoints-framework-gradle-plugin/blob/master/ANDROID_README.md
//https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/77e9910911d5412e5efede5fa681ec105a0f02ad/HelloEndpoints#2-connecting-your-android-app-to-the-backend