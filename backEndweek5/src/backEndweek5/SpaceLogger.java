package backEndweek5;

public class SpaceLogger implements Logger {

	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		StringBuilder log = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			log.append(str.charAt(i) + " ");
		}
		
		System.out.println(log);
	}

	@Override
	public void error(String str) {
		// TODO Auto-generated method stub
		System.out.println("ERROR: ");
		log(str);
	}

}
