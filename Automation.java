package week3.day1.assignments;

public class Automation extends MultipleLanguage implements TestTool, Language {

	@Override
	public void ruby() {
		System.out.println("Ruby Language");

	}

	@Override
	public void Selenium() {
		System.out.println("java-Selenium");

	}

	@Override
	public void java() {
		System.out.println("java Language");

	}

	public static void main(String[] args) {
		Automation automation = new Automation();
		automation.ruby();
		automation.Selenium();
		automation.java();
		automation.python();
	}

}
