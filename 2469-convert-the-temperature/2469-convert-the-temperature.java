class Solution {
    public double[] convertTemperature(double celcius) {
        double kel = celcius + 273.15;
        double fah = celcius*1.80 + 32.00;
        return new double[]{kel, fah};
    }
}