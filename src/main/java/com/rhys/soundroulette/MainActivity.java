package com.rhys.soundroulette;

import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.util.Random;


public class MainActivity extends Activity {
    private AdView adView;
    private InterstitialAd interstitial;
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        // Set the RelativeLayout as the main layout.
        setContentView(R.layout.activity_main);
    }


    SoundPool mySound;
    int aId, bId, cId, dId, eId, gId, hId, jId, kId, lId, mId, nId, oId, pId, rId, sId, tId, uId, vId, wId, xId, yId, zId, aaId, bbId, ccId, ddId, eeId, ffId, ggId, hhId, iiId, jjId, kkId, llId, mmId, ooId, ppId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        /*
        *
        * BEGINNING OF ADMOB CODE
        *
        */

        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(MainActivity.this);
        // Insert the Ad Unit ID
        interstitial.setAdUnitId("ca-app-pub-9088184716312736/3652643607");

        //Locate the Banner Ad in activity_main.xml
        AdView adView = (AdView) this.findViewById(R.id.adView);

        // Request for Ads
        AdRequest adRequest = new AdRequest.Builder()

                // Add a test device to show Test Ads
                // .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                // .addTestDevice("Random Text")
                .build();

        // Load ads into Banner Ads
        adView.loadAd(adRequest);

        // Load ads into Interstitial Ads
        interstitial.loadAd(adRequest);

        // Prepare an Interstitial Ad Listener
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
                // Call displayInterstitial() function
                displayInterstitial();
            }
        });

        mySound = new SoundPool(1, AudioManager.STREAM_MUSIC,0);
        aId = mySound.load(this, R.raw.a, 1);
        bId = mySound.load(this, R.raw.b, 1);
        cId = mySound.load(this, R.raw.c, 1);
        dId = mySound.load(this, R.raw.d, 1);
        eId = mySound.load(this, R.raw.e, 1);
        gId = mySound.load(this, R.raw.g, 1);
        hId = mySound.load(this, R.raw.h, 1);
        jId = mySound.load(this, R.raw.j, 1);
        kId = mySound.load(this, R.raw.k, 1);
        lId = mySound.load(this, R.raw.l, 1);
        mId = mySound.load(this, R.raw.m, 1);
        nId = mySound.load(this, R.raw.n, 1);
        oId = mySound.load(this, R.raw.o, 1);
        pId = mySound.load(this, R.raw.p, 1);
        rId = mySound.load(this, R.raw.r, 1);
        sId = mySound.load(this, R.raw.s, 1);
        tId = mySound.load(this, R.raw.t, 1);
        uId = mySound.load(this, R.raw.u, 1);
        vId = mySound.load(this, R.raw.v, 1);
        wId = mySound.load(this, R.raw.w, 1);
        xId = mySound.load(this, R.raw.x, 1);
        yId = mySound.load(this, R.raw.y, 1);
        zId = mySound.load(this, R.raw.z, 1);
        aaId = mySound.load(this, R.raw.aa, 1);
        bbId = mySound.load(this, R.raw.bb, 1);
        ccId = mySound.load(this, R.raw.cc, 1);
        ddId = mySound.load(this, R.raw.dd, 1);
        eeId = mySound.load(this, R.raw.ee, 1);
        ffId = mySound.load(this, R.raw.ff, 1);
        ggId = mySound.load(this, R.raw.gg, 1);
        hhId = mySound.load(this, R.raw.hh, 1);
        iiId = mySound.load(this, R.raw.ii, 1);
        jjId = mySound.load(this, R.raw.jj, 1);
        kkId = mySound.load(this, R.raw.kk, 1);
        llId = mySound.load(this, R.raw.ll, 1);
        mmId = mySound.load(this, R.raw.mm, 1);
        ooId = mySound.load(this, R.raw.oo, 1);
        ppId = mySound.load(this, R.raw.pp, 1);
    }

    public void displayInterstitial() {
        // If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }

    public void playSound(View view) {

        int Id = 0;

        Random rand = new Random();
        Id = rand.nextInt(38)+1;

        if(Id == 1) {
            mySound.play(aId, 1, 1, 1, 0, 1);
        }else if(Id == 2){
            mySound.play(bId, 1, 1, 1,0, 1);
        }else if(Id == 3){
            mySound.play(cId, 1, 1, 1,0, 1);
        }else if(Id == 4){
            mySound.play(dId, 1, 1, 1,0, 1);
        }else if(Id == 5){
            mySound.play(eId, 1, 1, 1, 0, 1);
        }else if(Id == 6){
            mySound.play(gId, 1, 1, 1,0, 1);
        }else if(Id == 7){
            mySound.play(hId, 1, 1, 1,0, 1);
        }else if(Id == 8){
            mySound.play(jId, 1, 1, 1,0, 1);
        }else if(Id == 9){
            mySound.play(kId, 1, 1, 1,0, 1);
        }else if(Id == 10){
            mySound.play(lId, 1, 1, 1,0, 1);
        }else if(Id == 11){
            mySound.play(mId, 1, 1, 1,0, 1);
        }else if(Id == 12){
            mySound.play(nId, 1, 1, 1,0, 1);
        }else if(Id == 13){
            mySound.play(oId, 1, 1, 1,0, 1);
        }else if(Id == 14){
            mySound.play(pId, 1, 1, 1,0, 1);
        }else if(Id == 15){
            mySound.play(rId, 1, 1, 1,0, 1);
        }else if(Id == 16){
            mySound.play(sId, 1, 1, 1,0, 1);
        }else if(Id == 17){
            mySound.play(tId, 1, 1, 1,0, 1);
        }else if(Id == 18){
            mySound.play(uId, 1, 1, 1,0, 1);
        }else if(Id == 19){
            mySound.play(vId, 1, 1, 1,0, 1);
        }else if(Id == 20){
            mySound.play(wId, 1, 1, 1,0, 1);
        }else if(Id == 21){
            mySound.play(xId, 1, 1, 1,0, 1);
        }else if(Id == 22){
            mySound.play(yId, 1, 1, 1,0, 1);
        }else if(Id == 23){
            mySound.play(zId, 1, 1, 1,0, 1);
        }else if(Id == 24){
            mySound.play(aaId, 1, 1, 1,0, 1);
        }else if(Id == 25){
            mySound.play(bbId, 1, 1, 1,0, 1);
        }else if(Id == 26){
            mySound.play(ccId, 1, 1, 1,0, 1);
        }else if(Id == 27){
            mySound.play(ddId, 1, 1, 1,0, 1);
        }else if(Id == 28){
            mySound.play(eeId, 1, 1, 1,0, 1);
        }else if(Id == 29){
            mySound.play(ffId, 1, 1, 1,0, 1);
        }else if(Id == 30){
            mySound.play(ggId, 1, 1, 1,0, 1);
        }else if(Id == 31){
            mySound.play(hhId, 1, 1, 1,0, 1);
        }else if(Id == 32){
            mySound.play(iiId, 1, 1, 1,0, 1);
        }else if(Id == 33){
            mySound.play(jjId, 1, 1, 1,0, 1);
        }else if(Id == 34){
            mySound.play(kkId, 1, 1, 1,0, 1);
        }else if(Id == 35){
            mySound.play(llId, 1, 1, 1,0, 1);
        }else if(Id == 36){
            mySound.play(mmId, 1, 1, 1,0, 1);
        }else if(Id == 37){
            mySound.play(ooId, 1, 1, 1,0, 1);
        }else if(Id == 38){
            mySound.play(ppId, 1, 1, 1,0, 1);
        }
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
}
