class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length()!=words.length) return false;
        HashMap <Character,String> map = new HashMap();
        HashMap <String,Boolean> usedword = new HashMap();
        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            
            if(!map.containsKey(ch)){
                if(usedword.containsKey(words[i]))
                    return false;
                else{
                    usedword.put(words[i],true);
                    map.put(ch, words[i]);
                }     
            }
            else{
                String mapWord = map.get(ch);
              if(!mapWord.equals(words[i]))
                  return false;  
            }
        }
        return true;
    }
}