class Solution {
    public int maxNumberOfBalloons(String text) {
        int count = 0;
        int a=0,b=0,l=0,o=0,n=0;
        for(char ch: text.toCharArray()){
            if(ch =='a') a++;
            else if(ch =='b') b++;
            else if(ch =='l') l++;
            else if(ch =='o') o++;
            else if(ch =='n') n++;
            if(a >=1 && b >=1 && l >=2 && o >=2 && n >=1){
                count++;
                a--;b--;n--;l -=2; o-=2;
            }
        }
        return count;    
    }
}