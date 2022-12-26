package api;

import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// 숫자 1키를 누르면 스피드가 증가하고
		// 숫자 2키를 누르면 스피드가 감소하고,
		// 숫자 3키를 누르면 프로그램을 중지
		int speed = 0;
		int keyCode = 0;

		while (true) {
			keyCode = System.in.read();
			if (keyCode != 13 && keyCode != 10) {
				if (keyCode == 49) {
					speed++;
				} else if (keyCode == 50) {
					speed--;

				} else if (keyCode == 51) {
					break;
				}
				System.out.println("현재 속도는 :" + speed);
			}
		}
		System.out.println("프로그램 종료");

		System.out.println("새로운 내용을 추가");
		System.out.println("또 새로운 내용을 추가");

		System.out.println("또 새로운 내용을 추가");
	}
	

}
