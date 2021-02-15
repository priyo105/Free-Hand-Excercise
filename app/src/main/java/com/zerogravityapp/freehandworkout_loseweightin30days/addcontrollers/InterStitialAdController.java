package com.zerogravityapp.freehandworkout_loseweightin30days.addcontrollers;

import android.content.Context;
import android.os.Handler;
import android.util.Log;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.zerogravityapp.freehandworkout_loseweightin30days.R;

public class InterStitialAdController {
    private Context c;
    private InterstitialAd mInterstitialAd;

    public InterStitialAdController(Context c) {
        this.c = c;
    }

    public void initializeAdds(){
        mInterstitialAd = new InterstitialAd(c);
        mInterstitialAd.setAdUnitId(c.getString(R.string.interstatial_addId));
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
    }

    public void ShowAdds(){
        final Handler handler = new Handler();
        final int delay = 12000; // 1000 milliseconds == 1 second

        handler.postDelayed(new Runnable() {
            public void run() {
                //add show
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }

                handler.postDelayed(this, delay);
            }
        }, delay);

    }

}
