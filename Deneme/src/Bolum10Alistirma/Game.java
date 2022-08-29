package Bolum10Alistirma;

import java.util.Scanner;

import Bolum9Alistirma.Account;;

public class Game {
	public static void main(String[] args) {

		Account[] accounts = new Account[10];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, 100);
		}
	}

	public static int asKforID(Account[] accounts) {
		Scanner input = new Scanner(System.in);
		int id = 0;
		boolean isValidID = false;
		while (!isValidID) {
			System.out.println("Enter an ID:");
			id = input.nextInt();

			if (!hasID(accounts, id)) {
				System.out.println("INVALID ID;Try again.");
			} else {
				isValidID = true;
			}
		}
		return id;
	}

	public static Account getAccount(Account[] accounts, int id) {
		for (Account account : accounts) {
			if (id == account.getId()) {
				return account;
			}
		}
		return null;
	}

	public static boolean hasID(Account[] accounts, int id) {
		for (Account account : accounts) {
			if (id == account.getId()) {
				return true;
			}
		}
		return false;
	}
}
