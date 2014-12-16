import java.io.*;

public class StringHandling {

	public static void main(String[] args) {
		
		String s;
		s = "Hello my friend we meet again its been a while where should we begin feels like forever";
		PrintStream ps = new PrintStream(System.out,true);
		ps.println(s.length());
		ps.println(s.charAt(5));
		ps.println(s.equals("hello"));
		ps.println(s.startsWith("Hello"));
		ps.println(s.replace('e','i'));
		ps.println(s.concat("its been a while"));
		String s1 = s;
		ps.println(s.compareTo(s1));
		ps.println(s1.substring(0,17));
		//ps.println(regionMatches(1,s1,1,s,4));
		ps.println(s.indexOf("wh"));
	}

}
