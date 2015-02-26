/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Characters;

import CharacterGenerator.Enums.Gender;
import CharacterGenerator.Enums.Personality;
import CharacterGenerator.Enums.Race;
import CharacterGenerator.SeededCharacterSetup;

/**
 *
 * @author Greatmelons
 */
public class SeededCharacterBase {
   
    private Personality personality;
    private String firstname;
    private String lastname;
    private String city;
    private String likes;
    private Gender gender;
    private Race race;
    private int age;
    private String deity;
    
    public SeededCharacterBase(SeededCharacterSetup setup) {
        race = setup.getRaceGenerator().generateRace();
        personality = setup.getPersonalityGenerator().generatePersonality();
        gender = setup.getGenderGenerator().generateGender();
        firstname = setup.getFirstnameGenerator().generateFirstname(gender);
        lastname = setup.getLastnameGenerator().generateLastname();
        city = setup.getCityGenerator().generateCity();
        likes = setup.getLikesGenerator().generateLikes();
        age = setup.getAgeGenerator().generateAge();
        deity = setup.getDeityGenerator().generateDeity();
    }
    public Personality getPersonality() {
        return personality;
    }
    public Gender getGender() {
        return gender;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getCity() {
        return city;
    }
    public int getAge() {
        return age;
    }
    public String getLikes() {
        return likes;
    }
    public String getDeity() {
        return deity;
    }
    public Race getRace() {
        return race;
    }
    
    
}