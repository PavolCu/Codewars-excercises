package org.example;

import java.util.Scanner;

public class GrassHopper {
    public static char getGrade(int s1, int s2, int s3) {
        int average = (s1 + s2 + s3) / 3;

        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void readAndCalculateGrade() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter score 1:");
        int s1 = scanner.nextInt();

        System.out.println("Enter score 2:");
        int s2 = scanner.nextInt();

        System.out.println("Enter score 3:");
        int s3 = scanner.nextInt();

        char grade = getGrade(s1, s2, s3);
        System.out.println("The grade is: " + grade);
    }
}

/*public class GrassHopper {

    public static char getGrade(int s1, int s2, int s3) {
        s1=(s1+s2+s3)/3;
        return s1 >= 90 ? 'A':s1 >= 80 ? 'B':s1 >= 70 ? 'C':s1 >= 60 ? 'D':'F';
    }
}*/