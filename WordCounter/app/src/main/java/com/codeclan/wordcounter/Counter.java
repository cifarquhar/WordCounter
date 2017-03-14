package com.codeclan.wordcounter;


import java.util.ArrayList;

/**
 * Created by user on 14/03/2017.
 */

public class Counter {

    private ArrayList<String> wordList;

    public Counter(){
        wordList = new ArrayList<String>();
    }

//    public ArrayList<String> showWordList(){
//        return wordList;
//    }

    public int countWords(){
        return wordList.size();
    }

    public void addWord(String word) {
        wordList.add(word);
    }
}
