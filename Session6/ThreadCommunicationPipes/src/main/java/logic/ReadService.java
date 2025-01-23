package logic;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReadService extends Thread{

    private final PipedInputStream pipedInputStream;

    public ReadService(PipedInputStream pipedInputStream) {
        this.pipedInputStream = pipedInputStream;
    }

    @Override
    public void run() {
        while(true) {
            int data = 0;
            try {
                data = pipedInputStream.read();
                if(data == -1) return;
                System.out.print((char)data);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
