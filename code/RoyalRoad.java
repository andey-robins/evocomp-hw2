
/******************************************************************************
*  A Teaching GA					  Developed by Hal Stringer & Annie Wu, UCF
*  Version 2, January 18, 2004
*******************************************************************************/

import java.io.*;

public class RoyalRoad implements IFitnessFunction {

	private static String name = "RoyalRoad Problem";

	private Schema[] schemata = new Schema[] {
			new Schema("11111111********************************************************", 8),
			new Schema("********11111111************************************************", 8),
			new Schema("****************11111111****************************************", 8),
			new Schema("************************11111111********************************", 8),
			new Schema("********************************11111111************************", 8),
			new Schema("****************************************11111111****************", 8),
			new Schema("************************************************11111111********", 8),
			new Schema("********************************************************11111111", 8),
			new Schema("1111111111111111111111111111111111111111111111111111111111111111", 32),
	};

	public RoyalRoad() {
	}

	// COMPUTE A CHROMOSOME'S RAW FITNESS
	public void doRawFitness(Chromo X) {
		X.rawFitness = 0;
		for (int i = 0; i < this.schemata.length; i++) {
			X.rawFitness += this.schemata[i].ScoreString(X.chromo);
		}
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
