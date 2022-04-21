package lesson2;
// 課題4 引数が0なら偽、引数が1なら真とコンソール画面に表示

public class TrueOrFalse {

	public static void main(String[] args) {
		try {
			int number = checkNumber(3);
			if (number == 0) {
				System.out.println("偽");
			} else if (number == 1) {
				System.out.println("真");
			}
		} catch (Exception e) {
			System.out.println("0または1を入力してください");
		}

	}

	public static int checkNumber(int number) throws Exception {
		if (!(number == 0 || number == 1)) {
			throw new Exception("値が有効ではありません");
		}
		return number;
	}

}
