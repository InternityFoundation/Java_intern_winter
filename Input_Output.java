import java.io.*;
public class Input_Output {

   public static void main(String args[]) {
   
      try {
         byte text [] = {10,20,30,40,50};
         OutputStream os = new FileOutputStream("file.txt");
         for(int x = 0; x < text.length ; x++) {
            os.write( text[x] );   // writes
         }
         os.close();
     
         InputStream is = new FileInputStream("file.txt");
         int size = is.available();

         for(int i = 0; i < size; i++) {
            System.out.print((char)is.read() + "  ");
         }
         is.close();
      } catch (IOException e) {
         System.out.print("Exception");
      }	
   }
}

