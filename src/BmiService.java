public class BmiService {
    public int myBmi(int weight, double height) {
        int result = (int) (weight / (height * height));

        return result;
    }
}
