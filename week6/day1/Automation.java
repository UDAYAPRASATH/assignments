package week6.day1;

public class Automation extends MultipleLanguage implements Language,TestingTool {

	
	@Override
	public void selenium() {
		System.out.println("Selenium...");
		
	}

	@Override
	public void java() {

		System.out.println("Java...");
	}

	@Override
	public void ruby() {

		System.out.println("Ruby...");
	}
	
	public static void main(String[] args) {
		
		Automation obj=new Automation();
		obj.java();
		obj.selenium();
		obj.python();
		obj.ruby();
		
		

	}


}
