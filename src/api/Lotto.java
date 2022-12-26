package api;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {

		int[] lottoNumber = new int[6];
		int[] userNumber = new int[6];
		Scanner input = new Scanner(System.in);
		System.out.println("1부터 45 사이의 6개의 숫자를 입력하세요.");
		String inputNumber = input.nextLine();
		input.close();
		String[] stringUserNumber = (inputNumber.split(","));

		for (int i = 0; i < userNumber.length; i++) {
			userNumber[i] = Integer.parseInt(stringUserNumber[i]);
		}

		Arrays.sort(userNumber);
		System.out.println("선택번호: " + Arrays.toString(userNumber));

		for (int i = 0; i < lottoNumber.length; i++) {
			int num = (int) (Math.random() * 45) + 1;
			lottoNumber[i] = num;
		}
		Arrays.sort(lottoNumber);
		System.out.println("당첨번호: " + Arrays.toString(lottoNumber));
		int count = 0;
		for (int i = 0; i < userNumber.length; i++) {
			for (int j = 0; j < lottoNumber.length; j++) {
				if (userNumber[i] == lottoNumber[j]) {
					count++;
				}
			}
		}

		if (count == 6) {
			System.out.println("1등 당첨");
		} else if (count == 5) {
			System.out.println("2등 당첨");
		} else if (count == 4) {
			System.out.println("3등 당첨");
		} else {
			System.out.println(count + "개 밖에;;");
		}

	}

}