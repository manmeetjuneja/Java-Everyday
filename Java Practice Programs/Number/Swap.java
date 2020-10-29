import java.util.Scanner;
public class Swap
{
	public static void main(String[] args) {
    int number1,number2;    // swap without
    Scanner sc = new Scanner(System.in);
    number1 = sc.nextInt();
    number2 = sc.nextInt();
    number1 = number1 + number2;
    number2 = number1 - number2;
    number1 = number1 - number2;
    System.out.println(number1 +" "+number2);
	}
}