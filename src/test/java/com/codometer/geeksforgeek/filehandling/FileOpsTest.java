//package com.codometer.geeksforgeek.filehandling;
//
//import java.io.*;
//
//import java.io.IOException;
//import java.util.Scanner;
//
//import org.testng.annotations.Ignore;
//import org.testng.annotations.Test;
//
//// have not returned assert
//@Ignore
//public class FileOpsTest {
//	
//	  String binFilePath = System.getProperty("user.dir") + File.separator + "src\\main\\resources\\AnyFiles\\testBinFile.bin";
//	  
//	  String textFilePath = System.getProperty("user.dir") + File.separator + "src\\main\\resources\\AnyFiles\\testTextFile.txt";
//	  
//	  File binfile = new File(binFilePath);
//	  File textfile = new File(textFilePath);
//	  
//	  FileOps fileops = new FileOps(binfile,"BINARY");
//	  
//	 // FileOps textfileops = new FileOps(textfile,"TEXT");
//	  
//	  Scanner scanner = new Scanner(System.in);
//	  
//	  @Test(priority = 1)
//	  public void createFileTest() throws IOException {
//		  System.out.println(" Binary file created ==> " + fileops.createFile());
//		//  System.out.println(" Text file created ==> " + textfileops.createFile());
//	  }
//	  
//	  @Ignore
//	  @Test(priority = 3)
//	  public void readByteTest() {
//		 // fileops.readALLByteAtOneShot();
//	  }
//	  
//	  @Test(priority = 2)
//	  public void writeByteTest() {
//		  
//		  String contentToWriteInFile = scanner.nextLine();
//		  fileops.writeByte(contentToWriteInFile);
//	  }
//	  
//	  @Test(priority = 4)
//	  public void readByteOneByOne() {
//		  fileops.readByteOneByOne();
//	  }
//	  
////	  
////	  @Ignore
////	  @Test(priority = 7)
////	  public void readAllCharAtOneShotTest() {
////		  textfileops.readALLByteAtOneShot();
////	  }
////
////	  @Test(priority = 6)
////	  public void readCharOneByTest() {
////		  textfileops.readAllCharAtOneShot();
////	  }
////
////	  @Test(priority = 5)
////	 public void writeCharTest() {
////		  
////		  String contentToWriteInFile = scanner.nextLine();
////		  textfileops.writeChar(scanner);
////	 }
//}
