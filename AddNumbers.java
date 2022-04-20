package lesson2;
// 課題2 「1～10まで足した結果」をコンソール画面に表示

public class AddNumbers {

	public static void main(String[] args) {
		int number = 0;
		for (int i = 1; i <= 10; i++) {
			number += i;
		}
		System.out.println(number);
	}

}
