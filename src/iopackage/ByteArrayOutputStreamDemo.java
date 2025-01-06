package iopackage;
/*

	FMS : - FILE MANAGMENT SYSTEM
			DATA : STRUCTURE :  : NOT
			       UNSTRUCTURE  : FILE

			1) SEQUEANCE :
			2) DELETIONS :


	RDBMS  (sql) / NOSQL

	JDK 1.3

	jdk 1.10

		STREAM :- DATA -> BYTE 
	
			OUTPUTSTREAM :- TO WRITE / STORE DATA INTO FILE
			INPUTSTREAM :- TO READ FROM FILE 
		
		
		
*/

import java.io.*;
class ByteArrayOutputStreamDemo
{
	public static void main(String args[]) throws Exception
	{
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		String temp="this is firstdemo by KHUSHI";
		byte b[] = temp.getBytes();
		bout.write(b);
		System.out.println("String is : " + bout.toString());
		
		FileOutputStream fout = new FileOutputStream("first.txt");
		bout.writeTo(fout);
	}
}