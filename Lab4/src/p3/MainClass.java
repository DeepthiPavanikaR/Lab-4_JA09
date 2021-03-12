package p3;

public class MainClass {
	public static void main(String[] args) {
		Book b1=new Book(111,"Let Us C",10,"Yeshwant");
		Book b2=new Book(112,"Satellite Communication",15,"Anil K Maini");
		JournalPaper jp1=new JournalPaper(115,"IEEE-Sensors",12,"Ram");
		jp1.setYear(2010);
		JournalPaper jp2=new JournalPaper(116,"IEEE-DSP",20,"Ramesh");
		jp2.setYear(1999);
		CD cd=new CD(10,"Mahaparva",5);
		Video v=new Video(12,"KGF",23);
		b1.print();
		System.out.println("=============");
		b2.print();
		System.out.println("=============");
		b1.checkIn();
		
		b1.print();
		b1.checkOut();
		b1.print();
		System.out.println("=============");
		jp1.print();
		System.out.println("The Author of Journal"+jp1.getAuthor());
		jp1.checkIn();
		jp1.print();
		jp1.checkOut();
		
		System.out.println("year"+jp1.getIdNum());
		System.out.println("=============");
		cd.print();
		cd.setArtist("Ranga");
		cd.setGenre("Drama");
		cd.setRuntime(3);
		System.out.println("Artist of this CD is "+cd.getArtist());
		System.out.println("Genre of this CD is "+cd.getGenre());
		System.out.println("Run time of CD:"+cd.getRuntime());
		System.out.println("=============");
		v.print();
		v.setDirector("Vikram");
		v.setGenre("Comedy");
		v.setYear(2014);
		v.setRuntime(5);
		System.out.println("Artist of this CD is "+v.getDirector());
		System.out.println("Genre of this CD is "+v.getGenre());
		System.out.println("Genre of this CD is "+v.getYear());
		System.out.println("Run Time of Video:"+v.getRuntime());
	}

}

