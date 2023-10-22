/*

Prints:-
3
true
o
welcomeworld
melcome
elc
welcome sandeep


welcome
sandeep
true
-1

* */
public class StringMethods {
    public static void main(String[] args){

        String s = new String("welcome");

        /*
        indexOf() -- returns index of first occurrence of substring passed.
        return values:
        0 if empty string is passed as substring.
        -1 if there is no occurrence.
        index of first occurrence of substring passed.

        Method Overloading:
        public int indexOf(char c);
        public int indexOf(char c,int startIndex);
        public int indexOf(String s);
        public int indexOf(String ,int startIndex);
        * */
        System.out.println(s.indexOf("come"));

        //contains() checks if a string is present or not and returns boolean value.
        String pattern = new String("come");
        System.out.println(s.contains(pattern));

        // to get char at given index
        System.out.println(s.charAt(4));

        //concatenation of another string returns new String
        System.out.println(s.concat("world"));

        //replace() replaces all instances of old character with new character and returns new string
        System.out.println(s.replace('w','m'));

        //substring(start,end) to get substring of string(gets string till end-1)
        System.out.println(s.substring(1,4));

        //split(delimiter,limit) to split string based on delimiter
        // if limit is passed search begins from that index. array of strings
        String spaceString = new String("  welcome sandeep  ");

        //strip() removes all trailing and leading whitespaces and returns string.
        System.out.println(spaceString.strip());

        for(String token:spaceString.split(" "))
            System.out.println(token);



        //equals() checks if 2 strings are equal or not. returns true or false.
        System.out.println(s.equals("welcome"));

        /*
        compareTo() compares 2 strings.
        return values
        0 - if both strings are equal
        <0 - if str1 is lexicographically smaller than str2.
        >0 - if str1 is lexicographically greater than str2.
        */
        String str1 = new String("str1");
        String str2 = new String("str2");
        System.out.println(str1.compareTo(str2));


    }
}
