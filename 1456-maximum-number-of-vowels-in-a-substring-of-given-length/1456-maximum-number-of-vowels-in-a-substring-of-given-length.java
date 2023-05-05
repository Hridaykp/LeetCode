// class Solution {
//     private int Count(String sub){
//         Set<Character> set = new HashSet();
//         set.add('a');set.add('e');set.add('i');
//         set.add('o');set.add('u');
//         int cnt = 0;
//         for(char c: sub.toCharArray())
//             if(set.contains(c))
//                 cnt++;
//         return cnt;
//     }
//     public int maxVowels(String s, int k) {
//         int max = 0;
        
//         for(int i=0; i<s.length()-k+1; i++){
//             String sub = s.substring(i,i+k);
//             int cnt = Count(sub);
//             max = Math.max(max, cnt);
//             // System.out.println(sub);
//         }
//         return max;
//     }
// }


class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int count = 0;
        for (int i = 0; i < k; i++) {
            count += vowels.contains(s.charAt(i)) ? 1 : 0;
        }
        int answer = count;
        
        for (int i = k; i < s.length(); i++) {
            count += vowels.contains(s.charAt(i)) ? 1 : 0;
            count -= vowels.contains(s.charAt(i - k)) ? 1 : 0;
            answer = Math.max(answer, count);
        }
        
        return answer;
    }
}