package lk.himash.controller;

import lk.himash.model.City;
import lk.himash.util.CityDetails;

import java.util.Map;

public class CityController {

    public String getCityDetails(int id) {
        City city = null;
        Map<Integer, City> cities = CityDetails.setAllCities();
        if(id != 0) {
           city = cities.get(id);
        }
        return city.getName();
    }

}
