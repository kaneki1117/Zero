package patterns.observer;

import com.google.common.collect.Lists;

import java.util.List;

public class WeatherData implements Subject {
    private float temperature;

    private float humidity;

    private List<Observer> observerList = Lists.newArrayList();

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void addObserver(Observer o) {
        observerList.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observerList.indexOf(o);
        observerList.remove(i);

    }

    public void measurementChanged(){
        notifyAllObservers();
    }

    public void notifyAllObservers() {
        for(Observer o : observerList){
            o.update(new WeatherParam(temperature,humidity));
        }
    }

    public void setWeatherParam(WeatherParam param){
        this.temperature = param.temperature;
        this.humidity = param.humidity;
        measurementChanged();
    }


}
