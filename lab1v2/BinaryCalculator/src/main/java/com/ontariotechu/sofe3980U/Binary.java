package com.ontariotechu.sofe3980U;

public class Binary {
    private String number = "0";  

    public Binary(String number) {
       
        if (number == null || number.isEmpty()) {
            this.number = "0"; 
            return;
        }
        
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            if (ch != '0' && ch != '1') {
                this.number = "0"; 
                return;
            }
        }
        
       
        int beg;
        for (beg = 0; beg < number.length(); beg++) {
            if (number.charAt(beg) != '0') {
                break;
            }
        }

        this.number = number.substring(beg);
        if (this.number.isEmpty()) {
            this.number = "0"; 
        }
    }

    public String getValue() {
        return number;
    }

    public static Binary add(Binary binary1, Binary binary2) {
        
        int num1 = Integer.parseInt(binary1.getValue(), 2);
        int num2 = Integer.parseInt(binary2.getValue(), 2);
        int sum = num1 + num2;
        return new Binary(Integer.toBinaryString(sum));
    }

   
    public static Binary or(Binary binary1, Binary binary2) {
        int num1 = Integer.parseInt(binary1.getValue(), 2);
        int num2 = Integer.parseInt(binary2.getValue(), 2);
        int result = num1 | num2;  
        return new Binary(Integer.toBinaryString(result));
    }

    
    public static Binary and(Binary binary1, Binary binary2) {
        int num1 = Integer.parseInt(binary1.getValue(), 2);
        int num2 = Integer.parseInt(binary2.getValue(), 2);
        int result = num1 & num2;  
        return new Binary(Integer.toBinaryString(result));
    }

   
    public static Binary multiply(Binary binary1, Binary binary2) {
        int num1 = Integer.parseInt(binary1.getValue(), 2);
        int num2 = Integer.parseInt(binary2.getValue(), 2);
        int result = num1 * num2; 
        return new Binary(Integer.toBinaryString(result));
    }
}
