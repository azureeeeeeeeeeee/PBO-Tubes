public class SuratMasuk extends Surat {
    String tanggalMasuk;
    String pengirim;

    public SuratMasuk(String noSurat, String tanggalSurat, String tanggalMasuk, String pengirim) {
        super(noSurat, tanggalSurat);
        this.tanggalMasuk = tanggalMasuk;
        this.pengirim =  pengirim;
    }
}
