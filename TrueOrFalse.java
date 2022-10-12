package lesson2;
// 課題4 引数が0なら偽、引数が1なら真とコンソール画面に表示

public class TrueOrFalse {

	public static void main(String[] args) throws Exception {
		if (isTrueOrFalse(3)) {
			System.out.println("真");
		} else {
			System.out.println("偽");
		}

	}

	public static boolean isTrueOrFalse(int number) throws Exception {
		if (number == 1) {
			return true;
		} else if (number == 0) {
			return false;
		} else {
			throw new Exception("値が有効ではありません");
		}
	}

}
