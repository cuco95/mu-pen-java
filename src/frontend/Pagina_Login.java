/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FrontEnd;

/**
 *
 * @author Quina
 */
public class Pagina_Login extends javax.swing.JFrame {

    /**
     * Creates new form Pagina_Login
     */
    public Pagina_Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFundoPagina = new javax.swing.JPanel();
        jPanelLogin = new javax.swing.JPanel();
        jLabelLogin = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldPassWord = new javax.swing.JTextField();
        jLabelEsquece = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelFundoLogin = new javax.swing.JLabel();
        jLabelFundoPagina = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(717, 540));
        getContentPane().setLayout(null);

        jPanelFundoPagina.setLayout(null);

        jPanelLogin.setLayout(null);

        jLabelLogin.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabelLogin.setText("Login");
        jPanelLogin.add(jLabelLogin);
        jLabelLogin.setBounds(0, 10, 69, 28);

        jTextFieldEmail.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldEmail.setText("E-mail");
        jPanelLogin.add(jTextFieldEmail);
        jTextFieldEmail.setBounds(10, 50, 160, 29);

        jTextFieldPassWord.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldPassWord.setText("Password");
        jPanelLogin.add(jTextFieldPassWord);
        jTextFieldPassWord.setBounds(10, 90, 160, 29);

        jLabelEsquece.setForeground(new java.awt.Color(153, 0, 0));
        jLabelEsquece.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEsquece.setText("Esqueceu-se da password?");
        jPanelLogin.add(jLabelEsquece);
        jLabelEsquece.setBounds(0, 170, 180, 20);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/imagens/botoes/fundo_vermelho.jpg"))); // NOI18N
        jButton1.setText("jButton1");
        jPanelLogin.add(jButton1);
        jButton1.setBounds(10, 130, 160, 30);

        jLabelFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/imagens/fundos/fundo_laranja.jpg"))); // NOI18N
        jPanelLogin.add(jLabelFundoLogin);
        jLabelFundoLogin.setBounds(0, 0, 180, 210);

        jPanelFundoPagina.add(jPanelLogin);
        jPanelLogin.setBounds(500, 130, 180, 210);

        jLabelFundoPagina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/imagens/fundos/Fundo_login.jpg"))); // NOI18N
        jPanelFundoPagina.add(jLabelFundoPagina);
        jLabelFundoPagina.setBounds(0, 0, 700, 500);

        getContentPane().add(jPanelFundoPagina);
        jPanelFundoPagina.setBounds(0, 0, 700, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Pagina_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagina_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagina_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagina_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagina_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelEsquece;
    private javax.swing.JLabel jLabelFundoLogin;
    private javax.swing.JLabel jLabelFundoPagina;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JPanel jPanelFundoPagina;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldPassWord;
    // End of variables declaration//GEN-END:variables
}
