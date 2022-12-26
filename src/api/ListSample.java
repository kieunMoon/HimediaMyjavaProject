package api;

import java.util.ArrayList;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		String[] array = new String[] { "가", "나", "다", "라" };

		array[1] = null;
		array[2] = null;
		array[3] = null;
		System.out.println(array.length);

		List<String> list = new ArrayList<>();
		list.add("다");
		list.add("나");
		list.add("가");
		list.add("라");
		System.out.println(list.size());
		System.out.println(list.toString());
		list.remove(0);
		list.remove("라");
		System.out.println(list.size());
		System.out.println(list.toString());
		System.out.println(list.get(0));

		list.add(2, "다");
		System.out.println(list.size());
		System.out.println(list.toString());

		list.add(2, "X");
		System.out.println(list.size());
		System.out.println(list.toString());

		list.removeAll(list);
		System.out.println(list.size());
		System.out.println(list.toString());
		System.out.println(list.isEmpty());

	}

}