
class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        rotate(nums, k);
        System.out.println("Rotated: " + java.util.Arrays.toString(nums));
    }
    
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        flip(arr, 0, n - 1);
        flip(arr, 0, k - 1);
        flip(arr, k, n - 1);
    }
    
    public static void flip(int[] a, int s, int e) {
        while (s < e) {
            int t = a[s];
            a[s] = a[e];
            a[e] = t;
            s++;
            e--;
        }
    }
}
