/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CharacterGenerator;

import CharacterGenerator.Interfaces.AgeGenerator;
import CharacterGenerator.Interfaces.CityGenerator;
import CharacterGenerator.Interfaces.DeityGenerator;
import CharacterGenerator.Interfaces.FirstnameGenerator;
import CharacterGenerator.Interfaces.GenderGenerator;
import CharacterGenerator.Interfaces.LastnameGenerator;
import CharacterGenerator.Interfaces.LikesGenerator;
import CharacterGenerator.Interfaces.PersonalityGenerator;
import CharacterGenerator.Interfaces.RaceGenerator;

/**
 *
 * @author Greatmelons
 */
public class SeededCharacterSetup {
    
    DeityGenerator deityGenerator;
    GenderGenerator genderGenerator;
    LikesGenerator likesGenerator;
    PersonalityGenerator personalityGenerator;
    FirstnameGenerator firstnameGenerator;
    LastnameGenerator lastnameGenerator;
    AgeGenerator ageGenerator;
    CityGenerator cityGenerator;
    RaceGenerator raceGenerator;
    
    
    public SeededCharacterSetup(
            DeityGenerator deityGenerator,
            PersonalityGenerator personalityGenerator,
            GenderGenerator genderGenerator,
            RaceGenerator raceGenerator,
            LikesGenerator likesGenerator,
            FirstnameGenerator firstnameGenerator,
            LastnameGenerator lastnameGenerator,
            AgeGenerator ageGenerator,
            CityGenerator cityGenerator) {

        this.deityGenerator = deityGenerator;
        this.ageGenerator = ageGenerator;
        this.cityGenerator = cityGenerator;
        this.firstnameGenerator = firstnameGenerator;
        this.lastnameGenerator = lastnameGenerator;
        this.genderGenerator = genderGenerator;
        this.personalityGenerator = personalityGenerator;
        this.likesGenerator = likesGenerator;
        this.raceGenerator = raceGenerator;
    }
    
    public DeityGenerator getDeityGenerator() {
        return deityGenerator;
    }

    public GenderGenerator getGenderGenerator() {
        return genderGenerator;
    }

    public LikesGenerator getLikesGenerator() {
        return likesGenerator;
    }

    public PersonalityGenerator getPersonalityGenerator() {
        return personalityGenerator;
    }

    public FirstnameGenerator getFirstnameGenerator() {
        return firstnameGenerator;
    }

    public LastnameGenerator getLastnameGenerator() {
        return lastnameGenerator;
    }

    public AgeGenerator getAgeGenerator() {
        return ageGenerator;
    }

    public CityGenerator getCityGenerator() {
        return cityGenerator;
    }
    public RaceGenerator getRaceGenerator() {
        return raceGenerator;
    }
    
}
