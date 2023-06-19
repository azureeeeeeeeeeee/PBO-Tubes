import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Pegawai extends User {
    String idPegawai;

    public Pegawai(String username, String password, String idPegawai) {
        super(username, password);
        this.idPegawai = idPegawai;
    }

    public void lihatSuratMasuk() {
    System.out.println("LIST SURAT MASUK:");
    try (
        BufferedReader readerNoSurat = new BufferedReader(new FileReader(fileNoSuratMasuk));
        BufferedReader readerTanggalMasuk = new BufferedReader(new FileReader(fileTanggalMasuk));
        BufferedReader readerPengirim = new BufferedReader(new FileReader(filePengirim));
        BufferedReader readerSuratMasuk = new BufferedReader(new FileReader(fileSuratMasuk))
    ) {
        String lineNoSurat;
        String lineTanggalMasuk;
        String linePengirim;
        String lineSuratMasuk;
        
        while (
            (lineNoSurat = readerNoSurat.readLine()) != null &&
            (lineTanggalMasuk = readerTanggalMasuk.readLine()) != null &&
            (linePengirim = readerPengirim.readLine()) != null &&
            (lineSuratMasuk = readerSuratMasuk.readLine()) != null
        ) {
            System.out.println(lineSuratMasuk);
            System.out.println("No Surat:" + lineNoSurat);
            System.out.println("Tanggal Masuk: " + lineTanggalMasuk);
            System.out.println("Pengirim: " + linePengirim);
            System.out.println("");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    public void lihatSuratKeluar() {
        System.out.println("LIST SURAT KELUAR:");
        try (
            BufferedReader readerNoSurat = new BufferedReader(new FileReader(fileNoSuratKeluar));
            BufferedReader readerTanggalKeluar = new BufferedReader(new FileReader(fileTanggalKeluar));
            BufferedReader readerTujuan = new BufferedReader(new FileReader(fileTujuan));
            BufferedReader readerSuratKeluar = new BufferedReader(new FileReader(fileSuratKeluar));
        ) {
            String lineNoSurat;
            String lineTanggalKeluar;
            String lineTujuan;
            String lineSuratKeluar;
            
            while (
                (lineNoSurat = readerNoSurat.readLine()) != null &&
                (lineTanggalKeluar = readerTanggalKeluar.readLine()) != null &&
                (lineTujuan = readerTujuan.readLine()) != null &&
                (lineSuratKeluar = readerSuratKeluar.readLine()) != null
            ) {
                System.out.println(lineSuratKeluar);
                System.out.println("No Surat:" + lineNoSurat);
                System.out.println("Tanggal Masuk: " + lineTanggalKeluar);
                System.out.println("Pengirim: " + lineTujuan);
                System.out.println("");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
