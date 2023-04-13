package week3.day1.assignment1.org.system;

public class Desktop extends Computer{
	
	public void desktopSize(){
		System.out.println("30 Inches");
	}

	public static void main(String[] args) {
		
		Desktop dp= new Desktop();
		dp.computerModel();
		dp.desktopSize();
	}
}
