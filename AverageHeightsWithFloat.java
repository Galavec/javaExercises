import java.io.*;

/*
 * @description: Calculate the average of the heights with Float.
 * @createdDate: 08/04/2023 15:05 GMT-5
 * @lastModifiedDate: N/A
 * @version: 1.0
 */

public class AverageHeightsWithFloat {
    public static void main(String[] arg) throws IOException {
        System.out.println("*** Calculate the average of the heights with Float ***");

        int countHeightMinors;
        int countHeight;

        double height;
        double totalAverageHeight;
        double totalAverageHeightMinors;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        countHeightMinors = 1;
        countHeight = 1;
        height = 1;
        totalAverageHeight = 0;
        totalAverageHeightMinors = 0;

        System.out.println("Enter the heights (0 at the end): ");

        while (height != 0) {
            countHeight++;

            height = (Float.valueOf(bufferedReader.readLine())).floatValue();

            totalAverageHeight = totalAverageHeight + height;

            if (height < 1.6) {
                totalAverageHeightMinors = totalAverageHeightMinors + height;

                countHeightMinors++;
            }
        }

        System.out.println(
                "The average height less than 1.60 m is: " + (totalAverageHeightMinors / (countHeightMinors - 2)));
        System.out.println("The overall average height is: " + (totalAverageHeight / (countHeight - 2)));
    }
}