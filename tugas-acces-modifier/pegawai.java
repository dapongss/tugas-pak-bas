package TugasAccessModifier;

public class pegawai {
    public String name;
    protected int IdPegawai;
    private double GajiPokok;

    public pegawai(String name, int IdPegawai, double GajiPokok)
    {
        this.name = name;
        this.IdPegawai = IdPegawai;
        this.GajiPokok = GajiPokok;
    }

    public void TampilkanData()
    {
        System.out.println("nama: " + name);
        System.out.println("ID: " + IdPegawai);
        System.out.println("gaji pokok: " + GajiPokok);
    }
}