public class BmiService {
    public double calculate(int weightInKilo, double resultHeight) {
        double index = (weightInKilo / resultHeight);
        double heightInMeters;
        double exponent = 2;
        double resultHeight = Math.pow(heightInMeters, exponent);
        double index = (int) index;
        return (int) index;
    }
}
