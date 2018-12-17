package edu.alifhermawan.latihanmvc.controller;

import edu.alifhermawan.latihanmvc.model.PelangganModel;
import edu.alifhermawan.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 *
 * Nama       : Alif Hermawan
 * NIM        : 10117045
 * Kelas      : IF 2
 * Keterangan : Latihan MVC
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    
    
    public void resetForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelp().getText();
        
        if (nama.equals("")&& email.equals("")&& noTlp.equals("")){
            
        } else {
            
            model.resetForm();
        }
        
    }
    
    public void simpanForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelp().getText();
        
        if (nama.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
            
        }else if(email.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");

        }else if(noTlp.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Nomer Telepon Masih Kosong");
            
        }else{
            model.simpanForm();
        }
        
        
    }
    
}
