/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwarf;

import enums.Gender;
import interfaces.FirstnameGenerator;
import interfaces.Randomizer;
import java.util.List;

/**
 * Generates a random first name for a dwarf
 * @author Greatmelons
 */
public class DwarfFirstnameGenerator implements FirstnameGenerator{
    
    List<String> dwarfFirstnameListM;
    List<String> dwarfFirstnameListF;

    Randomizer randomizer;

    /**
     * Constructor for DwarfFirstnameGenerator
     * @param randomizer
     * @param firstnamesM
     * @param firstnamesF 
     */
    public DwarfFirstnameGenerator(Randomizer randomizer, List<String> firstnamesM, List<String> firstnamesF) {
        this.randomizer = randomizer;
        this.dwarfFirstnameListM = firstnamesM;
        this.dwarfFirstnameListF = firstnamesF;
    }
    /**
     * Gets a random first name for a dwarf based on gender
     * @param gender
     * @return String
     */
    @Override
    public String generateFirstname(Gender gender) {
        switch(gender) {
            case MALE: return dwarfFirstnameListM.get(randomizer.getRandomNumber(dwarfFirstnameListM.size()));
            default: return dwarfFirstnameListF.get(randomizer.getRandomNumber(dwarfFirstnameListF.size()));
        }
    }
    
}
