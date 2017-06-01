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
public class ThreadSyncronizeThreadWithSyncronizedBlock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shared sr = new Shared();
        MyThread ob1 =  new MyThread(sr, "BIIT" );
        MyThread ob2 =  new MyThread(sr, "Computer" );
        MyThread ob3 =  new MyThread(sr, "Education" );

        try {
            ob1.join();
            ob2.join();
            ob3.join();
        } catch (Exception e) {
        }
    }
    
}
