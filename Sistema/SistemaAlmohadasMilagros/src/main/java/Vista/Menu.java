package Vista;

import Controlador.DocumentoVentaCRUD;
import Controlador.controladorListaVentas;
import Controlador.controladorMenu;
import Controlador.controladorRegistroEmpleado;
import Controlador.mostrarClientesCRUD;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame implements datosMenu {

    FuenteColor fuenteColor;
    LetraFantasmaMenu letraFmenu;
    controladorMenu controlMenu = new controladorMenu();
    DefaultTableModel modeloTabla = new DefaultTableModel();
    DefaultTableModel modeloTablaCliente = new DefaultTableModel();
    DefaultTableModel modeloTablaVentas = new DefaultTableModel();
    DefaultTableModel modeloTablaEmpleados = new DefaultTableModel();

    public Menu() {
        initComponents();
        botones();
        this.setLocationRelativeTo(null);
        fuenteColor = new FuenteColor();
        letraFmenu = new LetraFantasmaMenu();
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

        controlMenu.precioPorMedida(precio, boxMedidas, boxProducto, almohadas);

        controlMenu.asignarColor(boxProducto, almohadas, comboColor);
        controlMenu.precioT(almohadas, boxMedidas, boxProducto, cantidad, precioTotal);
        posiciónCursor();
        iniciar();

        cantidad.setText("1");
        try {
            mostrarLista();
        } catch (SQLException e) {

        }
    }

    public void mostrarLista() throws SQLException {
        m.mostrarListaVenta(lblFechaActual, lblCantidadVentas, lblTotalVentas);
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

    public void botones() {
        btngregarPedido.setForeground(Color.white);
        btngregarPedido.setBackground(Color.BLACK);
        listaClienteBtn.setForeground(Color.white);
        listaClienteBtn.setBackground(Color.BLACK);
        btnVentas.setForeground(Color.white);
        btnVentas.setBackground(Color.BLACK);
        btnSalida.setForeground(Color.white);
        btnSalida.setBackground(Color.BLACK);

    }

    public void mostrarTabla() {
        modeloTabla.addColumn("Producto");
        modeloTabla.addColumn("Medida");
        modeloTabla.addColumn("Color");
        modeloTabla.addColumn("Cantidad");
        modeloTabla.addColumn("Precio");
        tableMatriz.setModel(modeloTabla);

        modeloTablaCliente.addColumn("DNI");
        modeloTablaCliente.addColumn("Nombres");
        modeloTablaCliente.addColumn("Apellidos");
        modeloTablaCliente.addColumn("Telefono");
        modeloTablaCliente.addColumn("Correo");
        modeloTablaCliente.addColumn("Direccion");
        modeloTablaCliente.addColumn("Provincia");
        tablaListaCliente.setModel(modeloTablaCliente);

        modeloTablaVentas.addColumn("Empleado");
        modeloTablaVentas.addColumn("Cantidad");
        modeloTablaVentas.addColumn("Dinero");
        modeloTablaVentas.addColumn("Fecha");
        listaVentaTabla.setModel(modeloTablaVentas);

        modeloTablaEmpleados.addColumn("Nombres");
        modeloTablaEmpleados.addColumn("Apellidos");
        modeloTablaEmpleados.addColumn("DNI");
        modeloTablaEmpleados.addColumn("Teléfono");
        modeloTablaEmpleados.addColumn("Dirección");
        modeloTablaEmpleados.addColumn("Distrito");
        modeloTablaEmpleados.addColumn("Cumpleaños");
        modeloTablaEmpleados.addColumn("Puesto");

        tablaEmpleados.setModel(modeloTablaEmpleados);
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

    public void posiciónCursor() {
        txtNombre.requestFocus();
        txtApellidos.setCaretPosition(0);
        txtDNI.setCaretPosition(0);
        txtRazonSocial.setCaretPosition(0);
        txtRUC.setCaretPosition(0);
        txtDestino.setCaretPosition(0);
        txtCorreo.setCaretPosition(0);
        txtProvincia.setCaretPosition(0);
        txtTelefono.setCaretPosition(0);
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
        listaClienteBtn = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        puestoEmpleado = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        NombreEmpleado = new javax.swing.JLabel();
        apellidoEmpleado = new javax.swing.JLabel();
        DniEmpleado = new javax.swing.JLabel();
        telefonoEmpleado = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        registroEmpleadosbtn = new javax.swing.JButton();
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
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEliminarTotal = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtProvincia = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        cantidad = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        dniBuscar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaListaCliente = new javax.swing.JTable();
        buscarbtn = new javax.swing.JButton();
        buscarDNI = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        nombreBuscar = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        ApellidoBuscar = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        telefonoBuscar = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        carreoBuscar = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        direccionBuscar = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        provinciaBuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        actualizarbtn = new javax.swing.JButton();
        limpiarbtn = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lblFechaActual = new javax.swing.JLabel();
        lblCantidadVentas = new javax.swing.JLabel();
        lblTotalVentas = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaVentaTabla = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        buscarFecha = new javax.swing.JTextField();
        btnBuscarVentas = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        NomEmp = new javax.swing.JTextField();
        ApellidoEmp = new javax.swing.JTextField();
        DNIEmp = new javax.swing.JTextField();
        TelefEmp = new javax.swing.JTextField();
        DireccEmp = new javax.swing.JTextField();
        DistriEmp = new javax.swing.JTextField();
        CumEmp = new javax.swing.JTextField();
        PuestoEmp = new javax.swing.JTextField();
        RegistrarEmpleado = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        listTablaEmpleado = new javax.swing.JButton();
        seleccionarTablaEmpleado = new javax.swing.JButton();
        eliminarEmpleado = new javax.swing.JButton();
        actualizarEmpleado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        btngregarPedido.setFont(new java.awt.Font("Cairo", 0, 18)); // NOI18N
        btngregarPedido.setForeground(new java.awt.Color(255, 255, 255));
        btngregarPedido.setText("Agregar pedidos");
        btngregarPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btngregarPedido.setBorderPainted(false);
        btngregarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btngregarPedido.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btngregarPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btngregarPedidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btngregarPedidoMouseExited(evt);
            }
        });
        btngregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngregarPedidoActionPerformed(evt);
            }
        });

        btnSalida.setFont(new java.awt.Font("Cairo", 0, 18)); // NOI18N
        btnSalida.setForeground(new java.awt.Color(255, 255, 255));
        btnSalida.setText("Salida");
        btnSalida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSalida.setBorderPainted(false);
        btnSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalidaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalidaMouseExited(evt);
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

        listaClienteBtn.setFont(new java.awt.Font("Cairo", 0, 18)); // NOI18N
        listaClienteBtn.setForeground(new java.awt.Color(255, 255, 255));
        listaClienteBtn.setText("Lista de clientes");
        listaClienteBtn.setBorderPainted(false);
        listaClienteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaClienteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listaClienteBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listaClienteBtnMouseExited(evt);
            }
        });
        listaClienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaClienteBtnActionPerformed(evt);
            }
        });

        btnVentas.setFont(new java.awt.Font("Cairo", 0, 18)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setText("Lista de Ventas");
        btnVentas.setBorderPainted(false);
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVentasMouseExited(evt);
            }
        });
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        puestoEmpleado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        puestoEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        puestoEmpleado.setText("Gerente de Operaciones");

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
        NombreEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        NombreEmpleado.setText("jLabel34");

        apellidoEmpleado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        apellidoEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        apellidoEmpleado.setText("jLabel34");

        DniEmpleado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DniEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        DniEmpleado.setText("jLabel35");

        telefonoEmpleado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        telefonoEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        telefonoEmpleado.setText("jLabel36");

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        registroEmpleadosbtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        registroEmpleadosbtn.setText("Registros Empleados");
        registroEmpleadosbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroEmpleadosbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btngregarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(listaClienteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            .addComponent(puestoEmpleado)
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
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addComponent(registroEmpleadosbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(puestoEmpleado)
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
                .addGap(35, 35, 35)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btngregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listaClienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registroEmpleadosbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
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
        btnBoleta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBoletaMouseClicked(evt);
            }
        });
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
        comboColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboColorMouseClicked(evt);
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
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
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

        cantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cantidadMouseClicked(evt);
            }
        });
        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
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
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(boxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(comboColor, 0, 136, Short.MAX_VALUE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAgregar)
                                .addGap(30, 30, 30)
                                .addComponent(btnEliminar)
                                .addGap(27, 27, 27)
                                .addComponent(btnEliminarTotal)))
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
                                    .addComponent(jLabel7)
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
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        JTabbedPanel.addTab("", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Buscar Cliente");

        dniBuscar.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("DNI:");

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

        buscarbtn.setText("Listar");
        buscarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarbtnMouseClicked(evt);
            }
        });
        buscarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarbtnActionPerformed(evt);
            }
        });

        buscarDNI.setText("Buscar");
        buscarDNI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarDNIMouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel17.setText("Nombres:");

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel18.setText("Apellidos");

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel23.setText("Teléfono:");

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel24.setText("Dirección:");

        jLabel34.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel34.setText("Correo:");

        jLabel35.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel35.setText("Provincia:");

        jButton1.setText("Seleccionar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        actualizarbtn.setText("Actualizar");
        actualizarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizarbtnMouseClicked(evt);
            }
        });

        limpiarbtn.setText("Limpiar");
        limpiarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarbtnActionPerformed(evt);
            }
        });

        btnEliminarCliente.setText("Eliminar");
        btnEliminarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarClienteMouseClicked(evt);
            }
        });
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel18)
                                .addComponent(jLabel34)
                                .addComponent(jLabel35))
                            .addGap(41, 41, 41)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ApellidoBuscar)
                                        .addComponent(dniBuscar)
                                        .addComponent(carreoBuscar)
                                        .addComponent(provinciaBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel23)
                                        .addComponent(jLabel24))
                                    .addGap(27, 27, 27))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nombreBuscar)
                                .addComponent(telefonoBuscar)
                                .addComponent(direccionBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(buscarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(buscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(actualizarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(limpiarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(dniBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(nombreBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(ApellidoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(telefonoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(direccionBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(carreoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34)
                        .addComponent(jLabel24)))
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(provinciaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarDNI)
                    .addComponent(actualizarbtn)
                    .addComponent(limpiarbtn))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarbtn)
                    .addComponent(jButton1)
                    .addComponent(btnEliminarCliente))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        JTabbedPanel.addTab("", jPanel5);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 153, 153));
        jLabel25.setText("Reporte de Ventas");

        jLabel26.setText("Fecha Actual");

        jLabel27.setText("Cantidad de Ventas ");

        jLabel28.setText("Total venta");

        lblFechaActual.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblFechaActual.setText("---");

        lblCantidadVentas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCantidadVentas.setText("---");

        lblTotalVentas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTotalVentas.setText("---");

        listaVentaTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(listaVentaTabla);

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel29.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel29.setText("Buscar por fecha:");

        btnBuscarVentas.setText("Buscar");
        btnBuscarVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarVentasMouseClicked(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel25))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaActual)
                            .addComponent(lblCantidadVentas)
                            .addComponent(lblTotalVentas))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                        .addComponent(jSeparator1))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnBuscarVentas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buscarFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(83, 83, 83))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel25)
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(lblFechaActual))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(lblCantidadVentas))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(lblTotalVentas))
                .addGap(62, 62, 62)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(buscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarVentas)
                    .addComponent(btnListar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        JTabbedPanel.addTab("", jPanel7);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel36.setText("Nombre");

        jLabel37.setText("Apellido");

        jLabel38.setText("DNI");

        jLabel39.setText("Dirección");

        jLabel40.setText("Distrito");

        jLabel41.setText("Cumpleaños");

        jLabel42.setText("Telefono");

        jLabel43.setText("Puesto");

        RegistrarEmpleado.setText("Registrar Empleado");
        RegistrarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarEmpleadoMouseClicked(evt);
            }
        });

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablaEmpleados);

        listTablaEmpleado.setText("Listar ");
        listTablaEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listTablaEmpleadoMouseClicked(evt);
            }
        });

        seleccionarTablaEmpleado.setText("Seleccionar");
        seleccionarTablaEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seleccionarTablaEmpleadoMouseClicked(evt);
            }
        });

        eliminarEmpleado.setText("Eliminar");
        eliminarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarEmpleadoMouseClicked(evt);
            }
        });

        actualizarEmpleado.setText("Actualizar");
        actualizarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizarEmpleadoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel42)
                                .addComponent(jLabel36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel37)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(NomEmp)
                                .addComponent(ApellidoEmp)
                                .addComponent(DNIEmp)
                                .addComponent(TelefEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                            .addGap(22, 22, 22)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel39)
                                .addComponent(jLabel40)
                                .addComponent(jLabel43)
                                .addComponent(jLabel41))
                            .addGap(35, 35, 35)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PuestoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DistriEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CumEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DireccEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(RegistrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(actualizarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(listTablaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seleccionarTablaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DireccEmp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel36)
                                .addComponent(NomEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DistriEmp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel37)
                                .addComponent(ApellidoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel40)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(CumEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PuestoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DNIEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel41))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TelefEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel43))))))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegistrarEmpleado)
                    .addComponent(actualizarEmpleado))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listTablaEmpleado)
                    .addComponent(seleccionarTablaEmpleado)
                    .addComponent(eliminarEmpleado))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        JTabbedPanel.addTab("", jPanel2);

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
        boxMedidas.setSelectedIndex(0);
        boxProducto.setSelectedIndex(0);
        precio.setText("S/. " + String.valueOf(precioPorUnidad[0]));
        boxMedidas.setSelectedIndex(0);
        cantidad.setText("1");
        controlMenu.precioT(almohadas, boxMedidas, boxProducto, cantidad, precioTotal);
    }

    public void calcularPrecio() {
        precio.setText("S/. " + almohadas.getPrecioUnitario());
    }


    private void listaClienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaClienteBtnActionPerformed
        // TODO add your handling code here:
        JTabbedPanel.setSelectedIndex(1);
    }//GEN-LAST:event_listaClienteBtnActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed

    }//GEN-LAST:event_btnFacturaActionPerformed

    private void btnBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoletaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnBoletaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        // TODO add your handling code here:
        controlMenu.limpiarDatos(fuenteColor, letraFmenu, txtNombre, txtApellidos, txtDNI, txtRazonSocial, txtRUC, txtDestino, txtTelefono, txtCorreo, txtProvincia);
        controlMenu.asignarColor(boxProducto, almohadas, comboColor);
        borrarDatos();
    }//GEN-LAST:event_btnLimpiarMouseClicked


    private void comboColorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboColorItemStateChanged
        // TODO add your handling code here:
        controlMenu.asignarColor(boxProducto, almohadas, comboColor);

    }//GEN-LAST:event_comboColorItemStateChanged


    private void boxProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxProductoItemStateChanged
        // TODO add your handling code here:

        controlMenu.boxProductoCambio(boxProducto, comboColor, cantidad, precio);
        controlMenu.precioT(almohadas, boxMedidas, boxProducto, cantidad, precioTotal);
        controlMenu.precioPorMedida(precio, boxMedidas, boxProducto, almohadas);
        controlMenu.asignarColor(boxProducto, almohadas, comboColor);

    }//GEN-LAST:event_boxProductoItemStateChanged

    private void boxMedidasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxMedidasItemStateChanged
        // TODO add your handling code here:
        controlMenu.precioT(almohadas, boxMedidas, boxProducto, cantidad, precioTotal);

        controlMenu.precioPorMedida(precio, boxMedidas, boxProducto, almohadas);
        controlMenu.asignarColor(boxProducto, almohadas, comboColor);

    }//GEN-LAST:event_boxMedidasItemStateChanged

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked

        // TODO add your handling code here:
        controlMenu.asignarColor(boxProducto, almohadas, comboColor);


    }//GEN-LAST:event_btnAgregarMouseClicked

    public void actulizarDatos() {
        boxMedidas.setSelectedIndex(0);
        boxProducto.setSelectedIndex(0);
        precio.setText("S/. " + String.valueOf(precioPorUnidad[0]));
        boxMedidas.setSelectedIndex(0);
        Double in = 1d;
        cantidad.setText("");
        controlMenu.precioT(almohadas, boxMedidas, boxProducto, cantidad, precioTotal);

    }

    int cod = 0;


    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:

        if (!txtNombre.getText().equals(letraFmenu.getNombre())) {
            almohadas.setNombreProducto(Producto[boxProducto.getSelectedIndex()]);
            almohadas.setMedida(medida[boxMedidas.getSelectedIndex()]);
            String can = cantidad.getText();
            Double c = Double.valueOf(cantidad.getText());
            Double pr = almohadas.getPrecioUnitario();
            //Agregar en la tabla
            String p = String.valueOf(c * pr);
            informacion[0] = almohadas.getNombreProducto();
            informacion[1] = almohadas.getMedida();
            informacion[2] = almohadas.getColor();
            informacion[3] = can;
            informacion[4] = p;

            try {
                cod = pdao.idPro();
                cod++;
                almohadas.setCod(cod);
                int cantidadProducto = Integer.valueOf(this.cantidad.getText());
                codProductos.add(cod);
                cantidadPro.add(cantidadProducto);
                PrecioToPro.add(c * pr);
                for (int i = 0; i < 1; i++) {
                    pdao.insertarRegistro(almohadas);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
            modeloTabla.addRow(informacion);
            actulizarDatos();
        } else {
            JOptionPane.showMessageDialog(null, "Complete los datos");
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

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
        try {
            controlMenu.eliminarBoton(tableMatriz, modeloTabla, codProductos);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
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


    private void btnFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturaMouseClicked
        if (!txtNombre.getText().equals(letraFmenu.getNombre())) {
            // TODO add your handling code here:

            DocumentoVentaCRUD control = new DocumentoVentaCRUD();

            try {
                control.sqlCliente(txtNombre, txtApellidos, txtDNI, txtTelefono, txtProvincia, txtDestino, txtCorreo);
                control.insertarDatos(cliente, txtRazonSocial, txtRUC, "Boleta", txtDNI, codProductos, cantidadPro, PrecioToPro);
                controlMenu.limpiarDatos(fuenteColor, letraFmenu, txtNombre, txtApellidos, txtDNI, txtRazonSocial, txtRUC, txtDestino, txtTelefono, txtCorreo, txtProvincia);
                control.eliminarDatos(modeloTabla, tableMatriz);
                mostrarLista();
            } catch (SQLException ex) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Complete los datos");
        }

    }//GEN-LAST:event_btnFacturaMouseClicked

    private void btnBoletaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBoletaMouseClicked
        // TODO add your handling code here:
        if (!txtNombre.getText().equals(letraFmenu.getNombre())) {

            DocumentoVentaCRUD control = new DocumentoVentaCRUD();

            try {
                control.sqlCliente(txtNombre, txtApellidos, txtDNI, txtTelefono, txtProvincia, txtDestino, txtCorreo);
                control.insertarDatos(cliente, txtRazonSocial, txtRUC, "Boleta", txtDNI, codProductos, cantidadPro, PrecioToPro);
                controlMenu.limpiarDatos(fuenteColor, letraFmenu, txtNombre, txtApellidos, txtDNI, txtRazonSocial, txtRUC, txtDestino, txtTelefono, txtCorreo, txtProvincia);
                control.eliminarDatos(modeloTabla, tableMatriz);
                mostrarLista();
            } catch (SQLException ex) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Complete los datos");
        }
    }//GEN-LAST:event_btnBoletaMouseClicked

    private void buscarbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarbtnMouseClicked
        // TODO add your handling code here:

        mostrarClientesCRUD mos = new mostrarClientesCRUD();
        try {
            mos.mostrarTabla(tablaListaCliente);

        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_buscarbtnMouseClicked

    private void buscarDNIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarDNIMouseClicked
        // TODO add your handling code here:
        mostrarClientesCRUD mos = new mostrarClientesCRUD();
        try {
            mos.mostrarPorDNI(dniBuscar, tablaListaCliente);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_buscarDNIMouseClicked

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
        controlMenu.precioT(almohadas, boxMedidas, boxProducto, cantidad, precioTotal);

    }//GEN-LAST:event_cantidadActionPerformed

    private void buscarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarbtnActionPerformed

    }//GEN-LAST:event_buscarbtnActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            // TODO add your handling code here:
            mostrarClientesCRUD mos = new mostrarClientesCRUD();
            mos.seleccionarCliente(tablaListaCliente, dniBuscar, nombreBuscar, ApellidoBuscar, telefonoBuscar, carreoBuscar, direccionBuscar, provinciaBuscar);
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void actualizarbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarbtnMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        mostrarClientesCRUD mos = new mostrarClientesCRUD();
        try {
            mos.actualizarCliente(tablaListaCliente, dniBuscar, nombreBuscar, ApellidoBuscar, telefonoBuscar, carreoBuscar, direccionBuscar, provinciaBuscar);
            mos.seleccionarCliente(tablaListaCliente, txtDNI, txtDNI, txtDNI, txtDNI, txtDNI, txtDNI, txtRUC);
            mos.eliminarDatos(tablaListaCliente);
            limpiarCliente();

        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_actualizarbtnMouseClicked

    public void limpiarCliente() {
        dniBuscar.setText("");
        nombreBuscar.setText("");
        ApellidoBuscar.setText("");
        telefonoBuscar.setText("");
        carreoBuscar.setText("");
        direccionBuscar.setText("");
        provinciaBuscar.setText("");
    }

    private void limpiarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarbtnActionPerformed
        // TODO add your handling code here:

        mostrarClientesCRUD el = new mostrarClientesCRUD();
        try {
            el.eliminarDatos(tablaListaCliente);
            limpiarCliente();
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_limpiarbtnActionPerformed

    private void comboColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboColorMouseClicked
        // TODO add your handling code here:
        controlMenu.precioT(almohadas, boxMedidas, boxProducto, cantidad, precioTotal);

    }//GEN-LAST:event_comboColorMouseClicked

    private void cantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantidadMouseClicked
        // TODO add your handling code here:
        cantidad.setText("");
        controlMenu.precioT(almohadas, boxMedidas, boxProducto, cantidad, precioTotal);

    }//GEN-LAST:event_cantidadMouseClicked

    private void btngregarPedidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngregarPedidoMouseEntered
        // TODO add your handling code here:
        btngregarPedido.setBackground(Color.white);
        btngregarPedido.setForeground(Color.BLACK);

    }//GEN-LAST:event_btngregarPedidoMouseEntered

    private void btngregarPedidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngregarPedidoMouseExited
        // TODO add your handling code here:
        btngregarPedido.setForeground(Color.white);
        btngregarPedido.setBackground(Color.BLACK);
    }//GEN-LAST:event_btngregarPedidoMouseExited

    private void listaClienteBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaClienteBtnMouseEntered
        // TODO add your handling code here:
        listaClienteBtn.setBackground(Color.white);
        listaClienteBtn.setForeground(Color.BLACK);
    }//GEN-LAST:event_listaClienteBtnMouseEntered

    private void btnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseEntered
        // TODO add your handling code here:
        btnVentas.setBackground(Color.white);
        btnVentas.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnVentasMouseEntered

    private void listaClienteBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaClienteBtnMouseExited
        // TODO add your handling code here:
        listaClienteBtn.setForeground(Color.white);
        listaClienteBtn.setBackground(Color.BLACK);
    }//GEN-LAST:event_listaClienteBtnMouseExited

    private void btnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseExited
        // TODO add your handling code here:
        btnVentas.setForeground(Color.white);
        btnVentas.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnVentasMouseExited

    private void btnSalidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalidaMouseEntered
        // TODO add your handling code here:
        btnSalida.setBackground(Color.white);
        btnSalida.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnSalidaMouseEntered

    private void btnSalidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalidaMouseExited
        // TODO add your handling code here:
        btnSalida.setForeground(Color.white);
        btnSalida.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnSalidaMouseExited

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnEliminarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarClienteMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnEliminarClienteMouseClicked

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        // TODO add your handling code here:
        mostrarClientesCRUD el = new mostrarClientesCRUD();
        try {
            el.eliminarBotonCliente(dniBuscar);
            el.eliminarDatos(tablaListaCliente);
            limpiarCliente();
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnBuscarVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarVentasMouseClicked
        // TODO add your handling code here:
        controladorListaVentas cl = new controladorListaVentas();
        try {
            cl.BuscarFecha(listaVentaTabla, buscarFecha);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }//GEN-LAST:event_btnBuscarVentasMouseClicked

    private void btnListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMouseClicked
        // TODO add your handling code here:
        controladorListaVentas lv = new controladorListaVentas();
        try {
            lv.mostrarListaTabla(listaVentaTabla);
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }//GEN-LAST:event_btnListarMouseClicked

    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentasMouseClicked

    private void registroEmpleadosbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroEmpleadosbtnActionPerformed
        // TODO add your handling code here:
        JTabbedPanel.setSelectedIndex(3);
    }//GEN-LAST:event_registroEmpleadosbtnActionPerformed

    private void RegistrarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarEmpleadoMouseClicked
        // TODO add your handling code here:

        controladorRegistroEmpleado ce = new controladorRegistroEmpleado();
        try {
            ce.registrarDatos(NomEmp, ApellidoEmp, DNIEmp, TelefEmp, DireccEmp, DistriEmp, CumEmp, PuestoEmp);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RegistrarEmpleadoMouseClicked

    private void listTablaEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listTablaEmpleadoMouseClicked
        // TODO add your handling code here:
        controladorRegistroEmpleado ce = new controladorRegistroEmpleado();
        try {
            ce.mostrarTablaEmpleado(tablaEmpleados);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listTablaEmpleadoMouseClicked

    private void seleccionarTablaEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionarTablaEmpleadoMouseClicked
        // TODO add your handling code here:
        controladorRegistroEmpleado ce = new controladorRegistroEmpleado();
        try {
            ce.seleccionTabla(NomEmp, ApellidoEmp, DNIEmp, TelefEmp, DireccEmp, DistriEmp, CumEmp, PuestoEmp, tablaEmpleados);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_seleccionarTablaEmpleadoMouseClicked

    private void eliminarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarEmpleadoMouseClicked
        // TODO add your handling code here:
        controladorRegistroEmpleado ce = new controladorRegistroEmpleado();
        try {
            ce.eliminarEmpleado(NomEmp, ApellidoEmp, DNIEmp, TelefEmp, DireccEmp, DistriEmp, CumEmp, PuestoEmp);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eliminarEmpleadoMouseClicked

    private void actualizarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarEmpleadoMouseClicked
        // TODO add your handling code here:
        controladorRegistroEmpleado ce = new controladorRegistroEmpleado();
         try {
             ce.actulizarEmpleado(NomEmp, ApellidoEmp, DNIEmp, TelefEmp, DireccEmp, DistriEmp, CumEmp, PuestoEmp,tablaEmpleados);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_actualizarEmpleadoMouseClicked

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
    private javax.swing.JTextField ApellidoBuscar;
    private javax.swing.JTextField ApellidoEmp;
    private javax.swing.JTextField CumEmp;
    private javax.swing.JTextField DNIEmp;
    private javax.swing.JTextField DireccEmp;
    private javax.swing.JTextField DistriEmp;
    public javax.swing.JLabel DniEmpleado;
    private javax.swing.JTabbedPane JTabbedPanel;
    private javax.swing.JTextField NomEmp;
    public javax.swing.JLabel NombreEmpleado;
    private javax.swing.JTextField PuestoEmp;
    private javax.swing.JButton RegistrarEmpleado;
    private javax.swing.JTextField TelefEmp;
    private javax.swing.JButton actualizarEmpleado;
    private javax.swing.JButton actualizarbtn;
    public javax.swing.JLabel apellidoEmpleado;
    private javax.swing.JComboBox<String> boxMedidas;
    private javax.swing.JComboBox<String> boxProducto;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBoleta;
    private javax.swing.JButton btnBuscarVentas;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarTotal;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnSalida;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton btngregarPedido;
    private javax.swing.JButton buscarDNI;
    private javax.swing.JTextField buscarFecha;
    private javax.swing.JButton buscarbtn;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField carreoBuscar;
    private javax.swing.JComboBox<String> comboColor;
    private javax.swing.JTextField direccionBuscar;
    private javax.swing.JTextField dniBuscar;
    private javax.swing.JButton eliminarEmpleado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCantidadVentas;
    private javax.swing.JLabel lblFechaActual;
    private javax.swing.JLabel lblTotalVentas;
    private javax.swing.JButton limpiarbtn;
    private javax.swing.JButton listTablaEmpleado;
    private javax.swing.JButton listaClienteBtn;
    private javax.swing.JTable listaVentaTabla;
    private javax.swing.JTextField nombreBuscar;
    private javax.swing.JLabel precio;
    private javax.swing.JLabel precioTotal;
    private javax.swing.JTextField provinciaBuscar;
    public javax.swing.JLabel puestoEmpleado;
    private javax.swing.JButton registroEmpleadosbtn;
    private javax.swing.JButton seleccionarTablaEmpleado;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTable tablaListaCliente;
    private javax.swing.JTable tableMatriz;
    private javax.swing.JTextField telefonoBuscar;
    public javax.swing.JLabel telefonoEmpleado;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDestino;
    public javax.swing.JLabel txtEmpleado;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtRUC;
    protected javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
