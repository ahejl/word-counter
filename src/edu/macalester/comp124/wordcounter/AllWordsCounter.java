package edu.macalester.comp124.wordcounter;

/**
 * A counter that keeps track of counts for all words
 * 
 * @author shilad
 *
 */
public class AllWordsCounter {

    public static final int MAX_WORDS = 10000;

    private int count;
    private SingleWordCounter counters[] = new SingleWordCounter[MAX_WORDS];

    public int getNumWords() {
        int NumWords = 0;
        for (int i = 0; i < MAX_WORDS; i++) {
            if (counters[i] != null) {
                NumWords = i;
            }
        }
        // Counts the number of distinct words,
        // i.e. the number of non-null counter objects.
        return NumWords;
    }
	
	/**
	 * Increment the count for the specified word.  Remember that this may
     * be the first time the word counter has seen this particular word.
	 * 
	 * @param word
	 */
	public void count(String word) {
        int n = getNumWords();
        for (int i = 0; i < n; i++) {
            // If you find the word increment the count and return
            if (counters[i].wordMatches(word)){
                counters[i].incrementCount();
            }
            // You didn't find the word. Add a new word counter to the array.
            // Don't forget to increment the word's count to get it to 1!
            counters[n + 1] = new SingleWordCounter(word);
            counters[n + 1].incrementCount();
            }
        }

	/**
	 * Return the count for the particular word.  Remember that the
	 * word may not have been seen before.
	 * @param word
	 * @return
	 */
	public int getCount(String word) {
        int n = getNumWords();
        for (int i = 0; i < n; i++) {
            if (counters[i].wordMatches(word)){

                return counters[i].getCount();
            }
        }
        return 0;
            // Make sure to return 0 for words you haven't seen before.
	}
	
	/**
	 * @return The an array of all words that have been counted
	 * (just the words, not the values).
	 */
	public String []  getAllWords() {
        // part one: create an array of strings of size equal to the number of words
        int n = getNumWords();
        String words[] = null;  // FIXME

        // part two: fill the array of strings using a loop

        return words;
	}
}
