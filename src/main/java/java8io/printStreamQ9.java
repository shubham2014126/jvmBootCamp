package java8io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;


public class printStreamQ9 {

    public static void main(String[] args) throws IOException
    {
        PrintStream printStream=
                new PrintStream(new FileOutputStream("/tmp/user/print.txt"));
        printStream.print("Hello");
        printStream.print("World");
        printStream.print("Hello");
        printStream.print("To");
        printStream.print("The");
        printStream.print("New");
        printStream.flush();
        printStream.close();
    }

}
