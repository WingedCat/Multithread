package Thread3_1.Thread3_1_12.pipeInputOutput;

import java.io.PipedOutputStream;

public class ThreadWrite extends  Thread{
    private WriteData write;
    private PipedOutputStream out;

    public ThreadWrite(WriteData write,PipedOutputStream out){
        this.out = out;
        this.write = write;
    }

    @Override
    public void run(){
        write.writeMethod(out);
    }
}
