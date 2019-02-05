/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverWeather;

/**
 *
 * @author User
 */
public class StatisticsDisplay implements Observer, DisplayElement{
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private final WeatherData weatherData;
    
    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    @Override
    public void update(float temperature, float humidity, float pressure){
    tempSum += temperature;
    numReadings++;
    
     if (temperature > maxTemp){
        maxTemp = temperature;
}
     
    if(temperature < minTemp){
        minTemp= temperature; 
}
    
    display();
}
    @Override
    public void display(){
System.out.println("Avg/Max/Min temperature = " + (tempSum/numReadings)
    + "/" + maxTemp + "/" + minTemp);
}
}
