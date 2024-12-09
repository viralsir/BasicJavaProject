package iopackage;

import java.io.*;
class FileOutputStreamDemo
{
	public static void main(String args[]) throws Exception
	{
		FileOutputStream fout = new FileOutputStream("FirstDEMO.txt");
		String temp="This is FileOutputStreamDemo";
		byte b[] = temp.getBytes();
		fout.write(b);
		fout.close();
	}
}