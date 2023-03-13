public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int allmyBmi = service.myBmi(80, 1.84);

        System.out.println(allmyBmi);

    }
}
