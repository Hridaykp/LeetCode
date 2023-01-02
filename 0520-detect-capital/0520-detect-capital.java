class Solution {
    public boolean detectCapitalUse(String word) {
        if(word == word.toLowerCase() || word == word.toUpperCase()
          || word.substring(1).equals(word.substring(1).toLowerCase()))
            return true;
       
        return false;
    }
}