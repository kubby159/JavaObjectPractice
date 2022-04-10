package ch11;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {

		// Calc 는 CompleteCalc의 타입.
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int num1 = sc1.nextInt();
		int num2 = sc2.nextInt();
		Calc calc = new CompleteCalc();
		int result = calc.add(num1, num2);
		System.out.println(result);
		CompleteCalc complete = (CompleteCalc) calc;
		complete.showInfo();
	}

}
