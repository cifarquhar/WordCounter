package com.codeclan.wordcounter;


import java.util.ArrayList;

/**
 * Created by user on 14/03/2017.
 */

public class Counter {

    private ArrayList<String> wordList;

    public Counter() {
        wordList = new ArrayList<String>();
    }


    public int countWords() {
        return wordList.size();
    }

    public void addWord(String word) {
        wordList.add(word);
    }

    public void addString(String string) {
        String[] splitWords = string.split(" ");
        for (int i = 0; i < splitWords.length; i++) {
                addWord(splitWords[i]);
            }
        }

    public int getWordCount(String string) {
        addString(string);
        int wordCount = countWords();
        return wordCount;
    }
}
