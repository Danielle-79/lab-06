package com.example.listcity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if it doesn't already exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city){
        if (cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a list of cities in alphabetical order
     * @return
     */
    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
    /**
     * Check whether a city exists in the list
     * @param city the city to check
     * @return true if city exists, false otherwise
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }
    /**
     * Remove a city from the list
     * @param city the city to remove
     * @throws IllegalArgumentException if city is not found
     */
    public void delete(City city){
        if (cities.contains(city)){
            cities.remove(city);
        } else {
            throw new IllegalArgumentException("City not found");
        }
    }
    /**
     * Return number of cities in the list
     * @return number of cities
     */
    public int countCities(){
        return cities.size();
    }

}
