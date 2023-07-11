package week3.org;

public class Students {
	public void getStudentsInfo(int a) {
		System.out.println("ID:"+ a);
	}
	public void getTudentsInfo(String b ) {
		System.out.println("name" + b);
		
	}
	public void getStudentsInfo(int c, int d) {
		System.out.println("phone 1" + c + "phone2" + d);
		
	}
	public static void main(String[] args) {
		Students info = new Students();
		info.getStudentsInfo(654654);
		info.getStudentsInfo(435446565, 466464650);
		info.getTudentsInfo("manish");
	}

}
