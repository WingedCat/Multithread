package Thread3_1.Thread3_1_13.pipeReaderWriter;

import java.io.IOException;
import java.io.PipedReader;

public class ReadData {
    public void readMethod(PipedReader in){
        try{
            System.out.println("read:");
            char[] chs = new char[20];
            int readLength = in.read(chs);
            while (readLength!=-1){
                String newData = new String(chs,0,readLength);
                System.out.print(newData);
                readLength = in.read(chs);
            }
            System.out.println();
            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
