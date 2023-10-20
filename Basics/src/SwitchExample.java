/*
switch statements contains multiple blocks of code called cases and 
single case is executed based on the variable which is being switched.
break statement should be used to execute only that case block.
Prints:-
Value is 3.
*/
class SwitchExample {
    public static void main(String[] args)
    {
        int value = 3;

        switch(value)
        {
            case 1:
                System.out.println("Value is 1.");
                break;
            case 2:
                System.out.println("Value is 2.");
                break;
            case 3:
                System.out.println("Value is 3.");
                break;
            case 4:
                System.out.println("Value is 4.");
                break;
            default:
                System.out.println("Value is not 1, 2, 3 or 4.");
        }

    }
}