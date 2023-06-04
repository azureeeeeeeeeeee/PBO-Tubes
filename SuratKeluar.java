public class SuratKeluar extends Surat {
    String tanggalKeluar;
    String tujuan;

    public SuratKeluar(String noSurat, String tanggalSurat, String tanggalKeluar, String tujuan) {
        super(noSurat, tanggalSurat);
        this.tanggalKeluar = tanggalKeluar;
        this.tujuan =  tujuan;
    }
}