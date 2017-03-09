package com.anderscore.gradlesampleproject;

import android.app.Application;

/**
 * Created by mjohenneken on 09.03.17.
 */

public class FreeGmapsContext extends Application {

    @Override
    public void onCreate() {
        MapActivityFactory.setMapsActivity(new FreeGmapsMapsActivity());
    }
}
