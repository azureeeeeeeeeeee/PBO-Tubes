public class Admin extends User {
    String idAdmin;

    public Admin(String username, String password, String idAdmin) {
        super(username, password);
        this.idAdmin = idAdmin;
    }

    public void tambahSuratMasuk(String noSurat, String tanggalSurat, String tanggalMasuk, String pengirim) {
        SuratMasuk surat = new SuratMasuk(noSurat, tanggalSurat, tanggalMasuk, pengirim);
        listNoSuratMasuk.add(noSurat);
        listTanggalSuratMasuk.add(tanggalSurat);
        listTanggalMasuk.add(tanggalMasuk);
        listPengirim.add(pengirim);
        listSuratMasuk.add(surat);
        totalSuratMasuk++;
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

    public void tambahSuratKeluar(String noSurat, String tanggalSurat, String tanggalKeluar, String tujuan) {
        SuratKeluar surat = new SuratKeluar(noSurat, tanggalSurat, tanggalKeluar, tujuan);
        listNoSuratKeluar.add(noSurat);
        listTanggalSuratKeluar.add(tanggalSurat);
        listTanggalKeluar.add(tanggalKeluar);
        listTujuan.add(tujuan);
        listSuratKeluar.add(surat);
        totalSuratKeluar++;
    }

    public void lihatSuratKeluar() {
        System.out.println("LIST SURAT KELUAR:");
        for (int i = 0; i < totalSuratKeluar; i++) {
            System.out.println(listSuratKeluar.get(i));
            System.out.println("No Surat : "+listNoSuratKeluar.get(i));
            System.out.println("Tanggal Surat : "+listTanggalSuratKeluar.get(i));
            System.out.println("Tanggal Keluar : "+listTanggalKeluar.get(i));
            System.out.println("Tujuan : "+listTujuan.get(i));
            System.out.println("");
        }
    }
}