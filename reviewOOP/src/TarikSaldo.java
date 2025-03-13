public class TarikSaldo extends Rekening{
    
    public TarikSaldo(String namaPemilik, String noRekening, Double saldo, Double jumlah) {
        super(namaPemilik, noRekening, saldo);
    }

    @Override
    public double Tarik(Double saldo, Double jumlah, Double sisa){
        if(this.jumlah >= this.saldo){
            System.out.println("Saldo tidak mencukupi");
        }
        else{
        }
        this.sisa = this.saldo - this.jumlah;
        return this.sisa;
    }

    public void infoTarik() {
        System.out.println("Nama Pemilik: " + this.namaPemilik);
        System.out.println("No Rekening: " + this.noRekening);
        System.out.println("Sisa Saldo : " + this.sisa);
    }
}
