/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gym.pos.SYSTEM_LUNCHER;

import java.util.logging.Level;
import java.util.logging.Logger;
import lk.gym.pos.view.logInForm;

/**
 *
 * @author DILSHAN
 */
public class ScreenLoading {
    public static void main(String args[]){
       Splash s= new Splash();s.setVisible(true);
       logInForm log=new logInForm();
        
           for(int i=0;i<=100;i++){
           try {
               Thread.sleep(40);
               s.lodingNumber.setText(Integer.toString(i)+"%");
               s.lodingBar.setValue(i);
               if(i==100){
                   s.setVisible(false);
                   log.setVisible(true);
               }
           } catch (InterruptedException ex) {
               Logger.getLogger(ScreenLoading.class.getName()).log(Level.SEVERE, null, ex);
           }
           } 
        
                
    }
}
