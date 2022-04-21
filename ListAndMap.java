package lesson2;
// 課題5 String型のListとMapを作成してその内容をコンソール画面に表示

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ListAndMap {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("りんご");
		fruits.add("みかん");
		fruits.add("ぶどう");
		fruits.add("いちご");

		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		System.out.println("---------------");

		Map<String, Integer> vegetables = new LinkedHashMap<>();
		vegetables.put("トマト", 200);
		vegetables.put("にんじん", 100);
		vegetables.put("たまねぎ", 50);
		vegetables.put("かぼちゃ", 300);

		for (Map.Entry<String, Integer> vegetable : vegetables.entrySet()) {
			System.out.println(vegetable.getKey() + "：" + vegetable.getValue() + "円");
		}

	}

}
