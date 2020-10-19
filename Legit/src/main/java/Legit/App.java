package Legit;

public class App {

	public static void main(String[] args) {
		/*
		 * INSTALL & CREATE PROJECT IN TERMINAL
		 * 
		 * INSTALL:
		 * 0) https://www.youtube.com/watch?v=h6Figshq6_I
		 *
		 * 1) step1:
		 * 	-verify that java installed (gradle works with java)
		 * 	-go to gradle site download and install gradle
		 * 2) step2:
		 * 	-unzip the zip file in a local folder ex: d:/tools
		 * 3) step3:
		 * 	-open envirement parameters
		 * 	- create variable GRADLE_HOME insert gradle path ex: d:/tools/gradle
		 * 	-create entry in Path insert directory of bin file ex: d:/tools/gradle/bin
		 * 4) step4:
		 * 	-verify in cmd : gradle -v or gradle --version
		 * 
		 * CREATE PROJECT IN TERMINAL:
		 * 	-create a folder to hold the project ex: name it gradle
		 * 	-point on the folder 
		 * 	-excetute gradle init in terminal
		 * 		- you get quiz 
		 * 			- 1: application
		 * 			- 2: java
		 * 			- 3: no
		 * 			- 4: Groovy
		 * 	-insert in terminal "./gradlew build" to build the project
		 * 	-insert in terminal "./gradlew run" to run the project
		 * 	-the "./gradlew" will access the file "gradlew" in the current directory and "build"
		 * 	word will build the project the "run" word will run the project
		 * 	-open file to see the code
		 * 		- cd src
		 * 		- cd main
		 * 		- cd java 
		 * 		- cd Ligit(it is the name of the project that i gave in the initialization of the project
		 * 		- less app.java (open up the file in the vim command line editor)
		 * 		- "q" button to exit the vim command line editor
		 */
		
		/*
		 * GRADLE WITH ECLIPESE:
		 * 
		 * 	-Help > Market Place > buildShip Gradle (Plugin)
		 * 	-File > new > other > gradle >gradle project > Project Name > Legit >Finish
		 * 	-Create class in main but it will be created under the package named as project name > check public static void main
		 * 	-to run >project name > right click > run as > java application 
		 * 	-after this use run directly 
		 * 
		 */
		System.out.println("Hello World ! This is Gradle in eclipse");
	}

}
