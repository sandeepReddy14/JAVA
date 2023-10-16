/*
Java is platform independent language because it uses JVM.
JVM is a software that interprets and executes Java bytecode. Bytecode is a platform
independent format of java code that can run on any platform where JVM is installed
irrespective of OS (or) hardware.

Java can be considered as both compiled and interpreted language because the
source code is compiled first to bytecode and the bytecode is interpreted by JVM.


JVM is Java Virtual Machine
JVM is an abstract machine that provides runtime environment in which bytecode can
be executed.
JVM loads code, verifies code, executes code and provides runtime environment.
Using class files generated from compilation of java files. The JVM sits in RAM it
loads class files using class loader, the byte code is verified and then execution
engine runs the byte code to machine code and executes it. Because of this overhead
java is slow compared to C/C++

JRE is Java Runtime Environment
JRE is the implementation of JVM. It contains set of libraries and other files that
JVM uses.

JDK is Java Development Kit
JDK is software development environment. It consists of JRE along with development
tools such as interpreter/loader(java), compiler(javac), a archiver(jar), document
generator(javadoc), etc.

To compile: javac Main.java
To execute(after compilation): java Main


* */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}