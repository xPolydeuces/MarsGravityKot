public class MarsGravityKot {
    public static void main(String[] args) {
        float earthWeightKot = 81;
        float marsWeightKot = earthWeightKot * 0.38f;
        double resultsKot = marsWeightKot;

        System.out.print("My weight on Mars would be: ");
        System.out.format("%.4f", resultsKot);

        int intResultsKot = (int)resultsKot;
        System.out.println("\nAfter converting the variable to int, the result will be: " + intResultsKot);

        char charResultsKot = (char)intResultsKot;
        int charOperations = charResultsKot + 12;
        System.out.println("Converting int to char and adding 12 equals: " + (char)charOperations);
    }
}
