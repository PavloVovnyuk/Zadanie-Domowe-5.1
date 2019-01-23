public class Calculator {
    public int calk(int a, int b) {
        int result = 0;
        if (a > b) {
            result = a + b;
        } else if (a < b) {
            result = a * b;
        } else if (a == b) {
            result = (int) Math.pow (a, 2);
        }
        return result;
    }
}
