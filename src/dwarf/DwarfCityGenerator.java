/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwarf;

import interfaces.CityGenerator;
import interfaces.Randomizer;
import java.util.List;

/**
 * Generates a random home city for a dwarf
 * @author Greatmelons
 */
public class DwarfCityGenerator implements CityGenerator {
    
    List<String> dwarfCityList;
    Randomizer randomizer;
    
    /**
     * Constructor for DwarfCityGenerator
     * @param randomizer
     * @param cityList 
     */
    public DwarfCityGenerator(Randomizer randomizer, List<String> cityList) {
        this.randomizer = randomizer;
        this.dwarfCityList = cityList;
    }
    /**
     * Gets a random city from dwarfCityList
     * @return String city
     */
    @Override
    public String generateCity() {
        String city = dwarfCityList.get(randomizer.getRandomNumber(dwarfCityList.size()));
        return city;
    }
    
}
