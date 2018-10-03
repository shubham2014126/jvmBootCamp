package java8io;

import java.io.*;

public class bufferedIOQ8 {

    public static void main(String[] args) throws IOException
    {
        // Writing data to specified location
        BufferedOutputStream bufferedOutputStream=
                new BufferedOutputStream(new FileOutputStream("/tmp/user/Buffer.txt"));
        bufferedOutputStream.write("Hello World".getBytes());
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        // Reading data from a specified location
        BufferedInputStream bufferedInputStream=
                new BufferedInputStream(new FileInputStream("/tmp/user/Buffer.txt"));
        int i=0;
        while((i=bufferedInputStream.read())!=-1)
        {
            System.out.println((char) i);
        }
    }

}
