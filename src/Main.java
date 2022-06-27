import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String myWord = scan.next();

        System.out.print("Bir sayi giriniz: ");
        int myNum=scan.nextInt();

        System.out.println("Girdiginiz kelime: " + myWord);
        System.out.println("Girdiginiz sayi: " + myNum);
        System.out.println("Girdiginiz kelimenin tersten yazilmis hali: " + reverseWord(myWord));
        System.out.println("Girdiginiz kelimenin maskelenmi? hali: " + maskWord(myWord));
        System.out.println("Girdiginiz sayinin faktoriyeli: " + faktoriel(myNum));
        System.out.print("Girdiginiz sayiya kadar Fibonacci serisi: " );
        fibonacci(myNum);
        System.out.println();
        if(isPrime(myNum)){
            System.out.println("Girdiginiz sayi asaldir.");
        }else {
            System.out.println("Girdiginiz sayi asal degildir.");

        }


    }

    public static String reverseWord(String word) {
        String result = "";
        int len = word.length();
        for (int i = len - 1; i >= 0; i--) {
            result += word.charAt(i);
        }
        return result;
    }

    public static String maskWord(String word) {
        String result = "";
        int len = word.length();
        for (int i = 0; i < len; i++) {
            if (i == 0 || i == (len - 1)) {
                result += word.charAt(i);
            } else {
                result += "*";
            }
        }
        return result;
    }

    public static int faktoriel(int num) {
        int result = 1;
        for (int i = num; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    public static void fibonacci(int num) {
//*! 1 1 2 3 5 myNum=5
        int temp1 = 1;
        int temp2 = 1;
        for (int i = 1; i <= num; i++) {
            System.out.print(temp1 + " ");
            int temp3 = temp1 + temp2;
            temp1 = temp2;
            temp2 = temp3;

        }

    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}