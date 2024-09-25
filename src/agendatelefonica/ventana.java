
package agendatelefonica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
    import javax.swing.JFrame; 

import javax.swing.JLabel; 
import javax.swing.JOptionPane;

import javax.swing.JPanel; 

import javax.swing.JTextField; 


public class ventana extends JFrame{ 
     contactos arreglo[] = new contactos[15]; 

  JPanel panelInicio = new JPanel();   

   JTextField txtTexto1 = new JTextField();  

    JTextField txtTexto2 = new JTextField();  

    JTextField txtTexto3 = new JTextField(); 

  public ventana(){  

        this.setVisible(true);  

        this.setLocationRelativeTo(null);  

    

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);  

  } 

        public void insertarPanel(){ 

        

        this.getContentPane().add(panelInicio);  

      

        panelInicio.setLayout(null);  

    } 

         

     

public void insertarEtiquetas(){ 

        JLabel texto1 = new JLabel("Telefóno");  

        texto1.setBounds(20, 10, 200, 15);  

        panelInicio.add(texto1);  

        JLabel texto2 = new JLabel("Nombre"); 

        texto2.setBounds(20, 60, 200, 15);  

        panelInicio.add(texto2);  

          JLabel texto3 = new JLabel("Correo"); 

        texto3.setBounds(20, 110, 200, 15);  

        panelInicio.add(texto3);  

}     

    public void insertarTexto(){ 

         

        txtTexto1.setBounds(80, 10, 150, 25);  

        panelInicio.add(txtTexto1);  

        txtTexto1.repaint();  

         

         

        txtTexto2.setBounds(80, 60, 150, 25);  

        panelInicio.add(txtTexto2);  

        txtTexto2.repaint();  

         

         

        txtTexto3.setBounds(80, 110, 150, 25);  

        panelInicio.add(txtTexto3);  

        txtTexto3.repaint();  

    }  

     public void insertarBotones() { 
          JButton btng = new JButton("Guardar");
        btng.setBounds(260, 10, 95, 50);
        panelInicio.add(btng);
        btng.repaint();
        
        ActionListener agregarg = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtTexto1.getText() + "Guardar";
                txtTexto1.setText(union);
            }
        };
        btng.addActionListener(agregarg); 
        
        
         JButton btnb = new JButton("Buscar");
        btnb.setBounds(380, 10, 95, 50);
        panelInicio.add(btnb);
        btnb.repaint();
        
        ActionListener agregarb = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtTexto1.getText() + "Buscar";
                txtTexto1.setText(union);
            }
        };
        btnb.addActionListener(agregarb); 
        
          JButton btna = new JButton("Actualizar");
        btna.setBounds(260, 85, 95, 50);
        panelInicio.add(btna);
        btna.repaint();
        
        ActionListener agregara = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtTexto1.getText() + "Actualizar";
                txtTexto1.setText(union);
            }
        };
        btna.addActionListener(agregara); 
        
         JButton btne = new JButton("Eliminar");
        btne.setBounds(380, 85, 95, 50);
        panelInicio.add(btne);
        btne.repaint();
        
        ActionListener agregare = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = txtTexto1.getText() + "Eliminar";
                txtTexto1.setText(union);
            }
        };
        btne.addActionListener(agregare); 
        
     } 
}

