class DataProcessor {
    int parseData(String input) throws NumberFormatException {
        return Integer.parseInt(input);
    }
}

public class DataParser {
    public static void main(String[] args) {

        DataProcessor dp = new DataProcessor();

        try {
            int result = dp.parseData("ABC");
            System.out.println("Converted number: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }
    }
}

/*
OUTPUT
Error: Invalid number format.
*/