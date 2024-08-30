package HomeWork;

//subclass1 - user
public class User extends MainClass  {
	
		 //parent class property
		 	private String name;
		    private int id;
		    private int list;
		
		  //parent class constructor with class property
		    public User(String name,int id,int li){
		        this.name=name; //class_name.constructor_name = both are same
		        this.id=id;
		        this.list=li;
		    }
		    //non static parent class
		    public void display(){
			        System.out.println("Name : "+ name);
			        System.out.println("Id : "+id);
			        System.out.println("List of Users : "+ list);
			    }
}
