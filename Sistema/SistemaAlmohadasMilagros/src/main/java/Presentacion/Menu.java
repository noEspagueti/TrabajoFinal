package Presentacion;

import DTO.Cliente;
import DTO.Factura;
import DTO.ProductoAlmohadas;
import Datos.ClienteDAO;
import Datos.FacturaDAO;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
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
    int contador = 0;
    FuenteColor fuenteColor;
    LetraFantasmaMenu letraFmenu;

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
        asignarColor();
        fuenteColor = new FuenteColor();
        letraFmenu = new LetraFantasmaMenu();
        txtNombre.requestFocus();
        txtApellidos.setCaretPosition(0);
        txtDNI.setCaretPosition(0);
        txtRazonSocial.setCaretPosition(0);
        txtRUC.setCaretPosition(0);
        txtDestino.setCaretPosition(0);
        txtCorreo.setCaretPosition(0);
        txtProvincia.setCaretPosition(0);
        txtTelefono.setCaretPosition(0);
        iniciar();
    }

    public void iniciar() {
        fuenteColor.mensaje(txtNombre, letraFmenu.getNombre(), 0);
        fuenteColor.mensaje(txtApellidos, letraFmenu.getApellido(), 0);
        fuenteColor.mensaje(txtDNI, letraFmenu.getDNI(), 0);
        fuenteColor.mensaje(txtRazonSocial, letraFmenu.getRazonSocial(), 0);
        fuenteColor.mensaje(txtRUC, letraFmenu.getRuc(), 0);
        fuenteColor.mensaje(txtDestino, letraFmenu.getDestino(), 0);
        fuenteColor.mensaje(txtProvincia, letraFmenu.getProvincia(), 0);
        fuenteColor.mensaje(txtCorreo, letraFmenu.getCorreo(), 0);
        fuenteColor.mensaje(txtTelefono, letraFmenu.getTelefono(), 0);
    }

    public void mostrarTabla() {
        modeloTabla.addColumn("Producto");
        modeloTabla.addColumn("Medida");
        modeloTabla.addColumn("Color");
        modeloTabla.addColumn("Cantidad");
        modeloTabla.addColumn("Precio");
        tableMatriz.setModel(modeloTabla);
        actualizarTabla();
    }

    //Datos del cliente
    public void agregarPedido() {
        cliente.setNombre(txtNombre.getText());
        cliente.setApellido(txtApellidos.getText());
        cliente.setDNI(txtDNI.getText());
        cliente.setRazonSocial(txtRazonSocial.getText());
        cliente.setDireccion(txtDestino.getText());
        cliente.setProvincia(txtProvincia.getText());
        cliente.setCorreo(txtCorreo.getText());
        cliente.setTelefono(txtTelefono.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btngregarPedido = new javax.swing.JButton();
        btnSalida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtEmpleado = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        lblPuesto = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        NombreEmpleado = new javax.swing.JLabel();
        apellidoEmpleado = new javax.swing.JLabel();
        DniEmpleado = new javax.swing.JLabel();
        telefonoEmpleado = new javax.swing.JLabel();
        JTabbedPanel = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
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
        btnLimpiar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        comboColor = new javax.swing.JComboBox<>();
        cantidad = new javax.swing.JSpinner();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEliminarTotal = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtProvincia = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaListaCliente = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lblFechaActual = new javax.swing.JLabel();
        lblCantidadVentas = new javax.swing.JLabel();
        lblTotalVentas = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        btngregarPedido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btngregarPedido.setText("Agregar pedidos");
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
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido");

        txtEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        txtEmpleado.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        txtEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        txtEmpleado.setText("nombre");

        jButton3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton3.setText("Lista de clientes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnVentas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnVentas.setText("Lista de Ventas");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        lblPuesto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPuesto.setForeground(new java.awt.Color(255, 255, 255));
        lblPuesto.setText("Gerente de Operaciones");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Puesto:");

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Nombres:");

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Apellidos:");

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("DNI:");

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Telefono:");

        NombreEmpleado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        NombreEmpleado.setText("jLabel34");

        apellidoEmpleado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        apellidoEmpleado.setText("jLabel34");

        DniEmpleado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DniEmpleado.setText("jLabel35");

        telefonoEmpleado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        telefonoEmpleado.setText("jLabel36");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btngregarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telefonoEmpleado))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmpleado))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPuesto)
                            .addComponent(NombreEmpleado)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DniEmpleado)
                            .addComponent(apellidoEmpleado))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmpleado)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPuesto)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(NombreEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(apellidoEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(DniEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(telefonoEmpleado))
                .addGap(86, 86, 86)
                .addComponent(btngregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180)
                .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        JTabbedPanel.setBackground(new java.awt.Color(255, 255, 255));
        JTabbedPanel.setEnabled(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setAlignmentX(0.0F);
        jPanel4.setAlignmentY(0.0F);

        jLabel2.setText("Nombres");

        jLabel3.setText("Apellidos");
        jLabel3.setMaximumSize(new java.awt.Dimension(0, 0));
        jLabel3.setMinimumSize(new java.awt.Dimension(0, 0));

        jLabel4.setText("Razón Social");

        jLabel5.setText("RUC");

        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidosFocusLost(evt);
            }
        });
        txtApellidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtApellidosMouseClicked(evt);
            }
        });
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });

        txtRazonSocial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRazonSocialFocusLost(evt);
            }
        });
        txtRazonSocial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRazonSocialMouseClicked(evt);
            }
        });
        txtRazonSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRazonSocialKeyTyped(evt);
            }
        });

        txtRUC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRUCFocusLost(evt);
            }
        });
        txtRUC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRUCMouseClicked(evt);
            }
        });
        txtRUC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRUCKeyTyped(evt);
            }
        });

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
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Agregar Pedido");

        tableMatriz.setBackground(new java.awt.Color(255, 255, 255));
        tableMatriz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "1", "2", "3", "4", "5", "6"
            }
        ));
        jScrollPane1.setViewportView(tableMatriz);

        jLabel13.setText("Dirección");

        txtDestino.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDestinoFocusLost(evt);
            }
        });
        txtDestino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDestinoMouseClicked(evt);
            }
        });
        txtDestino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDestinoKeyTyped(evt);
            }
        });

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
        btnFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFacturaMouseClicked(evt);
            }
        });
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

        txtDNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDNIFocusLost(evt);
            }
        });
        txtDNI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDNIMouseClicked(evt);
            }
        });
        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
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

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEliminarTotal.setText("Eliminar todo");
        btnEliminarTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTotalActionPerformed(evt);
            }
        });

        jLabel20.setText("Provincia");

        txtProvincia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProvinciaFocusLost(evt);
            }
        });
        txtProvincia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtProvinciaMouseClicked(evt);
            }
        });
        txtProvincia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProvinciaKeyTyped(evt);
            }
        });

        jLabel21.setText("Teléfono");

        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusLost(evt);
            }
        });
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTelefonoMouseClicked(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        jLabel22.setText("Correo");

        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCorreoMouseClicked(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(85, 85, 85)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                                    .addComponent(txtTelefono)
                                    .addComponent(txtCorreo)
                                    .addComponent(txtDNI, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNombre)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel20))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtRUC, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDestino, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtProvincia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                                    .addComponent(txtRazonSocial)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(precio))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(precioTotal))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAgregar)
                                .addGap(30, 30, 30)
                                .addComponent(btnEliminar)
                                .addGap(27, 27, 27)
                                .addComponent(btnEliminarTotal))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(boxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(comboColor, 0, 136, Short.MAX_VALUE))))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel14))
                            .addComponent(boxMedidas, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(precio))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boxMedidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAgregar)
                                    .addComponent(btnEliminar)
                                    .addComponent(btnEliminarTotal))
                                .addGap(1, 1, 1)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(precioTotal))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        JTabbedPanel.addTab("", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Buscar Cliente");

        jTextField1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel11.setText("Buscar");

        tablaListaCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaListaCliente);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(48, 48, 48)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel9)
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        JTabbedPanel.addTab("", jPanel5);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel25.setText("Lista de Ventas");

        jLabel26.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel26.setText("Fecha Actual:");

        jLabel27.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel27.setText("Cantidad de Ventas ");

        jLabel28.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel28.setText("Total venta");

        lblFechaActual.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblFechaActual.setText("---");

        lblCantidadVentas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCantidadVentas.setText("---");

        lblTotalVentas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTotalVentas.setText("---");

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
        jScrollPane4.setViewportView(jTable1);

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel29.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel29.setText("Buscar por fecha:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel25)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel27)
                                .addComponent(jLabel28)
                                .addComponent(jLabel26))
                            .addGap(66, 66, 66)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblFechaActual)
                                .addComponent(lblTotalVentas)
                                .addComponent(lblCantidadVentas)))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                        .addComponent(jSeparator1)))
                .addGap(83, 83, 83))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel25)
                .addGap(57, 57, 57)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(lblFechaActual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(lblCantidadVentas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(lblTotalVentas))
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        JTabbedPanel.addTab("", jPanel7);

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

    private void btnSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalidaMouseClicked
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalidaMouseClicked

    private void btngregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngregarPedidoActionPerformed
        // TODO add your handling code here:
        JTabbedPanel.setSelectedIndex(0);

    }//GEN-LAST:event_btngregarPedidoActionPerformed

    private void boxProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxProductoActionPerformed

    public void borrarDatos() {
        boxProducto.setSelectedIndex(0);
        txtRUC.setText("");
        txtNombre.setText("");
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
                    p = String.valueOf((double) cantidad.getValue() * this.precioPorUnidad[0]);
                } else if (medida.equals(this.medida[1])) {
                    p = String.valueOf((double) cantidad.getValue() * this.precioPorUnidad[1]);
                } else if (medida.equals(this.medida[2])) {
                    p = String.valueOf((double) cantidad.getValue() * this.precioPorUnidad[2]);
                }
                break;
            case "Almohadas Alcolchadas":
                if (medida.equals(this.medida[0])) {
                    p = String.valueOf((double) cantidad.getValue() * this.precioPorUnidad[3]);

                } else if (medida.equals(this.medida[1])) {
                    p = String.valueOf((double) cantidad.getValue() * this.precioPorUnidad[4]);

                } else if (medida.equals(this.medida[2])) {
                    p = String.valueOf((double) cantidad.getValue() * this.precioPorUnidad[5]);

                }
                break;
            case "Almohadas Canon":
                if (medida.equals(this.medida[0])) {
                    p = String.valueOf((double) cantidad.getValue() * this.precioPorUnidad[6]);

                } else if (medida.equals(this.medida[1])) {
                    p = String.valueOf((double) cantidad.getValue() * this.precioPorUnidad[7]);

                } else if (medida.equals(this.medida[2])) {
                    p = String.valueOf((double) cantidad.getValue() * this.precioPorUnidad[8]);

                }
                break;
            case "Almohadas Popelina":
            case "Almohadas Económica":
                if (medida.equals(this.medida[0])) {
                    p = String.valueOf((double) cantidad.getValue() * this.precioPorUnidad[9]);

                } else if (medida.equals(this.medida[1])) {
                    p = String.valueOf((double) cantidad.getValue() * this.precioPorUnidad[10]);

                } else if (medida.equals(this.medida[2])) {
                    p = String.valueOf((double) cantidad.getValue() * this.precioPorUnidad[11]);

                }
                break;

            default:
