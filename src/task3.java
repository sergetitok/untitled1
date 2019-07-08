import java.util.Random;

public class task3 {

    public static void main(String[] args) {
        int numOfTries = 1000;
        headsTailsGame(numOfTries);

        int num1 = 8128;
        perfectNumberCheck(num1);

        int num4 = 109;
        simpleNumbersCheck(num4);

        int num6 = 1223;
        maxDigitCheck(num6);

        int num7 = 165;
        int num8 = 45;
        nokNod(num7, num8);

        friendlyNumbersCheck(200, 3000);
    }

    public static void headsTailsGame(int numOfTries) {
        Random rnd = new Random(System.currentTimeMillis());// объект класса рандом

        int headsCount = 0;
        int tailsCont = 0;
        boolean coinFlip = true;

        for (int i = 1; i <= numOfTries; i++) {

            coinFlip = rnd.nextBoolean();
            if (coinFlip == true) {
                headsCount++;
            } else if (coinFlip == false) {
                tailsCont++;
            }

        }
        System.out.println("Heads count: " + headsCount + ", tails count " + tailsCont);

    }

    public static void maxDigitCheck(int num6) {
        int maxDigit = 0;
        int tempdigit = 0;

        while (num6 > 0) {

            tempdigit = num6 % 10;

            if (maxDigit < tempdigit) {
                maxDigit = tempdigit;
            }
            num6 = num6 / 10;
        }

        System.out.println("Max digit of number is " + maxDigit);
    }

    public static void perfectNumberCheck(long num1) {

        int dividersSumm = 1;//сумма делителей


        for (int i = 2; i <= num1 / 2; i++) {

            if (num1 % i == 0) {
                dividersSumm += i;
            }


        }
        if (dividersSumm == num1) {
            System.out.println("Number " + num1 + "is perfect");
        } else {
            System.out.println("Number " + num1 + "is not perfect");
        }

    }

    /*public static void friendlyNumbersCheck(int num2, int num3) {

        int dividersSumm = 1;


        for (int i = 2; i <= num1 / 2; i++) {

            if (num1 % i == 0) {
                dividersSumm += i;
            }


        }
        if (dividersSumm == num1) {
            System.out.println("Number " + num1 + "is perfect");
        }
        else{
            System.out.println("Number " + num1 + "is not perfect");}

    } //подумать над этим похже*/

    public static void simpleNumbersCheck(long num4) {


        if (num4 > 0) {
            int dividersSumm = 1;

            for (int i = 2; i <= num4 / 2; i++) {

                if (num4 % i == 0) {
                    dividersSumm += i;
                }
            }
            if (dividersSumm == 1) {
                System.out.println("Number " + num4 + " is simple");
            } else {
                System.out.println("Number " + num4 + " is not simple");
            }
        } else {
            System.out.println("Enter correct number");
        }
    }


    public static int Nod(int num7, int num8) {
        int nod = 0;

        while (num8 != 0) {
            nod = num7 % num8;
            num7 = num8;
            num8 = nod;

        }

        return num7;

    }

    public static void nokNod(int num7, int num8) {
        Nod(num7, num8);

        int nok = num7 * num8 / Nod(num7, num8);


        System.out.println("Nok of numbers is  " + Nod(num7, num8) + " Nod of numbers is " + nok);

    }

    public static boolean isFriendly(int num1, int num2) {// метод для проверки 2 чисел на дружественность

        int dividersSumm1 = 0, dividersSum2 = 0;
        if (num1 == num2) {
            return false;
        }
        for (int i = 1; i <= (num1 / 2); i++) {
            if((num1 % i) == 0) {
                dividersSumm1 += i;
            }
        }
        for (int j = 1; j <= (num2 / 2); j++) {
            if((num2 % j) == 0) {
                dividersSum2 += j;
            }
        }
        if ((dividersSumm1 == num2) && (dividersSum2 == num1)) {
            return true;
        } else {
            return false;
        }

    }
    public static void friendlyNumbersCheck(int firstNum, int secondNum) {

        for (int i = firstNum; i <= secondNum; i++) { //цикл переребирает диапазон
            for (int j = (i + 1); j <= secondNum; j++) {// цикл сравнивает каждый делитель i поочереддно с диапазоном

                if (isFriendly(i, j)) {
                    System.out.println("Numbers " + i + " and " + j+" are friendly");
                }
            }
        }

    }

}









