
public class App {

	
public static void main(String[] args) {
	
		//  instantiate an instance of each of your logger classes that implement the Logger interface.
	
		Logger asteriskLogger = new AsteriskLogger();
       
        asteriskLogger.Log("Hi!");
        asteriskLogger.Error("Bye!");

        System.out.println();
        
        Logger spacedLogger = new SpacedLogger();
        
        spacedLogger.Log("Hello");
        spacedLogger.Error("STOP!");
        
        System.out.println();
	}

}
