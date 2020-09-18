package generale_algorthem;

public class MultiplicationWithoutUsingOperator {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        System.out.println(multiplicationUsingRecursion(-4, -5));
        System.out.println(multiplication(-4, -5));
    }
        //multiplication Using Recursion
    public static int multiplicationUsingRecursion(int x, int y) {
        if (y > 0) {
            return x + multiplicationUsingRecursion(x, y - 1);
        } else return 0;
    }
    public static int multiplication(int x, int y) {
        int mul = 0;

        for (int i = 1; i <= y; i++) {
            mul = mul + x;
        }
        return mul;
    }
}

