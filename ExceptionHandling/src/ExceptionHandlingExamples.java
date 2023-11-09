/*
Exception:-
Exception in java is an object that is thrown at runtime when there is a
disruption to flow
of program.

Exception handling is mechanism to handle runtime errors.

There are 2 types of Exceptions
1.Checked Exceptions:-
Classes that inherit the Throwable class except RuntimeException and Error are
checked exceptions and are checked at compile time
Ex:-IOException, SQLException etc.
2.Un-checked Exceptions:-
Classes that inherit the RuntimeException are known as unchecked exceptions.
Unchecked exceptions are checked at runtime.
Ex:-ArithmeticException, NullPointerException etc

Java Exception Keywords:-

try Keyword:-
The try keyword is used to specify a block where we should place an exception code.
The try block must be followed by either catch or finally block.


catch Keyword:-
The catch block is used to handle the exception.
It can be followed by finally.

finally Keyword:-
The finally block is used to execute the necessary code of the program.
It is executed whether an exception is handled or not.
For each try block there can be zero or more catch blocks, but only one finally
block.
The finally block will not be executed if the program exits (either by calling
System.exit() or by causing a fatal error that causes the process to abort).

throw Keyword:-
The throw keyword is used to throw an exception.
throw new exception_class("error message");

throws Keyword:-
The throws keyword is used to declare exceptions. It specifies that
there may occur an exception in method. It doesn't throw exception. It is
always used with method signature. This exception is forwarded in call stack.

try-catch :-
In try block execution is done till and exception is occurred and the statements
after that are not executed.

If a nested try block's exception is not caught then the subsequent parent
catch block is executed if there is an exception match.



Java Exception Propagation:-
An exception is first thrown from the top of the stack and if it is not caught,
it drops down the call stack to previous method and so on till the very bottom
of the call stack. This is called exception propagation.

Checked exceptions are not forwarded in calling chain.

Parent class method declares exception, child class can
	⁃	declare same subclass exception
	⁃	declare no exception
But can't declare parent exception

Parent class method didn't declare exception, child class can
	⁃	declare checked exception
	⁃	not declare unchecked exception

Prints:-
Inner most finally block
ArithmeticException catch java.lang.ArithmeticException: / by zero
Outer finally block
ArrayIndexOutOfBoundsException catch java.lang.ArrayIndexOutOfBoundsException
*/
public class ExceptionHandlingExamples {

     static int accessArrayElement(int[] arr, int index) throws ArrayIndexOutOfBoundsException{
         if(index < arr.length)
             return arr[index];
         else
             throw new ArrayIndexOutOfBoundsException();
    }
    public static void main(String[] args)
    {
        int data = 100;
        try{
            try{
                data = data / 0;
                System.out.println(data);
            }
            catch(StringIndexOutOfBoundsException e){
                System.out.println("StringIndexOutOfBoundsException catch " + e);
            }
            finally {
               System.out.println("Inner most finally block");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException catch " + e);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException catch " + e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Outer finally block");
        }

        int[] arr = new int[]{1,2,3};
        try{
            System.out.println(accessArrayElement(arr,4));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException catch " + e);
        }


    }
}

