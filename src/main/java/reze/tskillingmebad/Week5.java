import reze.tskillingmebad;
import java.util.Arrays;

public class Week5 {
    public static void main(String[] args) {

        System.out.println("--- FAVORITE THINGS ARRAY ---");

        String[] favThings = {
            "Reading",
            "Gaming",
            "Watching",
            "Badminton",
            "Listening to music"
        };

        for (int i = 0; i < favThings.length; i++) {
            System.out.println((i + 1) + ". " + favThings[i]);
        }

        System.out.println("\n--- CLASS STATISTICS CALCULATOR ---");

        int[] studentScores = {85, 92, 78, 64, 95, 88, 73, 90};

        int sum = 0;
        int high = studentScores[0];
        int low = studentScores[0];

        for (int i = 0; i < studentScores.length; i++) {
            sum += studentScores[i];

            if (studentScores[i] > high) {
                high = studentScores[i];
            }

            if (studentScores[i] < low) {
                low = studentScores[i];
            }
        }

        double ave = (double) sum / studentScores.length;

        System.out.println("\n--- SUMMARY ---");
        System.out.println("Sum of Scores: " + sum);
        System.out.printf("Average: %.2f%n", ave);
        System.out.println("Highest Score: " + high);
        System.out.println("Lowest Score: " + low);
        System.out.println("---------------");

        System.out.println("\n--- LINEAR SEARCH ---");

        int target = 95;
        int foundIndex = -1;

        for (int i = 0; i < studentScores.length; i++) {
            if (studentScores[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println(
                "Target " + target + " was found at index: " + foundIndex
            );
        } else {
            System.out.println(
                "Target " + target + " was not found in the array."
            );
        }

        int[] sortedScores =
            Arrays.copyOf(studentScores, studentScores.length);

        Arrays.sort(sortedScores);

        System.out.println("\n--- SORTED SCORES ---");
        System.out.println(
            "Original scores: " + Arrays.toString(studentScores)
        );
        System.out.println(
            "Sorted scores:   " + Arrays.toString(sortedScores)
        );

        System.out.println("\n--- CLASS RANKING SYSTEM ---");

        String[] studentNames = {
            "Naruto",
            "Sasuke",
            "Sakura",
            "Hinata",
            "Shikamaru"
        };

        int[][] rawQuizData = {
            {89, 93, 86, 96},
            {70, 76, 81, 78},
            {91, 88, 96, 92},
            {98, 96, 98, 99},
            {82, 83, 85, 84}
        };

        Student[] students = new Student[studentNames.length];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(
                studentNames[i],
                rawQuizData[i]
            );
        }

        // Bubble sort: highest average to lowest average
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {

                if (students[j].getAverage()
                        < students[j + 1].getAverage()) {

                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        // Assign ranks
        students[0].rank = 1;

        for (int i = 1; i < students.length; i++) {

            if (students[i].getAverage()
                    == students[i - 1].getAverage()) {

                students[i].rank = students[i - 1].rank;

            } else {
                students[i].rank = i + 1;
            }
        }

        // Display ranking
        System.out.println(
            "--------------------------------------------------"
        );

        System.out.printf(
            "%-6s | %-12s | %-10s | %s%n",
            "Rank",
            "Name",
            "Average",
            "Quizzes"
        );

        System.out.println(
            "--------------------------------------------------"
        );

        for (Student s : students) {
            System.out.printf(
                "%-6d | %-12s | %-10.2f | %s%n",
                s.rank,
                s.name,
                s.getAverage(),
                Arrays.toString(s.quizzes)
            );
        }

        System.out.println(
            "--------------------------------------------------"
        );

        // Search student
        String searchTargetName = "Naruto";

        int studentRank = studentRank(
            students,
            searchTargetName
        );

        if (studentRank != -1) {
            System.out.println(
                "Search Result: " +
                searchTargetName +
                " is ranked #" +
                studentRank
            );
        } else {
            System.out.println(
                "Search Result: Student \"" +
                searchTargetName +
                "\" not found."
            );
        }
    }

    public static int studentRank(
        Student[] list,
        String targetName
    ) {

        for (int i = 0; i < list.length; i++) {

            if (list[i].name.equalsIgnoreCase(targetName)) {
                return list[i].rank;
            }
        }

        return -1;
    }
}

class Student {

    String name;
    int[] quizzes;
    int rank;

    public Student(String name, int[] quizzes) {
        this.name = name;
        this.quizzes = quizzes;
    }

    public double getAverage() {

        int sum = 0;

        for (int score : quizzes) {
            sum += score;
        }

        return (double) sum / quizzes.length;
    }
}
