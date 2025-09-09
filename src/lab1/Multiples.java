package lab1;

public class Multiples {
    public static void main(String[] args) {

        int n = 0;
        int count= 0;

        while (n != 1000){

            if (n % 3 == 0){
                count++;
            } else if (n % 5 == 0) {
                count++;
            }


            n++;
        }

        System.out.println(count);
    }
}
