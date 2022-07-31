
public class AsteriskLogger implements Logger {
		//print out the String it receives between 3 asterisks on either side of the String
	
		
		 public void Log(String str) {
	         System.out.println("***" + str + "***");
	
		 
		 
		 }
		 
		 //The error method on the AsteriskLogger should print the String it receives inside a box of asterisks 
		 //with the String preceded by the word “ERROR:”.
		 
		 
		 public void Error(String str) {
	         String error = "Error: " + str;
	         System.out.println("****************");
	         Log(error);
	         System.out.println("****************");
	     }
}
