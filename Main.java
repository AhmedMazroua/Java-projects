/*
This assignment is to test your knowledge of GitHub and branching along with coding. A bonus section has been added for an additional 3 points, for those of you who have knowledge beyond what has been covered so far.



Methods and GitHub

Companies that provide business insurance have applications that calculate a business' risk factors in order to calculate an insurance quote. For this assignment, we will use methods to mimic how this works.

Our application will use the following risk factors: crimeFrequency, earthquakeFrequency, floodFrequency,



Create the following methods:

calculateCrimeRisk()
calculateEarthquakeRisk()
calculateFloodRisk()
totalCalculatedRisk()


Have the first 3 methods print a number to represent the calculated risk (usually this would be a number from 1 to 100).

Have totalCalculatedRisk() print the sum of the risks from those methods. In main() invoke each method.



Bonus (3 points):

To receive this bonus, the assignment must be correctly completed prior to the due date.

Have each of the first 3 methods return an integer instead of printing them.

Have totalCalculatedRisk() return a number that is the sum of the integers returned by the other methods. Do not write the literal numbers here. You will need to invoke those methods to get the value they're returning.

In main() print the result of the method totalCalculatedRisk().



Submission

To submit, send a link to the repository in GitHub. Try to use branching and merge a pull request just like we did in class.
 */

// imported Random object module
import java.util.Random;



// Defined main class
public class Main {
    // Defined Main method
    public static void main(String[] args) {
        // Invoke/Call all methods
        calculateCrimeRisk();
        calculateEarthquakeRisk();
        calculateFloodRisk();
        totalCalculatedRisk();
    }

    // Defined calculatedCrimeRisk method
    public static int calculateCrimeRisk(){
        // create Random object
        Random random = new Random();
        // Generate random number from 0 to 100
        int num = random.nextInt(101);
        // Return result
        return  num;
    }

    // Defined calculatedEarthquakeRisk method
    public static int calculateEarthquakeRisk(){
        // create Random object
        Random random = new Random();
        // Generate random number from 0 to 100
        int num = random.nextInt(101);
        // Return result
        return  num;

    }
    // Defined calculatedFloodRisk method
    public static int calculateFloodRisk(){
        // Create Random object
        Random random = new Random();
        // Generate random number from 0 to 100
        int num = random.nextInt(101);
        // Return result
        return  num;
    }

    // Defined totalCalculatedRisk method
    public static int totalCalculatedRisk(){
        // Initialized variable to store methods
        int a = calculateCrimeRisk();
        int b = calculateEarthquakeRisk();
        int c = calculateFloodRisk();

        // Sum each returned values into 1 variable
        int result = a + b + c;

        // Print to console result
        System.out.println("The total calculated risk level is" + " " + result);
        // Return result
        return result;
    }



}