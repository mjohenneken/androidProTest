package com.anderscore.gradlesampleproject;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by mjohenneken on 09.03.17.
 */

public class MapActivityFactory {

    static Activity activity = new MapsActivity();

    static Activity getMapActivityIntent() {
        return activity;

    }

    static void setMapsActivity(Activity newActivity) {
        activity = newActivity;
    }
}
