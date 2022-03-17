/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosocket;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JosCongQuy
 */
public class Client {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8989);
            socket.getOutputStream().write("xin chào".getBytes());
            socket.getOutputStream().flush();
            int data = 0;
            while ((data= socket.getInputStream().read())!=-1) {                
                System.out.println(String.valueOf((char)data));
            }
           
            socket.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
