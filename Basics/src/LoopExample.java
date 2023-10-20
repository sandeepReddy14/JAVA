/*
Loop Statements:-
To execute set of instructions in a repeated order loop statements are used.
1. for loop
2. while loop
3. do-while loop
4. for-each loop
In for loop initialization, condition, increment/decrement happens.
In while loop condition check happens and in code block values may change.
In do-while loop code block is executed first and condition is checked later.
for-each loop is used to traverse data structures like array or collection

Prints:-
Value of iterator in looping for-loop is 0
Value of iterator in looping for-loop is 1
Value of iterator in looping for-loop is 2
Value of iterator in looping for-loop is 3
Value of iterator in looping for-loop is 4
Value of iterator in looping while-loop is 0
Value of iterator in looping while-loop is 1
Value of iterator in looping while-loop is 2
Value of iterator in looping while-loop is 3
Value of iterator in looping while-loop is 4
Value of iterator in looping do-while-loop is 0
Value of iterator in looping do-while-loop is 1
Value of iterator in looping do-while-loop is 2
Value of iterator in looping do-while-loop is 3
Value of iterator in looping do-while-loop is 4
Value of iter in looping for-each loop is 10
Value of iter in looping for-each loop is 20
Value of iter in looping for-each loop is 30
Value of iter in looping for-each loop is 40
Value of iter in looping for-each loop is 50
*/

class LoopExample{
    public static void main(String[] args)
    {
        int iterator = 0;

        /* for-loop */
        for(iterator = 0;iterator < 5;iterator++){
            System.out.println("Value of iterator in looping for-loop is " + iterator);
        }

        /* while loop*/
        iterator = 0;
        while(iterator < 5){
            System.out.println("Value of iterator in looping while-loop is " + iterator);
            iterator++;
        }

        /* do while loop */
        iterator = 0;
        do{
            System.out.println("Value of iterator in looping do-while-loop is " + iterator);
            iterator++;
        }while(iterator < 5);

        /* for-each loop*/
        int[] array = new int[]{10, 20, 30, 40, 50};
        for(int iter : array){
            System.out.println("Value of iter in looping for-each loop is " + iter);
        }
    }
}