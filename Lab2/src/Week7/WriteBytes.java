package Week7;

import java.io.*;
import java.lang.Exception;
public class WriteBytes {
public static void main(String[] arguments) {
int[] data = {119, 114, 105, 116, 101, 66, 121, 116, 101, 115, 46, 106, 97, 118, 97, 10};
try {
FileOutputStream fos = new FileOutputStream("FileName.txt");
for (int i = 0; i < data.length; i++)
fos.write(data[i]);
fos.close();
} catch (IOException e) {
System.out.println("Error -- " + e.toString());
}
}
}