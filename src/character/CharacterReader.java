/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Reads saved characters from local drive
 * @author Greatmelons
 */
public class CharacterReader {
    
    /**
     * Reads characters into an ArrayList from binary file characters.bin
     * @return List characters
     */
    public List readCharactersFromFile() {
        
    List<Character> characters = new ArrayList<>();
    Logger logger = Logger.getLogger(CharacterReader.class.getName());
    ObjectInputStream characterIn = null;
    
        try {
            characterIn = new ObjectInputStream(new FileInputStream("lists/characters/characters.bin"));
            Character character;
            while((character = (Character) characterIn.readObject()) != null) {
                characters.add(character);
            } 
        } catch (ClassNotFoundException e) {
            logger.log(Level.SEVERE, "Could not find characters", e);
        } catch (FileNotFoundException e) {
            logger.log(Level.SEVERE, "File could not be found", e);
        } catch (EOFException e) {
            logger.log(Level.INFO, "Finished reading");
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Could not read from file", e);
        } finally {
            try {
                if (characterIn != null) { characterIn.close(); }
            } catch (IOException e) {
                logger.log(Level.SEVERE, "File could not be closed", e);
            }
        }
        return characters;
    }   

}