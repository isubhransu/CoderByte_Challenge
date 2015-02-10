package Animal;


public class Animal {
    protected String name = "Animal";
    	    public String favFood = "Food";
            	    // You use protected when you want to allow subclasses
            	    // To be able to access methods or fields
            	    // If you would have used private their would be no
            	    // way for subclasses to call this method
            	    // This is a final method which means it can't be overwritten
            	    protected final void changeName(String newName){
        	        // this is a reference to the object you're creating
        	        this.name = newName;
        	    }
            	    protected String getName(){
        	        return name;
                    }
            	    public void eatStuff(){
        	        System.out.println("Yum " + favFood);
        	    }
            	    public void walkAround(){
        	        System.out.println(this.name + " walks around");
        	    }
            	    public Animal(){
        	    }
            	    public Animal(String name, String favFood){
        	        this.changeName(name);
        	        this.favFood = favFood;
        	    }
}
