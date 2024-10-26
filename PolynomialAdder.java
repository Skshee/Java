// Abstract class BaseClass with an abstract method add
abstract class BaseClass {
    // Abstract method to be implemented in the derived class
    abstract String add(String Eq1, String Eq2);
}

// Main class derived from BaseClass
public class PolynomialAdder extends BaseClass {

    // Implementation of the abstract method add
    @Override
    public String add(String Eq1, String Eq2) {
        try {
            // Split the equations into individual terms
            String[] terms1 = Eq1.split("\\+");
            String[] terms2 = Eq2.split("\\+");

            // Variables to store coefficients of X and Y
            int xCoefficient = 0;
            int yCoefficient = 0;

            // Add coefficients of X and Y from the first equation
            for (String term : terms1) {
                term = term.trim();  // Trim is used to remove empty spaces
                if (term.endsWith("X")) {
                    xCoefficient += Integer.parseInt(term.replace("X", "").trim());
                } else if (term.endsWith("Y")) {
                    yCoefficient += Integer.parseInt(term.replace("Y", "").trim());
                } else {
                    throw new IllegalArgumentException("Invalid Equation");
                }
            }

            // Add coefficients of X and Y from the second equation
            for (String term : terms2) {
                term = term.trim();
                if (term.endsWith("X")) {
                    xCoefficient += Integer.parseInt(term.replace("X", "").trim());
                } else if (term.endsWith("Y")) {
                    yCoefficient += Integer.parseInt(term.replace("Y", "").trim());
                } else {
                    throw new IllegalArgumentException("Invalid Equation");
                }
            }

            // Return the combined equation
            return xCoefficient + "X + " + yCoefficient + "Y";

        } catch (Exception e) {
            return "Invalid Equation";
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of PolynomialAdder
        PolynomialAdder adder = new PolynomialAdder();

        // Sample input equations
        String Eq1 = "10X + 3Y";
        String Eq2 = "2X + 12Y";

        // Call the add method and print the result
        String result = adder.add(Eq1, Eq2);
        System.out.println("Result: " + result);
    }
}
