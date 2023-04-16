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
public class Thread2 extends Thread {

	@Override
	public void run() {

            try {
                FilePlayer filePlayer = new FilePlayer();
                sleep(1000);
                filePlayer.syncPlay("re");
                sleep(1000);
                
                filePlayer.syncPlay("fa");
                sleep(1000);
                
                filePlayer.syncPlay("la");
                sleep(1000);
                
                filePlayer.asyncPlay("do-octave");
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
            }

	}

}