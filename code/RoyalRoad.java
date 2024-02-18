
/******************************************************************************
*  A Teaching GA					  Developed by Hal Stringer & Annie Wu, UCF
*  Version 2, January 18, 2004
*******************************************************************************/

import java.io.*;

public class RoyalRoad implements IFitnessFunction {

	private static String name = "RoyalRoad Problem";

	public RoyalRoad() {
	}

	// COMPUTE A CHROMOSOME'S RAW FITNESS
	public void doRawFitness(Chromo X) {

		// TODO: perform RR encoding and fitness evaluation
		X.rawFitness = Double.MAX_VALUE;
	}

	// PRINT OUT AN INDIVIDUAL GENE TO THE SUMMARY FILE
	public void doPrintGenes(Chromo X, FileWriter output) throws IOException {

		for (int i = 0; i < Parameters.numGenes; i++) {
			halio.Hwrite.right(X.getGeneAlpha(i), 11, output);
		}
		output.write("   RawFitness");
		output.write("\n        ");
		for (int i = 0; i < Parameters.numGenes; i++) {
			halio.Hwrite.right(X.getPosIntGeneValue(i), 11, output);
		}
		halio.Hwrite.right((int) X.rawFitness, 13, output);
		output.write("\n\n");
		return;
	}

	public String getName() {
		return name;
	}
}
