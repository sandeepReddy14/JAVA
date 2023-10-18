/*
Data types specify size and value that can be stored in variable. There are 2 types of data
types in Java:
1.Primitive data types:
	The primitive data types include boolean, char, byte, short, int, long, float and double.
2. Non-Primitive data types:
  The non-primitive data types include Classes, Interfaces, and Arrays.

char in java uses 2 bytes instead of 1 byte because java uses unicode system in place of ASCII
like other languages to support more languages.

Prints:-
Size of byte: 1 bytes.
Size of short: 2 bytes.
Size of int: 4 bytes.
Size of long: 8 bytes.
Size of char: 2 bytes.
Size of float: 4 bytes.
Size of double: 8 bytes.

*/

public class DataTypes {

    public static void main(String[] args){

        /* range is true/false size is 1 bit */
        boolean booleanVariable = true;

        /* range is '\u0000' to '\uFFFF' size is 2 bytes*/
        char charVariable = 'a';

        /* byte is 8-bit signed 2's complement integer range */
        byte byteVariable = 10;

        /* short is 2-byte signed 2's complement integer */
        short shortVariable = 20;

        /* int is 4-byte signed 2's complement integer */
        int intVariable = 30;

        /* long is 8-byte signed 2's complement integer */
        long longVariable = 40L;

        /* float is 4-byte single precision floating point */
        float floatVariable = 234.5f;

        /* double is 8-byte double precision floating point */
        double doubleVariable = 12.3;


        /*
        * BYTES constant field of wrapper class gives size of data type.
        *
        * */

        System.out.println("Size of byte: " + (Byte.SIZE/8) + " bytes.");
        System.out.println("Size of short: " + (Short.SIZE/8) + " bytes.");
        System.out.println("Size of int: " + (Integer.SIZE/8) + " bytes.");
        System.out.println("Size of long: " + (Long.SIZE/8) + " bytes.");
        System.out.println("Size of char: " + (Character.SIZE/8) + " bytes.");
        System.out.println("Size of float: " + (Float.SIZE/8) + " bytes.");
        System.out.println("Size of double: " + (Double.SIZE/8) + " bytes.");

    }

}
