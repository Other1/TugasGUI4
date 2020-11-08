/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Another
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button btHapus;
    @FXML
    private Button btTandaplusminus;
    @FXML
    private Button btNol;
    @FXML
    private Button btKoma;
    @FXML
    private Button btEqual;
    @FXML
    private Button btSatu;
    @FXML
    private Button btDua;
    @FXML
    private Button btTiga;
    @FXML
    private Button btPertambahan;
    @FXML
    private Button btEmpat;
    @FXML
    private Button btLima;
    @FXML
    private Button btEnam;
    @FXML
    private Button btPengurangan;
    @FXML
    private Button btTujuh;
    @FXML
    private Button btDelapan;
    @FXML
    private Button btSembilan;
    @FXML
    private Button btPerkalian;
    @FXML
    private Button btClear;
    @FXML
    private Button btPembagian;
    @FXML
    private TextField display;
    
    private int angka1=0;
    private int angka2=0;
    private int hasil;
    private String operasi="netral";

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btclick(ActionEvent event) {
        if(event.getSource()== btNol){
            if(!display.getText().isBlank()){
                display.setText(display.getText()+"0");
            }
        }
        if(event.getSource()== btSatu){
            display.setText(display.getText()+"1");
        }else if(event.getSource()== btDua){
            display.setText(display.getText()+"2");
        }else if(event.getSource()== btTiga){
            display.setText(display.getText()+"3");
        }else if(event.getSource()== btEmpat){
            display.setText(display.getText()+"4");
        }else if(event.getSource()== btLima){
            display.setText(display.getText()+"5");
        }else if(event.getSource()== btEnam){
            display.setText(display.getText()+"6");
        }else if(event.getSource()== btTujuh){
            display.setText(display.getText()+"7");
        }else if(event.getSource()== btDelapan){
            display.setText(display.getText()+"8");
        }else if(event.getSource()== btSembilan){
            display.setText(display.getText()+"9");
        }else if(event.getSource()== btKoma){
            display.setText(display.getText()+",");
        }else if(event.getSource()== btClear){
            display.setText("");
        }else if(event.getSource()== btPertambahan){
            angka1 = Integer.parseInt(display.getText());
            operasi = "Tambah";
            display.setText("");
        }else if(event.getSource()== btPengurangan){
            angka1 = Integer.parseInt(display.getText());
            operasi = "Kurang";
            display.setText("");
        }else if(event.getSource()== btPembagian){
            angka1 = Integer.parseInt(display.getText());
            operasi = "Bagi";
            display.setText("");
        }else if(event.getSource()== btPerkalian){
            angka1 = Integer.parseInt(display.getText());
            operasi = "Kali";
            display.setText("");
        }else if(event.getSource()== btEqual){
            angka2 = Integer.parseInt(display.getText());
            if(operasi.equals("Tambah")){
                hasil = angka1 + angka2;
            }
            if(operasi.equals("Kurang")){
                hasil = angka1 - angka2;
            }
            if(operasi.equals("Kali")){
                hasil = angka1 * angka2;
            }
            if(operasi.equals("Bagi")){
                hasil = angka1 / angka2;
            }
            display.setText(String.valueOf(hasil));
            operasi="netral";
        }
    }
    
}
