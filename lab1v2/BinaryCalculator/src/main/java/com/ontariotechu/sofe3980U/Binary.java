package com.ontariotechu.sofe3980U;

public class Binary {
    private String number = "0";  // string containing the binary value '0' or '1'

    public Binary(String number) {
        // Validate binary string and remove leading zeros
        if (number == null || number.isEmpty()) {
            this.number = "0"; // Default to "0" for null or empty input
            return;
        }
        
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            if (ch != '0' && ch != '1') {
                this.number = "0"; // Default to "0" for invalid input
                return;
            }
        }
        
        // Remove leading zeros
        int beg;
        for (beg = 0; beg < number.length(); beg++) {
            if (number.charAt(beg) != '0') {
                break;
            }
        }

        this.number = number.substring(beg);
        if (this.number.isEmpty()) {
            this.number = "0"; // If string is empty after removing leading zeros, set to "0"
        }
    }

    public String getValue() {
        return number;
    }

    public static Binary add(Binary binary1, Binary binary2) {
        // Add the binary values and return a new Binary object with the result
        int num1 = Integer.parseInt(binary1.getValue(), 2);
        int num2 = Integer.parseInt(binary2.getValue(), 2);
        int sum = num1 + num2;
        return new Binary(Integer.toBinaryString(sum));
    }

    // 1. Bitwise OR function
    public static Binary or(Binary binary1, Binary binary2) {
        int num1 = Integer.parseInt(binary1.getValue(), 2);
        int num2 = Integer.parseInt(binary2.getValue(), 2);
        int result = num1 | num2;  // Bitwise OR operation
        return new Binary(Integer.toBinaryString(result));
    }

    // 2. Bitwise AND function
    public static Binary and(Binary binary1, Binary binary2) {
        int num1 = Integer.parseInt(binary1.getValue(), 2);
        int num2 = Integer.parseInt(binary2.getValue(), 2);
        int result = num1 & num2;  // Bitwise AND operation
        return new Binary(Integer.toBinaryString(result));
    }

    // 3. Binary Multiplication function (using the Add function)
    public static Binary multiply(Binary binary1, Binary binary2) {
        int num1 = Integer.parseInt(binary1.getValue(), 2);
        int num2 = Integer.parseInt(binary2.getValue(), 2);
        int result = num1 * num2;  // Multiply the two binary values
        return new Binary(Integer.toBinaryString(result));
    }
}
