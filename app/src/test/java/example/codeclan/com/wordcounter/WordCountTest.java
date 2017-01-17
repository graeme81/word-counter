package example.codeclan.com.wordcounter;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 17/01/2017.
 */
public class WordCountTest {
    WordCount wordCount;
    String words = "This is four words";

    @Before
    public void before(){
        wordCount = new WordCount();
    }

    @Test
    public void wordCountIsEmpty(){
        assertEquals(0,wordCount.getSize());
    }

    @Test
    public void canAddWord(){
        wordCount.addWords("word");
        assertEquals(1,wordCount.getSize());
    }

    @Test
    public void canSplitWordsAndAdd(){
        wordCount.splitPhrase(words);
        assertEquals(4,wordCount.getSize());
    }

}