public class saat {
    public static void main(String[] args) {

            int num = 29;
            boolean   isprime = false;
            for (int i = 2; i <= num / 2; ++i) {
                // condition for nonprime number
                if (num % i == 0) {
                    isprime= false;
                    break;
                }
            }

            if (  isprime)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }
    }

