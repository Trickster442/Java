
public class RainfallStats {
	int count;
	double total;
	double max ;
	public RainfallStats(){
		this.count = 0;
		this.total = 0;
		this.max = 0;
	}
	
	public void addMeasurement(double measurement) throws InvalidRainfallException{
        if (measurement < 0) {
            throw new InvalidRainfallException("Rainfall measurement cannot be negative");
        }
        count++;
        total += measurement;
        max = Math.max(max, measurement);
    }
	
	public int getCount() {
		return count ;
	}
	
	
	public double getMean() {
		if (count == 0) {
            throw new IllegalStateException("No measurements added yet");
        }
        return total / count;
    }
	
	
	public double getMax() {
		if (count == 0) {
            throw new IllegalStateException("No measurements added yet");
        }
        return max;
    }
}
