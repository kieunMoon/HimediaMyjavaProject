package test;

import java.util.Scanner;

public class AddressBook {

	private static Person[] persons = new Person[100];
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		boolean isRun = true;
		while (isRun) {

			showMenu();
			switch (input.nextInt()) {
			case 1:
				createAddress();
				break;
			case 2:
				showAddress();
				break;
			case 3:
				fix();
				break;
			case 4:
				delete();
				break;
			case 5:
				isRun = false;
				break;
			}

		}
		System.out.println("프로그램을 종료");

	}

	private static void createAddress() {
		printTitle("등록");

		System.out.println("이름 : ");
		String name = input.next();
		System.out.println("전화번호 : ");
		String phone = input.next();
		System.out.println("학생여부 : ");
		String isStudent = input.next();

		
	
		if (isStudent.equals("Y") || isStudent.equals("y")) {
			System.out.println("학번 : ");
			String studentNo = input.next();
			for (int i = 0; i < persons.length; i++) {
				if (persons[i] == null) {
					Student student = new Student(name, phone, studentNo);
					persons[i] = student;
					System.out.println("결과 > 정상적으로 등록되었습니다");
					break;
				}
			}
		} else if (isStudent.equals("N") || isStudent.equals("n")) {
			System.out.println("사번 : ");
			String workerNo = input.next();
			for (int i = 0; i < persons.length; i++) {
				if (persons[i] == null) {
					Worker worker = new Worker(name, phone, workerNo);
					persons[i] = worker;
					System.out.println("결과 > 정상적으로 등록되었습니다");
					break;
				}

			}
		}

	}

	private static void showAddress() {
		printTitle("조회");

		for (int i = 0; i < persons.length; i++) {
			Person person = persons[i];
			if (person != null) {
				person.print();

			}
		}

	}

	private static void fix() {
		printTitle("수정");

		System.out.println("이름 : ");
		String name = input.next();
		System.out.println("전화번호 : ");
		String phone = input.next();

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null && persons[i].getName().equals(name)) {
				persons[i].setPhone(phone);
				break;
			}
		}

	}

	private static void delete() {
		printTitle("삭제");

		System.out.println("이름 : ");
		String name = input.next();

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null && persons[i].getName().equals(name)) {
				persons[i] = null;
				System.out.println("삭제 완료");
				break;
			}
		}

	}

	private static void printTitle(String title) {
		System.out.println("-----------");
		System.out.println(title);
		System.out.println("-----------");
	}

	private static void showMenu() {
		System.out.println("---------------------------------------------------");
		System.out.println("1.등록 | 2.조회 | 3.수정 | 4.삭제 | 5.종료");
		System.out.println("---------------------------------------------------");
		System.out.print("선택 >  ");

	}

}
