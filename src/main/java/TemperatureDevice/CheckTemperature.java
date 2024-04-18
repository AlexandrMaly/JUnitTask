package TemperatureDevice;

import Exception.TemperatureException;

public class CheckTemperature {
    public void checkTemperature(double temperature) throws TemperatureException {
        if (temperature >= -10 && temperature <= 35) {
            System.out.println("The device operates at a temperature " + temperature);
        }
            else throw new TemperatureException("The device cannot operate outside the temperature regime (-10 +35)");
        }
    }