//                p = String.valueOf(precioPorUnidad[0]);
        }

        precioTotal.setText("S/. " + p);
    }

    public void actualizarTabla() {

    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JTabbedPanel.setSelectedIndex(1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnFacturaActionPerformed

    private void btnBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoletaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnBoletaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        borrarDatos();

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        // TODO add your handling code here:
        fuenteColor.mensaje(txtNombre, letraFmenu.getNombre(), 0);
        fuenteColor.mensaje(txtApellidos, letraFmenu.getApellido(), 0);
        fuenteColor.mensaje(txtDNI, letraFmenu.getDNI(), 0);
        fuenteColor.mensaje(txtRazonSocial, letraFmenu.getRazonSocial(), 0);
        fuenteColor.mensaje(txtRUC, letraFmenu.getRuc(), 0);
        fuenteColor.mensaje(txtDestino, letraFmenu.getDestino(), 0);
        fuenteColor.mensaje(txtTelefono, letraFmenu.getTelefono(), 0);
        fuenteColor.mensaje(txtCorreo, letraFmenu.getCorreo(), 0);
        fuenteColor.mensaje(txtProvincia, letraFmenu.getProvincia(), 0);
        asignarColor();
    }//GEN-LAST:event_btnLimpiarMouseClicked


    private void comboColorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboColorItemStateChanged
        // TODO add your handling code here:
        asignarColor();
    }//GEN-LAST:event_comboColorItemStateChanged

    public void asignarColor() {
        String produc = (String) boxProducto.getSelectedItem();
        switch (produc) {
            case "Almohadas Punto":
                almohadas.setColor(color1[comboColor.getSelectedIndex()]);
                break;
            case "Almohadas Alcolchadas":
                almohadas.setColor(color2[comboColor.getSelectedIndex()]);
                break;
            case "Almohadas Canon":
                almohadas.setColor(color3[comboColor.getSelectedIndex()]);
                break;
            case "Almohadas Popelina":
            case "Almohadas Económica":
                almohadas.setColor(color4[comboColor.getSelectedIndex()]);
                break;
        }
    }
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
        asignarColor();
    }//GEN-LAST:event_boxProductoItemStateChanged

    private void boxMedidasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxMedidasItemStateChanged
        // TODO add your handling code here:
        precioPorMedida();
        precioT();
        asignarColor();
    }//GEN-LAST:event_boxMedidasItemStateChanged

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        // TODO add your handling code here:
        asignarColor();
    }//GEN-LAST:event_btnAgregarMouseClicked


    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        almohadas.setNombreProducto(Producto[boxProducto.getSelectedIndex()]);
        almohadas.setMedida(medida[boxMedidas.getSelectedIndex()]);
        String can = String.valueOf(cantidad.getValue());
        Double c = (Double) cantidad.getValue();
        Double pr = almohadas.getPrecioUnitario();
        //Agregar en la tabla
        String p = String.valueOf(c * pr);
        String informacion[] = new String[5];
        informacion[0] = almohadas.getNombreProducto();
        informacion[1] = almohadas.getMedida();
        informacion[2] = almohadas.getColor();
        informacion[3] = can;
        informacion[4] = p;
        modeloTabla.addRow(informacion);

        //Desaparecer
        boxProducto.setSelectedIndex(0);
        precio.setText("S/. " + String.valueOf(precioPorUnidad[0]));
        boxMedidas.setSelectedIndex(0);
        Double in = 1d;
        cantidad.setValue(in);
        precioT();

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cantidadComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_cantidadComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadComponentAdded

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        // TODO add your handling code here:
        fuenteColor.click(txtNombre, letraFmenu.getNombre());
    }//GEN-LAST:event_txtNombreMouseClicked

    private void txtApellidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidosMouseClicked
        // TODO add your handling code here:
        fuenteColor.click(txtApellidos, letraFmenu.getApellido());
    }//GEN-LAST:event_txtApellidosMouseClicked

    private void txtDNIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDNIMouseClicked
        // TODO add your handling code here:
        fuenteColor.click(txtDNI, letraFmenu.getDNI());
    }//GEN-LAST:event_txtDNIMouseClicked


    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        // TODO add your handling code here:
        fuenteColor.mensaje(txtNombre, letraFmenu.getNombre(), txtNombre.getText().trim().length());
    }//GEN-LAST:event_txtNombreFocusLost


    private void txtApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosFocusLost
        // TODO add your handling code here:
        fuenteColor.mensaje(txtApellidos, letraFmenu.getApellido(), txtApellidos.getText().trim().length());
    }//GEN-LAST:event_txtApellidosFocusLost

    private void txtDNIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDNIFocusLost
        // TODO add your handling code here:
        fuenteColor.mensaje(txtDNI, letraFmenu.getDNI(), txtDNI.getText().trim().length());
    }//GEN-LAST:event_txtDNIFocusLost

    private void txtRazonSocialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRazonSocialFocusLost
        // TODO add your handling code here:
        fuenteColor.mensaje(txtRazonSocial, letraFmenu.getRazonSocial(), txtRazonSocial.getText().trim().length());
    }//GEN-LAST:event_txtRazonSocialFocusLost

    private void txtRUCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRUCFocusLost
        // TODO add your handling code here:
        fuenteColor.mensaje(txtRUC, letraFmenu.getRuc(), txtRUC.getText().trim().length());
    }//GEN-LAST:event_txtRUCFocusLost

    private void txtDestinoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDestinoFocusLost
        // TODO add your handling code here:
        fuenteColor.mensaje(txtDestino, letraFmenu.getDestino(), txtDestino.getText().trim().length());
    }//GEN-LAST:event_txtDestinoFocusLost

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        fuenteColor.click(txtNombre, letraFmenu.getNombre());
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        // TODO add your handling code here:
        fuenteColor.click(txtApellidos, letraFmenu.getApellido());
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        // TODO add your handling code here:
        fuenteColor.click(txtDNI, letraFmenu.getDNI());
    }//GEN-LAST:event_txtDNIKeyTyped

    private void txtRazonSocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonSocialKeyTyped
        // TODO add your handling code here:
        fuenteColor.click(txtRazonSocial, letraFmenu.getRazonSocial());
    }//GEN-LAST:event_txtRazonSocialKeyTyped


    private void txtRazonSocialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRazonSocialMouseClicked
        // TODO add your handling code here:
        fuenteColor.click(txtRazonSocial, letraFmenu.getRazonSocial());
    }//GEN-LAST:event_txtRazonSocialMouseClicked

    private void txtRUCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRUCMouseClicked
        // TODO add your handling code here:
        fuenteColor.click(txtRUC, letraFmenu.getRuc());

    }//GEN-LAST:event_txtRUCMouseClicked

    private void txtRUCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRUCKeyTyped
        // TODO add your handling code here:
        fuenteColor.click(txtRUC, letraFmenu.getRuc());
    }//GEN-LAST:event_txtRUCKeyTyped

    private void txtDestinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDestinoMouseClicked
        // TODO add your handling code here:
        fuenteColor.click(txtDestino, letraFmenu.getDestino());
    }//GEN-LAST:event_txtDestinoMouseClicked

    private void txtDestinoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDestinoKeyTyped
        // TODO add your handling code here:
        fuenteColor.click(txtDestino, letraFmenu.getDestino());
    }//GEN-LAST:event_txtDestinoKeyTyped

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNombreKeyPressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            int fila = tableMatriz.getSelectedRow();

            if (fila >= 0) {
                modeloTabla.removeRow(fila);
            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una fila de la tabla", "Error", JOptionPane.ERROR);
            }
        } catch (RuntimeException r) {
            r.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null, "No hay registros", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminarTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTotalActionPerformed
        // TODO add your handling code here:
        try {
            int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea eliminar todo los registros?", "Alerta!", JOptionPane.YES_NO_OPTION);
            if (confirmar == JOptionPane.YES_OPTION) {
                int fila = tableMatriz.getRowCount();
                for (int i = fila - 1; i >= 0; i--) {
                    modeloTabla.removeRow(i);
                }
                JOptionPane.showMessageDialog(null, "Registros eliminados", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        } catch (RuntimeException r) {

        }
    }//GEN-LAST:event_btnEliminarTotalActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
        JTabbedPanel.setSelectedIndex(2);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void txtCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMouseClicked
        // TODO add your handling code here:
        fuenteColor.click(txtCorreo, letraFmenu.getCorreo());
    }//GEN-LAST:event_txtCorreoMouseClicked

    private void txtTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMouseClicked
        // TODO add your handling code here:
        fuenteColor.click(txtTelefono, letraFmenu.getTelefono());
    }//GEN-LAST:event_txtTelefonoMouseClicked

    private void txtProvinciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProvinciaMouseClicked
        // TODO add your handling code here:
        fuenteColor.click(txtProvincia, letraFmenu.getProvincia());
    }//GEN-LAST:event_txtProvinciaMouseClicked

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        // TODO add your handling code here:
        fuenteColor.click(txtCorreo, letraFmenu.getCorreo());

    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
        fuenteColor.click(txtTelefono, letraFmenu.getTelefono());
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtProvinciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProvinciaKeyTyped
        // TODO add your handling code here:
        fuenteColor.click(txtProvincia, letraFmenu.getProvincia());

    }//GEN-LAST:event_txtProvinciaKeyTyped

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        // TODO add your handling code here:
        fuenteColor.mensaje(txtCorreo, letraFmenu.getCorreo(), txtCorreo.getText().trim().length());
    }//GEN-LAST:event_txtCorreoFocusLost

    private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusLost
        // TODO add your handling code here:
        fuenteColor.mensaje(txtTelefono, letraFmenu.getTelefono(), txtTelefono.getText().trim().length());
    }//GEN-LAST:event_txtTelefonoFocusLost

    private void txtProvinciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProvinciaFocusLost
        // TODO add your handling code here:
        fuenteColor.mensaje(txtProvincia, letraFmenu.getProvincia(), txtProvincia.getText().trim().length());
    }//GEN-LAST:event_txtProvinciaFocusLost

    
    public void sqlCliente() throws SQLException{
    
        cliente.setNombre(txtNombre.getText());
        cliente.setApellido(txtApellidos.getText());
        cliente.setDNI(txtDNI.getText());
        cliente.setTelefono(txtTelefono.getText());
        cliente.setProvincia(txtProvincia.getText());
        cliente.setDireccion(txtDestino.getText());
        cliente.setCorreo(txtCorreo.getText());
        ClienteDAO cdao = new ClienteDAO();
        cdao.insertarCliente(cliente);
    }
    
    private void btnFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturaMouseClicked
        // TODO add your handling code here:
        FacturaDAO fd = new FacturaDAO();

        String tipoDoc = "Factura";
        Factura f = new Factura();
        String CodDoc = f.generarCodigo();
        String Fecha = f.generarFecha(new Date());

        f.setFechaEmision(Fecha);
        f.setTipoDocu(tipoDoc);
        f.setCodigoVenta(CodDoc);
        
        contador++;
        String OrdenRe = f.GenerarOrdenResmion(contador);
        f.setOrdenRemision(OrdenRe);

        cliente.setRazonSocial(txtRazonSocial.getText());
        cliente.setRUC(txtRUC.getText());

        try {
            fd.insert(f, cliente);
            sqlCliente();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de insertar datos", "Error", JOptionPane.ERROR);
        }
    }//GEN-LAST:event_btnFacturaMouseClicked

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
    private javax.swing.JLabel DniEmpleado;
    private javax.swing.JTabbedPane JTabbedPanel;
    private javax.swing.JLabel NombreEmpleado;
    private javax.swing.JLabel apellidoEmpleado;
    private javax.swing.JComboBox<String> boxMedidas;
    private javax.swing.JComboBox<String> boxProducto;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBoleta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarTotal;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalida;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton btngregarPedido;
    private javax.swing.JSpinner cantidad;
    private javax.swing.JComboBox<String> comboColor;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCantidadVentas;
    private javax.swing.JLabel lblFechaActual;
    public static javax.swing.JLabel lblPuesto;
    private javax.swing.JLabel lblTotalVentas;
    private javax.swing.JLabel precio;
    private javax.swing.JLabel precioTotal;
    private javax.swing.JTable tablaListaCliente;
    private javax.swing.JTable tableMatriz;
    private javax.swing.JLabel telefonoEmpleado;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDestino;
    public static javax.swing.JLabel txtEmpleado;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
