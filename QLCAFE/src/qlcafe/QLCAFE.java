/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlcafe;

/**
 *
 * @author Admin
 */
public class QLCAFE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          new  MyConnection().getConnection();
          Login log = new Login();
          log.setVisible(true);
          log.setLocationRelativeTo(null);
    }
    
}
