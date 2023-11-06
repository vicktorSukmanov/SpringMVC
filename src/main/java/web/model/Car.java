package web.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Car {
    private String brand;
    private String model;
    private int series;

    public Car() {
    }

    public Car(String brand, String model, int series) {
        this.brand = brand;
        this.model = model;
        this.series = series;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
    @Bean
    public List<Car> getListCar(){
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Mercedec","E",125));
        carList.add(new Car("Audi","A8",127));
        carList.add(new Car("Hundai","Solaris",352));
        carList.add(new Car("KIA","RIO",32));
        carList.add(new Car("Nissan","Almera",11));
        return carList;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
