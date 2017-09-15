public class Fractions {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arraySize = s.nextInt();
		double posCounter = 0;
		double negCounter = 0;
		double zeroCounter = 0;
		double posResult = 0;
		double negResult = 0;
		double zeroResult = 0;
		int curr = 0;
		for(int i = 0; i < arraySize; i++) {
			curr = s.nextInt();
			if(curr < 0) {
				negCounter++;
			} else if(curr > 0) {
				posCounter++;
			} else {
				zeroCounter++;
			}
		}
		posResult = posCounter/arraySize;
		negResult = negCounter/arraySize;
		zeroResult = zeroCounter/arraySize;
		System.out.println(posResult);
		System.out.println(negResult);
		System.out.println(zeroResult);
		s.close();
	}
}
