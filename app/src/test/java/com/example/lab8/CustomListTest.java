package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.countCities();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.countCities(),listSize + 1);
    }

    @Test
    public void testHasCity() {
        list = MockCityList();
        City existingCity = new City("Edmonton", "Alberta");
        list.addCity(existingCity);

        Assertions.assertTrue(list.hasCity(existingCity),
                "The cityList should recognize an existing city.");

        Assertions.assertTrue(list.hasCity(new City("Edmonton", "Alberta")),
                "The cityList should recognize a city with the same name and province.");

        City newCity = new City("Vancouver", "British Columbia");
        Assertions.assertFalse(list.hasCity(newCity), "The cityList should not have the new city before it is added.");


    }

//

}
