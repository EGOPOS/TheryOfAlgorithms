public class Main {
    public static void main(String[] args) {
        double result = 0.0f;
        float f = 1.0f;
        int p = 1;
        for (int i = 1; i < 11; i += 1)
        {
            result += p/f;
            p *= 2;
            f *= i;
        }
        System.out.println(String.format("Result is " + result));
    }
}