package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Form_vetores extends javax.swing.JFrame {

    public List<String> urna;
    public List<String> listInter;
    public DefaultListModel model;

    public Form_vetores() {
        initComponents();
        
        urna = new ArrayList<>();
        urna.add("Caroline");
        urna.add("Cinthia");
        urna.add("Fernando");
        urna.add("Júlio");
        urna.add("Verônica");
        urna.add("Ronaldo");
        urna.add("Elisa");
        urna.add("Gabriela");
        urna.add("Rafaela");
        urna.add("Yasmim");
        urna.add("Isabela");
        urna.add("Rafael");
        urna.add("Débora");
        urna.add("Ana");
        urna.add("João");
        urna.add("Sara");
        urna.add("Henrique");
        urna.add("Vitória");
        urna.add("Fabiano");
        urna.add("Daiane");
        urna.add("Gizele");
        urna.add("Josiane");

        //O Model do JList é reponsável por exibir os elementos do componente para o usuário na forma de lista
        model = new DefaultListModel();
        urna.stream().forEach((item) -> {
            model.addElement(item);
        });
        this.listaAtual.setModel(model);

        listInter = new ArrayList<>();
        listInter.add("Renata");
        listInter.add("Daniel");
        listInter.add("Cristiano");

        DefaultListModel modelInter = new DefaultListModel();

        listInter.stream().forEach((item2) -> {
            modelInter.addElement(item2);
        });

        this.listIntercessor.setModel(modelInter);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BtnGerarLista = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaGerada = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaAtual = new javax.swing.JList();
        BtnCancelar = new javax.swing.JButton();
        BtnOk = new javax.swing.JButton();
        BtnIntercessor = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listIntercessor = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        intercessor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sorteio");

        jLabel1.setText("Lista Atual");

        BtnGerarLista.setText("Gerar Lista");
        BtnGerarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGerarListaActionPerformed(evt);
            }
        });

        jLabel2.setText("Lista Gerada");

        jScrollPane1.setViewportView(listaGerada);

        jScrollPane2.setViewportView(listaAtual);

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnOk.setText("Ok");
        BtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOkActionPerformed(evt);
            }
        });

        BtnIntercessor.setText("Sortear Intercessor");
        BtnIntercessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIntercessorActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(listIntercessor);

        jLabel3.setText("Intercessores");

        intercessor.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(BtnCancelar)
                                        .addGap(18, 18, 18)
                                        .addComponent(BtnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BtnIntercessor, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(BtnGerarLista, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(intercessor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(BtnGerarLista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnIntercessor)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(intercessor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnOk)
                    .addComponent(BtnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGerarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGerarListaActionPerformed
        Random sorteador = new Random(); //A classe Random sorteia um 

        //O Model do JList é reponsável por exibir os elementos do componente para o usuário na forma de lista
        DefaultListModel modelGerado = new DefaultListModel();
        this.listaGerada.setModel(modelGerado);

        int sort = 0;
        String num = null;

        //O sorteio ocorrerá se a lista de nomes for 
        //maior que o tanto de nomes que serão sorteados
        if (urna.size() >= 7) {
            for (int i = 0; i < 7; i++) { //O laço determina que serão sorteados ao todo 7 nomes
                sort = sorteador.nextInt(urna.size());
                num = urna.get(sort);
                modelGerado.addElement(num);
                urna.remove(sort);
                model.remove(sort);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Número de nomes a serem sorteados insuficiente...");
        }
    }//GEN-LAST:event_BtnGerarListaActionPerformed

    private void BtnIntercessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIntercessorActionPerformed
        if (!listInter.isEmpty()) { //O sorteio ocorrerá se a lista não estiver vazia
            Random sorteador = new Random(); //Esse objeto fará o sorteio
            int sort = sorteador.nextInt(listInter.size()); //A lista listInter é de tamanho 3. No caso, o objeto sorteará um número entre 0 e 2. O número corresponde ao índice da lista
            String nome = listInter.get(sort); //O nome da lista, cujo o índice é igual ao número sorteado, é guardado na string.
            listInter.remove(sort); //O nome da lista, cujo o índice é igual ao número sorteado, será removido da lista para não acontecer dele ser sorteado de novo.
            intercessor.setText(nome); //O nome guardado na string é apresentado na tela pelo JLabel.
        } else {
            JOptionPane.showMessageDialog(this, "Todos os intercessores já foram sorteados!");
        }
    }//GEN-LAST:event_BtnIntercessorActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        DefaultListModel modelGerado = new DefaultListModel();
        this.listaGerada.setModel(modelGerado);

        urna = new ArrayList<>();
        urna.add("Caroline");
        urna.add("Cinthia");
        urna.add("Fernando");
        urna.add("Júlio");
        urna.add("Verônica");
        urna.add("Ronaldo");
        urna.add("Elisa");
        urna.add("Gabriela");
        urna.add("Rafaela");
        urna.add("Yasmim");
        urna.add("Isabela");
        urna.add("Rafael");
        urna.add("Débora");
        urna.add("Ana");
        urna.add("João");
        urna.add("Sara");
        urna.add("Henrique");
        urna.add("Vitória");
        urna.add("Fabiano");
        urna.add("Daiane");
        urna.add("Gizele");
        urna.add("Josiane");

        //O Model do JList é reponsável por exibir os elementos do componente para o usuário na forma de lista
        model = new DefaultListModel();
        urna.stream().forEach((item) -> {
            model.addElement(item);
        });
        this.listaAtual.setModel(model);

        listInter = new ArrayList<>();
        listInter.add("Renata");
        listInter.add("Daniel");
        listInter.add("Cristiano");

        DefaultListModel modelInter = new DefaultListModel();

        listInter.stream().forEach((item2) -> {
            modelInter.addElement(item2);
        });

        this.listIntercessor.setModel(modelInter);
        this.intercessor.setText("");
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOkActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnOkActionPerformed

//    public void AddTabela() {
//        System.out.println(listaGerada.getModel());
//        
//        int linha = resultado.getRowCount();
//        int coluna = resultado.getColumnCount();
//        
//        Random sorteador = new Random();
//        sorteador.nextInt(3);
//               
//        for (int row = 0; row < linha; row++) {
//            for (int col = 0; col < coluna; col++) {
//            
//            }
//        }
//    }
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_vetores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Form_vetores().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGerarLista;
    private javax.swing.JButton BtnIntercessor;
    private javax.swing.JButton BtnOk;
    private javax.swing.JLabel intercessor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listIntercessor;
    private javax.swing.JList listaAtual;
    private javax.swing.JList listaGerada;
    // End of variables declaration//GEN-END:variables
}
