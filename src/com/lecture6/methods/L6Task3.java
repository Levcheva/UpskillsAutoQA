package com.lecture6.methods;

public class L6Task3 {
    public static void main(String[] args) {
        String myString = "12345678";

        int length = myString.length();

        if (length % 2 == 0) {
            System.out.println(myString.charAt(length / 2));
            System.out.println(myString.charAt((length / 2) - 1));
        }
        else {
            System.out.println(myString.charAt(length / 2));
        }

        String stringCount = "Please, count the words of this string if you can!";
        count_Words(stringCount);
   }
    public static int count_Words(String str)
    {
        int count = 0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
        {
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1;
        }
        System.out.println("The number of the words in the string is: " + count);
        return count; // returns 0 if string starts or ends with space " ".
    }
}
