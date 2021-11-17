package oop.capsule;

import java.util.Scanner;

public abstract class ExamConsole {

	private ExamList list;

	public ExamConsole() {
		list = new ExamList();
	}

	public void print() {
		print(list.size());

	}

	public void print(int size) {

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
			onPrint(exam);
			System.out.printf("total: %3d\n", total);
			System.out.printf("avg: %6.2f\n", avg);
		}
	}


	public void input() {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;
		System.out.printf("kor: ");
		kor = sc.nextInt();
		System.out.printf("eng: ");
		eng = sc.nextInt();
		System.out.printf("math: ");
		math = sc.nextInt();

		Exam exam = makeExam();
		onInput(exam);
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
		
		list.add(exam);
	}

	protected abstract void onPrint(Exam exam);
	protected abstract void onInput(Exam exam);

	protected abstract Exam makeExam();

}
