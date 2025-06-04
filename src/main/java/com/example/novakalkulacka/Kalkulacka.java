package com.example.novakalkulacka;

public class Kalkulacka {
    public static float eval(String arg) {
        String num1 = "";
        String num2 = "";
        char operation = '0';

        String state = "num1";

        boolean isNumeric = true;
        for (char c: arg.toCharArray()) {
            if (c >= '0' && c <= '9' || c == '.') {
                isNumeric = true;
            } else {
                isNumeric = false;
            }

            if (c == '+' || c == '-' || c == '*' || c == '/') {


                if (state.equals("num")) {

                    if (num2.isEmpty())
                       throw new IllegalArgumentException("non infinix notation");

                    if (operation == '+')
                        num1 = String.valueOf(Float.parseFloat(num1) + Float.parseFloat(num2));
                    if (operation == '-')
                        num1 = String.valueOf(Float.parseFloat(num1) - Float.parseFloat(num2));
                    if (operation == '*')
                        num1 = String.valueOf(Float.parseFloat(num1) * Float.parseFloat(num2));
                    if (operation == '/')
                        num1 = String.valueOf(Float.parseFloat(num1) / Float.parseFloat(num2));

                    num2 = "";
                    operation = c;
                }
                if (state.equals("num1")) {
                    if (num1.isEmpty())
                        throw new IllegalArgumentException("non infinix notation");
                    operation = c;
                    state = "num";
                }
            }

            if (state.equals("num1") && isNumeric) {
                num1 += c;
            } else if (state.equals("num") && isNumeric) {
                num2 += c;
            }

        }

        if (operation == '+')
            num1 = String.valueOf(Float.parseFloat(num1) + Float.parseFloat(num2));
        if (operation == '-')
            num1 = String.valueOf(Float.parseFloat(num1) - Float.parseFloat(num2));
        if (operation == '*')
            num1 = String.valueOf(Float.parseFloat(num1) * Float.parseFloat(num2));
        if (operation == '/')
            num1 = String.valueOf(Float.parseFloat(num1) / Float.parseFloat(num2));

        return Float.parseFloat(num1);
    }


}
