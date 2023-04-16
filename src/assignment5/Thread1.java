/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gunjitarora
 */
public class Thread1 extends Thread {

	@Override
	public void run() {

            try {
                FilePlayer filePlayer = new FilePlayer();
                
                filePlayer.syncPlay("do");
                sleep(1000);
                
                filePlayer.syncPlay("mi");
                sleep(1000);
                
                filePlayer.syncPlay("sol");
                sleep(1000);
                
                filePlayer.syncPlay("si");
                sleep(1000);
                
                filePlayer.asyncPlay("do-octave");
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
            }

	}
}
