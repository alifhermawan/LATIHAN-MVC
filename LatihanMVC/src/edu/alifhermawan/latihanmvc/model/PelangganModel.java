package edu.alifhermawan.latihanmvc.model;

import edu.alifhermawan.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *
 *
 * Nama       : Alif Hermawan
 * NIM        : 10117045
 * Kelas      : IF 2
 * Keterangan : Latihan MVC
 */
public class PelangganModel {
    
    private String nama;
    private String email;
    private String noTelp;
    
    
    private PelangganListener pelangganListener;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }
    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        fireOnChange();
    }
    
    protected void fireOnChange(){
        
        if (pelangganListener!=null){
            pelangganListener.onChange(this);
            
        }
    }
    
    public void resetForm(){
        setNama("");
        setEmail("");
        setNoTelp("");
        
    }
    
    public void simpanForm(){
        
        JOptionPane.showMessageDialog(null, "Behasil Disimpan");
        resetForm();
        
        
    }
    
    
}
