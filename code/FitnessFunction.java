
/******************************************************************************
*  A Teaching GA					  Developed by Hal Stringer & Annie Wu, UCF
*  Version 2, January 18, 2004
*******************************************************************************/

import java.io.*;

class FitnessFunction {

	public String name;

	public FitnessFunction() {

		System.out.print("Setting up Fitness Function.....");

	}

	// COMPUTE A CHROMOSOME'S RAW FITNESS
	public void doRawFitness(Chromo X) {
		System.out.println("Executing FF Raw Fitness");
	}

	// PRINT OUT AN INDIVIDUAL GENE TO THE SUMMARY FILE
	public void doPrintGenes(Chromo X, FileWriter output) throws java.io.IOException {
		System.out.println("Executing FF Gene Output");
	}
}
