package com.example.lab8;

import java.util.Comparator;
import java.util.Objects;

public class City implements Comparable {

    private String city;
    private String province;

    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    /**
     * Compares this city with another city
     * @param o The object to be compared with
     * @return integer, can be negative, zero, or positive
     * @throws ClassCastException if the specified object's type is different from this
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    // OpenAI, 2024, ChatGPT, overriding equals method for city
    /**
     * Indicates whether some other object is equal this
     * Two cities are considered equal if they have the same city name and province
     * @param o The  object to be compared with
     * @return true if this object is the same, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City cityObj = (City) o;
        return Objects.equals(city, cityObj.city) && Objects.equals(province, cityObj.province);
    }

    /**
     * Returns a hash code value for the city
     * @return A hash code value for this city
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
