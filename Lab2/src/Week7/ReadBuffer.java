package Week7;

import java.io.*;
public class ReadBuffer
{
ReadBuffer(){
try {
FileInputStream fis = new FileInputStream("student.txt");
BufferedInputStream buff = new BufferedInputStream(fis);
int in = 0;
do {
in = buff.read();
if (in !=
-1)
System.out.print((char)in);
} while (in !=
-1);
//buff.flush();
buff.close();
} catch (IOException e) {
System.out.println("Exception: " + e.getMessage());
}
}
public static void main(String[] arguments) {
ReadBuffer write = new ReadBuffer(); }
}