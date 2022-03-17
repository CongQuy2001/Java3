/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosocket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLServerSocket;

/**
 *
 * @author JosCongQuy
 */
public class SeverApplication {
    public static void main(String[] args)  {
        try {
            //        1  tạo đối tượng server socket
            ServerSocket serverSocket = new ServerSocket(8989);
            while (true) {
                Socket clieSocket = serverSocket.accept();
                InputStream inputStream = clieSocket.getInputStream();
                int data  = inputStream.read();
                while (data!=-1) {
                    System.out.println(String.valueOf((char)data));
                    data = inputStream.read();
                }
                clieSocket.getOutputStream().write("chào bạn".getBytes());
                clieSocket.getOutputStream().flush();
            }
        } catch (IOException ex) {            
          ex.printStackTrace();
        }
    }
            
}
