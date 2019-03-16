package Thread3_1.Thread3_1_13.pipeReaderWriter;

import java.io.PipedWriter;

public class ThreadWrite extends  Thread{
    private WriteData write;
    private PipedWriter out;

    public ThreadWrite(WriteData write, PipedWriter out){
        this.out = out;
        this.write = write;
    }

    @Override
    public void run(){
        write.writeMethod(out);
    }
}
