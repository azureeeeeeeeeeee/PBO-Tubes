import java.util.ArrayList;
import java.util.List;

abstract class User {
    String username;
    String password;

    int totalSuratMasuk = 0;
    int totalSuratKeluar = 0;

    ArrayList<SuratMasuk> listSuratMasuk =  new ArrayList<SuratMasuk>();
    List<String> listPengirim =  new ArrayList<String>();
    List<String> listNoSuratMasuk =  new ArrayList<String>();
    List<String> listTanggalMasuk =  new ArrayList<String>();
    List<String> listTanggalSuratMasuk =  new ArrayList<String>();

    ArrayList<SuratKeluar> listSuratKeluar =  new ArrayList<SuratKeluar>();
    List<String> listTujuan =  new ArrayList<String>();
    List<String> listNoSuratKeluar =  new ArrayList<String>();
    List<String> listTanggalKeluar =  new ArrayList<String>();
    List<String> listTanggalSuratKeluar =  new ArrayList<String>();

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    
}