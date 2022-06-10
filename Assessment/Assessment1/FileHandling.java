package com.assessment.first;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileHandling {
	public static void main(String[] args) throws InterruptedException {
		Date date = new Date();
		long fileStarting = date.getTime() / 100000000;
		System.out.println("starting :" + fileStarting);
		try {
			File folder = new File("Demo");
			if (!folder.exists())
				folder.mkdir();
			FileWriter fw = new FileWriter("Demo/instructions.txt");
			BufferedWriter bw = new BufferedWriter(fw, 2000);
			bw.write("Error is not good");
			bw.write("\n");
			bw.write("love yourself");
			bw.write("\n");
			bw.write("Fatal Error is not good for program");
			bw.write("\n");
			bw.write("Warning,");
			bw.write("\n");
			bw.write("Warn is not good,");
			bw.write("\n");
			bw.write("peace");
			bw.close();
			FileReader fr = new FileReader("Demo/instructions.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw1 = new FileWriter("Demo/instructions1.txt");
			Thread.sleep(100000);
			String str = null;
			while ((str = br.readLine()) != null) {

				if (str.contains("Error") || str.contains("Fatal") || str.contains("Warn")) {

					fw1.write(str);
					fw1.write("\n");
					fw1.flush();

				}
			}
			System.out.println("File saved succesfully");
			fw.close();
			bw.close();
			fr.close();
			br.close();
			fw1.close();
			long fileEnding = date.getTime() / 100000000;
			System.out.println("ending :" + fileEnding);

			long sub = fileStarting - fileEnding;
			System.out.println("total time taken " + sub);

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}

}
