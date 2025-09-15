package TugasAccessModifier;

public class manager extends pegawai {
    String divisi;

    public manager(String name, int IdPegawai, double GajiPokok, String divisi)
    {
        super(name, IdPegawai, GajiPokok);
        this.divisi = divisi;
    }
    
    @Override
    public void TampilkanData()
    {
        System.out.println("Nama: " + name);
        System.out.println("ID: " + IdPegawai);
        System.out.println("divisi: " + divisi);
    }
}