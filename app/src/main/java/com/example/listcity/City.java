package com.example.listcity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    /**
     * This returns the name of the city
     * @return the name of the city
     */
    String getCityName(){
        return this.city;
    }

    /**
     * This returns the name of the province
     * @return
     */
    String getProvinceName(){
        return this.province;
    }
    @Override
    public int compareTo(City city){
        return this.city.compareTo(city.getCityName());
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof City)) return false;

        City other = (City) o;

        return city.equals(other.city) &&
                province.equals(other.province);
    }

    @Override
    public int hashCode(){
        return city.hashCode() + province.hashCode();
    }
}
