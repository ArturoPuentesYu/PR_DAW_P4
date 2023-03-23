/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package iFP.pr_daw_p4_puentes_arturo;

/**
 *
 * @author ajpyu
 */
public class PanelListado extends javax.swing.JPanel {

    /**
     * Creates new form PanelListado
     */
    public PanelListado() {
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

        Titulo = new javax.swing.JLabel();
        FechaAltaBusqueda = new javax.swing.JTextField();
        jLabelPeso = new javax.swing.JLabel();
        Peso = new javax.swing.JTextField();
        jLabelLesion = new javax.swing.JLabel();
        Lesion = new javax.swing.JTextField();
        jLabelGravedad = new javax.swing.JLabel();
        jScrollPaneGravedad = new javax.swing.JScrollPane();
        jListGravedad = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        ClasesAnimales = new javax.swing.JScrollPane();
        jListClases = new javax.swing.JList<>();
        jLabelVet = new javax.swing.JLabel();
        Veterinario = new javax.swing.JComboBox<>();
        jLabelEspecie = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        Especie = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRadioButtonCaza = new javax.swing.JRadioButton();
        jRadioButtonAtropello = new javax.swing.JRadioButton();
        jRadioButtonInfec = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(246, 251, 244));

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(75, 134, 115));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Listado");
        Titulo.setToolTipText("");
        Titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelPeso.setText("Peso:");

        Peso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PesoKeyTyped(evt);
            }
        });

        jLabelLesion.setText("Lesion:");

        Lesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LesionKeyTyped(evt);
            }
        });

        jLabelGravedad.setText("Gravedad:");

        jListGravedad.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Baja", "Media", "Urgente" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneGravedad.setViewportView(jListGravedad);

        jLabel1.setText("Clase Animal:");

        jListClases.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ave", "Mamífero", "Reptil" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListClases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListClasesMouseClicked(evt);
            }
        });
        ClasesAnimales.setViewportView(jListClases);

        jLabelVet.setText("Veterinario:");

        Veterinario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Juan", "Roberto", "Carlos" }));

        jLabelEspecie.setText("Especie:");

        jLabelFecha.setText("Fecha alta:");

        Especie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EspecieKeyTyped(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clase Animal", "Especie", "Peso", "Gravedad", "Veterinario", "Fecha Alta", "Fecha Liberación", "Fallecido", "Dato Extra"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jRadioButtonCaza.setText("Caza furtiba");

        jRadioButtonAtropello.setText("Atropellado");

        jRadioButtonInfec.setText("Infección bacteriana");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabelEspecie)
                                    .addGap(18, 18, 18)
                                    .addComponent(Especie, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabelPeso)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FechaAltaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ClasesAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelGravedad)
                            .addComponent(jScrollPaneGravedad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelLesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabelVet)
                        .addGap(18, 18, 18)
                        .addComponent(Veterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonCaza)
                            .addComponent(jRadioButtonAtropello)
                            .addComponent(jRadioButtonInfec))
                        .addGap(73, 73, 73)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(Veterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelVet)
                            .addComponent(Lesion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLesion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelGravedad)
                            .addComponent(jLabel1)
                            .addComponent(FechaAltaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Especie, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClasesAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPaneGravedad, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonCaza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonAtropello)
                        .addGap(7, 7, 7)
                        .addComponent(jRadioButtonInfec)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesoKeyTyped
        Gestor.IntroNumeros(evt);
    }//GEN-LAST:event_PesoKeyTyped

    private void LesionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LesionKeyTyped
        Gestor.IntroLetras(evt);
    }//GEN-LAST:event_LesionKeyTyped

    private void jListClasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListClasesMouseClicked

    }//GEN-LAST:event_jListClasesMouseClicked

    private void EspecieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EspecieKeyTyped
        Gestor.IntroLetras(evt);
    }//GEN-LAST:event_EspecieKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ClasesAnimales;
    private javax.swing.JTextField Especie;
    private javax.swing.JTextField FechaAltaBusqueda;
    private javax.swing.JTextField Lesion;
    private javax.swing.JTextField Peso;
    private javax.swing.JLabel Titulo;
    private javax.swing.JComboBox<String> Veterinario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEspecie;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelGravedad;
    private javax.swing.JLabel jLabelLesion;
    private javax.swing.JLabel jLabelPeso;
    private javax.swing.JLabel jLabelVet;
    private javax.swing.JList<String> jListClases;
    private javax.swing.JList<String> jListGravedad;
    private javax.swing.JRadioButton jRadioButtonAtropello;
    private javax.swing.JRadioButton jRadioButtonCaza;
    private javax.swing.JRadioButton jRadioButtonInfec;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneGravedad;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
