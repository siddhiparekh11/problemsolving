/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageexample.server;
import packageexample.client.*;
import packageexample.shared.Utilities;

import java.io.*;
import java.net.*;
 
public class Server {
 
    public static void main(String args[]) {
    ServerSocket serverSocket = null;
 
    Utilities.printMsg("creating server socket");
     
    try {
        serverSocket = new ServerSocket(4444);
    } catch (IOException e) {
        System.err.println("Unable to create server socket, " + e);
        System.exit(1);
    }
 
    Utilities.printMsg("accepting client connections");
 
    while (true) {
        try {
        Socket clientSocket = serverSocket.accept();
        new Client(clientSocket).start();
        } catch (IOException e) {
        System.err.println("Unable to accept socket connection, " + e); 
        System.exit(1);
        }
    }
    }
}
