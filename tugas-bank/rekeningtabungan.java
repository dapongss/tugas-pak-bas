package Rothschild;

public class rekeningTabungan extends rekening {
    public rekeningTabungan(String NoRekening, double saldo)
    {
        super(NoRekening, saldo);
    }

    @Override
    public double HitungBunga(double SukuBunga)
    {
        return saldo * 0.02;
    }
}