import java.io.*;
import javax.swing.*;
import java.awt.*;

public class File {

		@SuppressWarnings("deprecation")
		public static void main(String[] args) throws IOException {
		
			FileOutputStream fout;
			PrintStream p;
			fout = new FileOutputStream("first.txt");
			p = new PrintStream(fout);
			
			p.println("First line in the file");
			p.println("Second line in the file");
			p.println("Fucking third line in the file");
			
			p.close();
			
			FileInputStream fin;
			fin = new FileInputStream("training.txt");
			DataInputStream di;
			di = new DataInputStream(fin);
			
			while (di.available()!= 0) { 
				
				System.out.println(di.readLine());
			}
			FileWriter fw = new FileWriter("first.txt");
			PrintWriter pw = new PrintWriter(fw);
			pw.println("THe fourth line");
			pw.close();
			
			
	}

}
