public class Main {
    public static int f(int digital)
    {
        int result = digital;
        for (int i = 1; i < digital; i+=1) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        double result = 1.0f;
        for (int i = 1; i < 11; i += 1)
        {
            result += Math.pow(2, i)/f(i);
        }
        System.out.println(String.format("Result is " + result));
    }
}