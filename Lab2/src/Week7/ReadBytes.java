package Week7;
import java.io.*;
public class ReadBytes {
public static void main(String[] arguments) {
try {
FileInputStream fis = new FileInputStream("student.txt");
boolean eof = false;
int count = 0;
while (!eof) {
int input = fis.read();
System.out.print((char)input);
if (input == -1)
eof = true;
else
count++;
}
fis.close();
System.out.println("Number Bytes read: " + count);
} catch (IOException e) {
System.out.println("Error -- " + e.toString());
}
}
}