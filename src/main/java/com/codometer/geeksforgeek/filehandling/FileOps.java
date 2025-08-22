package com.codometer.geeksforgeek.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOps<ANY> implements IStream<ANY>{
	
	private ANY anyfile,anyfiletype;
	
	FileOutputStream fos = null;
	FileInputStream fis = null;
	FileReader fileReader = null;
	FileWriter fileWriter = null;
	
	FileOps(ANY anyfile,ANY anyfiletype)
	{
		this.anyfile = anyfile;
		this.anyfiletype = anyfiletype;
	}

	@Override
	public void readALLByteAtOneShot() {		
		if(fis != null)
		{
			
			String byteReadToString;
			int c;
			
			try {
					byteReadToString = new String(fis.readAllBytes(),StandardCharsets.UTF_8);
					System.out.println("At One Shot ==> " + byteReadToString);
					
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}

	@Override
	public void writeByte(ANY anystring) {
		
		if(fos != null)
		{
			try {
				 
					System.out.println("Content to be written in byte form is ==> " + anystring.toString().getBytes());
					System.out.println("Content to be written in String form is ==> " + anystring.toString());
					
					fos.write(anystring.toString().getBytes());
					fos.flush();
					
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public boolean createFile() {
		
		if(anyfile instanceof File)
		{
			
			System.out.println("File Type is ==> " + anyfiletype.toString());
			
			if(anyfiletype.toString().compareTo("BINARY") == 0)
			{
				File genfile = (File) anyfile;
				try {
					
						fos = new FileOutputStream(genfile);
						fis = new FileInputStream(genfile);
						System.out.println("Binary File Is Created ==> " + genfile.createNewFile());
						System.out.println("Binary File Is Created With The Name ==> " + genfile.getName());
						System.out.println("Binary File Is Created At The Path ==> " + genfile.getAbsolutePath());
						return true;
				
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}else if(anyfiletype.toString().compareTo("TEXT") == 0)
			{
				File genfile1 = (File) anyfile;
				try {
						
					 	fileReader = new FileReader(genfile1);
					 	fileWriter = new FileWriter(genfile1);
						System.out.println("Text File Is Created ==> " + genfile1.createNewFile());
						System.out.println("Text File Is Created With The Name ==> " + genfile1.getName());
						System.out.println("Text File Is Created At The Path ==> " + genfile1.getAbsolutePath());
						return true;
				
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		return false;
	}

	@Override
	public void readByteOneByOne() {
		
		if(fis != null)
		{
			
			int c;
			try {
					while((c = fis.read()) != -1)
					{
						System.out.println(" One By One ==> " + (char) c);
					}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}

	@Override
	public void readAllCharAtOneShot() {
		
		if(fileReader != null)
		{
			try {
					char []charStore = null;
					int c = fileReader.read(charStore);
					while(( c = fileReader.read(charStore) ) != -1)
					{
						System.out.println(" At One Shot Char Read ==> " + (char) c);
						System.out.println(" Array Length is ==> " + charStore.length);
					}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void readCharOneByOne() {
		
		if(fileReader != null)
		{
			try {
					int c;
					while((c = fileReader.read()) != -1)
					{
						System.out.println(" One By One Char Read ==> " + (char) c);
					}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void writeChar(ANY any) {
		
		if(fileWriter != null)
		{
			try {
				
					System.out.println("Content to be written in String form is ==> " + any.toString());
					fileWriter.write(any.toString());
					fileWriter.flush();
					
					
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
}
