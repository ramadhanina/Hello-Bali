package Model;

import android.graphics.drawable.Drawable;

/**
 * Created by ACER on 03/12/2016.
 */
public class OptionClass
{
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public OptionClass(String judul, String deskripsi, Drawable foto)
    {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}
