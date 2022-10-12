package lesson2;

import java.util.stream.IntStream;

// 課題2 「1～10まで足した結果」をコンソール画面に表示

public class AddNumbers {

	public static void main(String[] args) {
		int number = 0;
		for (int i = 1; i <= 10; i++) {
			number += i;
		}
		System.out.println(number);

		System.out.println(IntStream.rangeClosed(0, 10).sum());

		System.out.println(getSum(1, 10));

	}

	public static int getSum(int number1, int number2) {
		return (number1 + number2) * number2 / 2;
	}

}
