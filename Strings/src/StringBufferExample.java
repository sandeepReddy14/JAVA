/*
Prints:-
8
welcomea
aemoclew
aabcemoclew
azzzzzemoclew
zzzemoclew
* */
public class StringBufferExample {
    public static void main(String[] args) {
        //1.creation of StringBuffer
        StringBuffer sb = new StringBuffer("welcome");

        //2.to append a string
        sb.append("a");

        //3.length of StringBuffer
        System.out.println(sb.length());

        //4.to get a string version of StringBuffer
        System.out.println(sb.toString());

        //5.to reverse the order of StringBuffer
        System.out.println(sb.reverse());

        //6.to insert string at specific position
        System.out.println(sb.insert(1,"abc"));

        //7.to replace string at given range.
        //if length of passed string overflows the range other characters are inserted.
        System.out.println(sb.replace(1,4,"zzzzz"));

        //8.to delete specific range but till before end index.
        System.out.println(sb.delete(0,3).toString());

    }
}