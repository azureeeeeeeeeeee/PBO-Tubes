abstract class User {
    String username;
    String password;

    String fileSuratMasuk = "datafile/masuk/ListSuratMasuk.txt";
    String filePengirim = "datafile/masuk/ListPengirim.txt";
    String fileNoSuratMasuk = "datafile/masuk/ListNoSuratMasuk.txt";
    String fileTanggalSuratMasuk = "datafile/masuk/ListTanggalSuratMasuk.txt";
    String fileTanggalMasuk = "datafile/masuk/ListTanggalMasuk.txt";

    String fileSuratKeluar = "datafile/keluar/ListSuratKeluar.txt";
    String fileTujuan = "datafile/keluar/ListTujuan.txt";
    String fileNoSuratKeluar = "datafile/keluar/ListNoSuratKeluar.txt";
    String fileTanggalSuratKeluar = "datafile/keluar/ListTanggalSuratKeluar.txt";
    String fileTanggalKeluar = "datafile/keluar/ListTanggalKeluar.txt";

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    
}