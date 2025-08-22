package com.codometer.geeksforgeek.filehandling;

public interface IByteStream<ANYWHERE> {
	
	void readByteStream(ANYWHERE anywhere);
	void writeByteStream(ANYWHERE anywhere);
	
}
