package lv.tsi.finaltask;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {

    private @Id @JsonProperty Integer id;
    private @JsonProperty String brand;
    private @JsonProperty Integer speed;
    private @JsonProperty Integer year;
    private @JsonProperty Double price;
    public Car() {}
    public Car(Integer id, String brand, Integer speed, Integer year, Double price){
        this.id = id;
        this.brand = brand;
        this.speed = speed;
        this.year = year;
        this.price = price;
    }

    public Integer getId(){
        return this.id;
    }
    public String getBrand(){
        return this.brand;
    }
    public Integer getSpeed(){
        return this.speed;
    }
    public Integer getYear(){
        return this.year;
    }
    public double getPrice() {
        return this.price;
    }
}

