package Analizador;

import java.awt.Color;
import java.awt.Desktop;
import compilerTools.Directory;
import compilerTools.Functions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Lincode
 */
public class FrmAnalizador extends javax.swing.JFrame {
    private Directory directorio;
    
    public FrmAnalizador() {
        initComponents();
        setTitle("Proyecto Final - Compilador LyA II");
        setResizable(false);
        setLocationRelativeTo(null);
        Functions.setLineNumberOnJTextComponent(Resultado); //Añadimos NO. de lineas al Campo de Codigo de entrada
        directorio = new Directory(this, Resultado, "Proyecto Final", ".lincode");
        BotonLexico.setBackground(Color.yellow);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonLexico = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTextArea();
        BotonSintactico = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnalizarLex = new javax.swing.JTextArea();
        IMGTecnm1 = new javax.swing.JLabel();
        IMGTecCelaya = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Analisis = new javax.swing.JLabel();
        btnBorrarCodigo = new javax.swing.JButton();
        Salida1 = new javax.swing.JLabel();
        BotonSemantico = new javax.swing.JButton();
        Identificadores = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaTokens = new javax.swing.JTextArea();
        Menu = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        Nuevo = new javax.swing.JMenuItem();
        Abrir = new javax.swing.JMenuItem();
        Guardar = new javax.swing.JMenuItem();
        MenuArchivos = new javax.swing.JMenu();
        PDFLexico = new javax.swing.JMenuItem();
        PDFSintactico = new javax.swing.JMenuItem();
        PDFSemantico = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();
        ManualUsuario = new javax.swing.JMenuItem();
        Documentacion = new javax.swing.JMenuItem();
        About = new javax.swing.JMenu();
        Integrantes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonLexico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotonLexico.setText("Análisis Léxico");
        BotonLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLexicoActionPerformed(evt);
            }
        });

        Resultado.setColumns(20);
        Resultado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Resultado.setRows(5);
        jScrollPane1.setViewportView(Resultado);

        BotonSintactico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotonSintactico.setText("Análisis Sintático");
        BotonSintactico.setEnabled(false);
        BotonSintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSintacticoActionPerformed(evt);
            }
        });

        txtAnalizarLex.setColumns(20);
        txtAnalizarLex.setRows(5);
        jScrollPane2.setViewportView(txtAnalizarLex);

        IMGTecnm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/TecNM.png"))); // NOI18N

        IMGTecCelaya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/ITCelaya.png"))); // NOI18N

        Titulo.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        Titulo.setText("Lenguajes y Autómatas II");

        Analisis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Analisis.setText("Ejecución de Análisis");

        btnBorrarCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBorrarCodigo.setText("Borrar ");
        btnBorrarCodigo.setActionCommand("Borrar Código");
        btnBorrarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarCodigoActionPerformed(evt);
            }
        });

        Salida1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Salida1.setText("Salida:");

        BotonSemantico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotonSemantico.setText("Análisis Semántico");
        BotonSemantico.setEnabled(false);
        BotonSemantico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSemanticoActionPerformed(evt);
            }
        });

        Identificadores.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Identificadores.setText("Generación de Token´s");

        tablaTokens.setColumns(20);
        tablaTokens.setRows(5);
        jScrollPane3.setViewportView(tablaTokens);

        Archivo.setText("Archivo");

        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        Archivo.add(Nuevo);

        Abrir.setText("Abrir");
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirActionPerformed(evt);
            }
        });
        Archivo.add(Abrir);

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        Archivo.add(Guardar);

        Menu.add(Archivo);

        MenuArchivos.setText("Archivos de Análisis");

        PDFLexico.setText("Análisis Léxico");
        PDFLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDFLexicoActionPerformed(evt);
            }
        });
        MenuArchivos.add(PDFLexico);

        PDFSintactico.setText("Analisis Sintáctico");
        PDFSintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDFSintacticoActionPerformed(evt);
            }
        });
        MenuArchivos.add(PDFSintactico);

        PDFSemantico.setText("Analisis Semántico");
        PDFSemantico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDFSemanticoActionPerformed(evt);
            }
        });
        MenuArchivos.add(PDFSemantico);

        Menu.add(MenuArchivos);

        MenuAyuda.setText("Ayuda");

        ManualUsuario.setText("Manual de Usuario");
        ManualUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManualUsuarioActionPerformed(evt);
            }
        });
        MenuAyuda.add(ManualUsuario);

        Documentacion.setText("Ejemplos Programas");
        Documentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocumentacionActionPerformed(evt);
            }
        });
        MenuAyuda.add(Documentacion);

        Menu.add(MenuAyuda);

        About.setText("Acerca de");

        Integrantes.setText("Integrantes");
        Integrantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntegrantesActionPerformed(evt);
            }
        });
        About.add(Integrantes);

        Menu.add(About);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Salida1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(btnBorrarCodigo)))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Identificadores)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(IMGTecnm1)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(Analisis))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(BotonLexico)
                                .addGap(18, 18, 18)
                                .addComponent(BotonSintactico)))
                        .addGap(9, 9, 9)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonSemantico)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(Titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addComponent(IMGTecCelaya)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IMGTecnm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(Titulo)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(46, 46, 46)
                        .addComponent(Analisis)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(IMGTecCelaya)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonLexico, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonSintactico, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonSemantico, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnBorrarCodigo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Identificadores)
                        .addGap(21, 21, 21)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Salida1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private boolean verificarEstructura(String codigo) {
        // Expresión regular para verificar estructuras básicas de C/C++
        String patron = "\\b(if|else|for|while|do|switch|case)\\b.*\\{.*\\}";
        Pattern pattern = Pattern.compile(patron, Pattern.DOTALL);

        Matcher matcher = pattern.matcher(codigo);
        return matcher.find();
    }
    
    public static <T> T asignarTipoIncorrecto(Class<T> tipo) {
        if (tipo == Integer.class) {
            // Intento incorrecto de asignar un double a una variable de tipo int
           return tipo.cast(1.5);
        } else if (tipo == Double.class) {
            // Intento incorrecto de asignar un String a una variable de tipo double
            return tipo.cast("¡Esto debería ser un double!");
        } else if (tipo == String.class) {
            // Intento incorrecto de asignar un boolean a una variable de tipo String
            return tipo.cast(true);
        } else {
            // Otros tipos de datos pueden manejarse de manera similar según sea necesario
            throw new IllegalArgumentException("Tipo de dato no compatible");
        }
    }
    
    private void analizarLexico() throws IOException {
        int cont = 1;

        String expr = (String) Resultado.getText();
        Lexico lexicos = new Lexico(new StringReader(expr));
        String resultado = "";
        while (true) {
            Tokens token = lexicos.yylex();
            if (token == null) {
               txtAnalizarLex.setText(resultado);
                return;
            }
            switch (token) {
                case ERROR:
                    resultado += "Error 100  <Simbolo no definido>\n";
                    txtAnalizarLex.setForeground(Color.red);
                    BotonLexico.setBackground(Color.red);
                    break;
            }
        }
        
    }
    
    private void tablaTokens()throws IOException{
        int cont = 1;
        
        sym numero= new sym();
        String expr = (String) Resultado.getText();
        Lexico lexicos = new Lexico(new StringReader(expr));
        //String resultado = "NO. LINEA \t\tSIMBOLO\nLINEA " + cont + "\n";
        String resultado = "";
        while (true) {
            Tokens token = lexicos.yylex();
            if (token == null) {
               this.tablaTokens.setText(resultado);
                return;
            }
        switch (token) {
               case Linea:
                    cont++;
                    resultado +="\n";
                    break;
                case STRING_LITERAL:
                    resultado += sym.STRING_LITERAL+"\t"+"<Cadena>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Comillas:
                    resultado += sym.Comillas+"\t"+"<Comillas>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Comilla_simple:
                    resultado += sym.Comilla_simple+"\t"+"<Comilla simple>\t" + lexicos.lexemas + "\n";
                    break;
                case _String:
                    resultado +=sym._String+"\t"+ "<Tipo de dato String>\t" + lexicos.lexemas + "\n";
                    break;
                case If:
                    resultado += sym.If+"\t"+ "<Reservada if>\t" + lexicos.lexemas + "\n";
                    break;
                case Int:
                    resultado +=sym.Int+"\t"+"<Tipo de dato int>\t" + lexicos.lexemas + "\n";
                    break;
                case Double:
                    resultado +=sym.Double+"\t"+"<Tipo de dato double>\t" + lexicos.lexemas + "\n";
                    break;
                case Float:
                    resultado += sym.Float+"\t"+ "<Tipo de dato float>\t" + lexicos.lexemas + "\n";
                    break;
                case Bool:
                    resultado += sym.Bool+"\t"+ "<Tipo de dato bool>\t" + lexicos.lexemas + "\n";
                    break;
                case Byte:
                    resultado += sym.Byte+"\t"+"<Tipo de dato byte>\t" + lexicos.lexemas + "\n";
                    break;
                case Long:
                    resultado += sym.Long+"\t"+"<Tipo de dato long>\t" + lexicos.lexemas + "\n";
                    break;
                case Scanf:
                    resultado += sym.Scanf+"\t"+"<Reservado Scanf>\t" + lexicos.lexemas + "\n";
                    break;
                case Printf:
                    resultado +=sym.Printf+"\t"+ "<Reservado Printf>\t" + lexicos.lexemas + "\n";
                    break;
                case Short:
                    resultado += sym.Short+"\t"+"<Tipo de dato short>\t" + lexicos.lexemas + "\n";
                    break;
                case Char:
                    resultado +=sym.Char+"\t"+ "<Tipo de dato char>\t" + lexicos.lexemas + "\n";
                    break;
                case Incremento:
                    resultado +=sym.Incremento+"\t"+ "<Incremento>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Decremento:
                    resultado +=sym.Decremento+"\t"+ "<Decremento>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Else:
                    resultado +=sym.Else+"\t"+ "<Reservada else>\t" + lexicos.lexemas + "\n";
                    break;
                case Endl:
                    resultado +=sym.Endl+"\t"+ "<Salto de linea>\t" + lexicos.lexemas + "\n";
                    break;
                case Return:
                    resultado +=sym.Return+"\t"+"<Reservada return>\t" + lexicos.lexemas + "\n";
                    break;
                case Void:
                    resultado +=sym.Void+"\t"+"<Reservada switch>\t" + lexicos.lexemas + "\n";
                    break;
                case Typedef:
                    resultado +=sym.Typedef+"\t"+"<Reservada switch>\t" + lexicos.lexemas + "\n";
                    break;
                case Switch:
                    resultado +=sym.Switch+"\t"+"<Reservada switch>\t" + lexicos.lexemas + "\n";
                    break;
                case Do:
                    resultado +=sym.Do+"\t"+"<Reservada do>\t" + lexicos.lexemas + "\n";
                    break;
                case For:
                    resultado +=sym.For+"\t"+"<Reservada for>\t" + lexicos.lexemas + "\n";
                    break;
                case Igual:
                    resultado +=sym.Igual+"\t"+"<Operador igual>\t" + lexicos.lexemas + "\n";
                    break;
                case O_logico:
                    resultado +=sym.O_logico+"\t"+"<Operador o logico>\t" + lexicos.lexemas + "\n";
                    break;
                case BitOr:
                    resultado +=sym.BitOr+"\t"+"<Operador bitor>\t" + lexicos.lexemas + "\n";
                    break;
                case Y_logico:
                    resultado +=sym.Y_logico+"\t"+"<Operador y logico>\t" + lexicos.lexemas + "\n";
                    break;
                case BitAnd:
                    resultado +=sym.BitAnd+"\t"+"<Operador bitand>\t" + lexicos.lexemas + "\n";
                    break;

                case Suma:
                    resultado +=sym.Suma+"\t"+"<Operador suma>\t" + lexicos.lexemas + "\n";
                    break;
                case Resta:
                    resultado +=sym.Resta+"\t"+"<Operador resta>\t" + lexicos.lexemas + "\n";
                    break;
                case Multiplicacion:
                    resultado +=sym.Multiplicacion+"\t"+"<Operador multiplicacion>\t" + lexicos.lexemas + "\n";
                    break;
                case Division:
                    resultado +=sym.Division+"\t"+"<Operador division>\t" + lexicos.lexemas + "\n";
                    break;
                case ModuloIgual:
                    resultado +=sym.ModuloIgual+"\t"+"<Operador modulo igual>\t" + lexicos.lexemas + "\n";
                    break;
                case Modulo:
                    resultado +=sym.Modulo+"\t"+"<Operador modulo>\t" + lexicos.lexemas + "\n";
                    break;
                case Diferente:
                    resultado +=sym.Diferente+"\t"+"<Comparador diferente>\t" + lexicos.lexemas + "\n";
                    break;
                case Negador:
                    resultado += sym.Negador+"\t"+"<Operador de negacion>\t" + lexicos.lexemas + "\n";
                    break;
                case DobleMayor:
                    resultado +=sym.DobleMayor+"\t"+"<Doble mayor>\t" + lexicos.lexemas + "\n";
                    break;
                case DobleMenor:
                    resultado +=sym.DobleMenor+"\t"+"<Doble menor>\t" + lexicos.lexemas + "\n";
                    break;
                case MayorQue:
                    resultado +=sym.MayorQue+"\t"+"<Simbolo Mayor que>\t" + lexicos.lexemas + "\n";
                    break;
                case _System:
                        resultado +=sym._System+"\t"+"<System>\t" + lexicos.lexemas + "\n";
                    break;
                case MenorQue:
                    resultado +=sym.MenorQue+"\t"+"<Simbolo Menor que>\t" + lexicos.lexemas + "\n";
                    break;
                case MayorIgual:
                    resultado +=sym.MayorIgual+"\t"+"<Mayor igual>\t\t" + lexicos.lexemas + "\n";
                    break;
                case MenorIgual:
                    resultado +=sym.MenorIgual+"\t"+"<Menor igual>\t\t" + lexicos.lexemas + "\n";
                    break;
                case MasIgual:
                    resultado +=sym.MasIgual+"\t"+"<Mas igual>\t\t" + lexicos.lexemas + "\n";
                    break;
                case MenosIgual:
                    resultado +=sym.MenosIgual+"\t"+"<Menos igual>\t\t" + lexicos.lexemas + "\n";
                    break;
                case MultiplicacionIgual:
                    resultado +=sym.MultiplicacionIgual+"\t"+"<Multiplica igual>\t" + lexicos.lexemas + "\n";
                    break;
                case DivisionIgual:
                    resultado +=sym.DivisionIgual+"\t"+"<Division igual>\t" + lexicos.lexemas + "\n";
                    break;
                case Parent_a:
                    resultado +=sym.Parent_a+"\t"+"<Parentesis de apertura>\t" + lexicos.lexemas + "\n";
                    break;
                case Parent_c:
                    resultado +=sym.Parent_c+"\t"+"<Parentesis de cierre>\t" + lexicos.lexemas + "\n";
                    break;
                case Llave_a:
                    resultado +=sym.Llave_a+"\t"+"<Llave de apertura>\t" + lexicos.lexemas + "\n";
                    break;
                case Llave_c:
                    resultado +=sym.Llave_c+"\t"+"<Llave de cierre>\t" + lexicos.lexemas + "\n";
                    break;
                case Corchete_a:
                    resultado +=sym.Corchete_a+"\t"+"<Corchete de apertura>\t" + lexicos.lexemas + "\n";
                    break;
                case Corchete_c:
                    resultado +=sym.Corchete_c+"\t"+"<Corchete de cierre>\t" + lexicos.lexemas + "\n";
                    break;
                case Main:
                    resultado +=sym.Main+"\t"+"<Reservada main>\t" + lexicos.lexemas + "\n";
                    break;
                case While:
                    resultado +=sym.While+"\t"+"<Reservada while>\t" + lexicos.lexemas + "\n";
                    break;
                case Cin:
                    resultado +=sym.Cin+"\t"+"<Entrada por consola>\t" + lexicos.lexemas + "\n";
                    break;
                case Cout:
                    resultado +=sym.Cout+"\t"+"<Salida por consola>\t" + lexicos.lexemas + "\n";
                    break;
                case P_coma:
                    resultado +=sym.P_coma+"\t"+"<Punto y coma>\t" + lexicos.lexemas + "\n";
                    break;
                case Punto:
                    resultado +=sym.Punto+"\t"+"<Punto>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Coma:
                    resultado +=sym.Coma+"\t"+"<Coma>\t\t" + lexicos.lexemas + "\n";
                    break;
                case DosPuntos:
                    resultado +=sym.DosPuntos+"\t"+"<Dos puntos>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Include:
                    resultado +=sym.Include+"\t"+"<Reservado include>\t" + lexicos.lexemas + "\n";
                    break;
                case Std:
                    resultado +=sym.Std+"\t"+"<Reservado std>\t" + lexicos.lexemas + "\n";
                    break;
                case Namespace:
                    resultado +=sym.Namespace+"\t"+"<Reservado namespace>\t" + lexicos.lexemas + "\n";
                    break;
                case Case:
                    resultado +=sym.Case+"\t"+"<Reservado case>\t" + lexicos.lexemas + "\n";
                    break;
                case Continue:
                    resultado +=sym.Continue+"\t"+"<Reservado continue>\t" + lexicos.lexemas + "\n";
                    break;
                case Break:
                    resultado +=sym.Break+"\t"+"<Reservado break>\t" + lexicos.lexemas + "\n";
                    break;
                case Iostream:
                    resultado +=sym.Iostream+"\t"+"<Reservado iostream>\t" + lexicos.lexemas + "\n";
                    break;
                case Using:
                    resultado +=sym.Using+"\t"+"<Reservado using>\t" + lexicos.lexemas + "\n";
                    break;
                case Const:
                    resultado +=sym.Const+"\t"+"<Reservado using>\t" + lexicos.lexemas + "\n";
                    break;
                case Default:
                    resultado +=sym.Default+"\t"+"<Reservado default>\t" + lexicos.lexemas + "\n";
                    break;
                case Define:
                    resultado +=sym.Define+"\t"+"<Reservado define>\t" + lexicos.lexemas + "\n";
                    break;
                case Unsigned:
                    resultado +=sym.Unsigned+"\t"+"<Reservado unsigned>\t" + lexicos.lexemas + "\n";
                    break;
                case Register:
                    resultado +=sym.Register+"\t"+"<Reservado register>\t" + lexicos.lexemas + "\n";
                    break;
                case Struct:
                    resultado +=sym.Struct+"\t"+"<Reservado struct>\t" + lexicos.lexemas + "\n";
                    break;
                case Numeral:
                    resultado +=sym.Numeral+"\t"+"<Reservado numeral>\t" + lexicos.lexemas + "\n";
                    break;
                case Identificador:
                    resultado +=sym.Identificador+"\t"+"<Identificador>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Numero:
                    resultado += sym.Numero+"\t"+"<Numero>\t\t" + lexicos.lexemas + "\n";
                    break;
                default:
                    resultado += "  < " + lexicos.lexemas + " >\n";
                    break;
            }
        }
    }

    private void BotonLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLexicoActionPerformed
        try {
            analizarLexico();
            tablaTokens();
        } catch (IOException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (txtAnalizarLex.getText().equals("")) {
            BotonSintactico.setBackground(Color.yellow);
            BotonSintactico.setEnabled(true);
            txtAnalizarLex.setText("Analisis Léxico realizado correctamente");
            txtAnalizarLex.setForeground(new Color(25, 111, 61));
            BotonLexico.setBackground(Color.green);
        } else {
            BotonSintactico.setEnabled(false);
        }
    }//GEN-LAST:event_BotonLexicoActionPerformed

    private void BotonSintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSintacticoActionPerformed
        String codigo = Resultado.getText();
        String ST = Resultado.getText();
        Sintaxis s = new Sintaxis(new Analizador.LexicoCup(new StringReader(ST)));

        try {
            s.parse();
            BotonSemantico.setEnabled(true);
            txtAnalizarLex.setText("Analisis Sintáctico realizado correctamente");
            txtAnalizarLex.setForeground(new Color(25, 111, 61));
            BotonSintactico.setBackground(Color.green);
        } catch (Exception ex) {
            Symbol sym = s.getS();
            BotonSemantico.setEnabled(false);
            txtAnalizarLex.setText("Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            txtAnalizarLex.setForeground(Color.red);
            BotonSintactico.setBackground(Color.red);
        }
    }//GEN-LAST:event_BotonSintacticoActionPerformed

    private void btnBorrarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarCodigoActionPerformed
        // TODO add your handling code here:
        Resultado.setText(null);
        tablaTokens.setText("");
        txtAnalizarLex.setText("");
        BotonSintactico.setEnabled(false);
        BotonSemantico.setEnabled(false);
        BotonLexico.setBackground(Color.yellow);
    }//GEN-LAST:event_btnBorrarCodigoActionPerformed

    private void BotonSemanticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSemanticoActionPerformed
        // TODO add your handling code here:
        //String codigo = Resultado.getText();
        try {
            asignarTipoIncorrecto(Integer.class);
            // Si no se lanza una excepción, la asignación fue exitosa
            txtAnalizarLex.setText("Analisis Semantico realizado correctamente");
            txtAnalizarLex.setForeground(new Color(25, 111, 61));
            BotonSemantico.setBackground(Color.green);
        } catch (ClassCastException ex) {
            // Capturar la excepción y mostrar un mensaje de error
            txtAnalizarLex.setText("Error de asignación de tipo de dato");
            txtAnalizarLex.setForeground(Color.red);
            BotonSemantico.setBackground(Color.red);
        } catch (IllegalArgumentException ex) {
            // Capturar la excepción y mostrar un mensaje de error
            txtAnalizarLex.setText("Error de asignación de tipo de dato");
            txtAnalizarLex.setForeground(Color.red);
            BotonSemantico.setBackground(Color.red);
        }
    }//GEN-LAST:event_BotonSemanticoActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        // TODO add your handling code here:
        directorio.New();
        //limpiar();
    }//GEN-LAST:event_NuevoActionPerformed

    private void AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirActionPerformed
        // TODO add your handling code here:
        if(directorio.Open()){
            BotonLexico.setEnabled(true);
        }
    }//GEN-LAST:event_AbrirActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        if(directorio.Save()){
            BotonLexico.setEnabled(true);
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void PDFLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFLexicoActionPerformed
        //        Clase Desktop es capaz de abrir e imprimir cualquier tipo de fichero con la aplicación
        //        que haya sido definida por defecto en el SO para ese tipo de fichero.
        try {
            File path = new File ("src/assets/pdf/analisis lexico.pdf");
            Desktop.getDesktop().open(path);
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_PDFLexicoActionPerformed

    private void PDFSintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFSintacticoActionPerformed
        try {
            File path = new File("src/assets/pdf/analisis sintactico.pdf");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_PDFSintacticoActionPerformed

    private void PDFSemanticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFSemanticoActionPerformed
        try {
            File path = new File("src/assets/pdf/analisis semantico.pdf");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_PDFSemanticoActionPerformed

    private void ManualUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManualUsuarioActionPerformed
        try {
            File path = new File("");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ManualUsuarioActionPerformed

    private void DocumentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocumentacionActionPerformed
        try {
            File path = new File("");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_DocumentacionActionPerformed

    private void IntegrantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntegrantesActionPerformed
        Integrantes aux= new Integrantes();
        aux.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IntegrantesActionPerformed

    public static void main(String args[]) throws Exception {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAnalizador().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu About;
    private javax.swing.JMenuItem Abrir;
    private javax.swing.JLabel Analisis;
    private javax.swing.JMenu Archivo;
    private javax.swing.JButton BotonLexico;
    private javax.swing.JButton BotonSemantico;
    private javax.swing.JButton BotonSintactico;
    private javax.swing.JMenuItem Documentacion;
    private javax.swing.JMenuItem Guardar;
    private javax.swing.JLabel IMGTecCelaya;
    private javax.swing.JLabel IMGTecnm1;
    private javax.swing.JLabel Identificadores;
    private javax.swing.JMenuItem Integrantes;
    private javax.swing.JMenuItem ManualUsuario;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu MenuArchivos;
    private javax.swing.JMenu MenuAyuda;
    private javax.swing.JMenuItem Nuevo;
    private javax.swing.JMenuItem PDFLexico;
    private javax.swing.JMenuItem PDFSemantico;
    private javax.swing.JMenuItem PDFSintactico;
    private javax.swing.JTextArea Resultado;
    private javax.swing.JLabel Salida1;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnBorrarCodigo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea tablaTokens;
    private javax.swing.JTextArea txtAnalizarLex;
    // End of variables declaration//GEN-END:variables
}
