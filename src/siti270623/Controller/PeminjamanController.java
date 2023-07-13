/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siti270623.Controller;

import siti270623.View.FormPeminjaman;
import siti270623.Peminjaman;
import siti270623.PeminjamanDao;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author windows
 */
public class PeminjamanController {
   
    private FormPeminjaman formPeminjaman;
    private Peminjaman Peminjaman;
    private PeminjamanDao peminjamanDao;
    
    public PeminjamanController(FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        peminjamanDao = new PeminjamanDao();
        
    }
    public void clearForm(){
        formPeminjaman.gettxtkodeanggota().setText("");
        formPeminjaman.gettxtnamaanggota().setText("");
        formPeminjaman.gettxtkodebuku().setText("");
        formPeminjaman.gettxtjudulbuku().setText("");
        formPeminjaman.gettxttanggalpinjam().setText("");
        formPeminjaman.gettxttanggalkembali().setText("");
       
      
        
    }
    public void tampil(){
       DefaultTableModel tabelModel = (DefaultTableModel) 
               formPeminjaman.gettabelpinjam().getModel();
       tabelModel.setRowCount(0);
       List<Peminjaman> list =peminjamanDao.getAll();
       for (Peminjaman a : list){
        Object [] row ={
            a.getKodeAnggota(),
            a.getNamaAnggota(),
            a.getKodeBuku(),
            a.getJudulBuku(),
            a.getTanggalPinjam(),
            a.getTanggalKembali(),
            
        };
        tabelModel.addRow(row);
        
    }
       
           
    }
    public void savePeminjaman(){
        Peminjaman = new Peminjaman();
        Peminjaman.setKodeAnggota(formPeminjaman.gettxtkodeanggota().getText());
        Peminjaman.setNamaAnggota(formPeminjaman.gettxtnamaanggota().getText());
        Peminjaman.setKodeBuku(formPeminjaman.gettxtkodebuku().getText());
        Peminjaman.setJudulBuku(formPeminjaman.gettxtjudulbuku().getText());
        Peminjaman.setTanggalPinjam(formPeminjaman.gettxttanggalpinjam().getText());
        Peminjaman.setTanggalKembali(formPeminjaman.gettxttanggalkembali().getText());
       
        peminjamanDao.insert(Peminjaman);
        JOptionPane.showMessageDialog(formPeminjaman,"insert OK");
        
    }
    
    public void updatePeminjaman(){
        int index = formPeminjaman.gettabelpinjam().getSelectedRow();
        Peminjaman = peminjamanDao.getPeminjaman(index);
        Peminjaman.setKodeAnggota(formPeminjaman.gettxtkodeanggota().getText());
        Peminjaman.setNamaAnggota(formPeminjaman.gettxtnamaanggota().getText());
        Peminjaman.setKodeBuku(formPeminjaman.gettxtkodebuku().getText());
        Peminjaman.setJudulBuku(formPeminjaman.gettxtjudulbuku().getText());
        Peminjaman.setTanggalPinjam(formPeminjaman.gettxttanggalpinjam().getText());
        Peminjaman.setTanggalKembali(formPeminjaman.gettxttanggalkembali().getText());
        peminjamanDao.update(index, Peminjaman);
        JOptionPane.showMessageDialog(formPeminjaman,"Update OK");
    }
    
    public void getPeminjaman(){
        int index = formPeminjaman.gettabelpinjam().getSelectedRow();
        Peminjaman = peminjamanDao.getPeminjaman(index);
        if(Peminjaman!=null){
            formPeminjaman.gettxtkodeanggota().setText(Peminjaman.getKodeAnggota());
            formPeminjaman.gettxtnamaanggota().setText(Peminjaman.getNamaAnggota());
            formPeminjaman.gettxtkodebuku().setText(Peminjaman.getKodeBuku());
            formPeminjaman.gettxtjudulbuku().setText(Peminjaman.getJudulBuku());
            formPeminjaman.gettxttanggalpinjam().setText(Peminjaman.getTanggalPinjam());
            formPeminjaman.gettxttanggalkembali().setText(Peminjaman.getTanggalKembali());
           
            
        }
    }
    
    public void deletePeminjaman(){
        int index = formPeminjaman.gettabelpinjam().getSelectedRow();
        peminjamanDao.delete(index);
         JOptionPane.showMessageDialog(formPeminjaman,"Delete OK");  
    }
    
}


