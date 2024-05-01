package Week7;

import java.io.*;
class ReadPrices {
public static void main(String[] arguments) {
try {
FileInputStream file = new FileInputStream("prices.txt");
BufferedInputStream buff = new BufferedInputStream(file);
DataInputStream data = new DataInputStream(buff);
try {
while (true) {
double in = data.readDouble();
System.out.println("Price = " + in);
}
} catch (EOFException eof) {
buff.close();
}
} catch (IOException e) {
System.out.println("Error -- " + e.toString());
}
}
}