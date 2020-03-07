import java.util.Scanner; 

public class DataAnalyze {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		int sampleSize, total1 = 0, total2 = 0, total3 = 0, total4 = 0 ;

		System.out.print("Please enter the sample size: ");
		sampleSize = input.nextInt(); 

		int [] samplesTrial1 = new int [sampleSize], samplesTrial2 = new int [sampleSize], samplesTrial3 = new int [sampleSize], samplesTrial4 = new int [sampleSize]; 

		if(sampleSize == 0)
			System.out.print("No data to analyze. Ending program.");
		else {
			System.out.println("Enter numbers for Trial 1");
			for(int i = 0; i < sampleSize; i++) {
				System.out.print("Enter sample #" + (i + 1) + ": ");
				samplesTrial1[i] = input.nextInt();
				total1 += samplesTrial1[i];
			}
			System.out.println();

			System.out.println("Enter numbers for Trial 2");
			for(int i = 0; i < sampleSize; i++) {
				System.out.print("Enter sample #" + (i + 1) + ": ");
				samplesTrial2[i] = input.nextInt();
				total2 += samplesTrial2[i];
			}
			System.out.println();

			System.out.println("Enter numbers for Trial 3");
			for(int i = 0; i < sampleSize; i++) {
				System.out.print("Enter sample #" + (i + 1) + ": ");
				samplesTrial3[i] = input.nextInt();
				total3 += samplesTrial3[i];
			}
			System.out.println();

			System.out.println("Enter numbers for Trial 4");
			for(int i = 0; i < sampleSize; i++) {
				System.out.print("Enter sample #" + (i + 1) + ": ");
				samplesTrial4[i] = input.nextInt();
				total4 += samplesTrial4[i];
			}
			System.out.println();

			System.out.println("\tSample #\tTrial 1\tTrial 2\tTrial 3\tTrial 4");
			for(int i = 0; i < sampleSize; i++) {
				System.out.print("\t" + (i + 1) + "\t");
				System.out.print("\t" + samplesTrial1[i]);
				System.out.print("\t" + samplesTrial2[i]);
				System.out.print("\t" + samplesTrial3[i]);
				System.out.print("\t" + samplesTrial4[i]);
				System.out.println();
			}

			System.out.println("\t-----------------------------------------------");

			double average1 = (double)total1 / sampleSize;
			double average2 = (double)total2 / sampleSize;
			double average3 = (double)total3 / sampleSize;
			double average4 = (double)total4 / sampleSize;

			System.out.print("Averages:\t\t");
			System.out.print(average1 + "\t");
			System.out.print(average2 + "\t");
			System.out.print(average3 + "\t");
			System.out.print(average4 + "\t");
			System.out.println("\n");


			double maxAverage = average1; 
			double minAverage = average1;

			if(minAverage > average2)
				minAverage = average2;
			if(minAverage > average3)
				minAverage = average3;
			if(minAverage > average4)
				minAverage = average4;
			System.out.println("Min Average: " + minAverage);

			if(maxAverage < average2)
				maxAverage = average2;
			if(maxAverage < average3)
				maxAverage = average3;
			if(maxAverage < average4)
				maxAverage = average4;

			System.out.println("Max Average: " + maxAverage + "\n");

			if((average1 == average2) && (average1 == average3) && (average1 == average4))
				System.out.print("The trials match EXACTLY!");
			else if(((average1 == average2) || (average1 == average3) || (average1 == average4)) || ((average2 == average3) || (average2 == average4)) || ((average3 == average4)))
				System.out.print("The trials concur with each other!");
			else 
				System.out.print("The trials do NOT concur!");
		}

	}

}
