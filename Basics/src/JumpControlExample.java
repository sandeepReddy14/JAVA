/*

Jump statements:-
1.break statement is used to break the current flow of program and transfer the
control to the next statement outside a loop or switch statement. It breaks only
the inner loop in the case of the nested loop.
2. continue statement is used to not break the current flow of program, but it skips
to the next iteration of loop immediately.

Prints:-
break example iteration : 0
break example iteration : 1
break example iteration : 2
continue example iteration : 0
continue example iteration : 1
continue example iteration : 2
continue example iteration : 4
*/
public class JumpControlExample {

    public static void main(String[] args){

        /* break */
        for(int i=0;i<5;i++)
        {
            if(i == 3){
                break;
            }else {
                System.out.println("break example iteration : " + i);
            }

        }

        /* continue */
        for(int i=0;i<5;i++)
        {
            if(i == 3){
                continue;
            }else {
                System.out.println("continue example iteration : " + i);
            }

        }
    }
}
