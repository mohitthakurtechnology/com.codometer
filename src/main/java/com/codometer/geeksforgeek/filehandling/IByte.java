package com.codometer.geeksforgeek.filehandling;

public interface IStream<ANY> {
	
	void readALLByteAtOneShot();
	void readByteOneByOne();
	void writeByte(ANY any);
	boolean createFile();
	
}
