package TemperatureDevice;

import Exception.TemperatureException;



public class DeviceStart {
    private static CheckTemperature checkTemperature = new CheckTemperature();
    private static DataDevice dataDevice = new DataDevice();

    public static void deviceStart() {
        try {
            checkTemperature.checkTemperature(dataDevice.getTemperature());
        } catch (TemperatureException e) {
            System.out.println(e.getMessage());
        }
    }

}