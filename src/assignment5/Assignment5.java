/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment5;

/**
 *
 * @author gunjitarora
 */
public class Assignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread1 thread1 = new Thread1();
	Thread2 thread2 = new Thread2();

	thread1.start();
	thread2.start();

    }
    
}