class Main {
    public static void main(String[] args) {
        int n = 5;
        long f = fact(n);
        System.out.println("F of " + n + ": " + f);
    }
    
    public static long fact(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * fact(x - 1);
        }
    }
}
