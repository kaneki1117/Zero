package patterns.observer;

public class Main {

    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        DailyReportDisplay dailyReportDisplay = new DailyReportDisplay();

        data.addObserver(forecastDisplay);
        data.addObserver(dailyReportDisplay);
        WeatherParam params1 = new WeatherParam(30,20);
        WeatherParam params2 = new WeatherParam(10,10);
        data.setWeatherParam(params1);
        data.setWeatherParam(params2);
    }
}
