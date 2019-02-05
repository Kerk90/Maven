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
public class CurrentConditionsDisplay implements Observer, DisplayElement{
     private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatheData;
    
    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatheData = weatherData;
        weatherData.registerObserver(this);
    }

    
    
     @Override
  public void display(){
      System.out.println("current conditions: " + temperature + " C degree and "
      + humidity + "% humidity" + "pressure");
  }
     @Override
  public void update(float temperature, float humidity, float pressure){
      this.humidity = humidity;
      this.temperature = temperature;
      this.pressure = pressure;
      display();
  }
}
