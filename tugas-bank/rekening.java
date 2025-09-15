package Rothschild;

public class rekening {
    public String NoRekening;
    protected double saldo;

    public rekening(String NoRekening, double saldo)
    {
        this.NoRekening = NoRekening;
        this.saldo = saldo;
    }

    public void TampilkanData(String NoRekening, double saldo)
    {
        System.out.println("No Rekening: " + NoRekening);
        System.out.println("Saldo: " + saldo);
    }

    public double HitungBunga(double SukuBunga)
    {
        return 0;
    }
}