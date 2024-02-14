import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileIO {
        /*  Reads files line by line and creates a string arraylist consists of
        these lines.
        If file is not found or occurs an error while reading file returns
        an error message. */
        public static ArrayList<String> reader(String path) throws IOException {
            BufferedReader reader = null;
            ArrayList<String> lines = new ArrayList<String>();
        try {
            FileReader file = new FileReader(path);
            reader = new BufferedReader(file);
            String line;
            while ((line = reader.readLine()) != null) {
                line =  line.replace(" ", "\t");
                lines.add(line.trim().replace("\n",""));
            } 
        }
        catch (FileNotFoundException e ) {
            System.err.printf("No such a  %s file..\n", path);
            System.exit(0);
        }
        catch (IOException e){
            System.err.printf("Occurs an error while reading %s file..\n", path);
            System.exit(0);
        }    
        finally {
            if (reader != null) 
                reader.close(); 
        }
        return lines;
    }
        public static void writer(String registration,Personnel p) throws IOException{
            // Writes personnel attributes into a txt file.
            FileWriter file = new FileWriter(registration+".txt");
            PrintWriter writer = new PrintWriter(file,true);
            writer.println(p.Display());
            }   
}