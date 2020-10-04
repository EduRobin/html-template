import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

class WriteInAFile {
    public static void main(String[] args) {

        try {
        File file = new File("fileName.txt");
        
        if(!file.exists()) {
            
                file.createNewFile();
        
        }

        PrintWriter pw = new PrintWriter(file);
        pw.println("This is my file content");
        pw.println(1000);
        pw.close();
        System.out.println("Done");

        } catch(IOException e) {
                e.printStackTrace();
        }

    }
}