package 추상화;

import java.util.Scanner;

import oop.capsule.Exam;
import oop.capsule.ExamConsole;

public class NewlecExamConsole extends ExamConsole {

	@Override
	protected Exam makeExam() {
		return new NewlecExam();
	}

	@Override
	protected void onPrint(Exam exam) {
		NewlecExam newlecExam = (NewlecExam) exam;
		int com = newlecExam.getCom();
		System.out.printf("com: %d\n", com);
	}

	@Override
	protected void onInput(Exam exam) {
		NewlecExam newlecExam = (NewlecExam) exam;
		Scanner sc = new Scanner(System.in);
		System.out.printf("com: ");
		int com = sc.nextInt();
		newlecExam.setCom(com);
		
	}

}
