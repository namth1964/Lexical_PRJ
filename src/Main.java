import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Main {
    public static String clearWhitespace (String s){
        String x = "";
        int i = 0;
        while (i < s.length()){
            if (s.charAt(i) == '\"') {
                x += s.charAt(i);
                i += 1;
                while (s.charAt(i) != '\"'){
                    x += s.charAt(i);
                    i += 1;
                }
                x += s.charAt(i);
                i += 1;
                continue;
            }

            if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ') continue;
            x += s.charAt(i);
            i += 1;
        }
        return x;
    }
    public static void main(String[] args) {
        try {
            File myObjFile = new File("./in/test.txt");
            Scanner myReader = new Scanner(myObjFile);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                Lexer lexer = new Lexer(data);
                ArrayList<Token> tokens = lexer.run(lexer);

                for (int x = 0; x < tokens.size(); x++) {
                    System.out.println(tokens.get(x).toString());
                }
            }
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        








    }
}