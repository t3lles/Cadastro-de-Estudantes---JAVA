package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class cadEstudantes  extends javax.swing.JFrame {
	 public cadEstudantes() {
	        initComponents();
	    }

	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	    private void initComponents() {

	        jPanel1 = new javax.swing.JPanel();
	        labelCadastro = new javax.swing.JLabel();
	        labelName = new javax.swing.JLabel();
	        labelCPF = new javax.swing.JLabel();
	        labelIdade = new javax.swing.JLabel();
	        labelCurso = new javax.swing.JLabel();
	        textNome = new javax.swing.JTextField();
	        textCPF = new javax.swing.JTextField();
	        textIdade = new javax.swing.JTextField();
	        textCurso = new javax.swing.JTextField();
	        jButton1 = new javax.swing.JButton();
	        jButton1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		
	        		
	        		cadastrarEstudante();
	        		
	        	
	     
	        	}
	        });
	        jScrollPane1 = new javax.swing.JScrollPane();
	        textarea = new javax.swing.JTextArea();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jPanel1.setToolTipText("Cadastro Estudantes ");

	        labelCadastro.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
	        labelCadastro.setForeground(new java.awt.Color(102, 153, 255));
	        labelCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        labelCadastro.setText("Cadastro de Estudantes");
	        labelCadastro.setToolTipText("Cadastro de Estudantes ");
	        labelCadastro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

	        labelName.setText("Nome");

	        labelCPF.setText("CPF");

	        labelIdade.setText("Idade");

	        labelCurso.setText("Curso");
	        textCPF.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jTextField2ActionPerformed(evt);
	            }
	        });

	        jButton1.setText("Cadastrar");
	        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

	        textarea.setColumns(20);
	        textarea.setRows(5);
	        jScrollPane1.setColumnHeaderView(textarea);

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1Layout.setHorizontalGroup(
	        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(jPanel1Layout.createSequentialGroup()
	        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
	        				.addGroup(jPanel1Layout.createSequentialGroup()
	        					.addContainerGap()
	        					.addComponent(labelCadastro, GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
	        				.addGroup(jPanel1Layout.createSequentialGroup()
	        					.addGap(38)
	        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
	        						.addGroup(jPanel1Layout.createSequentialGroup()
	        							.addComponent(labelCurso)
	        							.addPreferredGap(ComponentPlacement.RELATED)
	        							.addComponent(textCurso, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
	        						.addGroup(jPanel1Layout.createSequentialGroup()
	        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
	        								.addGroup(jPanel1Layout.createSequentialGroup()
	        									.addComponent(labelName)
	        									.addPreferredGap(ComponentPlacement.RELATED)
	        									.addComponent(textNome, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
	        								.addGroup(jPanel1Layout.createSequentialGroup()
	        									.addComponent(labelCPF)
	        									.addGap(18)
	        									.addComponent(textCPF, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
	        									.addGap(57)
	        									.addComponent(labelIdade)
	        									.addPreferredGap(ComponentPlacement.RELATED)
	        									.addComponent(textIdade, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))
	        							.addGap(28)
	        							.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
	        							.addGap(11))
	        						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 397, GroupLayout.PREFERRED_SIZE))
	        					.addGap(19)))
	        			.addContainerGap())
	        );
	        jPanel1Layout.setVerticalGroup(
	        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(jPanel1Layout.createSequentialGroup()
	        			.addContainerGap()
	        			.addComponent(labelCadastro, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
	        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
	        				.addGroup(jPanel1Layout.createSequentialGroup()
	        					.addGap(32)
	        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
	        						.addComponent(labelName)
	        						.addComponent(textNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	        					.addPreferredGap(ComponentPlacement.RELATED)
	        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
	        						.addComponent(labelCPF)
	        						.addComponent(textIdade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        						.addComponent(labelIdade)
	        						.addComponent(textCPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	        					.addPreferredGap(ComponentPlacement.UNRELATED)
	        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
	        						.addComponent(labelCurso)
	        						.addComponent(textCurso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
	        				.addGroup(jPanel1Layout.createSequentialGroup()
	        					.addGap(41)
	        					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
	        			.addGap(50)
	        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        jPanel1.setLayout(jPanel1Layout);

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addContainerGap())
	        );

	        pack();
	    }// </editor-fold>                        

	    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
	        // TODO add your handling code here:
	    }                                           

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
	                if ("Windows".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(cadEstudantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(cadEstudantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(cadEstudantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(cadEstudantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new cadEstudantes().setVisible(true);
	            }
	        });
	    }

	    // Variables declaration - do not modify                     
	    private javax.swing.JButton jButton1;
	    private javax.swing.JLabel labelCadastro;
	    private javax.swing.JLabel labelName;
	    private javax.swing.JLabel labelCPF;
	    private javax.swing.JLabel labelIdade;
	    private javax.swing.JLabel labelCurso;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JScrollPane jScrollPane1;
	    private javax.swing.JTextArea textarea;
	    private javax.swing.JTextField textNome;
	    private javax.swing.JTextField textCPF;
	    private javax.swing.JTextField textIdade;
	    private javax.swing.JTextField textCurso;
	    // End of variables declaration               
	    
	    
	    
	    private void cadastrarEstudante() {
	        String nome = textNome.getText();
	        String cpf = textCPF.getText();
	        String idade = textIdade.getText();
	        String curso = textCurso.getText();
	        
	        
	        if (!nome.isEmpty() && !cpf.isEmpty()  && !idade.isEmpty()  && !curso.isEmpty()) {
	            String cadastro = "A(o) estudante " + nome + "\ncom CPF número: " + cpf + "," + " de " +idade+ " anos de idade" + "," +  "\nse encontra devidamente matriculada(o) no curso " + curso + "\n\n";
	            textarea.append(cadastro);
	            textNome.setText("");
	            textCPF.setText("");
	            textIdade.setText("");
	            textCurso.setText("");
	        } else {
	            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
	        }
	    }
	}



