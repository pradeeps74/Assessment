package com.assessment.first;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandlingForFolder
{
	public static void main(String[] args) {

        Path sourceDirectory = Paths.get("/home/vastpro/javademos/Assessment/Demo/instructions.txt");
        Path targetDirectory = Paths.get("/home/vastpro/javademos/Assessment/Demo1/instructions1.txt");

        //copy source to target using Files Class
        try {
			Files.copy(sourceDirectory, targetDirectory);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}