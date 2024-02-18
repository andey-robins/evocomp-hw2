
/******************************************************************************
*  A Teaching GA					  Developed by Hal Stringer & Annie Wu, UCF
*  Version 2, January 18, 2004
*******************************************************************************/

import java.io.*;

public class NumberMatch implements IFitnessFunction {

	// Assumes no more than 100 values in the data file
	public static int[] testValue = new int[100];
	private static String name = "Number Match Problem";

	public NumberMatch() throws IOException {
		// Create Table of X values from input file
		BufferedReader input = new BufferedReader(new FileReader(Parameters.dataInputFileName));
		for (int i = 0; i < Parameters.numGenes; i++) {
			testValue[i] = Integer.parseInt(input.readLine().trim());
		}
		input.close();
	}

	// COMPUTE A CHROMOSOME'S RAW FITNESS
	public void doRawFitness(Chromo X) {
		double difference = 0;
		for (int j = 0; j < Parameters.numGenes; j++) {
			difference = (double) Math.abs(X.getIntGeneValue(j) - testValue[j]);
			X.rawFitness = X.rawFitness + difference;
		}
	}

	// PRINT OUT AN INDIVIDUAL GENE TO THE SUMMARY FILE
	public void doPrintGenes(Chromo X, FileWriter output) throws java.io.IOException {

		for (int i = 0; i < Parameters.numGenes; i++) {
			Hwrite.right(X.getGeneAlpha(i), 11, output);
		}
		output.write("   RawFitness");
		output.write("\n        ");
		for (int i = 0; i < Parameters.numGenes; i++) {
			Hwrite.right(X.getIntGeneValue(i), 11, output);
		}
		Hwrite.right((int) X.rawFitness, 13, output);
		output.write("\n\n");
		return;
	}

	public String getName() {
		return name;
	}
}
