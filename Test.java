package studentWork;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	int n;
	public static StringBuffer ReadTxt(String path){
		StringBuffer s = new StringBuffer();
		//读取文件内容
		try{
			FileInputStream out = new FileInputStream(path);
			InputStreamReader iy = new InputStreamReader(out);
			char[] chars = new char[100000];
			int ch = 0;
			int i = 0;
			while((ch = iy.read())!=-1){
				chars[i] = (char)ch;
				i++;
			}
			for (int j = 0;j<i;j++){
				s.append(chars[j]);
				if ((j + 1)% 7 == 0 && (j + 1) % 2 == 0){
					s.append("。" + "\n");
				}
				if((j + 1)% 7== 0 && (j + 1) % 2 != 0){
					s.append(",");
				}
			}
		}catch(Exception e){
			System.out.println("1");
		}
		return s;
	}
	
	public String readFile() {
		String original = null;
		int n=-1;
		char[] a = new char[100000];
		try {
			File file = new File("e:\\B.txt");
			InputStream flie = new FileInputStream(file);
			InputStreamReader in = new InputStreamReader(flie, "GBK");
		while((n=in.read(a,0,100))!=-1) {
		String s = new String(a,0,n);
		this.n=n;
		if(original!=null)
		original = original+s;
		else original=s;
		}
		
        in.close();
      	}
		catch (IOException e) {
			System.out.println("File read erroe:"+e);
		}
		return original;
	}
}
