import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class removeInt {
    public static void main(String[] args) throws FileNotFoundException {


        try {

            File file = new File("DATA.in");
            Scanner myReader = new Scanner(file);

            ArrayList<String> list = new ArrayList<String>();
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();

                String[] values = line.split(" ");

                for (String s : values) {
                    boolean isNumber = isInteger(s);
                    if (!isNumber) list.add(s);
                }
            }


            Collections.sort(list);

            for(String s : list) {
                System.out.print(s + " ");
            }

            myReader.close();
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }
}
