package edu.minr.latihanmvcjdbc.main;

import edu.minr.latihanmvcjdbc.database.KingBarbershopDatabase;
import edu.minr.latihanmvcjdbc.entity.Pelanggan;
import edu.minr.latihanmvcjdbc.error.PelangganException;
import edu.minr.latihanmvcjdbc.service.PelangganDao;
import edu.minr.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author
 * NIM : 10119022
 * NAMA : M Ikhlas N R
 * KELAS : IF-1
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
}
