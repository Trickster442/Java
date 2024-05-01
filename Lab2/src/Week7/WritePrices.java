package Week7;

import java.io.*;
class WritePrices {
public static void main(String[] arguments) {
try{
FileOutputStream file = new FileOutputStream("prices.txt");
BufferedOutputStream buff = new BufferedOutputStream(file);
DataOutputStream dos = new DataOutputStream(buff);
dos.writeDouble(39.95);
dos.writeDouble(3.22);
dos.writeDouble(1.08);
dos.close();
buff.close();
file.close();
}catch (IOException e) {
System.out.println("Error -- " + e.toString());
}
}
}