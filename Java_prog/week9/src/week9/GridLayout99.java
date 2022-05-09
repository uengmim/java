package week9;

import java.awt.*;
import javax.swing.*;

public class GridLayout99 extends JFrame {
   GridLayout99() {
      super("GridLayout ±¸±¸´Ü!");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      Container cp = getContentPane();
      cp.setLayout(new GridLayout(9,3,5,5));
      
      for(int i=1 ; i<=9 ; i++) {
         for(int j=1 ; j<=9 ; j++) {
            String susik = j+"*"+i+"="+(j*i);
            cp.add(new JButton(susik));
         }
      }
      
      setSize(800,500);
      setVisible(true);
   }
   
   public static void main(String[] args) {
      GridLayout99 gln = new GridLayout99();
   }
}