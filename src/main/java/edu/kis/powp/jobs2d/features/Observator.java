package edu.kis.powp.jobs2d.features;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.observer.Subscriber;

public class Observator implements Subscriber {

    private static DriverManager driverManager = new DriverManager();

    @Override
    public void update() {
        DriverFeature.getApp().updateInfo(driverManager.getCurrentDriver().toString());
    }
}
