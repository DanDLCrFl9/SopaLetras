
import java.awt.Color;
import java.util.Random;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dany2
 */
public class SopaLetras extends javax.swing.JFrame {

    JLabel letra[][];
    JLabel palabra[];
    boolean gano;
    boolean direccion[];
    boolean direccion2[];
    int inicioejex[],inicioejey[], random1;
    
    
    public SopaLetras() {
        initComponents();
        palabra= new JLabel[]{p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14};
        this.setLocationRelativeTo(null);
        iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        p1 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        p6 = new javax.swing.JLabel();
        p7 = new javax.swing.JLabel();
        p8 = new javax.swing.JLabel();
        p9 = new javax.swing.JLabel();
        p10 = new javax.swing.JLabel();
        p11 = new javax.swing.JLabel();
        p12 = new javax.swing.JLabel();
        p13 = new javax.swing.JLabel();
        p14 = new javax.swing.JLabel();
        Contenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        p1.setBackground(new java.awt.Color(102, 255, 0));
        p1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1.setText("GUANAJUATO");

        p3.setBackground(new java.awt.Color(153, 255, 0));
        p3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3.setText("CDMX");

        p2.setBackground(new java.awt.Color(153, 255, 0));
        p2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2.setText("SINALOA");

        p4.setBackground(new java.awt.Color(153, 255, 0));
        p4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4.setText("CHIAPAS");

        p5.setBackground(new java.awt.Color(153, 255, 0));
        p5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5.setText("NAYARIT");

        p6.setBackground(new java.awt.Color(153, 255, 0));
        p6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p6.setText("DURANGO");

        p7.setBackground(new java.awt.Color(153, 255, 0));
        p7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7.setText("TLAXCALA");

        p8.setBackground(new java.awt.Color(153, 255, 0));
        p8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p8.setText("QUERETARO");

        p9.setBackground(new java.awt.Color(153, 255, 0));
        p9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p9.setText("HIDALGO");

        p10.setBackground(new java.awt.Color(102, 255, 0));
        p10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p10.setText("COAHUILA");

        p11.setBackground(new java.awt.Color(153, 255, 0));
        p11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p11.setText("GUERRERO");

        p12.setBackground(new java.awt.Color(153, 255, 0));
        p12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p12.setText("VERACRUZ");

        p13.setBackground(new java.awt.Color(153, 255, 0));
        p13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p13.setText("GUADALAJARA");

        p14.setBackground(new java.awt.Color(153, 255, 0));
        p14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p14.setText("YUCATAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p9, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
            .addComponent(p10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p14)
                .addGap(21, 21, 21))
        );

        Contenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Contenedor.setLayout(new java.awt.GridLayout(15, 15));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("Estados");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setText("SOPA DE LETRAS");

