package Week7;

import java.io.*;
public class WriteBuffer {
WriteBuffer(){
int[] data = {82, 101, 99, 116, 97, 110, 103, 108, 101, 46, 106, 97, 118, 97, 10};
try {
FileOutputStream fos = new FileOutputStream("student.txt", true);
BufferedOutputStream buff = new BufferedOutputStream(fos);
for (int i = 0; i < data.length ; i++) {
buff.write(data[i]);
}
buff.flush();
buff.close();
} catch (IOException e) {
System.out.println("Exception: " + e.getMessage());
}
}
public static void main(String[] arguments) {
WriteBuffer write = new WriteBuffer();
}
}