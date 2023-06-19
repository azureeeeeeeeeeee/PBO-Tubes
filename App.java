public class App {
    public static void main(String[] args) {
        Admin admin1 = new Admin("admin", "admin123", "11221063");
        Pegawai akmal = new Pegawai("akmal","akmal123","11221037");

        // admin1.tambahSuratMasuk("422.7/107511", "27/06/2004", "12/12/2004", "Dinas Pendidikan");
        // admin1.tambahSuratMasuk("CCD/123.6", "19/06/2004", "20/12/2004", "Kak Adi Mesin 19");
        // admin1.tambahSuratMasuk("98/A.72", "20/11/2009", "22/11/2009", "CIA");

        // admin1.tambahSuratKeluar("123/321", "30/10/1945", "01/11/1945", "Soeharto");
        // admin1.tambahSuratKeluar("ABC/123.9", "18/10/1945", "02/11/1945", "Adi Subagyo");

        admin1.hapusSuratMasuk("98/A.72");
        admin1.lihatSuratMasuk();
        System.out.println("---------------");
        akmal.lihatSuratMasuk();

//         System.out.println("======================================");

//         admin1.hapusSuratKeluar("123/321");
//         admin1.lihatSuratKeluar();
//         System.out.println("---------------");
//         akmal.lihatSuratKeluar();
    }
}