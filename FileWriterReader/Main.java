package FileWriterReader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		
		//UTILIZAÇÃO DO FILE WRITER
		try {
			FileWriter writer = new FileWriter("teste.txt");
			writer.write("Isso é um teste.txt \n Um teste aleatório \n Para um codigo aleatório");
			writer.append("\n- By Breno");
			writer.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//UTILIZAÇÃO DO FILE READER
		try {
			FileReader reader = new FileReader("C:\\Users\\breno\\eclipse-workspace\\programJar\\src\\FileWriterReader\\teste.txt");
			int dado = reader.read();
			while (dado != -1) {
				System.out.print((char)dado);
				dado = reader.read();
			}
			reader.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
