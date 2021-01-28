package com.example.freehandworkout_loseweightin30days.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toolbar;

import com.example.freehandworkout_loseweightin30days.InterStitialAdController;
import com.example.freehandworkout_loseweightin30days.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.ads.interstitial.InterstitialAd;

public class ketoPdfViewActivity extends AppCompatActivity {

    PDFView ketoBook;
    private InterStitialAdController interStitialAdController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keto_pdf_view);
         ketoBook=findViewById(R.id.pdfView);
         ketoBook.fromAsset("ketopdf.pdf")
                 .swipeHorizontal(true)
                 .enableSwipe(true)
                 .swipeHorizontal(true)
                 .enableDoubletap(true)
                 .load();

        getSupportActionBar().setTitle("Keto Recipies");

        //add
        interStitialAdController=new InterStitialAdController(this);
        interStitialAdController.initializeAdds();
        interStitialAdController.ShowAdds();
        
    }
}