package com.xworkz.wrapperapp.wrapperClass;

public class Executor {
    public static void main(String[] args) {
        int i;
        i =90;

        Integer age = new Integer(i);
        Integer age2 = i;// Creating object without using new keyword. (Integer literals)

        //Character literals
        char ch = 'A';
        Character ch1 = new Character(ch);

         byte b = 10;
         Byte b1 = new Byte(b);

         short s = 50;
         Short s1 = new Short(s);

         long l = 193348l;
         Long l1 = new Long(l);


        System.out.println(i);
        System.out.println(ch);

    }
}
