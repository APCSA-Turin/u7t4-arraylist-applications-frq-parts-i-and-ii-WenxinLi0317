        
package com.example.project;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import com.example.project.WordScramble.*;

public class TestWordScramble {
    @Test
    public void testScrambleWordPARTA(){
        String result1 = WordScramble.scrambleWord("TAN");
        assertEquals(result1,"TNA");

        String result2 = WordScramble.scrambleWord("ABRACADABRA");
        assertEquals(result2,"BARCADABARA");
  
        String result3 = WordScramble.scrambleWord("WHOA");
        assertEquals(result3,"WHOA");

        String result4 = WordScramble.scrambleWord("AARDVARK");
        assertEquals(result4,"ARADVRAK");

        String result5 = WordScramble.scrambleWord("EGGS");
        assertEquals(result5,"EGGS");

        String result6 = WordScramble.scrambleWord("A");
        assertEquals(result6,"A");

        String result7 = WordScramble.scrambleWord("");
        assertEquals(result7,"");
    }

    @Test
    public void testScrambleOrRemovePARTB(){
        ArrayList<String> testWordList = new ArrayList<String>(Arrays.asList("TAN", "ABRACADABRA", "WHOA", "APPLE", "EGGS"));
        testWordList = WordScramble.scrambleOrRemove(testWordList);
        ArrayList<String> expectedAfterScrambleRemove = new ArrayList<String>(Arrays.asList("TNA", "BARCADABARA", "PAPLE"));
        assertEquals(testWordList, expectedAfterScrambleRemove);
    }
}
