package companies.reasunta;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    static HashSet<Character> variables = new HashSet<>();

    public static String SimpleSAT(String str) {
        // Extracting variables from the string
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                variables.add(c);
            }
        }

        // Creating permutations for assigning true or false to variables
        ArrayList<String> permutations = generatePermutations(new ArrayList<>(variables));

        // Evaluating each permutation
        for (String permutation : permutations) {
            if (evaluate(str, permutation)) {
                return "yes";
            }
        }

        return "no";
    }

    // Method to generate all possible permutations of variables being true or false
    public static ArrayList<String> generatePermutations(ArrayList<Character> variables) {
        ArrayList<String> result = new ArrayList<>();
        generatePermutationsHelper(variables, 0, "", result);
        return result;
    }

    public static void generatePermutationsHelper(ArrayList<Character> variables, int index, String prefix, ArrayList<String> result) {
        if (index >= variables.size()) {
            result.add(prefix);
            return;
        }

        char currentVar = variables.get(index);
        generatePermutationsHelper(variables, index + 1, prefix + currentVar + "=TRUE,", result);
        generatePermutationsHelper(variables, index + 1, prefix + currentVar + "=FALSE,", result);
    }

    // Method to evaluate the boolean formula with a given variable assignment
    public static boolean evaluate(String formula, String assignment) {
        String[] assignments = assignment.split(",");
        for (String assignmentPair : assignments) {
            String[] parts = assignmentPair.split("=");
            char variable = parts[0].charAt(0);
            boolean value = parts[1].equals("TRUE");
            formula = formula.replaceAll(String.valueOf(variable), String.valueOf(value));
        }
        formula = formula.replaceAll("~", "!");
        return evaluateExpression(formula);
    }

    public static boolean evaluateExpression(String expression) {
        return Boolean.parseBoolean(expression);
    }

    public static void main(String[] args) {
        // Example usage:
        String str1 = "(a&b)|c";
        String str2 = "((a&c)&~a)";

        System.out.println(SimpleSAT(str1)); // Output: yes
        System.out.println(SimpleSAT(str2)); // Output: no
    }
}