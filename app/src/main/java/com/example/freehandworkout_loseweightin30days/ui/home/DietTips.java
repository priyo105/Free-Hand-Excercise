package com.example.freehandworkout_loseweightin30days.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.freehandworkout_loseweightin30days.InterStitialAdController;
import com.example.freehandworkout_loseweightin30days.R;
import com.example.freehandworkout_loseweightin30days.BannerAddController;
import com.google.android.gms.ads.AdView;

public class DietTips extends AppCompatActivity {

    InterStitialAdController interStitialAdController;
    private BannerAddController bannerAddController;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_tips);
        getSupportActionBar().setTitle("Diet Tips");


        interStitialAdController=new InterStitialAdController(this);
        interStitialAdController.initializeAdds();
        interStitialAdController.ShowAdds();

        mAdView = findViewById(R.id.adView);
        bannerAddController=new BannerAddController(this,mAdView);
        bannerAddController.LoadBannerAdd();


    }
}