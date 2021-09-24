package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        double sum = 0;
        int size = 0;
        for (Map.Entry<String, Double> average : temperatures.getTemperatures().entrySet()) {
            double n = average.getValue();
            size++;
            sum += n;
        }
        return sum / size;
    }

    public double calculateTemperatureMedian() {
        ArrayList<Double> temperaturesToCalculate = new ArrayList<>();
        double sum = 0;
        int index = 0;
        double medianValue = 0;

        for (Map.Entry<String, Double> median : temperatures.getTemperatures().entrySet()) {
            temperaturesToCalculate.add(median.getValue());
        }
        Collections.sort(temperaturesToCalculate);

        //Trying different way to sort values. problems
        /*double max = temperaturesToCalculate.get(0);
        double min = temperaturesToCalculate.get(0);

        for(double medianCalculator: temperaturesToCalculate) {
            sum += medianCalculator;

            if(max < medianCalculator) {
                max = medianCalculator;
            }

            if(min > medianCalculator) {
                min = medianCalculator;
            }
            System.out.println(temperaturesToCalculate.get(2));
        }*/

        index = temperaturesToCalculate.size() / 2;

        if (temperaturesToCalculate.size() % 2 == 1) {
            medianValue = temperaturesToCalculate.get(index);
        } else {
            medianValue = (temperaturesToCalculate.get(index-1) + temperaturesToCalculate.get(index))/2;
        }

        //System.out.println(index); - why does it print two times?

        return medianValue;
    }
}