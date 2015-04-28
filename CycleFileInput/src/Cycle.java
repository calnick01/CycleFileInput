/**
- Examine your application for the class called Cycle
- Add an appropriate throws statement in the main method
- Create a reference to a File class with the appropriate name of a text file (Cycle.txt) 
Note: Cycle.txt was created in the previous assignment, CycleFileOutput.
- In your code, check that the text file does exist.
- Input the values from the file to memory.
- Close the file.
- Document each statement concisely.
- Post your Java source code file and output text file in Blackboard using the Assignment Upload area below.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cycle {
	public static double numberOfWheels; //initialize values
	public static double weight;
	
	public Cycle(double numberOfWheels, double weight){ //constructor
		this.numberOfWheels=numberOfWheels;
		this.weight=weight;
	}
	
	public String toString() {
		return "Cycle [numberOfWheels= " + numberOfWheels + ", weight= " + weight + "]"; //to string
	}
	
	public static void main(String[] args) throws FileNotFoundException   {
		// TODO Auto-generated method stub
		Scanner input = null;
		try {	 //try catch methods
			File file = new File("D:/School/CSC201/workspace/CycleFileInput/CycleIn.txt"); //calls txt location
			input = new Scanner(file);
		}
		catch(FileNotFoundException e) {
			System.out.println("File does not exist");
			throw e;
		}
		
		if(input.hasNextDouble()) { //set wheel and weight values
			 numberOfWheels=input.nextDouble();
			 //System.out.println("Number of wheels: " + numberOfWheels);
		}else{
			System.out.println("File does not contain numbers.");
		}
		
		if(input.hasNextDouble()) {
			 weight=input.nextDouble();
			 //System.out.println("Weight: " + weight);
		}else{
			System.out.println("File only contains one number value.");
		}
		
	 Cycle c = new Cycle(numberOfWheels, weight); //sets new file
	 System.out.println(c.toString());
	}
}