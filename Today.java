package lesson2;
// 課題3 「3年後の今日が何曜日なのか」を計算してコンソール画面に表示

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Today {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		String today = now.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 E曜日"));

		LocalDateTime threeYearsLater = now.plusYears(3);
		DayOfWeek dayOfWeek = threeYearsLater.getDayOfWeek();

		System.out.println("今日は" + today);
		System.out.println("3年後の今日は" + dayOfWeek.getDisplayName(TextStyle.FULL, Locale.JAPANESE));
	}

}
