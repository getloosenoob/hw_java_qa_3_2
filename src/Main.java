public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.78;
        int weight = 77;
        int bmi = service.calculate(height, weight);
        System.out.println(bmi);

    }
}