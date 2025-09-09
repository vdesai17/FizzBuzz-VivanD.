package lab1;

public class Multiples {
    public static void main(String[] args) {

        System.out.println(multiples(1000,3,5));
    }

    public static int multiples(int n, int a, int b) {
        int count = 0;
        n = n - 1;
        while (n != 0){

            if (n % a == 0){
                count++;
                n--;
            } else if (n % b == 0) {
                count++;
                n--;
            } else {

                n--;
            }


        }
        return count;
    }
}
