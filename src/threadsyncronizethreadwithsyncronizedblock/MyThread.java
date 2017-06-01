/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsyncronizethreadwithsyncronizedblock;

/**
 *
 * @author tiago.lucas
 */
public class MyThread extends Thread{
    Shared sr;
    public MyThread(Shared sr1, String s)
    {
        super(s);
        sr = sr1;
        start();
    }
    public void run(){
        synchronized(sr){
            sr.justDolt(Thread.currentThread().getName());
        }        
    }
}
