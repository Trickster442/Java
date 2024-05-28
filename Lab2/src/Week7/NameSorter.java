package Week7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NameSorter {
    public static final String Names_file = "names.txt";

    public static void main(String[] args) {
        try {
            BufferedReader file = new BufferedReader(new FileReader(Names_file));

            List<String> names = new ArrayList<>();

            while (true) {
                String name = file.readLine();
                if (name == null) {
                    file.close();
                    break;
                }
                names.add(name);
            }
            Collections.sort(names);

            for (String name : names) {
                System.out.println(name);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + Names_file);
        } catch (IOException ex) {
            System.out.println("Error while reading the file:");
            System.out.println(ex.getMessage());
        }
    }
}
