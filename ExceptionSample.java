package lesson2;
//課題6 任意のプログラムで例外を起こしてみる。デバッグを使って例外の内容を見てみる。

//内容：getNumberメソッドで得た数字をString型に変換して出力。引数がnullの場合に例外が発生する。例外処理を追加して動作するようにする。

public class ExceptionSample {

	public static void main(String[] args) {
		try {
			Integer n = getNumber(null);
			String number = n.toString();
			System.out.println(number);

		} catch (Exception e) {
			System.out.println("値がnullです");
		}

	}

	public static Integer getNumber(Integer i) throws Exception {
		if (i == null) {
			throw new Exception("変数iはnullを許容しません");
		}
		return i;
	}

}
