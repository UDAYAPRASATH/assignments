package week6.day1;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("ID:"+id);

	}
	public void getStudentInfo(int id, String name) {
		System.out.println("ID:"+id+" NAME:"+name);
		

	}
	public void getStudentInfo(String email,long phonenumber ) {
		
           System.out.println("EMAIL:"+email+"  PHN NUMBER:"+phonenumber);
	}
	
	public static void main(String[] args) {
		
		Students obj=new Students();
		obj.getStudentInfo(115);
		obj.getStudentInfo(115, "Udaya");
		obj.getStudentInfo("udai@gmail.com",9876543210l);

		
	}

}
