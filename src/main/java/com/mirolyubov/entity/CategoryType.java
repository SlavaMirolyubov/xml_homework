package com.mirolyubov.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "categoryType", propOrder = {
    "subcategory"
})
public class CategoryType {

    public List<SubcategoryType> subcategory;

    @JsonProperty("category")
    @XmlAttribute(name = "name", required = true)
    public String name;

    public List<SubcategoryType> getSubcategory() {
        if (subcategory == null) {
            subcategory = new ArrayList<>();
        }
        return this.subcategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    @Override
    public String toString() {
        return "subcategory=" + subcategory +
                ", name='" + name + '\'' + "\n";
    }
}
