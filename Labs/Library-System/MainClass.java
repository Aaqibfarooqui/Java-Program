package HomeWork;


public class MainClass {

	public static void main(String[] args) {
		//User,library,book
		//subclass 1
		User u=new User("Aqib",1,17);
		//Call parent class with child class object
		u.display();
		//subclass 2
		Library l=new Library(7,750,90);
		l.display();
		//subclass 3
		Book b=new Book("Aaqib","AaqibFarooqui",7);
		b.display();

	}

}
