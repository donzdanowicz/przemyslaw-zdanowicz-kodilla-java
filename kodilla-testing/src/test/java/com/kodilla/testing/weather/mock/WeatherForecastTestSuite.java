package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {
    @Mock
    private Temperatures temperaturesMock;
    private static int testCounter = 0;

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Test #" + testCounter);

    Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow",25.5);
        temperaturesMap.put("Krakow",26.2);
        temperaturesMap.put("Wroclaw",24.8);
        temperaturesMap.put("Warszawa",25.2);
        temperaturesMap.put("Gdansk",26.1);
        //temperaturesMap.put("Lodz", 27.5);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateAverageWithMock() {
        //Given
        WeatherForecast weatherAverageTemperature = new WeatherForecast(temperaturesMock);

        //When
        weatherAverageTemperature.calculateAverageTemperature();

        //Then
        Assertions.assertEquals(25.56, weatherAverageTemperature.calculateAverageTemperature());
    }

    @Test
    void testCalculateMedianWithMock() {
        //Given
        WeatherForecast weatherAverageTemperature = new WeatherForecast(temperaturesMock);
        //temperaturesMap.put("Lodz", 27.5); - checking list that has an even size - error.
        //When
        weatherAverageTemperature.calculateTemperatureMedian();

        //Then
        Assertions.assertEquals(25.5, weatherAverageTemperature.calculateTemperatureMedian());
    }
}
