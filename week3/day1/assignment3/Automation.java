package week3.day1.assignment3;

public class Automation extends MultipleLangauge implements TestTool,Language{
	
	public static void main(String[] args) {
		
		Automation at= new Automation();
		at.java();
		at.selenium();
		at.python();
		at.ruby();

	}

	@Override
	public void python() {
		System.out.println("Python Programming Language");
	}

	@Override
	public void ruby() {
		System.out.println("Ruby Programming Language");
	}

	public void java() {
		System.out.println("Java Programming Language");
		
	}

	public void selenium() {
		System.out.println("Selenium Automation Tool");
		
	}

}
