/**
 * A utility class for checking numeric values and ranges.
 */
public class checking {
    /**
     * Checks if a string can beS parsed into a numeric value.
     * @param st The string to be checked.
     * @return True if the string can be parsed into a numeric value, false otherwise.
     */
    public static boolean checkNum(String st) {
        try {
            Double.parseDouble(st);
            return true;
        } catch (NumberFormatException e) {
            // Exception occurred, string cannot be parsed into a numeric value
            return false;
        }
    }

    /**
     * Checks if a given value is within a specified range.
     * @param min The minimum value of the range.
     * @param max The maximum value of the range.
     * @param value The value to be checked.
     * @return True if the value is within the specified range, false otherwise.
     */
    public static boolean checkRange(int min, int max, int value) {
        // Check if the value is within the specified range
        return value >= min && value <= max;
    }
}
