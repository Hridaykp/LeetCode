class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sal = 0;
        for(int i=1; i<salary.length-1; i++)
            sal += salary[i];
        return sal /(salary.length-2);
    }
}