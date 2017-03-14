package com.codeclan.wordcounter;


import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by user on 14/03/2017.
 */

public class Counter {

    private ArrayList<String> wordList;
    public HashMap<String,Integer> frequencyCounter;

    public Counter() {
        wordList = new ArrayList<String>();
        frequencyCounter = new HashMap<String,Integer>();
    }


    public int countWords() {
        return wordList.size();
    }

    public void addWord(String word) {
        wordList.add(word);
    }

//    public void addString(String string) {
//        String[] splitWords = string.split(" ");
//        for (int i = 0; i < splitWords.length; i++) {
//                addWord(splitWords[i]);
//            }
//        }

    public int getWordCount(String string) {
        addString(string);
        int wordCount = countWords();
        return wordCount;
    }

    public void addString(String string) {
        String[] splitWords = string.split(" ");
        for (int i = 0; i < splitWords.length; i++){
            Integer count = frequencyCounter.get(splitWords[i]);
            if (count == null){
                frequencyCounter.put(splitWords[i],1);
            }
            else {
              frequencyCounter.put(splitWords[i],count+1);
            }
        }
    }

    public String mapCount(){
        String outputString = "";
        for (String word: frequencyCounter.keySet()){
            Integer count = frequencyCounter.get(word);
            String countToAdd =  "\"" + word + "\"" + ": " + count.toString() + "," + "\n";
            outputString = outputString + countToAdd;
        }
        return outputString;
    }

}
