import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RainfallProgram {
	public static void main(String[] args) throws IOException {
		BufferedReader keyboard = new BufferedReader(
			new InputStreamReader(System.in) 
		);
		 
		RainfallStats stats = new RainfallStats();
		System.out.println("Enter rainfall measurements (in mm), or end to stop.");
		
		while(true) {
			System.out.print("> ");
			String line = keyboard.readLine(); 
			if("end".equals(line)) {
				break;
			}
			try {
				double measurement = Double.parseDouble(line);
				stats.addMeasurement(measurement);
			}catch(NumberFormatException e){
				System.out.println("Please enter a valid number");
				
			}catch(InvalidRainfallException e) {
				System.out.println(e.getMessage());
				
			}
		}
		System.out.println(stats.getCount() + " measurement(s) entered.");
		// TODO: prevent the exception when no measurements have been entered.
		System.out.println("Mean rainfall: " + stats.getMean() + " mm");
		System.out.println("Maximum rainfall: " + stats.getMax() + " mm");
	}
}
