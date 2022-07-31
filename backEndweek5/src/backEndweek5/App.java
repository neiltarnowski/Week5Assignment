package backEndweek5;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  AsteriskLogger AL = new AsteriskLogger();
		    AL.log("We have lift off!");
		    System.out.println();
		    AL.error("We don't have lift off.");
		    System.out.println();

		    SpaceLogger SL = new SpaceLogger();
		    SL.log("Hey how are ya?"); 
		    System.out.println();
		    SL.error("Not so good, you?");
		    System.out.println();
		  }	
	}

