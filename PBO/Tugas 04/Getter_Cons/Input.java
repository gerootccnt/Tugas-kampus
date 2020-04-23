
package com.mycompany.getter_cons;

/**
 *
 * @author Geroot
 */
public class Input {

    private final String matakuliah;
    private final String namadosen;
    
    //ini Constructor
    public Input(String matakuliah, String namadosen)
    {
        this.matakuliah = matakuliah;
        this.namadosen = namadosen;
    }

    public String getMatakuliah() {
        return matakuliah;
    }

    public String getNamadosen() {
        return namadosen;
    }
}
