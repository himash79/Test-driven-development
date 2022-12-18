package lk.himash.util;

import lk.himash.model.City;

import java.util.HashMap;
import java.util.Map;

public class CityDetails {

    public static Map<Integer, City> setAllCities() {
        Map<Integer, City> cities = new HashMap<>();
        cities.put(1,new City(1,"colombo","weston",10000));
        cities.put(2,new City(2,"galle","southern",4000));
        cities.put(3,new City(3,"kandy","middle",20000));
        cities.put(4,new City(4,"jaffna","north",14000));
        cities.put(5,new City(5,"chilaw","weston",10700));
        return cities;
    }

}
