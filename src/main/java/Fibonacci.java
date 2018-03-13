public class Fibonacci {


    public static int caculate(int i) {
        if(i >= 3) {
            return caculate(i - 2) + caculate(i - 1);
        }
        return 1;
    }
}
