public class Main {
    public static void main(String[] args) {

        System.out.println(sumOfOddPositive(6));


    }

    public static int sumOfOddPositive(int k) {
        int sum = 0;

//        for (int i = 0; i <= k; i++){
//            if (i % 2 != 0)
//                sum += i;
//        }

        for (int i = 1; i <= k; i += 2) {
            sum += i;
        }


        return sum;

    }
}
