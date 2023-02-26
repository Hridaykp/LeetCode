class Solution {
    public int[] divisibilityArray(String word, int m) {
        List<Integer> list = new ArrayList();
        int j=0;
        long number = 0;
        while(j < word.length()){
            int dig = word.charAt(j)-'0';
            number = number*10 + dig;
            if(number % m == 0)
                list.add(1);
            else
                list.add(0);
            if(number > m)
                number %= m;
            j++;
            // System.out.println(number);
        }
        int p=0;
        int arr[] = new int[list.size()];
        for(int i: list) arr[p++] = i;
        return arr;
    }
}