import java.util.Scanner;
public class JavaLibs5026211072 
{
    public static void main(String[] args) 
    {
    	Scanner keyboardInput = new Scanner(System.in);
    
    	System.out.print("Enter your name :");
   	String name = keyboardInput.nextLine();
	System.out.print("Enter your gender :");
    	String gender = keyboardInput.nextLine();
   	System.out.print("Enter your age :");
    	String age = keyboardInput.nextLine();
    	System.out.print("Enter your favorite food :");
    	String favoriteFood = keyboardInput.nextLine();
	System.out.print("Enter your favorite drinks :");
    	String favoriteDrinks = keyboardInput.nextLine();
	System.out.print("Where do you study :");
    	String studyPlaces = keyboardInput.nextLine();
	System.out.print("What semester are you right now (in integer):");
    	int semester = keyboardInput.nextInt();
	System.out.print("How many brother do you have (in integer) :");
    	int brother = keyboardInput.nextInt();
	System.out.print("How many sister do you have :");
    	int sister= keyboardInput.nextInt();
	System.out.print("Enter a integer :");
    	int input1 = keyboardInput.nextInt();
	System.out.print("Enter a decimal :");
    	double input2 = keyboardInput.nextDouble();
	
    	System.out.println ("My name is"+ name);
	System.out.println ("im a "+ gender);
    	System.out.println ("My age is"+ favoriteFood);
    	System.out.println ("My favorite food is"+ age);
	System.out.println ("My favorite drinks is"+ favoriteDrinks);
    	System.out.println ("I studied at " + studyPlaces);
    	System.out.println ("Im in semester" + semester + "right now");
    	System.out.println ("i have " + brother +" brothers");
	System.out.println ("i have " + sister +" sisters");
	System.out.println (input1 + input2); 
    }
}
