package com.rqiang.Java20.selectordemo;


import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

public class SelectorServerSocketChannel {
    public static void main(String[] args) throws Exception {
        int port[] = {8000, 8001, 8002, 8003, 8005, 8006};
        Selector selector = Selector.open(); //打开一个选择器
        for(int i = 0; i<port.length; i++){
            ServerSocketChannel ssc = ServerSocketChannel.open();  //打开套接接口通道
            ssc.configureBlocking(false); //设置为非阻塞
            ServerSocket ss = ssc.socket();

            InetSocketAddress addr = new InetSocketAddress(port[i]);
            ss.bind(addr);

            ssc.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("服务器运行，在" + port[i] + "端口监听");
        }

        int keyAdd = 0;
        while((keyAdd = selector.select()) > 0){
            Set<SelectionKey> selectedKeys = selector.selectedKeys();
            Iterator<SelectionKey> iter = selectedKeys.iterator();
            while (iter.hasNext()){
                SelectionKey key = iter.next();
                if(key.isAcceptable()){
                    ServerSocketChannel ssc = (ServerSocketChannel) key.channel();
                    SocketChannel client = ssc.accept();
                    client.configureBlocking(false);
                    ByteBuffer outBuf = ByteBuffer.allocate(1024);
                    outBuf.put(("当前时间为: " + new Date()).getBytes());
                    outBuf.flip();
                    client.write(outBuf);
                    client.close();
                }
            }
            selectedKeys.clear();
        }
    }
}


/*
        int port = 8888;
        Selector selector = Selector.open(); //打开一个选择器

        ServerSocketChannel ssc = ServerSocketChannel.open();  //打开套接接口通道
        ssc.configureBlocking(false); //设置为非阻塞
        ServerSocket ss = ssc.socket();
        InetSocketAddress addr = new InetSocketAddress(port);
        ss.bind(addr);
        ssc.register(selector, SelectionKey.OP_ACCEPT);
        System.out.println("服务器运行，在" + port + "端口监听");
 */