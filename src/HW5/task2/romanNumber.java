package HW5.task2;
import java.util.Scanner;
public class romanNumber {
   /* Перевести натуральное число n > 0 в римскую систему.
 * Римские цифры: 1 = I, 4 = IV, 5 = V, 9 = IX, 10 = X, 40 = XL, 50 = L,
 * 90 = XC, 100 = C, 400 = CD, 500 = D, 900 = CM, 1000 = M.
 * Например: 23 = XXIII, 44 = XLIV, 100 = C
 */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numbers;
        int a;
        String s = "";
        System.out.println("Введите число для перевода в римские символы: ");
        numbers = in.nextInt();
        if (numbers < 1 || numbers > 3999)
            System.out.println("некоректное число");
        while (numbers >= 1000) {
                s += "M";
                numbers -= 1000;
            }
        while (numbers >= 900) {
            s += "CM";
            numbers -= 900;
        }
        while (numbers >= 500) {
            s += "D";
            numbers -= 500;
        }
        while (numbers >= 400) {
            s += "CD";
            numbers -= 400;
        }
        while (numbers >= 100) {
            s += "C";
            numbers -= 100;
        }
        while (numbers >= 90) {
            s += "XC";
            numbers -= 90;
        }
        while (numbers >= 50) {
            s += "L";
            numbers -= 50;
        }
        while (numbers >= 40) {
            s += "XL";
            numbers -= 40;
        }
        while (numbers >= 10) {
            s += "X";
            numbers -= 10;
        }
        while (numbers >= 9) {
            s += "IX";
            numbers -= 9;
        }
        while (numbers >= 5) {
            s += "V";
            numbers -= 5;
        }
        while (numbers >= 4) {
            s += "IV";
            numbers -= 4;
        }
        while (numbers >= 1) {
            s += "I";
            numbers -= 1;
        }
        System.out.println(s);
    }
}


