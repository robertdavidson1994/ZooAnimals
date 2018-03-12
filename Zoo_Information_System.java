import java.lang.*; //Used for the sleep method when displaying animal information


//Main module used to facilitate the Zoo Information System
public class Zoo_Information_System 
{
    public static void main(String[] args) throws InterruptedException 
    	{
    		System.out.println("Lion:\n"); 
    		Animal l = new Lion("8105491013"); //Creating Lion animal object
        	System.out.println(l.AnimalInformation());
        	Thread.sleep(2000); //Wait 2 seconds before next print
        	System.out.println("Gorilla:\n"); //Creating Gorilla animal object
        	Animal g = new Gorilla("8105768635");
        	System.out.println(g.AnimalInformation());
        	Thread.sleep(2000); //Wait 2 seconds before next print
        	System.out.println("Elephant:\n"); //Creating Elephant animal object
        	Animal e = new Elephant("8102431375");
        	System.out.println(e.AnimalInformation());
        	Thread.sleep(2000); //Wait 2 seconds before next print
          	System.out.println("Duck:\n"); //Creating Duck animal object
        	Animal d = new Duck("8107492788");
        	System.out.println(d.AnimalInformation());
        	Thread.sleep(2000); //Wait 2 seconds before next print
          	System.out.println("Cow:\n"); //Creating Cow animal object
        	Animal c = new Cow("8109875490");
        	System.out.println(c.AnimalInformation());
    	}
}



//Animal class for the most part prints the messages for the animals attributes.
//Methods are called for the corresponding animal atribute
abstract class Animal 
{
    private String UniqueID;
    public Animal(String UniqueID) 
    {
        this.UniqueID = UniqueID;
    }
    public String AnimalInformation() 
    {
        return "Unique ID - " + UniqueID + "\n" +
               "Date of arrival - " + DateOfArrival() + "\n" +
        	   "Sex - " + Sex() + "\n" +
        	   "Habitat location - " + Habitat() + "\n" +
               "Eating schedule - " + Schedule() + "\n" +
        	   "Noise the animal makes - " + Sound() + "\n\n";
    }
    public abstract String DateOfArrival();
    public abstract String Sex();
    public abstract String Habitat();
    public abstract String Schedule();
    public abstract String Sound();
}



//Call to Lion Class to acquire animal attributes
class Lion extends Animal 
{
    public Lion(String UniqueID) 
    {
        super(UniqueID);
    }
    @Override public String DateOfArrival()
    {
    	return "01/01/2000";
    }
    @Override public String Sex()
    {
    	return "Male";
    }
    @Override public String Habitat()
    {
    	return "Open woodlands";
    }
    @Override public String Schedule()
    {
    	return "08:00 AM";
    }
    @Override public String Sound() 
    {
        return "Roars";
    }
}



//Call to Gorilla Class to acquire animal attributes
class Gorilla extends Animal 
{
    public Gorilla(String UniqueID) 
    {
        super(UniqueID);
    }
    @Override public String DateOfArrival()
    {
    	return "05/28/2005";
    }
    @Override public String Sex()
    {
    	return "Female";
    }
    @Override public String Habitat()
    {
    	return "Jungle";
    }
    @Override public String Schedule()
    {
    	return "11:30 AM";
    }
    @Override public String Sound() 
    {
        return "Growls";
    }
}



//Call to Elephant Class to acquire animal attributes
class Elephant extends Animal 
{
    public Elephant(String UniqueID) 
    {
        super(UniqueID);
    }
    @Override public String DateOfArrival()
    {
    	return "07/04/2010";
    }
    @Override public String Sex()
    {
    	return "Male";
    }
    @Override public String Habitat()
    {
    	return "Savannah";
    }
    @Override public String Schedule()
    {
    	return "03:00 PM";
    }
    @Override public String Sound() 
    {
        return "Honks";
    }
}



//Call to Duck Class to acquire animal attributes
class Duck extends Animal 
{
    public Duck(String UniqueID) 
    {
        super(UniqueID);
    }
    @Override public String DateOfArrival()
    {
    	return "09/03/2013";
    }
    @Override public String Sex()
    {
    	return "Female";
    }
    @Override public String Habitat()
    {
    	return "Pond";
    }
    @Override public String Schedule()
    {
    	return "06:30 PM";
    }
    @Override public String Sound() 
    {
        return "Quack Quack";
    }
}



//Call to Cow Class to acquire animal attributes
class Cow extends Animal 
{
    public Cow(String UniqueID) 
    {
        super(UniqueID);
    }
    @Override public String DateOfArrival()
    {
    	return "11/23/2017";
    }
    @Override public String Sex()
    {
    	return "Male";
    }
    @Override public String Habitat()
    {
    	return "Pasture";
    }
    @Override public String Schedule()
    {
    	return "10:00 PM";
    }
    @Override public String Sound() 
    {
        return "Mooo";
    }
}
