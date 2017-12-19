package calling_methods_eg;
import java.io.*;


public class calling_methods_eg {
	public static void main(String[] args){
		printOne();
		printOne();
		printTwo();
                
                readingfiles();
	}

	public static void printOne() {
		System.out.println("Hello World");
	}

	public static void printTwo() {
		printOne();
		printOne();
	}
       
        
        public static void readingfiles(){
		String line;
                BufferedReader reader = null;
                
                try {
                    reader = new BufferedReader (new FileReader("/Users/PML/myyfile.txt"));
                
                
                line = reader.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = reader.readLine();
                }
                
                }
                catch (IOException e)
                {
                    System.out.println(e.getMessage());
                }
                finally
                { 
                    try 
                    {
                    if (reader == null) 
                    reader.close();
                }
               catch (IOException e)
               {
                   System.out.println(e.getMessage());
               }
                }
                    
                }
                
                
                     
        
}