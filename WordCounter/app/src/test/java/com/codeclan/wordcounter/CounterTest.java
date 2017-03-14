package com.codeclan.wordcounter;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 14/03/2017.
 */

public class CounterTest {

    Counter wordArray;

    @Before
    public void before(){
        wordArray = new Counter();
    }

    @Test
    public void checkNewListStartsEmpty(){
        assertEquals(0,wordArray.countWords());
    }

    @Test
    public void canAddWordToList(){
        wordArray.addWord("Test");
        assertEquals(1,wordArray.countWords());
    }

    @Test
    public void canAddStringToList(){
        wordArray.addString("Hello world this is a test");
        assertEquals(6,wordArray.countWords());
    }

    @Test
    public void canGetWordCount(){
        int testCount = wordArray.getWordCount("Hello world this is a test");
        assertEquals(6,testCount);
    }

}
