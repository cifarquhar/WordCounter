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

}