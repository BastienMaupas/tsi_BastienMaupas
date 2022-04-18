package lv.tsi.webshop;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    public enum ProductCategory {
        COMPUTERS, SMARTPHONES, SMART_HOME_DEVICES
    }

    @JsonProperty
    @Id
    Long id;
    @JsonProperty
    String name;
    @JsonProperty
    String description;
    @JsonProperty
    float price;
    @JsonProperty
    String pictureUrl;
    @JsonProperty
    ProductCategory productCategory;


}
