/*
Decision-Making statements:-

"if" statement is used to evaluate a condition. Code
Execution branching is based on condition's true or false value.
There are 4 types of if-statements
1. Simple if statement
2. if-else statement
3. if-else-if ladder
4. Nested if statement

Prints:-
Value is lesser than 10.
Value is not equal to 10.
Value lies between 6 and 10(inclusive).
Value lies between 8 and 10(inclusive).
*/
class IfControlExample{
    public static void main(String[] args)
    {
        int value = 9;

        /* if statement */
        if(value < 10){
            System.out.println("Value is lesser than 10.");
        }

        /* if-else statement */
        if(value == 10){
            System.out.println("Value is not equal to 10.");
        }
        else{
            System.out.println("Value is not equal to 10.");
        }

        /* if-else if statement */
        if(value >= 0 && value <= 5){
            System.out.println("Value lies between 0 and 5(inclusive).");
        }else if(value >= 6 && value <=10){
            System.out.println("Value lies between 6 and 10(inclusive).");
        }else{
            System.out.println("Value is greater than 10.");
        }

        /* nested-if statement */
        if(value > 7){
            if(value < 10){
                System.out.println("Value lies between 8 and 10(inclusive).");
            }

        }

    }
}
