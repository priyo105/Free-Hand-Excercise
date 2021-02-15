package com.zerogravityapp.freehandworkout_loseweightin30days.addcontrollers;

import android.content.Context;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.zerogravityapp.freehandworkout_loseweightin30days.R;


public class BannerAddController {

    private Context c;
    private AdView mAdView;


    public BannerAddController(Context c, AdView mAdView) {
        this.c = c;
        MobileAds.initialize(c, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        this.mAdView=mAdView;
        AdView adView = new AdView(c);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId(c.getString(R.string.banner_add));


    }

    public void LoadBannerAdd(){
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
