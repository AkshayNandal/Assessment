package Assessment1;

class Author{
	private String Aname;
	private String Amail;
	private char Agender;
	
	void setAuthor(String Aname,String Amail,char Agender){
		this.Aname=Aname;
		this.Amail=Amail;
		this.Agender=Agender;
	}
	
}

class Book extends Author{
	private String Bname;
	private String Bauthor;
	private double price;
	private int qty;
	
	
	String getName(String Bname){
		return Bname;
	}
	void getAuthor(String Aname,String Amail,char Agender){
		System.out.println(" " +Aname+ " "+Amail);
		System.out.println(Agender);
	}
	String getAuthorName(String Aname){
		return Aname;
	}
	String getAuthorMail(String Amail){
		return Amail;
	}
	char getAuthorGender(char Agender){
		return Agender;
	}
	double getPrice(double price){
		return price;
	}
	int getQty(int qty){
		return qty;
	}
	
	String toString(String s){
		return s;
	}
}

public class TestBook extends Book{

	public static void main(String[] args) {
		String d1=new String();
		double d2;
		int d3;
		String s1,s2;
		char s3;
		Book b1=new Book();
		Author a1=new Book();
		b1.getAuthor("James Gosling","jamesgosling@ibm.com",'M');
		System.out.println("Book Details:");
		d1=b1.getName("Java for beginners");
		d2=b1.getPrice(800.00);
		d3=b1.getQty(25);
		System.out.println("Books' Name is:"+d1);		
		System.out.println("Books' price is:"+d2);
		System.out.println("Book quantity:"+d3);
		s1=b1.getAuthorName("James Gosling");
		s2=b1.getAuthorMail("jamesgosling@ibm.com");
		s3=b1.getAuthorGender('M');
		System.out.println("Author details:");
		System.out.println("Author is:"+s1+"at"+s2);
		System.out.println("Author's name:"+s1);
		System.out.println("Author's mail:"+s2);
		System.out.println("Author's gender:"+s3);
	}

}
