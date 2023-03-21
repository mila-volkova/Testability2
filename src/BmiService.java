public class BmiService {
    public int calculate(int weghtKg, double heightMeters) {
        return (int) (weghtKg / heightMeters /  heightMeters);
    }
}
