public class Rekening {
    String namaPemilik;
    String noRekening;
    Double saldo;
    Double jumlah;
    double sisa;

    public Rekening(String namaPemilik, String noRekening, Double saldo) {
        this.namaPemilik = namaPemilik;
        this.noRekening = noRekening;
        this.saldo = saldo;
    }

    public Rekening(Double saldo, Double jumlah, Double sisa) {
        this.saldo = saldo;
        this.jumlah = jumlah;
        this.sisa = this.saldo - this.jumlah;
    }

    public double Setor(Double saldo, Double jumlah){
        this.saldo = this.saldo + this.jumlah;
        return this.saldo;
    }

    public double Tarik(Double saldo, Double jumlah, Double sisa){
        if(this.jumlah >= this.saldo){
            System.out.println("Saldo tidak mencukupi");
        }
        else{
        }
        this.sisa = this.saldo - this.jumlah;
        return this.sisa;
    }

    public Double getSaldo(){
        return saldo;
    }

    public Double getJumlah(){
            // Lakukan penarikan
            this.saldo = this.saldo - this.jumlah;
            // Hitung sisa saldo
            this.saldo = this.sisa;
        return jumlah;
    }

    public String getNamaPemilik(){
        return namaPemilik;
    }
    

    public String getNoRekening(){
        return noRekening;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }

    public void setSisa(Double sisa){
        this.sisa = sisa;
    }

    public void setJumlah(Double jumlah){
        this.jumlah = jumlah;
    }

    public void setNamaPemilik(String namaPemilik){
        this.namaPemilik = namaPemilik;
    }

    public void setNoRekening(String noRekening){
        this.noRekening = noRekening;
    }

    public void infoRekening(){
        System.out.println("Nama Pemilik: " + this.namaPemilik);
        System.out.println("No Rekening: " + this.noRekening);
        System.out.println("Saldo: " + this.saldo);
    }   

}
