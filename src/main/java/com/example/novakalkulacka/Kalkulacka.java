package com.example.novakalkulacka;

public class Kalkulacka {
    public static float eval(String arg) {
        String num1 = "";
        String num2 = "";
        char operation = '0';

        String state = "num1";

        boolean isNumeric = true;
        for (char c: arg.toCharArray()) {
            if (c >= '0' && c <= '9') {
                isNumeric = true;
            } else {
                isNumeric = false;
            }

            if ((c == '+' || c == '-' || c == '*' || c == '/') && state.equals("num1")) {
                operation = c;
                state = "num2";
            }

            if (state.equals("num1") && isNumeric) {
                num1 += c;
            } else if (state.equals("num2") && isNumeric) {
                num2 += c;
            }
        }

        if (operation == '+')
            return Float.parseFloat(num1) + Float.parseFloat(num2);
        if (operation == '-')
            return Float.parseFloat(num1) - Float.parseFloat(num2);
        if (operation == '*')
            return Float.parseFloat(num1) * Float.parseFloat(num2);
        if (operation == '/')
            return Float.parseFloat(num1) / Float.parseFloat(num2);
        return 0;
    }


}
