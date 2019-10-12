package com.interview;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//uses jpanel to display interactive 3x3 puzzle from Trover saves the universe

//| 0 | 1 | 2 |
//| 3 | 4 | 5 |
//| 6 | 7 | 8 |

//0,3,5,6,7 are activated initially

//0-1,3,4,7
//1-0,2,4,6,8
//2-0,3,6
//3-0,1,2
//4-3,5
//5-2,8
//6-2,4
//7-1,4
//8-! all

public class new2 extends JPanel implements ActionListener {

    private static final long serialVersionUID = 1L;
    
    private static void createAndShowGUI() {
        
        //Create and set up the window.
        JFrame frame = new JFrame("new2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Create and set up the content pane.
        new2 newContentPane = new new2();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        createAndShowGUI();
    }
    protected JButton b0,b1,b2,b3,b4,b5,b6,b7,b8;
 
    public new2() {
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        
        b0.setActionCommand("A1");//"switch 0,1,3,4,7"
        b1.setActionCommand("A2");//"switch 0,1,2,4,6,8"
        b2.setActionCommand("A3");//"switch 0,2,3,6"
        b3.setActionCommand("B1");//"switch 0,1,2,3"
        b4.setActionCommand("B2");//"switch 3,4,5"
        b5.setActionCommand("B3");//"switch 2,5,8"
        b6.setActionCommand("C1");//"switch 2,4,6"
        b7.setActionCommand("C2");//"switch 1,4,7"
        b8.setActionCommand("C3");//"switch 0,1,2,3,4,5,6,7,8"
        
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
 
        b1.setBackground(Color.GREEN);
        b2.setForeground(Color.RED);
       
    }
    @Override
     public void actionPerformed(ActionEvent e) {
         if("A1".equals(e.getActionCommand())){}
         if("A2".equals(e.getActionCommand())){}
         if("A3".equals(e.getActionCommand())){}
         if("B1".equals(e.getActionCommand())){}
         if("B2".equals(e.getActionCommand())){}
         if("B3".equals(e.getActionCommand())){}     
         if("C1".equals(e.getActionCommand())){}
         if("C2".equals(e.getActionCommand())){}
         if("C3".equals(e.getActionCommand())){}
     }
     
}
