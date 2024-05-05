class main {

    public static int missingNumber(int[] data) {
        int maxNum = data.length + 1;
        int expectedSum = maxNum * (maxNum + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < data.length; i++) {
            actualSum += data[i];
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] input = {1, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = missingNumber(input);
        System.out.println("Missing Number: " + result);
    }
}
