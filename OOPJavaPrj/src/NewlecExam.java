import oop.capsule.Exam;

public class NewlecExam extends Exam {
	private int com;

	public NewlecExam() {
		// TODO Auto-generated constructor stub
		this(0,0,0,0);
	}
	
	public NewlecExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com = com;
	}

	@Override
	public float avg() {
		return total() / 4.0f;
	}

	@Override
	public int total() {

		return super.onTotal() + com;
	}
	

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

}
