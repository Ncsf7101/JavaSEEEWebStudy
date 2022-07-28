package com.rqiang.Java20.bufferdemo;

import java.nio.IntBuffer;

public class IntBufferDemo01 {
    public static void main(String[] args) {
        IntBuffer intBuf = IntBuffer.allocate(10);
        IntBuffer sub = null;
        for(int i = 0; i < 10; i++){
            intBuf.put(i * 2 + 1);
        }
        intBuf.flip();
        while(intBuf.hasRemaining()){
            System.out.println(intBuf.get() + "、");
        }
    }
}
