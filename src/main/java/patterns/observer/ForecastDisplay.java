package patterns.observer;

public class ForecastDisplay implements Observer, Display {
    private float temperature;

    private float humidity;

    @Override
    public void update(WeatherParam param) {
        this.temperature = param.temperature;
        this.humidity = param.humidity;
        display();
    }


    @Override
    public void display() {
        System.out.println("Forecast display : temp = " + temperature +" , humid =" + humidity );
    }
}
