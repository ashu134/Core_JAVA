package com.ashu.FM;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class FileHandling {
    static Logger logger = LogManager.getLogger(FileHandling.class.getName());


    public static void main(String[] args) {
        createFile("myFile.txt");
        readFile("myFile.txt");
        writeFile("Kumar Aashutosh", "myFile.txt");
        System.out.println(deleteFile("myFile.txt"));
        logger.trace("Entering method processOrder().");
        logger.debug("Received order with ID 12345.");
        logger.info("Order shipped successfully.");
        logger.warn("Potential security vulnerability detected in user input: '...'");
        logger.error("Failed to process order. Error: {. . .}");
        logger.fatal("System crashed. Shutting down...");

    }

    public static void createFile(String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
            logger.debug("Created file");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void readFile(String fileName) {
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                logger.debug("Reading");
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeFile(String str, String f) {
        try {
            FileWriter fw = new FileWriter(f);
            fw.write(str);
            fw.close();
            logger.info("Successfully wrote");
        }catch (IOException e){
            logger.debug("Something Wrong in File");
            e.printStackTrace();
        }
    }
    public static boolean deleteFile(String filename){
        File file = new File(filename);
        if(file.delete()){
            return true;
        }
        return false;

    }
}
