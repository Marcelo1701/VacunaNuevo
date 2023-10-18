package Vistas;

import AccesoADatos.CiudadanoData;
import AccesoADatos.LaboratorioData;
import AccesoADatos.VacunaData;
import Entidades.Ciudadano;
import Entidades.Laboratorio;
import Entidades.Vacuna;
import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import java.awt.Color;
import java.awt.Component;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class VacunarGUI extends javax.swing.JFrame {
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public VacunarGUI() {
        initComponents();
        setLocationRelativeTo(null);
        ocultarIFrames();
    }

    public void ocultarIFrames() {
        IF_Paciente.setVisible(false);
        IF_Laboratorio.setVisible(false);
        IF_Vacuna.setVisible(false);
        IF_Admin.setVisible(false);
        IF_Consultas.setVisible(false);
        IF_Ayuda.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        IF_Paciente = new javax.swing.JInternalFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JT_Ocupacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JT_DNI = new javax.swing.JTextField();
        JT_Nombre = new javax.swing.JTextField();
        JT_Email = new javax.swing.JTextField();
        JT_Patologia = new javax.swing.JTextField();
        JT_Apellido = new javax.swing.JTextField();
        JT_Edad = new javax.swing.JTextField();
        JT_Celular = new javax.swing.JTextField();
        JT_ResponsableLegal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        BTN_BuscarPaciente = new javax.swing.JButton();
        BTN_GuardarActualizarPaciente = new javax.swing.JButton();
        BTN_NuevoPaciente = new javax.swing.JButton();
        RB_EstadoPaciente = new javax.swing.JRadioButton();
        LB_EstadoPaciente = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        IF_Laboratorio = new javax.swing.JInternalFrame();
        jLabel15 = new javax.swing.JLabel();
        BTN_GuardarActualizarLab = new javax.swing.JButton();
        BTN_NuevoLab = new javax.swing.JButton();
        BTN_BuscarLab = new javax.swing.JButton();
        JT_CuitLab = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        JT_NombreLab = new javax.swing.JTextField();
        JT_PaisLab = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        JT_DomComLab = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        JT_EmailLab = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        JT_TelefonoLab = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        IF_Vacuna = new javax.swing.JInternalFrame();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        JT_SerieDosis = new javax.swing.JTextField();
        JT_CuitLabVacuna = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        JT_NomVacuna = new javax.swing.JTextField();
        JT_MarcaVacuna = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        BTN_NuevaVacuna = new javax.swing.JButton();
        BTN_GuardarActualizarVacuna = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        JT_Medida = new javax.swing.JTextField();
        BTN_BuscarVacuna = new javax.swing.JButton();
        RB_EstadoVacuna = new javax.swing.JRadioButton();
        LB_EstadoVacuna = new javax.swing.JLabel();
        JDC_VencimientoVacuna = new com.toedter.calendar.JDateChooser();
        JCB_CuitsLabs = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        IF_Admin = new javax.swing.JInternalFrame();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        JT_Apellido3 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        JT_Edad3 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        JT_Celular5 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        JT_ResponsableLegal5 = new javax.swing.JTextField();
        BTN_BuscarPaciente3 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        JT_Celular6 = new javax.swing.JTextField();
        JT_ResponsableLegal6 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        LB_EstadoPaciente2 = new javax.swing.JLabel();
        BTN_NuevoPaciente3 = new javax.swing.JButton();
        BTN_GuardarActualizarPaciente3 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        IF_Consultas = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        IF_Ayuda = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        MenuFlotante = new javax.swing.JMenuBar();
        JM_Paciente = new javax.swing.JMenu();
        MI_Paciente = new javax.swing.JMenuItem();
        JM_Laboratorio = new javax.swing.JMenu();
        MI_lab = new javax.swing.JMenuItem();
        JM_Vacuna = new javax.swing.JMenu();
        MI_Vac = new javax.swing.JMenuItem();
        JM_Admin = new javax.swing.JMenu();
        MI_Turno = new javax.swing.JMenuItem();
        JM_Consultas = new javax.swing.JMenu();
        MI_Turnos = new javax.swing.JMenuItem();
        JM_Temas = new javax.swing.JMenu();
        MI_Noche = new javax.swing.JMenuItem();
        MI_Dia = new javax.swing.JMenuItem();
        JM_Ayuda = new javax.swing.JMenu();
        MI_Ayuda = new javax.swing.JMenuItem();
        JM_Salir = new javax.swing.JMenu();
        MI_Salir = new javax.swing.JMenuItem();

        jLabel14.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("PACIENTE");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 700));
        setPreferredSize(new java.awt.Dimension(1000, 690));
        getContentPane().setLayout(new java.awt.FlowLayout());

        IF_Paciente.setClosable(true);
        IF_Paciente.setTitle("Paciente");
        IF_Paciente.setFrameIcon(null);
        IF_Paciente.setMinimumSize(new java.awt.Dimension(870, 690));
        IF_Paciente.setName(""); // NOI18N
        IF_Paciente.setPreferredSize(new java.awt.Dimension(870, 690));
        IF_Paciente.setVisible(true);
        IF_Paciente.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PACIENTE");
        IF_Paciente.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 868, 60));

        jLabel4.setText("DNI");
        IF_Paciente.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 20, 40));

        JT_Ocupacion.setColumns(1);
        JT_Ocupacion.setName("Ocupación"); // NOI18N
        IF_Paciente.getContentPane().add(JT_Ocupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 180, 30));

        jLabel5.setText("NOMBRE");
        IF_Paciente.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 50, 40));

        jLabel6.setText("EMAIL");
        IF_Paciente.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 40, 40));

        jLabel7.setText("PATOLOGÍA");
        IF_Paciente.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 70, 40));

        jLabel8.setText("OCUPACIÓN");
        IF_Paciente.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 70, 40));

        JT_DNI.setColumns(1);
        JT_DNI.setName("DNI"); // NOI18N
        IF_Paciente.getContentPane().add(JT_DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 180, 30));

        JT_Nombre.setColumns(1);
        JT_Nombre.setName("Nombre"); // NOI18N
        IF_Paciente.getContentPane().add(JT_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 180, 30));

        JT_Email.setColumns(1);
        IF_Paciente.getContentPane().add(JT_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 180, 30));

        JT_Patologia.setColumns(1);
        JT_Patologia.setName("Patología"); // NOI18N
        IF_Paciente.getContentPane().add(JT_Patologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 180, 30));

        JT_Apellido.setColumns(1);
        JT_Apellido.setName("Apellido"); // NOI18N
        IF_Paciente.getContentPane().add(JT_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 180, 30));

        JT_Edad.setColumns(1);
        JT_Edad.setName("Edad"); // NOI18N
        IF_Paciente.getContentPane().add(JT_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 180, 30));

        JT_Celular.setColumns(1);
        JT_Celular.setName("Celular"); // NOI18N
        IF_Paciente.getContentPane().add(JT_Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 180, 30));

        JT_ResponsableLegal.setColumns(1);
        JT_ResponsableLegal.setName("Responsable Legal"); // NOI18N
        IF_Paciente.getContentPane().add(JT_ResponsableLegal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 180, 30));

        jLabel10.setText("APELLIDO");
        IF_Paciente.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 60, 40));

        jLabel11.setText("EDAD");
        IF_Paciente.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 40, 40));

        jLabel12.setText("CELULAR");
        IF_Paciente.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 60, 40));

        jLabel13.setText("RESPONSABLE LEGAL");
        IF_Paciente.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 130, 40));

        BTN_BuscarPaciente.setText("BUSCAR PACIENTE");
        BTN_BuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BuscarPacienteActionPerformed(evt);
            }
        });
        IF_Paciente.getContentPane().add(BTN_BuscarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 270, 60));

        BTN_GuardarActualizarPaciente.setText("GUARDAR | ACTUALIZAR");
        BTN_GuardarActualizarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GuardarActualizarPacienteActionPerformed(evt);
            }
        });
        IF_Paciente.getContentPane().add(BTN_GuardarActualizarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 280, 60));

        BTN_NuevoPaciente.setText("NUEVO PACIENTE | BÚSQUEDA");
        BTN_NuevoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NuevoPacienteActionPerformed(evt);
            }
        });
        IF_Paciente.getContentPane().add(BTN_NuevoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 280, 60));

        RB_EstadoPaciente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RB_EstadoPaciente.setText("Activo");
        IF_Paciente.getContentPane().add(RB_EstadoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 80, -1));

        LB_EstadoPaciente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        IF_Paciente.getContentPane().add(LB_EstadoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 280, 40));

        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        IF_Paciente.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 820, 420));

        getContentPane().add(IF_Paciente);

        IF_Laboratorio.setClosable(true);
        IF_Laboratorio.setTitle("Laboratorio");
        IF_Laboratorio.setMinimumSize(new java.awt.Dimension(870, 680));
        IF_Laboratorio.setName(""); // NOI18N
        IF_Laboratorio.setPreferredSize(new java.awt.Dimension(870, 680));
        IF_Laboratorio.setVisible(true);
        IF_Laboratorio.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("LABORATORIO");
        IF_Laboratorio.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 868, 60));

        BTN_GuardarActualizarLab.setText("GUARDAR | ACTUALIZAR");
        BTN_GuardarActualizarLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GuardarActualizarLabActionPerformed(evt);
            }
        });
        IF_Laboratorio.getContentPane().add(BTN_GuardarActualizarLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 280, 60));

        BTN_NuevoLab.setText("NUEVO LABORATORIO");
        BTN_NuevoLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NuevoLabActionPerformed(evt);
            }
        });
        IF_Laboratorio.getContentPane().add(BTN_NuevoLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 280, 60));

        BTN_BuscarLab.setText("BUSCAR LABORATORIO");
        BTN_BuscarLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BuscarLabActionPerformed(evt);
            }
        });
        IF_Laboratorio.getContentPane().add(BTN_BuscarLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 340, 110));

        JT_CuitLab.setColumns(1);
        JT_CuitLab.setName("CUIT"); // NOI18N
        IF_Laboratorio.getContentPane().add(JT_CuitLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 180, 30));

        jLabel16.setText("CUIT LABORATORIO");
        IF_Laboratorio.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, 40));

        jLabel17.setText("NOMBRE LABORATORIO");
        IF_Laboratorio.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, 40));

        JT_NombreLab.setColumns(1);
        JT_NombreLab.setName("Nombre"); // NOI18N
        IF_Laboratorio.getContentPane().add(JT_NombreLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 180, 30));

        JT_PaisLab.setColumns(1);
        JT_PaisLab.setName("País"); // NOI18N
        IF_Laboratorio.getContentPane().add(JT_PaisLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 180, 30));

        jLabel18.setText("PAIS");
        IF_Laboratorio.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, 40));

        jLabel19.setText("DOMICILIO COMERCIAL");
        IF_Laboratorio.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, 40));

        JT_DomComLab.setColumns(1);
        JT_DomComLab.setName("Domicilio Comercial"); // NOI18N
        IF_Laboratorio.getContentPane().add(JT_DomComLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 180, 30));

        jLabel20.setText("EMAIL");
        IF_Laboratorio.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, 40));

        JT_EmailLab.setColumns(1);
        JT_EmailLab.setName("Email"); // NOI18N
        IF_Laboratorio.getContentPane().add(JT_EmailLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 180, 30));

        jLabel21.setText("TELEFONO");
        IF_Laboratorio.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, 40));

        JT_TelefonoLab.setColumns(1);
        JT_TelefonoLab.setName("Teléfono"); // NOI18N
        IF_Laboratorio.getContentPane().add(JT_TelefonoLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 180, 30));

        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        IF_Laboratorio.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 810, 350));

        getContentPane().add(IF_Laboratorio);

        IF_Vacuna.setClosable(true);
        IF_Vacuna.setTitle("Vacuna");
        IF_Vacuna.setMinimumSize(new java.awt.Dimension(870, 680));
        IF_Vacuna.setName(""); // NOI18N
        IF_Vacuna.setPreferredSize(new java.awt.Dimension(870, 680));
        IF_Vacuna.setVisible(true);
        IF_Vacuna.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("VACUNA");
        IF_Vacuna.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 868, 60));

        jLabel24.setText("N° SERIE DOSIS");
        IF_Vacuna.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, 40));

        JT_SerieDosis.setColumns(1);
        JT_SerieDosis.setName("Serie Dosis"); // NOI18N
        IF_Vacuna.getContentPane().add(JT_SerieDosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 180, 30));

        JT_CuitLabVacuna.setColumns(1);
        JT_CuitLabVacuna.setName("Cuit Laboratorio"); // NOI18N
        IF_Vacuna.getContentPane().add(JT_CuitLabVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 180, 30));

        jLabel26.setText("CUIT LABORATORIO");
        IF_Vacuna.getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, 40));

        jLabel27.setText("NOMBRE VACUNA");
        IF_Vacuna.getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, 40));

        JT_NomVacuna.setColumns(1);
        JT_NomVacuna.setName("Nombre Vacuna"); // NOI18N
        IF_Vacuna.getContentPane().add(JT_NomVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 180, 30));

        JT_MarcaVacuna.setColumns(1);
        JT_MarcaVacuna.setName("Marca"); // NOI18N
        IF_Vacuna.getContentPane().add(JT_MarcaVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 180, 30));

        jLabel28.setText("MARCA");
        IF_Vacuna.getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, 40));

        BTN_NuevaVacuna.setText("NUEVA VACUNA");
        BTN_NuevaVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NuevaVacunaActionPerformed(evt);
            }
        });
        IF_Vacuna.getContentPane().add(BTN_NuevaVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 280, 60));

        BTN_GuardarActualizarVacuna.setText("GUARDAR | ACTUALIZAR");
        BTN_GuardarActualizarVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GuardarActualizarVacunaActionPerformed(evt);
            }
        });
        IF_Vacuna.getContentPane().add(BTN_GuardarActualizarVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 280, 60));

        jLabel29.setText("LABORATORIOS");
        IF_Vacuna.getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 100, 40));

        jLabel30.setText("MEDIDA");
        IF_Vacuna.getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, 40));

        JT_Medida.setColumns(1);
        JT_Medida.setName("Medida"); // NOI18N
        IF_Vacuna.getContentPane().add(JT_Medida, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 180, 30));

        BTN_BuscarVacuna.setText("BUSCAR VACUNA");
        BTN_BuscarVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BuscarVacunaActionPerformed(evt);
            }
        });
        IF_Vacuna.getContentPane().add(BTN_BuscarVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 340, 50));

        RB_EstadoVacuna.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RB_EstadoVacuna.setText("APLICACIÓN");
        IF_Vacuna.getContentPane().add(RB_EstadoVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 120, -1));

        LB_EstadoVacuna.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        IF_Vacuna.getContentPane().add(LB_EstadoVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 190, 40));

        JDC_VencimientoVacuna.setBackground(new java.awt.Color(0, 0, 0));
        JDC_VencimientoVacuna.setDateFormatString("yyyy-MM-dd");
        JDC_VencimientoVacuna.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        IF_Vacuna.getContentPane().add(JDC_VencimientoVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 180, 40));

        IF_Vacuna.getContentPane().add(JCB_CuitsLabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 180, 40));

        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        IF_Vacuna.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 810, 370));

        jLabel39.setText("VENCIMIENTO");
        IF_Vacuna.getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, 40));

        getContentPane().add(IF_Vacuna);

        IF_Admin.setClosable(true);
        IF_Admin.setTitle("Administración");
        IF_Admin.setMinimumSize(new java.awt.Dimension(870, 680));
        IF_Admin.setName(""); // NOI18N
        IF_Admin.setPreferredSize(new java.awt.Dimension(870, 680));
        IF_Admin.setVisible(true);
        IF_Admin.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("ADMINISTRACIÓN");
        IF_Admin.getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 868, 94));

        jLabel32.setText("N° TURNO");
        IF_Admin.getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, 40));

        JT_Apellido3.setColumns(1);
        IF_Admin.getContentPane().add(JT_Apellido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 180, 30));

        jLabel33.setText("DNI PACIENTE");
        IF_Admin.getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, 40));

        JT_Edad3.setColumns(1);
        IF_Admin.getContentPane().add(JT_Edad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 180, 30));

        jLabel34.setText("CÓDIGO REFUERZO");
        IF_Admin.getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, 40));

        JT_Celular5.setColumns(1);
        IF_Admin.getContentPane().add(JT_Celular5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 180, 30));

        jLabel35.setText("CENTRO VACUNACIÓN");
        IF_Admin.getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, 40));

        JT_ResponsableLegal5.setColumns(1);
        IF_Admin.getContentPane().add(JT_ResponsableLegal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 180, 30));

        BTN_BuscarPaciente3.setText("BUSCAR TURNO");
        BTN_BuscarPaciente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BuscarPaciente3ActionPerformed(evt);
            }
        });
        IF_Admin.getContentPane().add(BTN_BuscarPaciente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 340, 100));

        jLabel36.setText("FECHA HORARIO COLOCACIÓN");
        IF_Admin.getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, 40));

        JT_Celular6.setColumns(1);
        IF_Admin.getContentPane().add(JT_Celular6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 180, 30));

        JT_ResponsableLegal6.setColumns(1);
        IF_Admin.getContentPane().add(JT_ResponsableLegal6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 180, 30));

        jLabel37.setText("N° SERIE DOSIS");
        IF_Admin.getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, -1, 40));
        IF_Admin.getContentPane().add(LB_EstadoPaciente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 190, 30));

        BTN_NuevoPaciente3.setText("NUEVO TURNO");
        BTN_NuevoPaciente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NuevoPaciente3ActionPerformed(evt);
            }
        });
        IF_Admin.getContentPane().add(BTN_NuevoPaciente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 280, 60));

        BTN_GuardarActualizarPaciente3.setText("GUARDAR | ACTUALIZAR");
        BTN_GuardarActualizarPaciente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GuardarActualizarPaciente3ActionPerformed(evt);
            }
        });
        IF_Admin.getContentPane().add(BTN_GuardarActualizarPaciente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 280, 60));

        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        IF_Admin.getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 810, 370));

        getContentPane().add(IF_Admin);

        IF_Consultas.setClosable(true);
        IF_Consultas.setTitle("Consultas");
        IF_Consultas.setMinimumSize(new java.awt.Dimension(870, 680));
        IF_Consultas.setPreferredSize(new java.awt.Dimension(870, 690));
        IF_Consultas.setVisible(true);
        IF_Consultas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTAS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(200, 100));
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 100));
        IF_Consultas.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 240, 80));

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
        jScrollPane1.setViewportView(jTable1);

        IF_Consultas.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 760, 320));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("STOCK VACUNAS");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        IF_Consultas.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 160, 60));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        IF_Consultas.getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 136, 260, 40));

        getContentPane().add(IF_Consultas);

        IF_Ayuda.setClosable(true);
        IF_Ayuda.setTitle("Ayuda");
        IF_Ayuda.setPreferredSize(new java.awt.Dimension(870, 680));
        IF_Ayuda.setVisible(true);
        IF_Ayuda.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        jTextPane1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextPane1.setPreferredSize(new java.awt.Dimension(870, 680));
        jScrollPane2.setViewportView(jTextPane1);

        IF_Ayuda.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 660));

        getContentPane().add(IF_Ayuda);

        MenuFlotante.setAlignmentX(0.0F);
        MenuFlotante.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        MenuFlotante.setPreferredSize(new java.awt.Dimension(750, 35));

        JM_Paciente.setText("Paciente");
        JM_Paciente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Paciente.setText("Paciente");
        MI_Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_PacienteActionPerformed(evt);
            }
        });
        JM_Paciente.add(MI_Paciente);

        MenuFlotante.add(JM_Paciente);

        JM_Laboratorio.setText("Laboratorio");
        JM_Laboratorio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_lab.setText("Laboratorio");
        MI_lab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_labActionPerformed(evt);
            }
        });
        JM_Laboratorio.add(MI_lab);

        MenuFlotante.add(JM_Laboratorio);

        JM_Vacuna.setText("Vacuna");
        JM_Vacuna.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Vac.setText("Vacuna");
        MI_Vac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_VacActionPerformed(evt);
            }
        });
        JM_Vacuna.add(MI_Vac);

        MenuFlotante.add(JM_Vacuna);

        JM_Admin.setText("Administración");
        JM_Admin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Turno.setText("Turnos");
        MI_Turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_TurnoActionPerformed(evt);
            }
        });
        JM_Admin.add(MI_Turno);

        MenuFlotante.add(JM_Admin);

        JM_Consultas.setText("Consultas");
        JM_Consultas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Turnos.setText("Consultas");
        MI_Turnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_TurnosActionPerformed(evt);
            }
        });
        JM_Consultas.add(MI_Turnos);

        MenuFlotante.add(JM_Consultas);

        JM_Temas.setText("Temas");
        JM_Temas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Noche.setText("Noche");
        JM_Temas.add(MI_Noche);

        MI_Dia.setText("Día");
        JM_Temas.add(MI_Dia);

        MenuFlotante.add(JM_Temas);

        JM_Ayuda.setText("Ayuda");
        JM_Ayuda.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Ayuda.setText("Información");
        MI_Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_AyudaActionPerformed(evt);
            }
        });
        JM_Ayuda.add(MI_Ayuda);

        MenuFlotante.add(JM_Ayuda);

        JM_Salir.setText("Salir");
        JM_Salir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Salir.setText("Salir del programa");
        MI_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_SalirActionPerformed(evt);
            }
        });
        JM_Salir.add(MI_Salir);

        MenuFlotante.add(JM_Salir);

        setJMenuBar(MenuFlotante);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void MI_PacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_PacienteActionPerformed
        ocultarIFrames();
        IF_Paciente.setVisible(true);
        BTN_GuardarActualizarPaciente.setEnabled(false);
        BTN_BuscarPaciente.setEnabled(false);
        //activarBotonSegunCantCaract(JT_DNI, BTN_GuardarActualizarPaciente, 7);
        activarBotonSegunCantCaract(JT_DNI, BTN_BuscarPaciente, 7);
        
        List <JTextField> campos = new ArrayList<>();
        campos.add(JT_Nombre);
        campos.add(JT_Apellido);
        campos.add(JT_DNI);
        campos.add(JT_Celular);
        campos.add(JT_Edad);
                
        activarBotonSiTextoIngresado(BTN_GuardarActualizarPaciente, campos);
        desbloquearCampos(false);
    }//GEN-LAST:event_MI_PacienteActionPerformed

    private void MI_labActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_labActionPerformed
        ocultarIFrames();
        IF_Laboratorio.setVisible(true);
        BTN_GuardarActualizarLab.setEnabled(false);
        BTN_BuscarLab.setEnabled(false);
        activarBotonSegunCantCaract(JT_CuitLab, BTN_BuscarLab, 7);
        List <JTextField> campos = new ArrayList<>();
        campos.add(JT_NombreLab);
        campos.add(JT_PaisLab);
        campos.add(JT_DomComLab);
        campos.add(JT_EmailLab);
        campos.add(JT_TelefonoLab);
        activarBotonSiTextoIngresado(BTN_GuardarActualizarLab, campos);
        desbloquearCamposEnIF(campos, false);
    }//GEN-LAST:event_MI_labActionPerformed

    private void MI_VacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_VacActionPerformed
        ocultarIFrames();
        JDC_VencimientoVacuna.getDateEditor().setEnabled(false);
        IF_Vacuna.setVisible(true);
        cargarLabsComboBox(JCB_CuitsLabs);
        BTN_GuardarActualizarVacuna.setEnabled(false);
        BTN_BuscarVacuna.setEnabled(false);
        activarBotonSegunCantCaract(JT_SerieDosis, BTN_BuscarVacuna, 5);
        List <JTextField> campos = new ArrayList<>();
        campos.add(JT_CuitLabVacuna);
        campos.add(JT_NomVacuna);
        campos.add(JT_MarcaVacuna);
        campos.add(JT_Medida);
        
                
        activarBotonSiTextoIngresado(BTN_GuardarActualizarVacuna, campos);
        desbloquearCamposVacuna(false);
    }//GEN-LAST:event_MI_VacActionPerformed

    private void MI_TurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_TurnoActionPerformed
        ocultarIFrames();
        IF_Admin.setVisible(true);
    }//GEN-LAST:event_MI_TurnoActionPerformed

    private void MI_TurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_TurnosActionPerformed
        ocultarIFrames();
        IF_Consultas.setVisible(true);
    }//GEN-LAST:event_MI_TurnosActionPerformed

    private void MI_AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_AyudaActionPerformed
        ocultarIFrames();
        IF_Ayuda.setVisible(true);
    }//GEN-LAST:event_MI_AyudaActionPerformed
    
    public static void activarBotonSegunCantCaract(JTextField textField, JButton button, int longitudMinima) {
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkTextLength();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkTextLength();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkTextLength();
            }

            private void checkTextLength() {
                if (textField.getText().length() >= longitudMinima) {
                    button.setEnabled(true);
                } else {
                    button.setEnabled(false);
                }
            }
        });
    }    
    
    private void BTN_BuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BuscarPacienteActionPerformed
        desbloquearCampos(true);
        CiudadanoData ciuData = new CiudadanoData();
        ArrayList<Ciudadano> ciudadanoBuscado = new ArrayList<>();
        String dniPaciente = JT_DNI.getText();
        boolean dniValido = esNumeroDNI(dniPaciente);
        
        
        if (dniValido) {
            try {
                BTN_BuscarPaciente.setEnabled(false);
                int dniCiudadano = Integer.parseInt(dniPaciente);
                ciudadanoBuscado.add(ciuData.buscarCiudadanoPorDni(dniCiudadano));

                // Verifico si se encontró un paciente antes de mostrar los datos
                String apellido = ciudadanoBuscado.get(0).getApellido();
                String nombre = ciudadanoBuscado.get(0).getNombre();
                String email = ciudadanoBuscado.get(0).getEmail();
                String patologia = ciudadanoBuscado.get(0).getPatologia();
                String ocupacion = ciudadanoBuscado.get(0).getOcupacion();
                String celular = ciudadanoBuscado.get(0).getCelular();
                String responsableLegal = ciudadanoBuscado.get(0).getResponsableLegal();
                int edad = ciudadanoBuscado.get(0).getEdad();
                boolean estado = ciudadanoBuscado.get(0).isEstado();

                String edadString = String.valueOf(edad);

                // Muestra los datos en los campos de información
                JT_Apellido.setText(apellido);
                JT_Nombre.setText(nombre);
                JT_Celular.setText(celular);
                JT_Email.setText(email);
                JT_Patologia.setText(patologia);
                JT_Ocupacion.setText(ocupacion);
                JT_ResponsableLegal.setText(responsableLegal);
                JT_Edad.setText(edadString);

                RB_EstadoPaciente.setSelected(estado); // Establecemos el estado del RadioButton           
                if (RB_EstadoPaciente.isSelected()) {
                    Color verde = new Color(0, 204, 0);
                    LB_EstadoPaciente.setText("Paciente activo");
                    LB_EstadoPaciente.setForeground(verde);
                } else {
                    Color rojo = new Color(210, 32, 32);
                    LB_EstadoPaciente.setText("Paciente inactivo");
                    LB_EstadoPaciente.setForeground(rojo);
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "El paciente no existe en las listas\nIntenta con otro DNI");
                desbloquearCampos(false);
                BTN_BuscarPaciente.setEnabled(true);
                JT_DNI.setText("");
            }

        } else {
            desbloquearCampos(false);
            //JOptionPane.showMessageDialog(null, "Ingresa un DNI válido");
        }
    }//GEN-LAST:event_BTN_BuscarPacienteActionPerformed

    private void MI_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_SalirActionPerformed
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "¿Estás seguro de que quieres cerrar la aplicación?",
                "Confirmar Cierre",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {
            // Cierra la aplicación
            //System.exit(0);
            dispose();
            Login log=new Login();
            log.setVisible(true);
            
        }
    }//GEN-LAST:event_MI_SalirActionPerformed

    private void BTN_NuevoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NuevoPacienteActionPerformed
        
        Object[] options = {"Agregar Paciente", "Buscar Paciente"};
        int choice = JOptionPane.showOptionDialog(null,
                "¿Qué quieres hacer?",
                "Elegir una opción",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (choice == JOptionPane.YES_OPTION) { //Opción que permite cargar un nuevo paciente
            Color verde = new Color(0, 204, 0);
            LB_EstadoPaciente.setVisible(true);
            LB_EstadoPaciente.setText("Llenar todos los campos.");
            LB_EstadoPaciente.setForeground(verde);
            // Código para guardar
            BTN_BuscarPaciente.setVisible(false);
            RB_EstadoPaciente.setVisible(false);
            //JOptionPane.showMessageDialog(null, "Seleccionaste Nuevo Paciente");
            desbloquearCampos(true);
            limpiarCampos(IF_Paciente, LB_EstadoVacuna);
            //LB_EstadoPaciente.setVisible(false);
        } else if (choice == JOptionPane.NO_OPTION) { //Opción que permite iniciar una búsqueda nueva de paciente            
            BTN_BuscarPaciente.setEnabled(true);
            desbloquearCampos(false);
            BTN_BuscarPaciente.setVisible(true);
            //JOptionPane.showMessageDialog(null, "Seleccionaste Búsqueda Nueva");
            limpiarCampos(IF_Paciente, LB_EstadoPaciente);
        }
    }//GEN-LAST:event_BTN_NuevoPacienteActionPerformed
    
    private void desbloquearCamposEnIF(List<JTextField> campos, boolean habilitar) {
        campos.forEach((campo) -> {
            campo.setEditable(habilitar);
        });
        RB_EstadoPaciente.setEnabled(habilitar);
    }

    
    private void desbloquearCampos(boolean seteo){
        JT_Ocupacion.setEditable(seteo);
        JT_Nombre.setEditable(seteo);
        JT_Email.setEditable(seteo);
        JT_Patologia.setEditable(seteo);
        JT_Apellido.setEditable(seteo);
        JT_Edad.setEditable(seteo);
        JT_Celular.setEditable(seteo);
        JT_ResponsableLegal.setEditable(seteo);
        RB_EstadoPaciente.setEnabled(seteo);
    }
    
    private void desbloquearCamposLabs(boolean seteo){        
        JT_NombreLab.setEditable(seteo);
        JT_PaisLab.setEditable(seteo);
        JT_DomComLab.setEditable(seteo);
        JT_EmailLab.setEditable(seteo);
        JT_TelefonoLab.setEditable(seteo);        
    }
    
    private void desbloquearCamposVacuna(boolean seteo){
        JT_CuitLabVacuna.setEditable(seteo);
        JT_NomVacuna.setEditable(seteo);
        JT_MarcaVacuna.setEditable(seteo);
        JT_Medida.setEditable(seteo);
        JDC_VencimientoVacuna.setEnabled(seteo);
        RB_EstadoVacuna.setEnabled(seteo);
    }
    
    private void BTN_GuardarActualizarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GuardarActualizarPacienteActionPerformed

        CiudadanoData ciuData = new CiudadanoData();

        String dni = JT_DNI.getText();
        String apellido = JT_Apellido.getText();
        String nombre = JT_Nombre.getText();
        String email = JT_Email.getText();
        String patologia = JT_Patologia.getText();
        String ocupacion = JT_Ocupacion.getText();
        String celular = JT_Celular.getText();
        String responsableLegal = JT_ResponsableLegal.getText();
        String edad = JT_Edad.getText();
        
        boolean esDNIValido = esNumeroDNI(dni);
        boolean numValido = esNumeroValido(edad);
        
        List <JTextField> campos = new ArrayList<>();
        campos.add(JT_Nombre);
        campos.add(JT_Apellido);
        campos.add(JT_Patologia);
        campos.add(JT_Ocupacion);
        campos.add(JT_ResponsableLegal);
        
        boolean camposAlfasValidos = validarCamposAlfabeticos(campos);
        
        List <JTextField> camposNum = new ArrayList<>();
        camposNum.add(JT_DNI);
        camposNum.add(JT_Celular);
        camposNum.add(JT_Edad);
        
        boolean camposNumericos = validarCamposNumericos(camposNum);
        
        if (esDNIValido && numValido && camposAlfasValidos && camposNumericos) {
            try {

                boolean estadoPaciente = RB_EstadoPaciente.isSelected(); //Verifico que el estado del radioButton según el estado del paciente
                // Buscar ciudadano por DNI
                Ciudadano pacienteEncontrado = ciuData.buscarCiudadanoPorDni(Integer.parseInt(dni));
            
                if (pacienteEncontrado != null) {
                int opcion = JOptionPane.showConfirmDialog(null, "El DNI ya existe. ¿Deseas actualizarlo?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    // Actualizar el ciudadano existente
                    pacienteEncontrado.setNombre(nombre);
                    pacienteEncontrado.setApellido(apellido);
                    pacienteEncontrado.setEmail(email);
                    pacienteEncontrado.setCelular(celular);
                    pacienteEncontrado.setPatologia(patologia);
                    pacienteEncontrado.setOcupacion(ocupacion);
                    pacienteEncontrado.setEdad(Integer.parseInt(edad));
                    pacienteEncontrado.setResponsableLegal(responsableLegal);
                    pacienteEncontrado.setEstado(estadoPaciente);
                    
                    ciuData.modificarCiudadano(pacienteEncontrado);
                    limpiarCampos(IF_Paciente, LB_EstadoPaciente);
                    desbloquearCampos(false);
                }
            } else {
                
                // El DNI no existe, guardar un nuevo ciudadano
                Ciudadano citizen = new Ciudadano(Integer.parseInt(dni), nombre, apellido, email, celular, patologia, ocupacion, Integer.parseInt(edad), responsableLegal, estadoPaciente);
                ciuData.guardarCiudadano(citizen);
                JOptionPane.showMessageDialog(null, "Se ha guardado un paciente nuevo.");
                limpiarCampos(IF_Paciente, LB_EstadoPaciente);
                desbloquearCampos(false);
                }                

            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Error al guardar estos tipos de datos. Verificar.");
                System.out.println("Error: " + e);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Verifica los campos y que sean correctos.");
        }
    }//GEN-LAST:event_BTN_GuardarActualizarPacienteActionPerformed

    private void BTN_GuardarActualizarLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GuardarActualizarLabActionPerformed
        LaboratorioData labData = new LaboratorioData();

        String cuit = JT_CuitLab.getText();        
        String nombreLab = JT_NombreLab.getText();
        String emailLab = JT_EmailLab.getText();
        String paisLab = JT_PaisLab.getText();
        String domComercial = JT_DomComLab.getText();
        String telefonoLab = JT_TelefonoLab.getText();
                
        boolean esCuitValido = esCuitValido(cuit);
                
        List <JTextField> campos = new ArrayList<>();
        campos.add(JT_NombreLab);
        campos.add(JT_PaisLab);
        campos.add(JT_DomComLab);
        campos.add(JT_EmailLab);
                
        boolean camposAlfasValidos = validarCamposAlfabeticos(campos);
        
        List <JTextField> camposNum = new ArrayList<>();
        camposNum.add(JT_CuitLab);
        camposNum.add(JT_TelefonoLab);
                
        boolean camposNumericos = validarCamposNumericos(camposNum);
        
        if (esCuitValido && camposAlfasValidos && camposNumericos) {
            try {
                
                // Buscar ciudadano por DNI
                Laboratorio labEncontrado = labData.buscarLaboratorioPorCuit(Integer.parseInt(cuit));
            
                if (labEncontrado != null) {
                int opcion = JOptionPane.showConfirmDialog(null, "El Laboratorio ya existe. ¿Deseas actualizarlo?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    // Actualizar el laboratorio existente
                    labEncontrado.setNombreLab(nombreLab);
                    labEncontrado.setPais(paisLab);
                    labEncontrado.setMail(emailLab);
                    labEncontrado.setDomComercial(domComercial);
                    labEncontrado.setTelefono(telefonoLab);
                                        
                    labData.modificarLaboratorio(labEncontrado, Integer.parseInt(cuit));
                    limpiarCampos(IF_Laboratorio, LB_EstadoPaciente);
                    desbloquearCamposLabs(false);
                }
            } else {
                
                // El CUIT no existe, guardar un nuevo laboratorio
                Laboratorio lab = new Laboratorio(Integer.parseInt(cuit), nombreLab, paisLab, domComercial, emailLab, telefonoLab);
                labData.guardarLaboratorio(lab);
                JOptionPane.showMessageDialog(null, "Se ha guardado un laboratorio nuevo.");
                limpiarCampos(IF_Laboratorio, LB_EstadoPaciente);
                desbloquearCamposLabs(false);
                }                

            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Error al guardar estos tipos de datos. Verificar.");
                System.out.println("Error: " + e);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Verifica los campos y que sean correctos.");
        }
    }//GEN-LAST:event_BTN_GuardarActualizarLabActionPerformed

    private void BTN_NuevoLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NuevoLabActionPerformed
        Object[] options = {"Agregar Laboratorio", "Buscar Laboratorio"};
        int choice = JOptionPane.showOptionDialog(null,
                "¿Qué quieres hacer?",
                "Elegir una opción",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (choice == JOptionPane.YES_OPTION) { //Opción que permite cargar un nuevo laboratorio
            // Código para guardar
            BTN_BuscarLab.setVisible(false);
            desbloquearCamposLabs(true);            
            limpiarCampos(IF_Laboratorio, LB_EstadoPaciente);
        } else if (choice == JOptionPane.NO_OPTION) { //Opción que permite iniciar una búsqueda nueva de paciente            
            BTN_BuscarLab.setEnabled(true);
            desbloquearCamposLabs(false);
            BTN_BuscarLab.setVisible(true);          
            limpiarCampos(IF_Laboratorio, LB_EstadoPaciente);
        }
    }//GEN-LAST:event_BTN_NuevoLabActionPerformed

    private void BTN_BuscarLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BuscarLabActionPerformed
        desbloquearCamposLabs(true);
        LaboratorioData labData = new LaboratorioData();
        ArrayList<Laboratorio> labBuscado = new ArrayList<>();
        String cuitLab = JT_CuitLab.getText();
        boolean dniValido = esCuitValido(cuitLab);
        
        
        if (dniValido) {
            try {
                BTN_BuscarLab.setEnabled(false);
                int cuitLaboratorio = Integer.parseInt(cuitLab);
                labBuscado.add(labData.buscarLaboratorioPorCuit(cuitLaboratorio));

                // Verifico si se encontró un laboratorio antes de mostrar los datos
                //int cuit = labBuscado.get(0).getCuitLaboratorio();
                String nombreLab = labBuscado.get(0).getNombreLab();
                String pais = labBuscado.get(0).getPais();
                String domComercial = labBuscado.get(0).getDomComercial();
                String emailLab = labBuscado.get(0).getMail();
                String telefonoLab = labBuscado.get(0).getTelefono();
                
                

                // Muestra los datos en los campos de información
                JT_NombreLab.setText(nombreLab);
                JT_PaisLab.setText(pais);
                JT_DomComLab.setText(domComercial);
                JT_EmailLab.setText(emailLab);
                JT_TelefonoLab.setText(telefonoLab);
                           
//                if (RB_EstadoPaciente.isSelected()) {
//                    Color verde = new Color(0, 204, 0);
//                    LB_EstadoPaciente.setText("Paciente activo");
//                    LB_EstadoPaciente.setForeground(verde);
//                } else {
//                    Color rojo = new Color(210, 32, 32);
//                    LB_EstadoPaciente.setText("Paciente inactivo");
//                    LB_EstadoPaciente.setForeground(rojo);
//                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "El laboratorio no existe en las listas\nIntenta con otro CUIT");
                desbloquearCamposLabs(false);
                BTN_BuscarLab.setEnabled(true);
                JT_CuitLab.setText("");
            }

        } else {
            desbloquearCamposLabs(false);
        }
    }//GEN-LAST:event_BTN_BuscarLabActionPerformed

    private void BTN_NuevaVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NuevaVacunaActionPerformed
        Object[] options = {"Agregar Vacuna", "Buscar Vacuna"};
        int choice = JOptionPane.showOptionDialog(null,
                "¿Qué quieres hacer?",
                "Elegir una opción",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (choice == JOptionPane.YES_OPTION) { //Opción que permite cargar un nueva vacuna
            // Código para guardar una vacuna
            BTN_BuscarVacuna.setVisible(false);
            RB_EstadoVacuna.setVisible(false);
            
            desbloquearCamposVacuna(true);
            limpiarCampos(IF_Vacuna, LB_EstadoVacuna);
        } else if (choice == JOptionPane.NO_OPTION) { //Opción que permite iniciar una búsqueda nueva de vacuna            
            BTN_BuscarVacuna.setEnabled(true);
            desbloquearCamposVacuna(false);
            BTN_BuscarVacuna.setVisible(true);
            limpiarCampos(IF_Vacuna, LB_EstadoVacuna);
        }
    }//GEN-LAST:event_BTN_NuevaVacunaActionPerformed

    private void BTN_GuardarActualizarVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GuardarActualizarVacunaActionPerformed
                
        VacunaData vacuData = new VacunaData();

        String numSerieDosis = JT_SerieDosis.getText();
        String cuitLab = JT_CuitLabVacuna.getText();
        String nombreVacuna = JT_NomVacuna.getText();
        String marcaVacuna = JT_MarcaVacuna.getText();
        String medida = JT_Medida.getText();        
        String date = ((JTextField)JDC_VencimientoVacuna.getDateEditor().getUiComponent()).getText(); // capturo la fecha como String
        
        // Convertir Date a LocalDate puuufff!!
        LocalDate fechaVencimiento = LocalDate.parse(date);
        
        boolean esNDosisValido = esNumeroDosisValido(numSerieDosis);
        boolean cuitValido = esCuitValido(cuitLab);
        
        List <JTextField> campos = new ArrayList<>();
        campos.add(JT_NomVacuna);
        campos.add(JT_MarcaVacuna);        
        
        /*AGREGAR LA VALIDEZ DEL CAMPO LocalDate*/
        
        boolean camposAlfasValidos = validarCamposAlfabeticos(campos);
        
        List <JTextField> camposNum = new ArrayList<>();
        camposNum.add(JT_SerieDosis);
        camposNum.add(JT_CuitLabVacuna);
        camposNum.add(JT_Edad);
        
        boolean camposNumericos = validarCamposNumericos(camposNum);
        
        if (esNDosisValido && cuitValido && camposAlfasValidos && camposNumericos) {
            try {

                boolean estadoVacuna = RB_EstadoVacuna.isSelected(); //Verifico que el estado del radioButton según el estado de la vacuna
                // Buscar vacuna por NroSerieDosis
                Vacuna vacunaEncontrada = vacuData.obtenerVacuna(Integer.parseInt(numSerieDosis));
            
                if (vacunaEncontrada != null) {
                int opcion = JOptionPane.showConfirmDialog(null, "La vacuna ya existe. ¿Deseas actualizarla?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    // Actualizar la vacuna existente
                    //vacunaEncontrada.setCuitLaboratorio(Integer.parseInt(cuitLab)); //creo que este no debe actualizarse al igual que el nroSerieDosis
                    vacunaEncontrada.setNombreVacuna(nombreVacuna);
                    vacunaEncontrada.setMarca(marcaVacuna);
                    vacunaEncontrada.setMedida(Double.parseDouble(medida));
                    vacunaEncontrada.setVencimiento(fechaVencimiento);
                    vacunaEncontrada.setAplicacion(estadoVacuna);
                    
                    vacuData.modificarVacuna(vacunaEncontrada);
                    limpiarCampos(IF_Vacuna, LB_EstadoPaciente);
                    desbloquearCamposVacuna(false);
                }
            } else {
                int nroSerieDosis = Integer.parseInt(JT_SerieDosis.getText());
                double medidaDosis = Double.parseDouble(JT_Medida.getText());
                // El NroSerieDosis no existe, guardar una nueva vacuna
                Vacuna vacuna = new Vacuna(nroSerieDosis, ABORT, nombreVacuna, marcaVacuna, medidaDosis, fechaVencimiento, estadoVacuna);
                vacuData.guardarVacuna(vacuna);
                JOptionPane.showMessageDialog(null, "Se ha guardado una vacuna nueva.");
                limpiarCampos(IF_Vacuna, LB_EstadoPaciente);
                desbloquearCamposVacuna(false);
                }                

            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Error al guardar estos tipos de datos. Verificar.");
                System.out.println("Error: " + e);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Verifica los campos y que sean correctos.");
        }
        
    }//GEN-LAST:event_BTN_GuardarActualizarVacunaActionPerformed

    private void BTN_BuscarVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BuscarVacunaActionPerformed
        desbloquearCamposVacuna(true);
        VacunaData vacuData = new VacunaData();
        ArrayList<Vacuna> vacunaBuscada = new ArrayList<>();
        String nroDosis = JT_SerieDosis.getText();
        boolean nroSerieValido = esNumeroDosisValido(nroDosis);
        //String date = ((JTextField)JDC_VencimientoVacuna.getDateEditor().getUiComponent()).getText(); // capturo la fecha como String
        
        if (nroSerieValido) {
            try {
                BTN_BuscarVacuna.setEnabled(false);
                int numeroDosis = Integer.parseInt(nroDosis);
                vacunaBuscada.add(vacuData.obtenerVacuna(numeroDosis));

                // Verifico si se encontró una vacuna antes de mostrar los datos
                int cuitLab = vacunaBuscada.get(0).getCuitLaboratorio();
                String nombreVacuna = vacunaBuscada.get(0).getNombreVacuna();
                String marca = vacunaBuscada.get(0).getMarca();
                double medida = vacunaBuscada.get(0).getMedida();
                LocalDate vencimiento = vacunaBuscada.get(0).getVencimiento();
                
                boolean estado = vacunaBuscada.get(0).isAplicacion();

                String cuitString = String.valueOf(cuitLab);
                String medidaString = String.valueOf(medida);
                //String venciString = String.valueOf(vencimiento);
                
                //línea de código para transformar el dato LocalDate para cargarlo en el JCalendar
                java.util.Date utilDate = java.util.Date.from(vencimiento.atStartOfDay(ZoneId.systemDefault()).toInstant());
                
                // Muestra los datos en los campos de información
                JT_CuitLabVacuna.setText(cuitString);
                JT_NomVacuna.setText(nombreVacuna);
                JT_MarcaVacuna.setText(marca);
                JT_Medida.setText(medidaString);
                JDC_VencimientoVacuna.setDate(utilDate);
                
                RB_EstadoVacuna.setSelected(estado); // Establecemos el estado del RadioButton           
                if (RB_EstadoVacuna.isSelected()) {
                    Color verde = new Color(0, 204, 0);
                    LB_EstadoVacuna.setText("Vacuna activa");
                    LB_EstadoVacuna.setForeground(verde);
                } else {
                    Color rojo = new Color(210, 32, 32);
                    LB_EstadoVacuna.setText("Vacuna inactiva");
                    LB_EstadoVacuna.setForeground(rojo);
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "La Vacuna no existe en las listas\nIntenta con otro Número de Serie");
                desbloquearCamposVacuna(false);
                BTN_BuscarVacuna.setEnabled(true);
                JT_SerieDosis.setText("");
            }

        } else {
            desbloquearCamposVacuna(false);            
        }
    }//GEN-LAST:event_BTN_BuscarVacunaActionPerformed

    private void BTN_BuscarPaciente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BuscarPaciente3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_BuscarPaciente3ActionPerformed

    private void BTN_NuevoPaciente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NuevoPaciente3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_NuevoPaciente3ActionPerformed

    private void BTN_GuardarActualizarPaciente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GuardarActualizarPaciente3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_GuardarActualizarPaciente3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void limpiarCampos(JInternalFrame internalFrame, JLabel labelALimpiar) {
        if (internalFrame != null) {
            Component[] components = internalFrame.getContentPane().getComponents();
            for (Component component : components) {
                if (component instanceof JTextField) {
                    JTextField textField = (JTextField) component;
                    textField.setText("");
                } else if (component instanceof JRadioButton) {
                    JRadioButton radioButton = (JRadioButton) component;
                    radioButton.setSelected(false);
                } else if (component == labelALimpiar) {
                    if (labelALimpiar instanceof JLabel) {
                        JLabel label = (JLabel) labelALimpiar;
                        label.setText("");
                    }
                }
            }
        }
    }

    public static boolean esNumeroDNI(String str) {

        if (str == null || str.isEmpty()) { // Evalúa que no sea un campo vacío
            JOptionPane.showMessageDialog(null, "Campo DNI debe llenarse.");
            return false;
        }

        for (char c : str.toCharArray()) { // Evalúa que no contenga carácteres, uso un for each para eso
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(null, "Campo DNI debe contener solo números.");
                return false; // No es un número válido.
            }
        }

        try {
            int dni = Integer.parseInt(str); // Intenta convertir a entero.
            if (dni > 4000000 && dni < 999999999) {
                return true; // Es un número válido y está dentro del rango.
            } else {
                JOptionPane.showMessageDialog(null, "El campo DNI debe cumplir con un formato válido.");
                return false; // No está dentro del rango.
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo DNI debe ser un número válido.");
            return false; // No se pudo convertir a entero.
        }
    }
    
    public static boolean esNumeroDosisValido(String str) {

        if (str == null || str.isEmpty()) { // Evalúa que no sea un campo vacío
            JOptionPane.showMessageDialog(null, "Campo Nro Serie Dosis debe llenarse.");
            return false;
        }

        for (char c : str.toCharArray()) { // Evalúa que no contenga carácteres, uso un for each para eso
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(null, "Campo Nro Serie Dosis debe contener solo números.");
                return false; // No es un número válido.
            }
        }

        try {
            int dni = Integer.parseInt(str); // Intenta convertir a entero.
            if (dni > 10000 && dni < 999999999) {
                return true; // Es un número válido y está dentro del rango.
            } else {
                JOptionPane.showMessageDialog(null, "El campo Nro Serie Dosis debe cumplir con un formato válido.");
                return false; // No está dentro del rango.
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo Nro Serie Dosis debe ser un número válido.");
            return false; // No se pudo convertir a entero.
        }
    }
    
    public static boolean esCuitValido(String str) {

        if (str == null || str.isEmpty()) { // Evalúa que no sea un campo vacío
            JOptionPane.showMessageDialog(null, "Campo Cuit debe llenarse.");
            return false;
        }

        for (char c : str.toCharArray()) { // Evalúa que no contenga carácteres, uso un for each para eso
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(null, "Campo Cuit debe contener solo números.");
                return false; // No es un número válido.
            }
        }

        try {
            int dni = Integer.parseInt(str); // Intenta convertir a entero.
            if (dni > 10000000 && dni < 999999999) {
                return true; // Es un número válido y está dentro del rango.
            } else {
                JOptionPane.showMessageDialog(null, "El campo Cuit debe cumplir con un formato válido.");
                return false; // No está dentro del rango.
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo Cuit debe ser un número válido.");
            return false; // No se pudo convertir a entero.
        }
    }
    
    public static boolean esNumeroValido(String str) {

        if (str == null || str.isEmpty()) { // Evalúa que no sea un campo vacío            
            return false;
        }

        for (char c : str.toCharArray()) { // Evalúa que no contenga carácteres, uso un for each para eso
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(null, "Campo DNI y Edad debe contener solo números.");
                return false; // No es un número válido.
            }
        }

        try {
            int num = Integer.parseInt(str); // Intenta convertir a entero.
            return num > 0 && num < 150;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo Edad debe ser un valor acorde.");
            return false; // No se pudo convertir a entero.
        }
    }
    
    public boolean validarCamposAlfabeticos(List<JTextField> campos) {
        for (JTextField campo : campos) {
            String textoCampo = campo.getText().trim(); // Elimina espacios en blanco al principio y al final.

            if (!textoCampo.matches("^[a-zA-Z@-ZáéíóúÁÉÍÓÚüÜñÑ'-'.\\s]+$")) {
                JOptionPane.showMessageDialog(null, "El campo " + campo.getName() + " debe contener solo letras, el símbolo '@' o espacios.");
                return false;
            }
        }

        return true; // Todos los campos son válidos.
    }
    
    public boolean validarCamposNumericos(List<JTextField> campos) {
        for (JTextField campo : campos) {
            String textoCampo = campo.getText().trim(); // Elimina espacios en blanco al principio y al final.

            if (!textoCampo.matches("^[0-9]+$")) {
                JOptionPane.showMessageDialog(null, "El campo " + campo.getName() + " debe contener solo números.");
                return false;
            }
        }

        return true; // Todos los campos son válidos.
    }
    
    /*
    public String getCustomDisplayText() {
        return getCuitLaboratorio() + " - " + getNombreLab();
    }

    */
    
    private void cargarLabsComboBox(JComboBox combo) {
        LaboratorioData labData = new LaboratorioData();

        // Obtener la lista de laboratorios
        List<Laboratorio> listaLabs = labData.listarLaboratorios();

        combo.removeAllItems();

        // Agregar los elementos al JComboBox
        for (Laboratorio lab : listaLabs) {
            combo.addItem(lab.getCuitLaboratorio() + " - " + lab.getNombreLab());
        }
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        FlatCarbonIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VacunarGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_BuscarLab;
    private javax.swing.JButton BTN_BuscarPaciente;
    private javax.swing.JButton BTN_BuscarPaciente3;
    private javax.swing.JButton BTN_BuscarVacuna;
    private javax.swing.JButton BTN_GuardarActualizarLab;
    private javax.swing.JButton BTN_GuardarActualizarPaciente;
    private javax.swing.JButton BTN_GuardarActualizarPaciente3;
    private javax.swing.JButton BTN_GuardarActualizarVacuna;
    private javax.swing.JButton BTN_NuevaVacuna;
    private javax.swing.JButton BTN_NuevoLab;
    private javax.swing.JButton BTN_NuevoPaciente;
    private javax.swing.JButton BTN_NuevoPaciente3;
    private javax.swing.JInternalFrame IF_Admin;
    private javax.swing.JInternalFrame IF_Ayuda;
    private javax.swing.JInternalFrame IF_Consultas;
    private javax.swing.JInternalFrame IF_Laboratorio;
    private javax.swing.JInternalFrame IF_Paciente;
    private javax.swing.JInternalFrame IF_Vacuna;
    private javax.swing.JComboBox<String> JCB_CuitsLabs;
    private com.toedter.calendar.JDateChooser JDC_VencimientoVacuna;
    private javax.swing.JMenu JM_Admin;
    private javax.swing.JMenu JM_Ayuda;
    private javax.swing.JMenu JM_Consultas;
    private javax.swing.JMenu JM_Laboratorio;
    private javax.swing.JMenu JM_Paciente;
    private javax.swing.JMenu JM_Salir;
    private javax.swing.JMenu JM_Temas;
    private javax.swing.JMenu JM_Vacuna;
    private javax.swing.JTextField JT_Apellido;
    private javax.swing.JTextField JT_Apellido3;
    private javax.swing.JTextField JT_Celular;
    private javax.swing.JTextField JT_Celular5;
    private javax.swing.JTextField JT_Celular6;
    private javax.swing.JTextField JT_CuitLab;
    private javax.swing.JTextField JT_CuitLabVacuna;
    private javax.swing.JTextField JT_DNI;
    private javax.swing.JTextField JT_DomComLab;
    private javax.swing.JTextField JT_Edad;
    private javax.swing.JTextField JT_Edad3;
    private javax.swing.JTextField JT_Email;
    private javax.swing.JTextField JT_EmailLab;
    private javax.swing.JTextField JT_MarcaVacuna;
    private javax.swing.JTextField JT_Medida;
    private javax.swing.JTextField JT_NomVacuna;
    private javax.swing.JTextField JT_Nombre;
    private javax.swing.JTextField JT_NombreLab;
    private javax.swing.JTextField JT_Ocupacion;
    private javax.swing.JTextField JT_PaisLab;
    private javax.swing.JTextField JT_Patologia;
    private javax.swing.JTextField JT_ResponsableLegal;
    private javax.swing.JTextField JT_ResponsableLegal5;
    private javax.swing.JTextField JT_ResponsableLegal6;
    private javax.swing.JTextField JT_SerieDosis;
    private javax.swing.JTextField JT_TelefonoLab;
    private javax.swing.JLabel LB_EstadoPaciente;
    private javax.swing.JLabel LB_EstadoPaciente2;
    private javax.swing.JLabel LB_EstadoVacuna;
    private javax.swing.JMenuItem MI_Ayuda;
    private javax.swing.JMenuItem MI_Dia;
    private javax.swing.JMenuItem MI_Noche;
    private javax.swing.JMenuItem MI_Paciente;
    private javax.swing.JMenuItem MI_Salir;
    private javax.swing.JMenuItem MI_Turno;
    private javax.swing.JMenuItem MI_Turnos;
    private javax.swing.JMenuItem MI_Vac;
    private javax.swing.JMenuItem MI_lab;
    private javax.swing.JMenuBar MenuFlotante;
    private javax.swing.JRadioButton RB_EstadoPaciente;
    private javax.swing.JRadioButton RB_EstadoVacuna;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables

    private boolean activarBotonSiTextoIngresado(JButton button, List<JTextField> textFields) {
        
        final boolean[] todosLlenos = {true}; // Usamos un array de un solo elemento

        for (JTextField textField : textFields) {
            textField.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    checkTextLength();
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    checkTextLength();
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    checkTextLength();
                }

                private void checkTextLength() {
                    todosLlenos[0] = true; // Reiniciar el valor a verdadero

                    for (JTextField textField : textFields) {
                        if (textField.getText().isEmpty()) {
                            todosLlenos[0] = false;
                            break;
                        }
                    }

                    button.setEnabled(todosLlenos[0]);
                }
            });
        }

        return todosLlenos[0];
    }
        
}
