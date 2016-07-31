package com.example.timothy.tryfragmentlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Timothy on 31/07/2016.
 */
public class WordContent {

    /**
     * An array of sample (dummy) words.
     */
    public static final List<WordItem> WORD_ITEMS_DUMMY = new ArrayList<>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            WORD_ITEMS_DUMMY.add(new WordItem(""+i,"Word "+i, "This is word "+i+" description"));
        }
    }

    /**
     * A word item representing a piece of content.
     */
    public static class WordItem {
        public final String id;
        public final String wordTitle;
        public final String wordDescription;

        public WordItem(String id, String wordTitle, String wordDescription) {
            this.id = id;
            this.wordTitle = wordTitle;
            this.wordDescription = wordDescription;
        }
    }
}
