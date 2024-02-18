
/******************************************************************************
*  A Teaching GA					  Developed by Hal Stringer & Annie Wu, UCF
*  Version 2, January 18, 2004
*******************************************************************************/

import java.io.*;

interface IFitnessFunction {

	// COMPUTE A CHROMOSOME'S RAW FITNESS
	public void doRawFitness(Chromo X);

	// PRINT OUT AN INDIVIDUAL GENE TO THE SUMMARY FILE
	public void doPrintGenes(Chromo X, FileWriter output) throws IOException;

	public String getName();
}
