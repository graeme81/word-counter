package example.codeclan.com.wordcounter;

import java.util.ArrayList;

/**
 * Created by user on 17/01/2017.
 */

public class WordCount {
    private ArrayList<String> wordCount;

    public WordCount() {
        wordCount = new ArrayList<String>();
    }

    public ArrayList getWordCount(){
        return wordCount;
    }

    public void addWords(String word){
        wordCount.add(word);
    }

    public int getSize(){
        return wordCount.size();
    }

    public void splitPhrase(String input){
        String[] array = input.split(" ");
        for (String word: array){
            wordCount.add(word);
        }
    }

}
