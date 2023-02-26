class Solution {
    public int[] divisibilityArray(String word, int m) {
        int arr[] = new int[word.length()];;
        int j=0, i=0;
        long number = 0;
        while(j < word.length()){
            int dig = word.charAt(j)-'0';
            number = number*10 + dig;
            if(number % m == 0)
                arr[i++] = 1;
            else
                arr[i++] = 0;
            if(number > m)
                number %= m;
            j++;
        }
        return arr;
    }
}