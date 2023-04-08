import java.io.*;

/*
 * @description: Calculate the number of workers who will receive the bonus.
 * @createdDate: 08/04/2023 12:51 GMT-5
 * @lastModifiedDate: N/A
 * @version: 1.0
 */

public class CalculateBonusForWorkers {
    public static void main(String[] args) throws IOException {
        System.out.println("*** Calculate the number of workers who will receive the bonus ***");

        BufferedReader bufferedReader;

        int numberYearsToBonus;
        int yearsWorked;
        int counter;
        int totalEmployeesWithBonus;
        int totalEmployeesMoreTwentyYearsWorked;

        bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of years an employee must have worked at least to receive the bonus:");

        numberYearsToBonus = Integer.parseInt(bufferedReader.readLine());

        System.out
                .println("Enter the number of years worked for each employee: (entering 0 ends data entry)");

        yearsWorked = 1;
        counter = 0;
        totalEmployeesWithBonus = 0;
        totalEmployeesMoreTwentyYearsWorked = 0;

        while (yearsWorked != 0) {
            counter++;
            System.out.println("Employee " + (counter) + ": ");

            yearsWorked = Integer.parseInt(bufferedReader.readLine());

            if (yearsWorked >= numberYearsToBonus)
                totalEmployeesWithBonus++;

            if (yearsWorked > 20)
                totalEmployeesMoreTwentyYearsWorked++;
        }

        if (totalEmployeesWithBonus == 0)
            System.out.println("No employee will receive bonus.");
        else {
            System.out.println("The company will pay " + totalEmployeesWithBonus + " bonus(es).");

            System.out.println(((totalEmployeesMoreTwentyYearsWorked * 100) / totalEmployeesWithBonus)
                    + "% of all employees who will receive the bonus have worked more than twenty years.");
        }
    }
}