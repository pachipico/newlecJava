package oop.capsule;

public class ExamList {
	private Exam[] exams;
	private int current;

	public ExamList() {
		this(3);
	}

	public ExamList(int size) {
		this.exams = new Exam[3];
		this.current = 0;
	}


	public Exam get(int i) {
		// TODO Auto-generated method stub
		return exams[i];
	}

	public void add(Exam exam) {

		Exam[] exams = this.exams;
		int size = this.current;

		if (exams.length == size) {
			Exam[] temp = new Exam[size + 5];
			for (int i = 0; i < size; i++) {
				temp[i] = exams[i];
			}
			this.exams = temp;
		}
		this.exams[this.current] = exam;
		this.current++;

	}

	public int size() {
		return current;
	}

}
