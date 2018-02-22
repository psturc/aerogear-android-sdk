package org.aerogear.mobile.example;

import android.app.Application;

import org.aerogear.mobile.core.MobileCore;
import org.aerogear.mobile.core.metrics.MetricsService;
import org.aerogear.mobile.core.metrics.impl.AppMetrics;
import org.aerogear.mobile.core.metrics.impl.DeviceMetrics;

public class ExampleApplication extends Application {

    private MobileCore mobileCore;
    private MetricsService metricsService;

    @Override
    public void onCreate() {
        super.onCreate();

        mobileCore = MobileCore.init(this);
        metricsService = mobileCore.getInstance(MetricsService.class);

        metricsService.sendDefaultMetrics();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();

        mobileCore.destroy();
    }

    public MobileCore getMobileCore() {
        return mobileCore;
    }

    public MetricsService getMetricsService() {
        return metricsService;
    }

}
