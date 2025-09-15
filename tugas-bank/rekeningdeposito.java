package Rothschild;

public class rekeningDeposito extends rekening{
    public rekeningDeposito(String NoRekening, double saldo)
    {
        super(NoRekening, saldo);
    }

    @Override
    public double HitungBunga(double SukuBunga)
    {
        return saldo * 0.05;
    }
    
}