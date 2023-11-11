package com.xworkz.wrapperapp.wrapperClass;

public class Parse {
    public static void main(String[] args) {


        String phoneNumber = "9438795834";
        long contactNo = Long.parseLong(phoneNumber);
        System.out.println(contactNo);

        String age = "4500";
        int age1 = Integer.parseInt(age);
        System.out.println(age1);

        String num = "12";
        byte num1 = Byte.parseByte(num);
        System.out.println(num1);

        String number = "834";
        short number1 = Short.parseShort(number);
        System.out.println(number1);

        String float1 = "1238.00";
        float float2 = Float.parseFloat(float1);
        System.out.println(float2);

        String double1 = "329856.00";
        double double2 = Double.parseDouble(double1);
        System.out.println(double2);
    }
}
