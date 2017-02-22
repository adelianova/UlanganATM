
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author intel
 */
public class transfer {
     private int saldo; 
   
    public void transfer (int tab, int t)
    {
         if(t%100!=0)
            JOptionPane.showMessageDialog(null,"Mesin ATM BRI tidak menerima uang koin \nSilahkan ulangi kembali","Transaksi gagal ",0);
         else{
             if(t>tab)
            JOptionPane.showMessageDialog(null,"saldo anda tidak mencukupi \nSilahkan ulangi kembali","Transaksi gagal ",0);
             else{
                 saldo = tab-t;
                 JOptionPane.showMessageDialog(null,"Saldo saat ini sebesar"+saldo); 
                 if(tab<=50000)
                 JOptionPane.showMessageDialog(null,"Saldo minimal harus 50000, segera lakukan penyetoran untuk menghindari penutupan akun","CAUTION",2); 
             }
         }
    }
     public int getsaldo()
    {
        return saldo;
    }
}
