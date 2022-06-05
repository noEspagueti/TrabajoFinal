package Presentacion;

import DTO.Cliente;
import DTO.ProductoAlmohadas;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {

    String Producto[] = {"Almohadas Punto", "Almohadas Alcolchadas", "Almohadas Canon", "Almohadas Popelina", "Almohadas Económica"};
    String medida[] = {"40 cm x 60 cm", "45 cm x 65 cm", "50 cm x 70 cm"};
    String color1[] = {"Blanco", "Negro", "Plomo"};
    String color2[] = {"Azul", "Blanco", "Plomo", "Naranja"};
    String color3[] = {"Blanco entero", "Estampado Zebra"};
    String color4[] = {"Amarillo", "Celeste", "Naranja", "Mostaza", "Azul", "Azul Oscuro", "Marron claro", "Marron Oscuro"};
    Double precioPorUnidad[] = {12.0, 15.0, 17.0, 20.0, 25.0, 27.0, 10.0, 12.0, 15.0, 8.0,
        9.0, 10.0};
    List<ProductoAlmohadas> listaProducto = new ArrayList<>();
    Cliente cliente = new Cliente();
    ProductoAlmohadas almohadas = new ProductoAlmohadas();
    DefaultTableModel modeloTabla = new DefaultTableModel();
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultComboBoxModel combo = new DefaultComboBoxModel(Producto);
        boxProducto.setModel(combo);
        DefaultComboBoxModel comboMedida = new DefaultComboBoxModel(medida);
        boxMedidas.setModel(comboMedida);
        agregarPedido();
        mostrarTabla();

        String pro = (String) boxProducto.getSelectedItem();
        if (pro.equals(Producto[0])) {
            DefaultComboBoxModel comboColorInici = new DefaultComboBoxModel(color1);
            comboColor.setModel(comboColorInici);
        }

        precioPorMedida();
        precioT();
    }

    public void mostrarTabla() {
        
        modeloTabla.addColumn("Producto");
        modeloTabla.addColumn("Medida");
        modeloTabla.addColumn("Color");
        modeloTabla.addColumn("Precio");
        tableMatriz.setModel(modeloTabla);
        actualizarTabla();
    }

   
    public void agregarPedido() {
        cliente.setNombre(txtNombre.getText());
        cliente.setApellido(txtApellidos.getText());
        cliente.setDNI(txtDNI.getText());
        cliente.setCantidadProducto(cantidad.getComponentCount());
        cliente.setRazonSocial(txtRazonSocial.getText());
        cliente.setUbicacion(txtDestino.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        btngregarPedido = new javax.swing.JButton();
        btnSalida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        JTabbedPanel = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtRazonSocial = new javax.swing.JTextField();
        txtRUC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        precioTotal = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMatriz = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        boxMedidas = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        boxProducto = new javax.swing.JComboBox<>();
        btnFactura = new javax.swing.JButton();
        btnBoleta = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        comboColor = new javax.swing.JComboBox<>();
        cantidad = new javax.swing.JSpinner();
        btnAgregar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        btnMenu.setText("Inicio");
        btnMenu.setBorderPainted(false);
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuMouseEntered(evt);
            }
        });
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btngregarPedido.setText("Agregar pedido");
        btngregarPedido.setBorderPainted(false);
        btngregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngregarPedidoActionPerformed(evt);
            }
        });

        btnSalida.setText("Salida");
        btnSalida.setBorderPainted(false);
        btnSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalidaMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido");

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setText("nombre");

        jButton3.setText("Lista de clientes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Productos en Stock");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btngregarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre)
                .addContainerGap(164, Short.MAX_VALUE))
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre)
                    .addComponent(jLabel1))
                .addGap(105, 105, 105)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btngregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        JTabbedPanel.setBackground(new java.awt.Color(255, 255, 255));
        JTabbedPanel.setEnabled(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );

        JTabbedPanel.addTab("", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Nombres");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Razón Social");

        jLabel5.setText("RUC");

        jLabel6.setText("Producto");

        jLabel7.setText("Cantidad");

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Precio total:");

        precioTotal.setForeground(new java.awt.Color(0, 0, 0));
        precioTotal.setText("jLabel9");

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Precio Unitario: ");

        precio.setForeground(new java.awt.Color(0, 0, 0));
        precio.setText("jLabel11");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel12.setText("Agregar Pedido");

        tableMatriz.setBackground(new java.awt.Color(255, 255, 255));
        tableMatriz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "1", "2", "3", "4", "5"
            }
        ));
        jScrollPane1.setViewportView(tableMatriz);

        jLabel13.setText("Destino");

        boxMedidas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxMedidasItemStateChanged(evt);
            }
        });

        jLabel14.setText("Medida");

        boxProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        boxProducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxProductoItemStateChanged(evt);
            }
        });
        boxProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxProductoActionPerformed(evt);
            }
        });

        btnFactura.setText("Gererar Factura");
        btnFactura.setBorderPainted(false);
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });

        btnBoleta.setText("Generar Boleta");
        btnBoleta.setBorderPainted(false);
        btnBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoletaActionPerformed(evt);
            }
        });

        jLabel15.setText("D.N.I.");

        jButton1.setText("Limpiar");
        jButton1.setBorderPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel16.setText("Color");

        comboColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", " " }));
        comboColor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboColorItemStateChanged(evt);
            }
        });

        cantidad.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, 10000.0d, 1.0d));
        cantidad.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                cantidadComponentAdded(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(boxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precio))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precioTotal)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(comboColor, 0, 136, Short.MAX_VALUE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel14))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(boxMedidas, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                                    .addComponent(txtApellidos)
                                    .addComponent(txtRazonSocial)
                                    .addComponent(txtRUC)
                                    .addComponent(txtDestino, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDNI)))
                            .addComponent(jLabel12)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel12)
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(jLabel16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxMedidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxProducto)
                            .addComponent(comboColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(precio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(precioTotal))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(31, 31, 31)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59))
        );

        JTabbedPanel.addTab("", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );

        JTabbedPanel.addTab("", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );

        JTabbedPanel.addTab("", jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTabbedPanel))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JTabbedPanel)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseEntered
        // TODO add your handling code here:    

    }//GEN-LAST:event_btnMenuMouseEntered

    private void btnSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalidaMouseClicked
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalidaMouseClicked

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        JTabbedPanel.setSelectedIndex(0);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btngregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngregarPedidoActionPerformed
        // TODO add your handling code here:
        JTabbedPanel.setSelectedIndex(1);

    }//GEN-LAST:event_btngregarPedidoActionPerformed

    private void boxProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxProductoActionPerformed

    public void borrarDatos() {
        boxProducto.setSelectedIndex(0);
        txtRUC.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDNI.setText("");
        txtRazonSocial.setText("");
        txtDestino.setText("");
        boxMedidas.setSelectedIndex(0);
        boxProducto.setSelectedIndex(0);
        precio.setText("S/. " + String.valueOf(precioPorUnidad[0]));
        boxMedidas.setSelectedIndex(0);
        Double in = 1d;
        cantidad.setValue(in);
        precioT();
    }

    public void calcularPrecio() {
        precio.setText("S/. " + almohadas.getPrecioUnitario());
    }

    public void precioT() {
//        Double can = (Double) cantidad.getValue();
        String p = "0.0";
        String medida = (String) boxMedidas.getSelectedItem();
        String pro = (String) boxProducto.getSelectedItem();

        switch (pro) {
            case "Almohadas Punto":
                if (medida.equals(this.medida[0])) {
                    p = String.valueOf((double)cantidad.getValue() * this.precioPorUnidad[0]);
                } else if (medida.equals(this.medida[1])) {
                    p = String.valueOf((double)cantidad.getValue() * this.precioPorUnidad[1]);
                } else if (medida.equals(this.medida[2])) {
                    p = String.valueOf((double)cantidad.getValue() * this.precioPorUnidad[2]);
                }
                break;
            case "Almohadas Alcolchadas":
                if (medida.equals(this.medida[0])) {
                    p = String.valueOf((double)cantidad.getValue() * this.precioPorUnidad[3]);

                } else if (medida.equals(this.medida[1])) {
                    p = String.valueOf((double)cantidad.getValue() * this.precioPorUnidad[4]);

                } else if (medida.equals(this.medida[2])) {
                    p = String.valueOf((double)cantidad.getValue() * this.precioPorUnidad[5]);

                }
                break;
            case "Almohadas Canon":
                if (medida.equals(this.medida[0])) {
                    p = String.valueOf((double)cantidad.getValue() * this.precioPorUnidad[6]);

                } else if (medida.equals(this.medida[1])) {
                    p = String.valueOf((double)cantidad.getValue() * this.precioPorUnidad[7]);

                } else if (medida.equals(this.medida[2])) {
                    p = String.valueOf((double)cantidad.getValue() * this.precioPorUnidad[8]);

                }
                break;
            case "Almohadas Popelina": case "Almohadas Económica":
                if (medida.equals(this.medida[0])) {
                    p = String.valueOf((double)cantidad.getValue() * this.precioPorUnidad[9]);

                } else if (medida.equals(this.medida[1])) {
                    p = String.valueOf((double)cantidad.getValue() * this.precioPorUnidad[10]);

                } else if (medida.equals(this.medida[2])) {
                    p = String.valueOf((double)cantidad.getValue() * this.precioPorUnidad[11]);

                }
                break;
            
            default:
//                p = String.valueOf(precioPorUnidad[0]);
        }
        precioTotal.setText("S/. "+ p);
    }
    

    public void actualizarTabla() {
        
       
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JTabbedPanel.setSelectedIndex(2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JTabbedPanel.setSelectedIndex(3);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnFacturaActionPerformed

    private void btnBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoletaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnBoletaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        borrarDatos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton1MouseClicked


    private void comboColorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboColorItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_comboColorItemStateChanged

    private void boxProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxProductoItemStateChanged
        // TODO add your handling code here:
        String produc = (String) boxProducto.getSelectedItem();
        if (produc.equals("Almohadas Punto")) {
            DefaultComboBoxModel combo = new DefaultComboBoxModel(color1);
            comboColor.setModel(combo);
        } else if (produc.equals(Producto[1])) {
            DefaultComboBoxModel combo = new DefaultComboBoxModel(color2);
            comboColor.setModel(combo);
        } else if (produc.equals(Producto[2])) {
            DefaultComboBoxModel combo = new DefaultComboBoxModel(color3);
            comboColor.setModel(combo);
        } else if (produc.equals(Producto[3])) {
            DefaultComboBoxModel combo = new DefaultComboBoxModel(color4);
            comboColor.setModel(combo);
        } else if (produc.equals(Producto[4])) {
            DefaultComboBoxModel combo = new DefaultComboBoxModel(color4);
            comboColor.setModel(combo);
        }
        precioPorMedida();
        precioT();
    }//GEN-LAST:event_boxProductoItemStateChanged

    private void boxMedidasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxMedidasItemStateChanged
        // TODO add your handling code here:
        precioPorMedida();
        precioT();
    }//GEN-LAST:event_boxMedidasItemStateChanged

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        // TODO add your handling code here:
        boxProducto.setSelectedIndex(0);
        precio.setText("S/. " + String.valueOf(precioPorUnidad[0]));
        boxMedidas.setSelectedIndex(0);
        Double in = 1d;
        cantidad.setValue(in);
        precioT();
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cantidadComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_cantidadComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadComponentAdded

    public void precioPorMedida() {
        String medida = (String) boxMedidas.getSelectedItem();
        String pro = (String) boxProducto.getSelectedItem();

        switch (pro) {
            case "Almohadas Punto":
                if (medida.equals(this.medida[0])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[0]);
                } else if (medida.equals(this.medida[1])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[1]);
                } else if (medida.equals(this.medida[2])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[2]);
                }
                break;
            case "Almohadas Alcolchadas":
                if (medida.equals(this.medida[0])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[3]);
                } else if (medida.equals(this.medida[1])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[4]);
                } else if (medida.equals(this.medida[2])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[5]);
                }
                break;
            case "Almohadas Canon":
                if (medida.equals(this.medida[0])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[6]);
                } else if (medida.equals(this.medida[1])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[7]);
                } else if (medida.equals(this.medida[2])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[8]);
                }
                break;
            case "Almohadas Popelina":
                if (medida.equals(this.medida[0])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[9]);
                } else if (medida.equals(this.medida[1])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[10]);
                } else if (medida.equals(this.medida[2])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[11]);
                }
                break;
            case "Almohadas Económica":
                if (medida.equals(this.medida[0])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[9]);
                } else if (medida.equals(this.medida[1])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[10]);
                } else if (medida.equals(this.medida[2])) {
                    almohadas.setPrecioUnitario(this.precioPorUnidad[11]);
                }
                break;
        }

        calcularPrecio();
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTabbedPanel;
    private javax.swing.JComboBox<String> boxMedidas;
    private javax.swing.JComboBox<String> boxProducto;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBoleta;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSalida;
    private javax.swing.JButton btngregarPedido;
    private javax.swing.JSpinner cantidad;
    private javax.swing.JComboBox<String> comboColor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel precio;
    private javax.swing.JLabel precioTotal;
    private javax.swing.JTable tableMatriz;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDestino;
    public static javax.swing.JLabel txtNombre;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtRazonSocial;
    // End of variables declaration//GEN-END:variables
}
