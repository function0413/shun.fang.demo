package shun.fang.SE;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/***
 * 多种方法实现文件复制
 * @author function0413
 *
 */

public class FileCopy {
	public static void main(String[] args) throws Exception {
		fileCopy3("a", "b");
	}
	static void fileCopy1(String inPath, String outPath) throws Exception {
		FileInputStream fis = new FileInputStream(inPath);
		FileOutputStream fos = new FileOutputStream(outPath);
		/*int lenth = -1;
		while ((lenth = fis.read()) != -1) {
           fos.write(lenth);
		}*/
		byte[] b = new byte[5];
		int lenth = -1;
		while ((lenth = fis.read(b)) != -1) {
			fos.write(b);
		}
		fos.flush();
		fos.close();
		fis.close();
	}
	static void fileCopy3(String inPath, String outPath) throws Exception {
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(inPath));
		BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream(outPath));
		/*int lenth=-1;
		while ((lenth=bis.read())!=-1) {
			bos.write(lenth);
		}*/
		byte[] b=new byte[5];
		int lenth=-1;
		while ((lenth=bis.read(b))!=-1) {
			bos.write(b);
		}
		bis.close();
		bos.flush();
		bos.close();
	}
	/**
	 * 如果明确要复制的文件是一个字符文本文件,则可以使用字符流
	 * @param inPath
	 * @param outPath
	 * @throws Exception
	 */
	static void fileCopy2(String inPath, String outPath) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(inPath)));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outPath)));
		/*int  lenth=-1;
		while ((lenth=br.read())!=-1) {
			bw.write(lenth);
		}*/
		String str="";
		while ((str=br.readLine())!=null) {
			bw.write(str);
		}
		br.close();
		bw.flush();
		bw.close();
	}
	
	
	
}
