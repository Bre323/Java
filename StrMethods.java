package programJar;

public class StrMethods {

	public static void main(String[] args) {
		
		String name = "Breno";
		
		//boolean re = name.equals("breno");
		//boolean re = name.equalsIgnoreCase("breno");
		//int re = name.length();
		//char re = name.charAt(0); 
		//int re = name.indexOf("B");
		//boolean re = name.isEmpty();
		//String re = name.toUpperCase();
		//String re = name.toLowerCase();
		//String re = name.trim();
		String re = name.replace("B", "W");
		
		System.out.println(re);
	}

}
