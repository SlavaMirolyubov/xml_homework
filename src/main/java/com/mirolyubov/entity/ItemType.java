package com.mirolyubov.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemType", propOrder = {
    "manufacturer",
    "model",
    "dateOfManufacture",
    "color",
    "price",
    "amount"
})
public class ItemType {

    @JsonProperty("manufacturer")
    @XmlElement
    public String manufacturer;

    @JsonProperty("model")
    @XmlElement
    public String model;

    @JsonProperty("date_of_manufacture")
    @XmlElement(name="date_of_manufacture")
    public String dateOfManufacture;

    @JsonProperty("color")
    @XmlElement
    public String color;

    @JsonProperty("price")
    @XmlElement
    public BigDecimal price;

    @JsonProperty("amount")
    @XmlElement
    public BigInteger amount;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String value) {
        this.model = value;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String value) {
        this.dateOfManufacture = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String value) {
        this.color = value;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    public BigInteger getAmount() {
        return amount;
    }

    public void setAmount(BigInteger value) {
        this.amount = value;
    }

    @Override
    public String toString() {
        return "\n" +
                "\nmanufacturer='" + manufacturer + '\'' +
                ", \nmodel='" + model + '\'' +
                ", \ndate_of_manufacture='" + dateOfManufacture + '\'' +
                ", \ncolor='" + color + '\'' +
                ", \nprice='" + price + '\'' +
                ", \namount='" + amount + '\'' +
                '\n';
    }

}
