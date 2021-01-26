package edu.minr.latihanmvcjdbc.error;

/**
 *
 * @author
 * NIM : 10119022
 * NAMA : M Ikhlas N R
 * KELAS : IF-1
 */
public class PelangganException extends Exception {

    /**
     * Creates a new instance of <code>PelangganException</code> without detail
     * message.
     */
    public PelangganException() {
    }

    /**
     * Constructs an instance of <code>PelangganException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PelangganException(String msg) {
        super(msg);
    }
}
