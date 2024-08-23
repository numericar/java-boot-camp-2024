public class DataType {

    /*
    *
    * Numeric Type - จำนวนเติม
    *   byte (8-bit signed integer)
    *   short (16-bit signed integer)
    *   int (32-bit signed integer)
    *   long (64-bit signed integer)
    *
    * Numeric Type Floating-Point - เลขทศนิยม
    *   float (32-bit single-precision floating-point number)
    *   double (64-bit double-precision floating-point number, commonly used)
    *
    * Character Type
    *   char (16-bit Unicode character)
    *
    * Boolean Type
    *   boolean (represents true or false)
    *
    * */

    // https://youtu.be/_m_-km4RyZg?si=NIVTvAW_-1MxJQWW&t=1817
    public static void main(String[] args) {
        // variable name use camelCase
        byte exampleOfByte = 127;
        short exampleOfShort = 100;
        int exampleOfInteger = 100;
        long exampleOfLong = 100L;

        float exampleOfFloat = 25.00F;
        double exampleOfDouble = 25.00;

        char exampleOfChar = 'D';

        // boolean should start with 'is' example isEnable
        boolean isExampleOfBoolean = true;

        System.out.println("Example of byte " + exampleOfByte);
        System.out.println("Example of short " + exampleOfShort);
        System.out.println("Example of int " + exampleOfInteger);
        System.out.println("Example of long " + exampleOfLong);

        System.out.println("Example of float " + exampleOfFloat);
        System.out.println("Example of double " + exampleOfDouble);

        System.out.println("Example of char " + exampleOfChar);

        System.out.println("Example of boolean " + isExampleOfBoolean);
    }
}
