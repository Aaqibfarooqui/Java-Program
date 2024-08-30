package HomeWork;

public class Library extends MainClass {
	//parent class property
	 	private int returnBook;
	    private int collections;
	    private int borrowBook;

	  //parent class constructor with class property
	    public Library(int returnBook,int collections,int borrowBook){
	    	
	        this.returnBook=returnBook; //class_name.constructor_name = both are same
	        this.collections=collections;
	        this.borrowBook=borrowBook;
	    }
	    //non static parent class
	    public void display(){
		        System.out.println("Number of Return books : "+returnBook);
		        System.out.println("Collection of books : "+collections);
		        System.out.println("How Many Book you borrow : "+borrowBook);
		    }
}