        jMenu1.setText("REINICIAR");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31))))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel2)
                .addGap(0, 274, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void iniciar(){
        gano = false;
        inicioejex= new int[15];
        inicioejey= new int[15];
        direccion= new boolean[14];
        direccion2= new boolean[14];
        celdas_letras();
        poner_palabras_horizontales();
        poner_palabras_verticales();
        //rellenar();
    }
    
    public void celdas_letras() {
        letra=new JLabel[15][15];//crea la matriz de celdas donde va cada letra
        for (int i = 0; i < 15; i++) 
        {
            for (int j = 0; j < 15; j++) {
                letra[i][j]=new JLabel("", javax.swing.SwingConstants.CENTER);
                letra[i][j].setName("");//le pone un nombre a la casilla en este caso no le pone ninguno
                letra[i][j].setBackground(Color.WHITE);//coloca la casilla de color blanco
                letra[i][j].setFont(new java.awt.Font("Arial", 1, 14));
                letra[i][j].setForeground(new java.awt.Color(0, 5, 2));
                letra[i][j].setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                letra[i][j].setOpaque(true);
                letra[i][j].setBorder(new javax.swing.border.LineBorder(Color.BLACK, 1));
                letra[i][j].addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        darClic(evt);//llama al metodo que debe ejecutarse cuando se da clic
                    }
                });
                Contenedor.add(letra[i][j]);
            }
        }
    }
    public void darClic(java.awt.event.MouseEvent evt) {
        if (!gano) {//verifica si gano el juego
            if (evt.getComponent().getBackground().equals(Color.WHITE))//verifica si la casilla esta de color blanco 
            {
                evt.getComponent().setBackground(new java.awt.Color(255, 255, 0));//cambiar a amarilla
                //tachar();
            }else if(evt.getComponent().getName().equals(""))//pregunta si la casilla no tiene una letra de alguna palabra
            {
                evt.getComponent().setBackground(Color.WHITE);//color blanco
            }
        }
    }
    public void poner_palabras_horizontales(){
        String palabra[]={p1.getText(),p2.getText(),p3.getText(),p4.getText(),p5.getText(),p6.getText(),p7.getText()};
        Random random=new Random();//estemetodo ayuda a crear numeros aleatorios
        int iniciax=0;//posicion x donde inicia la palabra
        int iniciay;//posicion y donde inicia la palabra
        int unico[]=NumerosSinRepeticiones(14);//evita que en una fila se generen mas de una vez
        int unico2[]=NumerosSinRepeticiones2(14);
        inicioejex=unico;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].length()<15) {
                iniciax=unico[i];
                //iniciax=(int)(random.nextDouble()*15-1);
                //iniciay=(int)(random.nextDouble()*15-1);
                iniciay=unico2[i];
                int poner=0;
                if (iniciay+palabra[i].length()<15) {
                    
                    for (int j = iniciay; j < iniciay+palabra[i].length(); j++) {
                        letra[iniciax][j].setText(palabra[i].substring(poner, poner+1));
                        letra[iniciax][j].setName("1");//pone el nombre a la casilla para que se sepa que hay va una letra de una palabra
                        poner++;
                        inicioejey[i]=iniciay;
                        direccion[i]=true;
                    }
                }           
                else if (iniciay-palabra[i].length()>0)
                {
                        for (int j = iniciay; j >iniciay-palabra[i].length() ; j--) {
                            letra[iniciax][j].setText(palabra[i].substring(poner, poner+1));
                            letra[iniciax][j].setName("1");
                            poner++;
                            inicioejey[i]=iniciay;
                            direccion[i]=false;
                        }
                }
            }
        }
    }
    public void poner_palabras_verticales(){
        String palabra[]={p8.getText(),p9.getText(),p10.getText(),p11.getText(),p12.getText(),p13.getText(),p14.getText()};
        Random random=new Random();//estemetodo ayuda a crear numeros aleatorios
        int iniciax;//posicion x donde inicia la palabra
        int iniciay=0;//posicion y donde inicia la palabra
        int unico[]=NumerosSinRepeticiones(15);//evita que en una fila se generen mas de una vez
        int unico2[]=NumerosSinRepeticiones2(14);
        inicioejex=unico;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].length()<15) {
                iniciay=unico[i];
                //iniciax=(int)(random.nextDouble()*15-1);
                iniciax=unico2[i];
                int poner=0;
                if (iniciax +palabra[i].length()<15) {
                    
                    for (int j = iniciax; j < iniciax+palabra[i].length(); j++) {
                        letra[j][iniciay].setText(palabra[i].substring(poner, poner+1));
                        letra[j][iniciay].setName("1");//pone el nombre a la casilla para que se sepa que hay va una letra de una palabra
                        poner++;
                        inicioejey[i]=iniciax;
                        direccion[i]=true;
                    }
            }           
            else if (iniciax-palabra[i].length()>0)
                {
                        for (int j = iniciax; j >iniciax-palabra[i].length() ; j--) {
                            letra[j][iniciay].setText(palabra[i].substring(poner, poner+1));
                            letra[j][iniciay].setName("1");
                            poner++;
                            inicioejey[i]=iniciax;
                            direccion[i]=false;
                        }
            }
        }
    }
    }
    //checar
    public int[] NumerosSinRepeticiones(int repeticiones) {
        int numeros[]=new int[repeticiones];
        for(int i=0; i<repeticiones; i++){
            numeros[i]=i;
        }
        return numeros;
    }
    public int[] NumerosSinRepeticiones2(int repeticiones) {
        int numeros2[]= new int[repeticiones];
        for(int i=0; i<repeticiones; i++){
            
            numeros2[i]= (int) (Math.random()*14 + 1 );
        }
        return numeros2;
    }
//    public void rellenar() 
//    {
//        //este arreglo ayuda a poner las letras del avecedario
//        String abc[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
//        Random random=new Random();
//        for (int i = 0; i < 15; i++) {
//            for (int j = 0; j < 15; j++) {
//                if (letra[i][j].getText().equals("")) {//si la casilla esta vacia pongale una letra del arreglo abc
//                    letra[i][j].setText(abc[(int)(random.nextDouble()*abc.length-1)]);//aqui pone la letra
//                }
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SopaLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SopaLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SopaLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SopaLetras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SopaLetras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p10;
    private javax.swing.JLabel p11;
    private javax.swing.JLabel p12;
    private javax.swing.JLabel p13;
    private javax.swing.JLabel p14;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel p6;
    private javax.swing.JLabel p7;
    private javax.swing.JLabel p8;
    private javax.swing.JLabel p9;
    // End of variables declaration//GEN-END:variables
}
