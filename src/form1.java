import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    public JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton ingresarBtn;
    private JLabel lblEdad;
    private JLabel lblCiudad;
    private JLabel lblNombre;
    private JButton mostrarButton;
    private JButton limpiarDatosButton;


    public form1() {
        ingresarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            mascotas mascotas = new mascotas();
            mascotas.setNombre(textField1.getText());
            mascotas.setRaza(textField2.getText());
            mascotas.setNum_patas(Integer.parseInt(textField3.getText()));

            mascotas.mostrarMascotas();
            }


        });
        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mascotas mascotas = new mascotas();
                mascotas.mostrarMascotas();
                System.out.println("Holaa ");
                System.out.println("Nombre: " + textField1.getText() + "Ciudad: " + textField2.getText() + "Edad: " + textField3.getText());


            }
        });
        limpiarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
            }
        });
    }

    private void createUIComponents() {
        //TODO: place custom
    }
}
