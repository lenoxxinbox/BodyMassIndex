public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(86, 1.65);
        System.out.println("Индекс массы вашего тела равен " + bmi);

    }
}
