public class Pegawai extends User {
    String idPegawai;

    public Pegawai(String username, String password, String idPegawai) {
        super(username, password);
        this.idPegawai = idPegawai;
    }

    public void lihatSuratMasuk() {
        System.out.println("LIST SURAT MASUK:");
        for (int i = 0; i < totalSuratMasuk; i++) {
            System.out.println(listSuratMasuk.get(i));
            System.out.println("No Surat : "+listNoSuratMasuk.get(i));
            System.out.println("Tanggal Surat : "+listTanggalSuratMasuk.get(i));
            System.out.println("Tanggal Masuk : "+listTanggalMasuk.get(i));
            System.out.println("Pengirim : "+listPengirim.get(i));
            System.out.println("");
        }
    }

    public void lihatSuratKeluar() {
        System.out.println("LIST SURAT KELUAR:");
        for (int i = 0; i < totalSuratKeluar; i++) {
            System.out.println(listSuratMasuk.get(i));
            System.out.println("No Surat : "+listNoSuratKeluar.get(i));
            System.out.println("Tanggal Surat : "+listTanggalSuratKeluar.get(i));
            System.out.println("Tanggal Masuk : "+listTanggalKeluar.get(i));
            System.out.println("Pengirim : "+listTujuan.get(i));
            System.out.println("");
        }
    }
}
