package com.mirolyubov.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subcategoryType", propOrder = {"item"})
public class SubcategoryType {

    public List<ItemType> item;

    @JsonProperty("subcategory")
    @XmlAttribute(name = "name", required = true)
    public String name;

    public List<ItemType> getItem() {
        if (item == null) {
            item = new ArrayList<ItemType>();
        }
        return this.item;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    @Override
    public String toString() {
        return "\n" +
                "item=" + item +
                ", name='" + name + '\'';
    }
}
