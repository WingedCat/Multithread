package Thread3_1.Thread3_1_13.pipeReaderWriter;

import java.io.PipedReader;

public class ThreadRead extends Thread {
    private ReadData read;
    private PipedReader in;

    public ThreadRead(ReadData read, PipedReader in){
        this.read = read;
        this.in = in;
    }

    @Override
    public void run(){
        read.readMethod(in);
    }
}
