class Solution {
    public boolean closeStrings(String word1, String word2) {
        Map<Character, Integer> firstWord = new HashMap<Character, Integer>();
        Map<Character, Integer> secondWord = new HashMap<Character, Integer>();

        for (int i = 0; i < word1.length(); i++) {
            firstWord.put(word1.charAt(i), firstWord.getOrDefault(word1.charAt(i), 0) + 1);
        }
        for (int i = 0; i< word2.length(); i++) {
            secondWord.put(word2.charAt(i), secondWord.getOrDefault(word2.charAt(i), 0) + 1);
        }
        List<Integer> firstCount = new ArrayList<>(firstWord.values());
        List<Integer> secondCount = new ArrayList<>(secondWord.values());
        Collections.sort(firstCount);
        Collections.sort(secondCount);

        return firstCount.equals(secondCount) &&
                firstWord.keySet().equals(secondWord.keySet());
    }
}