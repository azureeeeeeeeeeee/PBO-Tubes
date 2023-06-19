import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
// import java.nio.file.Files;
// import java.nio.file.Path;

public class Admin extends User {
    String idAdmin;

    public Admin(String username, String password, String idAdmin) {
        super(username, password);
        this.idAdmin = idAdmin;
    }

    public void tambahSuratMasuk(String noSurat, String tanggalSurat, String tanggalMasuk, String pengirim) {
        SuratMasuk surat = new SuratMasuk(noSurat, tanggalSurat, tanggalMasuk, pengirim);

        try (FileWriter writer = new FileWriter(filePengirim, true)) {
            writer.write(pengirim + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the list to a file.");
            e.printStackTrace();
        }

        try (FileWriter writer = new FileWriter(fileNoSuratMasuk, true)) {
            writer.write(noSurat + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the list to a file.");
            e.printStackTrace();
        }

        try (FileWriter writer = new FileWriter(fileTanggalMasuk, true)) {
            writer.write(tanggalMasuk + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the list to a file.");
            e.printStackTrace();
        }

        try (FileWriter writer = new FileWriter(fileSuratMasuk, true)) {
            writer.write(surat + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the list to a file.");
            e.printStackTrace();
        }
    }

    public void hapusSuratMasuk(String noSurat) {
        try (BufferedReader readerNoSurat = new BufferedReader(new FileReader(fileNoSuratMasuk));
             BufferedReader readerTanggalMasuk = new BufferedReader(new FileReader(fileTanggalMasuk));
             BufferedReader readerPengirim = new BufferedReader(new FileReader(filePengirim));
             BufferedReader readerSuratMasuk = new BufferedReader(new FileReader(fileSuratMasuk));
             BufferedWriter writerNoSurat = new BufferedWriter(new FileWriter(fileNoSuratMasuk + ".tmp"));
             BufferedWriter writerTanggalMasuk = new BufferedWriter(new FileWriter(fileTanggalMasuk + ".tmp"));
             BufferedWriter writerPengirim = new BufferedWriter(new FileWriter(filePengirim + ".tmp"));
             BufferedWriter writerSuratMasuk = new BufferedWriter(new FileWriter(fileSuratMasuk + ".tmp"))
        ) {
            String lineNoSurat;
            String lineTanggalMasuk;
            String linePengirim;
            String lineSuratMasuk;

            while ((lineNoSurat = readerNoSurat.readLine()) != null &&
                   (lineTanggalMasuk = readerTanggalMasuk.readLine()) != null &&
                   (linePengirim = readerPengirim.readLine()) != null &&
                   (lineSuratMasuk = readerSuratMasuk.readLine()) != null) {
                if (!lineNoSurat.equals(noSurat)) {
                    writerNoSurat.write(lineNoSurat + "\n");
                    writerTanggalMasuk.write(lineTanggalMasuk + "\n");
                    writerPengirim.write(linePengirim + "\n");
                    writerSuratMasuk.write(lineSuratMasuk + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Delete the original files and rename the temporary files
        try {
            Files.deleteIfExists(Paths.get(fileNoSuratMasuk));
            Files.move(Paths.get(fileNoSuratMasuk + ".tmp"), Paths.get(fileNoSuratMasuk));
            Files.deleteIfExists(Paths.get(fileTanggalMasuk));
            Files.move(Paths.get(fileTanggalMasuk + ".tmp"), Paths.get(fileTanggalMasuk));
            Files.deleteIfExists(Paths.get(filePengirim));
            Files.move(Paths.get(filePengirim + ".tmp"), Paths.get(filePengirim));
            Files.deleteIfExists(Paths.get(fileSuratMasuk));
            Files.move(Paths.get(fileSuratMasuk + ".tmp"), Paths.get(fileSuratMasuk));
        } catch (IOException e) {
            e.printStackTrace();
        }
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

    public void tambahSuratKeluar(String noSurat, String tanggalSurat, String tanggalKeluar, String tujuan) {
        SuratMasuk surat = new SuratMasuk(noSurat, tanggalSurat, tanggalKeluar, tujuan);

        try (FileWriter writer = new FileWriter(fileTujuan, true)) {
            writer.write(tujuan + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the list to a file.");
            e.printStackTrace();
        }

        try (FileWriter writer = new FileWriter(fileNoSuratKeluar, true)) {
            writer.write(noSurat + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the list to a file.");
            e.printStackTrace();
        }

        try (FileWriter writer = new FileWriter(fileTanggalKeluar, true)) {
            writer.write(tanggalKeluar + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the list to a file.");
            e.printStackTrace();
        }

        try (FileWriter writer = new FileWriter(fileSuratKeluar, true)) {
            writer.write(surat + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the list to a file.");
            e.printStackTrace();
        }
    }

    public void hapusSuratKeluar(String noSurat) {
        try (BufferedReader readerNoSurat = new BufferedReader(new FileReader(fileNoSuratKeluar));
             BufferedReader readerTanggalKeluar = new BufferedReader(new FileReader(fileTanggalKeluar));
             BufferedReader readerTujuan = new BufferedReader(new FileReader(fileTujuan));
             BufferedReader readerSuratKeluar = new BufferedReader(new FileReader(fileSuratKeluar));
             BufferedWriter writerNoSurat = new BufferedWriter(new FileWriter(fileNoSuratKeluar + ".tmp"));
             BufferedWriter writerTanggalKeluar = new BufferedWriter(new FileWriter(fileTanggalKeluar + ".tmp"));
             BufferedWriter writerTujuan = new BufferedWriter(new FileWriter(fileTujuan + ".tmp"));
             BufferedWriter writerSuratKeluar = new BufferedWriter(new FileWriter(fileSuratKeluar + ".tmp"))
        ) {
            String lineNoSurat;
            String lineTanggalKeluar;
            String lineTujuan;
            String lineSuratKeluar;

            while ((lineNoSurat = readerNoSurat.readLine()) != null &&
                   (lineTanggalKeluar = readerTanggalKeluar.readLine()) != null &&
                   (lineTujuan = readerTujuan.readLine()) != null &&
                   (lineSuratKeluar = readerSuratKeluar.readLine()) != null) {
                if (!lineNoSurat.equals(noSurat)) {
                    writerNoSurat.write(lineNoSurat + "\n");
                    writerTanggalKeluar.write(lineTanggalKeluar + "\n");
                    writerTujuan.write(lineTujuan + "\n");
                    writerSuratKeluar.write(lineSuratKeluar + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Delete the original files and rename the temporary files
        try {
            Files.deleteIfExists(Paths.get(fileNoSuratKeluar));
            Files.move(Paths.get(fileNoSuratKeluar + ".tmp"), Paths.get(fileNoSuratKeluar));
            Files.deleteIfExists(Paths.get(fileTanggalKeluar));
            Files.move(Paths.get(fileTanggalKeluar + ".tmp"), Paths.get(fileTanggalKeluar));
            Files.deleteIfExists(Paths.get(fileTujuan));
            Files.move(Paths.get(fileTujuan + ".tmp"), Paths.get(fileTujuan));
            Files.deleteIfExists(Paths.get(fileSuratKeluar));
            Files.move(Paths.get(fileSuratKeluar + ".tmp"), Paths.get(fileSuratKeluar));
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