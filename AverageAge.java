import java.io.*;

/*
 * @description: Average age and percentage of people older than fifty years.
 * @createdDate: 08/04/2023 12:14 GMT-5
 * @lastModifiedDate: N/A
 * @version: 1.0
 */

public class AverageAge {
    public static void main(String[] args) throws IOException {
        System.out.println("*** Average age and percentage of people older than fifty years ***");

        BufferedReader bufferedReader;

        int number;
        int totalRecords;

        double sumAge;
        double overFifty;
        double averageAge;
        double percentageOverFifty;

        bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        number = 1;
        sumAge = 0;
        totalRecords = 0;
        overFifty = 0;

        System.out.println("Entering the number 0 indicates the end of the age entry.");

        while (number != 0) {
            System.out.print("Enter an age:");
            number = Integer.parseInt(bufferedReader.readLine());

            sumAge = sumAge + number;

            if (number > 50)
                overFifty++;

            totalRecords++;
        }

        averageAge = sumAge / (totalRecords - 1);

        percentageOverFifty = (overFifty * 100) / (totalRecords - 1);

        System.out.println("The average of the ages entered is: " + averageAge);
        System.out.println("The percentage of people older than 50 years is: " + percentageOverFifty);
    }
}