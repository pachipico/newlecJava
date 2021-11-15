package oop.capsule;

import java.util.Scanner;

public class Program {
	private Exam[] exams;
	private int current;

	public static void main(String[] args) {

		ExamList list = new ExamList();
		ExamConsole console = new ExamConsole();
		int menu;
		boolean keepLoop = true;

		while (keepLoop) {
			menu = inputMenu();

			switch (menu) {
			case 1:
//				ExamList.inputList(list);
				console.inputList();
				break;
			case 2:
//				ExamList.printList(list);
				console.printList();
				break;
			case 3:
				System.out.println("bye");
				keepLoop = false;
				break;
			default:
				break;
			}
		}
	}

	private static int inputMenu() {
		Scanner sc = new Scanner(System.in);

		System.out.println("select a menu");
		System.out.println("1. 입력, 2.평균, 3.종료");
		return sc.nextInt();

	}
}
