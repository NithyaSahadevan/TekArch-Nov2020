package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;


public class readWrite {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(System.getProperty("user.dir")+"/src/Files/Nov2020.txt");
		String sPath = System.getProperty("user.dir")+"/src/Files/Nov2020.txt";
		//readFile(sPath);
		//String sFilePathToWrite = "C:\\Users\\hanuma\\Google Drive\\Srinidhi Nov20 Sessions\\Demo_Java_Day8\\sri.txt";
		writeFile(sPath);
		loadingProperitiesFile();

	}
	public static void loadingProperitiesFile() throws Exception {
		FileInputStream oFIS = new FileInputStream(System.getProperty("user.dir")+"/src/Files/environment.properties");
		//Load the file as property. Set to this key values to your run time properties. Then you can get that properties
		Properties oPR = new Properties();
		oPR.load(oFIS);
		System.getProperties().putAll(oPR);
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("FileWritingPath"));
		System.out.println(System.getProperty("password"));
		System.out.println(System.getProperty("xyz"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("os.name"));
	}
	
	public static void readFile(String sPath) throws IOException {
		String sLine;
		FileReader oFR = new FileReader(sPath);
		BufferedReader oBR = new BufferedReader(oFR);
		
		while((sLine = oBR.readLine()) != null){
			System.out.println(sLine);
		}
		oBR.close();
	}
	
	public static void writeFile(String sPath) throws IOException {
		//1. First you will go to location 2. you will open it 3. write it
		BufferedWriter oBW = null;
		try {
		FileWriter oFW = new FileWriter(sPath, true);
		 oBW = new BufferedWriter(oFW);
		oBW.newLine();oBW.newLine();
		oBW.write("Hello team,");
		oBW.newLine();oBW.newLine();
		oBW.write("\t How are you doing all?");
		oBW.newLine();oBW.newLine();
		oBW.write("Thanks and Regards");
		oBW.newLine();
		oBW.write("Srinidhi.B");
		//oBW.close();
		}catch(Exception a) {
			System.out.println("Exception  : "+a);
			
		}finally {
			oBW.close();
		}
		
	}
}
