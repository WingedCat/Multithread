package Thread3_1.Thread3_1_13.pipeReaderWriter;

import java.io.*;

public class Run {
    public static void main(String[] args) {
        try{
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedReader in = new PipedReader();
            PipedWriter out = new PipedWriter();
            out.connect(in);
            ThreadRead threadRead = new ThreadRead(readData,in);
            ThreadWrite threadWrite = new ThreadWrite(writeData,out);
            threadWrite.start();
            Thread.sleep(2000);
            threadRead.start();
        }catch (IOException e){
            e.printStackTrace();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
