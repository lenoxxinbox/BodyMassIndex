public class BmiService {
    public double calculate(double weight, double height) {
        double bmi = Math.round((weight / (height * height)) * 100.0) / 100.0; // Вес в кг, Рост в м
        return bmi;
    }
}
