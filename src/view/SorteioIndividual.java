package view;

import aux.OptItem;
import java.util.*;
import javax.swing.*;

public class SorteioIndividual extends javax.swing.JFrame {

    public List<String> servos; //Array de nomes digitados
    public List<String> virtudes;
    public DefaultListModel modelServo;
    public DefaultListModel modelVirtude;

    public OptItem opcoes;
    public String opcao;
    public String texto;

    public String servo;
    public String virtude;

    public SorteioIndividual() {
        initComponents();

        servos = new ArrayList<>();
        servos.add("Caroline");
        servos.add("Cinthia");
        servos.add("Fernando");
        servos.add("Júlio");
        servos.add("Ronaldo");
        servos.add("Elisa");
        servos.add("Gabriela");
        servos.add("Rafaela");
        servos.add("Yasmim");
        servos.add("Isabela");
        servos.add("Rafael");
        servos.add("Débora");
        servos.add("Ana");
        servos.add("João");
        servos.add("Sara");
        servos.add("Henrique");
        servos.add("Vitória");
        servos.add("Fábio");
        servos.add("Daiane");
        servos.add("Gizele");
        servos.add("Josiane");

        //O Model do JList é reponsável por exibir os elementos do componente 
        //para o usuário na forma de lista
        modelServo = new DefaultListModel();
        servos.stream().forEach((item) -> {
            modelServo.addElement(item);
        });
        this.listaServos.setModel(modelServo);

        virtudes = new ArrayList<>();
        virtudes.add("Paciência");
        virtudes.add("Benevolência");
        virtudes.add("Sinceridade");
        virtudes.add("Compaixão");
        virtudes.add("Compreenção");
        virtudes.add("Responsabilidade");
        virtudes.add("Integridade");
        virtudes.add("Zelo");
        virtudes.add("Prudência");
        virtudes.add("Dignidade");
        virtudes.add("Sabedoria");
        virtudes.add("Discernimento");
        virtudes.add("Fidelidade");
        virtudes.add("Complacência");
        virtudes.add("Compadecencia");
        virtudes.add("Simpático");
        virtudes.add("Justiça");
        virtudes.add("Mansidão");
        virtudes.add("Generosidade");
        virtudes.add("Honestidade");
        virtudes.add("Gentileza");
        virtudes.add("Santidade");
        virtudes.add("Humildade");
        virtudes.add("Simplicidade");
        virtudes.add("Afeto");

        //O Model do JList é reponsável por exibir os elementos do componente 
        //para o usuário na forma de lista
        modelVirtude = new DefaultListModel();
        virtudes.stream().forEach((item) -> {
            modelVirtude.addElement(item);
        });
        this.listaVirtudes.setModel(modelVirtude);
    }

    public void AddContentList(OptItem opt, String texto, String item) {
        opcao = item;

        switch (opcao) {
//            case "Virtude":
//                virtudes.add(texto);
//                virtudes.stream().forEach((text) -> {
//                    for (int i = 0; i < modelVirtude.size(); i++) {
//                        if (!text.equals(modelVirtude.get(i))) {
//                            modelVirtude.addElement(text);
//                        }
//                    }
//                });
//
//                this.listaVirtudes.setModel(modelVirtude);
//            break;
//
            case "Servo":
                modelServo.addElement(texto);
                for (int i = 0; i < modelServo.size(); i++) {
                    if (modelServo.get(i).equals(texto)) {
                        modelServo.removeElement(i);
                        servos.add(texto);
                    }
                }
                this.listaServos.setModel(modelServo);
                break;
        }
    }

    public void Sortear() {
        if (!servos.isEmpty()) {
            Random sorteador = new Random(); //Esse objeto fará o sorteio
            int sort = sorteador.nextInt(servos.size()); //A lista listInter é de tamanho 3. No caso, o objeto sorteará um número entre 0 e 2. O número corresponde ao índice da lista
            String nome = servos.get(sort); //O nome da lista, cujo o índice é igual ao número sorteado, é guardado na string.
            servos.remove(sort); //O nome da lista, cujo o índice é igual ao número sorteado, será removido da lista para não acontecer dele ser sorteado de novo.
            jLabel5.setText(nome); //O nome guardado na string é apresentado na tela pelo JLabel.

            Random sorteador2 = new Random(); //Esse objeto fará o sorteio
            int sort2 = sorteador2.nextInt(virtudes.size()); //A lista listInter é de tamanho 3. No caso, o objeto sorteará um número entre 0 e 2. O número corresponde ao índice da lista
            String nome2 = virtudes.get(sort2); //O nome da lista, cujo o índice é igual ao número sorteado, é guardado na string.
            virtudes.remove(sort2); //O nome da lista, cujo o índice é igual ao número sorteado, será removido da lista para não acontecer dele ser sorteado de novo.
            jLabel6.setText(nome2); //O nome guardado na string é apresentado na tela pelo JLabel.
        } else {
            JOptionPane.showMessageDialog(this, "Todos já foram sorteados!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaVirtudes = new javax.swing.JList();
        BtnGerarLista = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaServos = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnOk = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nomeServo = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dinâmica");

        BtnAdicionar.setText("Adicionar");
        BtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdicionarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listaVirtudes);

        BtnGerarLista.setText("Sortear");
        BtnGerarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGerarListaActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(listaServos);

        jLabel1.setText("Lista de Servos");

        jLabel2.setText("Virtudes/Qualidades");

        BtnOk.setText("Ok");
        BtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOkActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        jLabel3.setText("Servo sorteado :");

        jLabel4.setText("Qualidade/Virtude :");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setText("nome");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setText("nome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(nomeServo)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnGerarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAdicionar)
                    .addComponent(nomeServo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnGerarLista))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnOk)
                    .addComponent(BtnCancelar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdicionarActionPerformed
        texto = nomeServo.getText().trim();

        opcoes = new OptItem();
        opcoes.getTexto(texto, this);
        opcoes.setVisible(true);
    }//GEN-LAST:event_BtnAdicionarActionPerformed

    private void BtnGerarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGerarListaActionPerformed
        Sortear();
    }//GEN-LAST:event_BtnGerarListaActionPerformed

    private void BtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOkActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnOkActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed

    }//GEN-LAST:event_BtnCancelarActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SorteioIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SorteioIndividual().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdicionar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGerarLista;
    private javax.swing.JButton BtnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    public javax.swing.JList listaServos;
    private javax.swing.JList listaVirtudes;
    private javax.swing.JTextField nomeServo;
    // End of variables declaration//GEN-END:variables
}
