package backEndweek5;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		System.out.println("***" + str + "***");
	}

	@Override
	public void error(String str) {
		// TODO Auto-generated method stub
		String error = "ERROR: " + str;
		int length = error.length() + 6;
		StringBuilder line = new StringBuilder();
		
		for (int i = 1; i <= length; i++) { 
			line.append('*');
		}
		
		System.out.println(line.toString());
		log(error);
		System.out.println(line.toString());
	}

}
