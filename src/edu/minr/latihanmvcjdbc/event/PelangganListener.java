package edu.minr.latihanmvcjdbc.event;

import edu.minr.latihanmvcjdbc.entity.Pelanggan;
import edu.minr.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author
 * NIM : 10119022
 * NAMA : M Ikhlas N R
 * KELAS : IF-1
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);
}
