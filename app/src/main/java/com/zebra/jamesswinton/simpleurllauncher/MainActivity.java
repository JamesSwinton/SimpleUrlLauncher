package com.zebra.jamesswinton.simpleurllauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // Debugging
    private static final String TAG = "MainActivity";

    // Constants
    private static final String URL = "https://valueretail.my.salesforce.com";

    // Private Variables


    // Public Variables


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Start Chrome
        Intent browserIntent = new Intent();
        browserIntent.setAction(Intent.ACTION_VIEW);
        browserIntent.addCategory(Intent.CATEGORY_DEFAULT);
        browserIntent.setData(Uri.parse(URL.toLowerCase()));
        startActivity(browserIntent);

        // Exit
        finish();
    }
}
