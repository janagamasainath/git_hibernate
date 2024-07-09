
public  class Methods {
	
	
	private String sainath() {
		return "sainath hello";
		
	}
	public static String saritha() {
		return "static sarith";
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String saritha = Methods.saritha();
		
			System.out.println(saritha);
			Methods  m = new Methods() ;
			String sainath = m.sainath();
			System.out.println(sainath);
		

	}

}

