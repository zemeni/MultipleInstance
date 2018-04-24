/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.handlingmultipleinstance;

import java.io.IOException;
import java.net.BindException;
import java.net.InetAddress;
import java.net.ServerSocket;

/**
 *
 * @author babu Apr 24, 2018 10:33:36 AM
 */
public class Test1 {

    private static final int PORT = 9999;
    private static ServerSocket socket;

    private static void checkIfRunning() {
        try {
            socket = new ServerSocket(PORT, 0, InetAddress.getByAddress(new byte[]{127, 0, 0, 1}));
        } catch (BindException e) {
            System.err.println("Already running.");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Unexpected error.");
            e.printStackTrace();
            System.exit(2);
        }
    }

    public static void main(String[] args) {
// new line is been added
      checkIfRunning();
        for (int i = 0; i < 10; i++) {
            System.out.println("i>>"+i);
//             checkIfRunning();
            try {
                Thread.sleep(10000);
            } catch (Exception e) {

            }
        }
    }

}
