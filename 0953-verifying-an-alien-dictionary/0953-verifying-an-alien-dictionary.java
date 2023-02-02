class Solution {
    Map<Character, Integer> map;
    public boolean compare(String s1, String s2){
        int n1 = s1.length(), n2 = s2.length();
        for(int i=0,j=0; i<n1 && j<n2; i++,j++){
            if(s1.charAt(i)!=s2.charAt(j)){
                if(map.get(s1.charAt(i)) > map.get(s2.charAt(j)))
                    return false;
                else 
                    return true;
            }
        }
        if (n1 > n2) 
            return false;
        return true;
    }
    public boolean isAlienSorted(String[] words, String order) {
        map = new HashMap();
        char[] arr = order.toCharArray();
        for(int i=0; i<arr.length; i++)
            map.put(arr[i], i);
            
        for(int i=0; i<words.length-1; i++)
            if(!compare(words[i], words[i+1]))
                return false;
        return true;
    }
}