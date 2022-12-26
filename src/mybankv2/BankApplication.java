package mybankv2;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accounts = new Account[100];
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		boolean isRun = true;
		while (isRun) {

			System.out.println("---------------------------------------------------");
			System.out.println("1.계정생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택 >  ");

			int menu = input.nextInt();

			switch (menu) {
			case 1:
				createAccount();
				break;
			case 2:
				showAccounts();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				isRun = false;
				break;
			}

		}
		System.out.println("프로그램을 종료");
		System.exit(0);
	}

	private static void createAccount() {

		printTitle("계좌생성");

		System.out.print("계좌번호: ");
		String accountNo = input.next();

		System.out.print("계좌주: ");
		String name = input.next();

		System.out.print("초기 입금액: ");
		int amount = input.nextInt();

		Account account = new Account();
		account.setAccountNo(accountNo);
		account.setName(name);
		account.setBalance(amount);

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = account;
				System.out.println("계좌가 생성 되었습니다.");
				break;
			}
		}

	}

	private static void showAccounts() {
		printTitle("계좌목록");
		for (int i = 0; i < accounts.length; i++) {
			Account account = accounts[i];
			if (account != null) {
				System.out.printf("%s\t%s\t%d\n", account.getAccountNo(), account.getName(), account.getBalance());
			}
		}
	}

	private static void deposit() {
		printTitle("예금");

		System.out.print("계좌번호: ");
		String accountNo = input.next();
		System.out.print("예금 액: ");
		int amount = input.nextInt();

		for (int i = 0; i < accounts.length; i++) {
			Account account = accounts[i];
			if (account != null && account.getAccountNo().equals(accountNo)) {
				account.setBalance(account.getBalance() + amount);

			}
		}

	}

	private static void printTitle(String title) {
		System.out.println("-----------");
		System.out.println(title);
		System.out.println("-----------");
	}

	private static void withdraw() {
		printTitle("출금");

		System.out.print("계좌번호: ");
		String accountNo = input.next();
		System.out.print("출금 액: ");
		int amount = input.nextInt();

		for (int i = 0; i < accounts.length; i++) {
			Account account = accounts[i];
			if (account != null && account.getAccountNo().equals(accountNo)) {
				account.setBalance(account.getBalance() - amount);

			}
		}

	}

}