public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 80;
        double heightMeters = 1.73;
        int index = service.calculate(weightKg, heightMeters);
        System.out.println(index);
    }
}