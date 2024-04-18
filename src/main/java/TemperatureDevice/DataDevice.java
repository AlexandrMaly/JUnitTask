package TemperatureDevice;

import java.util.Scanner;

public class DataDevice {
    public double getTemperature(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        return Double.parseDouble(sc.nextLine());
    }
}
