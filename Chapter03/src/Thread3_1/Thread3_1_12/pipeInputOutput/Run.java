package Thread3_1.Thread3_1_12.pipeInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Run {
    public static void main(String[] args) {
        try{
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedInputStream in = new PipedInputStream();
            PipedOutputStream out = new PipedOutputStream();
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
