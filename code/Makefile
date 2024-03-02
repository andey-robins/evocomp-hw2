build:
	javac *.java

run: build
	java Search ./parameters/testing.params

clean:
	rm -f **/*.class
	rm -f *.class
	rm -rf ../pkg
	rm -f ../pkg.zip
	rm -f *_summary.txt
	rm -f ../data/*.txt
	rm -f *.csv

data: build
	mkdir -p ../data
	mkdir -p ../data/rr1
	mkdir -p ../data/rr2
	java Search ./parameters/rr1/rr_1pt_50.params > ../data/rr_1pt_50.txt
	java Search ./parameters/rr1/rr_1pt_70.params > ../data/rr_1pt_70.txt
	java Search ./parameters/rr1/rr_1pt_100.params > ../data/rr_1pt_100.txt
	java Search ./parameters/rr1/rr_2pt_50.params > ../data/rr_2pt_50.txt
	java Search ./parameters/rr1/rr_2pt_70.params > ../data/rr_2pt_70.txt
	java Search ./parameters/rr1/rr_2pt_100.params > ../data/rr_2pt_100.txt
	java Search ./parameters/rr1/rr_uni_50.params > ../data/rr_uni_50.txt
	java Search ./parameters/rr1/rr_uni_70.params > ../data/rr_uni_70.txt
	java Search ./parameters/rr1/rr_uni_100.params > ../data/rr_uni_100.txt
	mv ../data/*.txt ../data/rr1/
	mv *.txt ../data/rr1/
	java Search ./parameters/rr2/rr2_1pt_50.params > ../data/rr2_1pt_50.txt
	java Search ./parameters/rr2/rr2_1pt_70.params > ../data/rr2_1pt_70.txt
	java Search ./parameters/rr2/rr2_1pt_100.params > ../data/rr2_1pt_100.txt
	java Search ./parameters/rr2/rr2_2pt_50.params > ../data/rr2_2pt_50.txt
	java Search ./parameters/rr2/rr2_2pt_70.params > ../data/rr2_2pt_70.txt
	java Search ./parameters/rr2/rr2_2pt_100.params > ../data/rr2_2pt_100.txt
	java Search ./parameters/rr2/rr2_uni_50.params > ../data/rr2_uni_50.txt
	java Search ./parameters/rr2/rr2_uni_70.params > ../data/rr2_uni_70.txt
	java Search ./parameters/rr2/rr2_uni_100.params > ../data/rr2_uni_100.txt
	mv ../data/*.txt ../data/rr2/
	mv *.txt ../data/rr2/

zip:
	mkdir -p ../pkg
	cp -r ../code/*.java ../pkg
	cp -r ../code/parameters/*.params ../pkg
	zip -r ../pkg.zip ../pkg