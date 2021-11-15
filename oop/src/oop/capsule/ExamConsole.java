package oop.capsule;

import java.util.Scanner;

public class ExamConsole {

	private ExamList list = new ExamList();

	
	public void printList() {
		printList(list.size());

	}

	public void printList(int size) {

		for (int i = 0; i < size; i++) {
			Exam exam = list.get(i);
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();

			int total = exam.total();
			float avg = exam.avg();
			System.out.printf("kor: %d\n", kor);
			System.out.printf("eng: %d\n", eng);
			System.out.printf("math: %d\n", math);
			System.out.printf("total: %3d\n", total);
			System.out.printf("avg: %6.2f\n", avg);
		}
	}

	public void inputList() {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;
		System.out.printf("kor: ");
		kor = sc.nextInt();
		System.out.printf("eng: ");
		eng = sc.nextInt();
		System.out.printf("math: ");
		math = sc.nextInt();

		Exam exam = new Exam(kor, eng, math);

		list.add(exam);
	}

}
