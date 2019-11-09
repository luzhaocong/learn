import java.io.*;
public class Example10_6 {
	public static void main(String[] args) {
		File source_file=new File("a.txt");
		File target_file=new File("b.txt");
		char c[]=new char[19];
		try{
			Writer out=new FileWriter(target_file,true);
			Reader in=new FileReader(source_file);
			int n=-1;
			while((n=in.read(c))!=-1){
				out.write(c,0,n);
			}
			out.flush();
			out.close();
			
		}
		catch(IOException e){
			System.out.println("Error "+e);
		}
	}

}
