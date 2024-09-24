package org.system;

public class Desktop extends Computer{
	
	public void desktopSize()
	{
		System.out.println("6'3 inch screen");
	}

	public static void main(String[] args) {
		
             Desktop obj=new Desktop();
             obj.computerModel();
             obj.desktopSize();
	}

}
