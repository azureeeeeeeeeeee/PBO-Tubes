public class App {
    public static void main(String[] args) {
        Admin admin1 = new Admin("admin", "admin123", "11221063");
        Pegawai rio = new Pegawai("Rio", "pegawai123", "11221051");

        admin1.tambahSuratMasuk("422.7/107511", "27/06/2004", "12/12/2004", "Dinas Pendidikan");
        admin1.tambahSuratMasuk("1366/ABRL", "12/09/2007", "03/06/2023", "ITK");
        admin1.tambahSuratMasuk("123/123", "12/12/1212", "12/12/1213", "Majapahit");

        // admin1.tambahSuratKeluar("13.4/2407", "11/03/1966", "12/03/1966", "Soeharto");

        admin1.lihatSuratMasuk();

        System.out.println("");
        System.out.println("");

        rio.lihatSuratMasuk();
    }
}