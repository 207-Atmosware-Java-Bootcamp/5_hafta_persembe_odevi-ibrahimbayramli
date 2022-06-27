import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String myWord = scan.next();

        System.out.print("Bir sayi giriniz: ");
        int myNum = scan.nextInt();
        System.out.print("Bir sayi giriniz: ");
        System.out.print("Bir sayi giriniz: ");
        int myNum1 = scan.nextInt();

        System.out.println("Girdiginiz kelime: " + myWord);
        System.out.println("Girdiginiz sayi: " + myNum);
        System.out.println("Girdiginiz yeni sayi: " + myNum1);
        System.out.println("Girdiginiz kelimenin tersten yazilmis hali: " + reverseWord(myWord));
        System.out.println("Girdiginiz kelimenin maskelenmi? hali: " + maskWord(myWord));
        System.out.println("Girdiginiz sayinin faktoriyeli: " + faktoriel(myNum));
        System.out.print("Girdiginiz sayiya kadar Fibonacci serisi: ");
        fibonacci(myNum);
        System.out.println();
        if (isPrime(myNum)) {
            System.out.println("Girdiginiz sayi asaldir.");
        } else {
            System.out.println("Girdiginiz sayi asal degildir.");

        }
        if (isPerfectNum(myNum)) {
            System.out.println("Girdiginiz sayi super sayidir.");
        } else {
            System.out.println("Girdiginiz sayi super sayi degildir.");

        }
        isLeterIsDigit(myWord.charAt(0));

        System.out.println("Girilen sayilarin EBOB'u: " + ebob(myNum, myNum1));
        System.out.print("Girilen sayilarin EKOK'u: ");
        ekok(myNum, myNum1);

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

    public static boolean isPerfectNum(int num) {
        int total = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                total += i;
            }
        }
        return total == num;
    }

    public static void isLeterIsDigit(char c) {
        if (Character.isLetter(c)) {
            System.out.println("Harf: " + c);
        } else if (Character.isDigit(c)) {
            System.out.println("Say?: " + c);
        } else {
            System.out.println("Özel Karakter: " + c);
        }
    }

    public static void ekok(int num1, int num2) {
        int ekok = (num1 * num2) / ebob(num1, num2);
        System.out.println("Ekok: " + ekok);
    }

    public static int ebob(int num1, int num2) {
        int ebob = 1;
        for (int i = Math.min(num1, num2); i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i;
                break;
            }
        }
        return ebob;
    }
}