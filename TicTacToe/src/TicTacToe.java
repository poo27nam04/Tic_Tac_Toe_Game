/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Poonam
 */

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class TicTacToe extends javax.swing.JFrame {

     private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
  public TicTacToe() {
        initComponents();
    }
   
    private void choose_a_Player()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else
        {
            startGame = "X";
        }
    }
    
    
    private void gameScore()
    {
        t1.setText(String.valueOf(xCount));
        t2.setText(String.valueOf(oCount));
    }
    
    private void winningGame()
    {
        String b1 = txtbtn1.getText();
        String b2 = txtbtn2.getText();
        String b3 = txtbtn3.getText();
       
        String b4 = txtbtn4.getText();
        String b5 = txtbtn5.getText();
        String b6 = txtbtn6.getText();
        
        String b7 = txtbtn7.getText();
        String b8 = txtbtn8.getText();
        String b9 = txtbtn9.getText();
        
        
        // PLAYER X CODING
        
        if(b1 == ("X") && b2 ==("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn3.setBackground(Color.ORANGE);
            
        }
        
        if(b4 == ("X") && b5 ==("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn4.setBackground(Color.PINK);
            txtbtn5.setBackground(Color.PINK);
            txtbtn6.setBackground(Color.PINK);           
        }
         
        if(b7 == ("X") && b8 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn7.setBackground(Color.YELLOW);
            txtbtn8.setBackground(Color.YELLOW);
            txtbtn9.setBackground(Color.YELLOW);           
        }
        
        if(b1 == ("X") && b4 ==("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);           
        }
        
        if(b2 == ("X") && b5 ==("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn2.setBackground(Color.PINK);
            txtbtn5.setBackground(Color.PINK);
            txtbtn8.setBackground(Color.PINK);           
        }
        if(b3 == ("X") && b6 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.YELLOW);
            txtbtn6.setBackground(Color.YELLOW);
            txtbtn9.setBackground(Color.YELLOW);           
        }
        
        
        if(b1 == ("X") && b5 ==("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);           
        }
        
        if(b3 == ("X") && b5 ==("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.PINK);
            txtbtn5.setBackground(Color.PINK);
            txtbtn7.setBackground(Color.PINK);           
        }
        
        
        
        // PLAYER O CODING
        
        
        if(b1 == ("O") && b2 ==("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn3.setBackground(Color.ORANGE);
            
        }
        
        if(b4 == ("O") && b5 ==("O") && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn4.setBackground(Color.PINK);
            txtbtn5.setBackground(Color.PINK);
            txtbtn6.setBackground(Color.PINK);           
        }
         
        if(b7 == ("O") && b8 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn7.setBackground(Color.YELLOW);
            txtbtn8.setBackground(Color.YELLOW);
            txtbtn9.setBackground(Color.YELLOW);           
        }
        
        if(b1 == ("O") && b4 ==("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);           
        }
        
        if(b2 == ("O") && b5 ==("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn2.setBackground(Color.PINK);
            txtbtn5.setBackground(Color.PINK);
            txtbtn8.setBackground(Color.PINK);           
        }
        if(b3 == ("O") && b6 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.YELLOW);
            txtbtn6.setBackground(Color.YELLOW);
            txtbtn9.setBackground(Color.YELLOW);           
        }
        
        
        if(b1 == ("O") && b5 ==("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);           
        }
        
        if(b3 == ("O") && b5 ==("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.PINK);
            txtbtn5.setBackground(Color.PINK);
            txtbtn7.setBackground(Color.PINK);           
        }
        
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtn1 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtclear = new javax.swing.JButton();
        txtexit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        playerx = new javax.swing.JLabel();
        player0 = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 0));
        jLabel1.setText(" Tic Tac Toe Game");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51), 2));

        txtbtn1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        txtbtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 204), 2));
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn2.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        txtbtn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 204), 2));
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        txtbtn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 204), 2));
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        txtbtn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 204), 2));
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        txtbtn5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 204), 2));
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        txtbtn6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 204), 2));
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        txtbtn8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 204), 2));
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        txtbtn7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 204), 2));
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn9.setBackground(new java.awt.Color(204, 255, 255));
        txtbtn9.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        txtbtn9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 204), 2));
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtclear.setBackground(new java.awt.Color(0, 204, 204));
        txtclear.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        txtclear.setForeground(new java.awt.Color(102, 0, 0));
        txtclear.setText("Clear");
        txtclear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclearActionPerformed(evt);
            }
        });

        txtexit.setBackground(new java.awt.Color(255, 153, 153));
        txtexit.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        txtexit.setForeground(new java.awt.Color(102, 0, 0));
        txtexit.setText("Exit");
        txtexit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        playerx.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        playerx.setForeground(new java.awt.Color(204, 0, 0));
        playerx.setText("Player X:");

        player0.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        player0.setForeground(new java.awt.Color(204, 0, 0));
        player0.setText("Player 0:");

        t1.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        t1.setForeground(new java.awt.Color(204, 0, 0));
        t1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t1.setText("******");
        t1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.orange, null));

        t2.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        t2.setForeground(new java.awt.Color(204, 0, 0));
        t2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t2.setText("******");
        t2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.orange, null));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerx)
                    .addComponent(player0))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(t2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerx)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player0)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtclear, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtbtn7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtclear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexitActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want Exit", 
                "Tic Tac Toe",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_txtexitActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        txtbtn1.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn1.setForeground(Color.RED);
        }
        else
        {
            txtbtn1.setForeground(Color.MAGENTA);
        }
        
        choose_a_Player();
    winningGame();
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        txtbtn2.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn2.setForeground(Color.RED);
        }
        else
        {
            txtbtn2.setForeground(Color.MAGENTA);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
       txtbtn3.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn3.setForeground(Color.RED);
        }
        else
        {
            txtbtn3.setForeground(Color.MAGENTA);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:
         txtbtn4.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn4.setForeground(Color.RED);
        }
        else
        {
            txtbtn4.setForeground(Color.MAGENTA);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
         txtbtn5.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn5.setForeground(Color.RED);
        }
        else
        {
            txtbtn5.setForeground(Color.MAGENTA);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
         txtbtn6.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn6.setForeground(Color.RED);
        }
        else
        {
            txtbtn6.setForeground(Color.MAGENTA);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
         txtbtn7.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn7.setForeground(Color.RED);
        }
        else
        {
            txtbtn7.setForeground(Color.MAGENTA);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
      txtbtn8.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn8.setForeground(Color.RED);
        }
        else
        {
            txtbtn8.setForeground(Color.MAGENTA);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
         txtbtn9.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
           txtbtn9.setForeground(Color.RED);
        }
        else
        {
            txtbtn9.setForeground(Color.MAGENTA);
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void txtclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclearActionPerformed
         txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn3.setText(null);
        
        txtbtn4.setText(null);
        txtbtn5.setText(null);
        txtbtn6.setText(null);
        
        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);
        
        txtbtn1.setBackground(Color.LIGHT_GRAY);
        txtbtn2.setBackground(Color.LIGHT_GRAY);
        txtbtn3.setBackground(Color.LIGHT_GRAY);
        
        txtbtn4.setBackground(Color.LIGHT_GRAY);
        txtbtn5.setBackground(Color.LIGHT_GRAY);
        txtbtn6.setBackground(Color.LIGHT_GRAY);
        
        txtbtn7.setBackground(Color.LIGHT_GRAY);
        txtbtn8.setBackground(Color.LIGHT_GRAY);
        txtbtn9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_txtclearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel player0;
    private javax.swing.JLabel playerx;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtclear;
    private javax.swing.JButton txtexit;
    // End of variables declaration//GEN-END:variables
}
