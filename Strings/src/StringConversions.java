
public class StringConversions {


    public static void main(String[] args){

        String s = new String("12345");
        /* String to Other types */

        /* to convert string to char array */
        char[] char_array = s.toCharArray();
        System.out.println(char_array);

        /* to convert string to Integer wrapperClass.parseWrapperClass(String s)*/
        System.out.println(Integer.parseInt(s));

        /* to convert string to integer wrapperClass.valueOf(String s)*/
        System.out.println(Integer.valueOf(s));

        /* Other types to string */

        /* String.valueOf() converts passed data type to String */
        System.out.println(String.valueOf(char_array));

        /* toString() converts object to String */
        System.out.println(char_array.toString());
    }

}
