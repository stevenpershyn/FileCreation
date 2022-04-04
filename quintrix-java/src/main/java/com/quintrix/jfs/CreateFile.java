package com.quintrix.jfs;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;

public class CreateFile {
	void createFile() {
		try {
			File myObj = new File("filename.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File Already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
	}
	void writeFile() {
		try { 
			FileWriter myWriter = new FileWriter("filename.txt");
			myWriter.write("Hello World");
			myWriter.close();
		} catch (IOException e) {
			System.out.println("An Error occurred.");
			e.printStackTrace();
		}
	}
	void readFile() {
		try {
			File myObj = new File("filename.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		CreateFile file = new CreateFile();
		file.createFile();
		file.writeFile();
		file.readFile();
	}
}
