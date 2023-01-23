package Serialization;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		User user = new User();
		user.name = "Breno";
		user.password = "BatmanIsAwesome";
		
		FileOutputStream fileOutput = new FileOutputStream("UserInfo.ser");
		ObjectOutputStream output = new ObjectOutputStream(fileOutput);
		output.writeObject(user);
		output.close();
		fileOutput.close();
		
		System.out.println("Object info saved successfully!");
		
	}

}
