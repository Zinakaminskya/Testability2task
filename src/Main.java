//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKilo = 98;
        double heightInMeters = 1.87;
        double index = service.calculate(weightInKilo, resultHeight);
        System.out.println((int) index);
    }
}
