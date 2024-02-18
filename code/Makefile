build:
	javac *.java

run: build
	java Search ./parameters/testing.params

clean:
	rm -f *.class
	rm -rf ../pkg
	rm -f ../pkg.zip

zip:
	mkdir -p ../pkg
	cp -r ../code/*.java ../pkg
	cp -r ../code/parameters/*.params ../pkg
	zip -r ../pkg.zip ../pkg