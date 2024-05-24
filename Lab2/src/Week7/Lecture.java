package Week7;
import java.io.* ;
public class Lecture {

		public static void main(String[] arguments) {
//			try {
//					FileInputStream fis = new FileInputStream("student.txt");
//					boolean eof = false;
//					int count = 0;
//					while (!eof) {
//							int input = fis.read();
//							System.out.print((char)input);
//							if (input == -1) {
//								eof = true;
//							}
//							else
//								{
//								count++;
//								}
//					}
//					fis.close();
//					System.out.println("Number Bytes read: " + count);
//		} catch (IOException e) {
//		System.out.println("Error -- " + e.toString());
//		}
//	}
		int[] data = {119, 114, 105, 116, 101, 66, 121, 116, 101, 115, 46, 106, 97, 118, 97, 10} ;
		try {
		FileOutputStream fos = new FileOutputStream("FileName2.txt");
		for (int i = 0; i < data.length; i++)
		fos.write(data[i]);
		fos.close();
		} catch (IOException e) {
		System.out.println("Error -- " + e.toString());
		}
		}
}
