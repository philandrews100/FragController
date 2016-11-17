package apposing.skeletonfragmentapp;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by Phil on 17/11/2016.
 */

public class SkeletonApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if(BuildConfig.DEBUG)
        Timber.plant(new Timber.DebugTree());
    }
}
