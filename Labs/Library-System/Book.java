package HomeWork;

//subclass2 - book
public class Book extends MainClass {
	//parent class property
	private String title;
	private String author;
	private int ISBN;

//parent class constructor with class property
  public Book(String title,String author,int ISBN){
      this.title=title; //class name.constructor name = both are same
      this.author=author;
      this.ISBN=ISBN;  
  }
  
  		//Non static parent class
  		public void display(){
		        System.out.println("Title Of Book: "+ title);
		        System.out.println("Author Of Book: "+author);
		        System.out.println("Id: "+ ISBN);
      
  }
}
