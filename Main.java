
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        Mahasiswa tomy = new Mahasiswa("tomsky", "peby", 
        Role.MAHASISWA, "Tomy.A F", "2315061110", "Teknik Informatika",
        "Teknik Elektro", "Teknik", "0821242344", "Kota Baru", "Budi", "Siti", 144, 4.0, 7
        );
        
        Mahasiswa elthon = new Mahasiswa("eltzy", "s.kepr", 
        Role.MAHASISWA, "Elthon. J. K", "2315061018", "Teknik Informatika",
        "Teknik Elektro", "Teknik", "0821242344", "KP.Baru", "Budiono", "Nourzy", 144, 4.0, 7
        );
        
        Admin jammy = new Admin("Jammy Nasution", "3428974143", 
        "Labuhan Ratu", "082141384235", "Staff", "jemsky1805_@gmail.com", 
        "jemsky", "jemy", Role.ADMIN);
        
        Dokumen dokumenElthon = new Dokumen("URL1", "URL2", "URL3", "URL4", "URL5", "URL6", "URL7");
        
        Dokumen dokumenTomy = new Dokumen("URL1", "URL2", "URL3", "URL4", "URL5", "URL6", "URL7");

        PendaftaranWisudaMahasiswa pendaftar1 = new PendaftaranWisudaMahasiswa(tomy, dokumenTomy, "2 Januari 2025", "25 Januari 2025");
        
        PendaftaranWisudaMahasiswa pendaftar2 = new PendaftaranWisudaMahasiswa(elthon, dokumenElthon, "2 Januari 2025", "25 Januari 2025");

        pendaftar1.displayPendaftaranWisuda();
        
        pendaftar1.verifikasiDokumen(jammy, StatusPendaftaran.DITERIMA);
        
        pendaftar1.displayPendaftaranWisuda();
        
        pendaftar2.verifikasiDokumen(jammy, StatusPendaftaran.DITERIMA);
        
        DaftarMahasiswaWisuda daftarWisudawan = new DaftarMahasiswaWisuda();
        
        daftarWisudawan.addMahasiswa(pendaftar1);
        daftarWisudawan.addMahasiswa(pendaftar2);
        
        for(PendaftaranWisudaMahasiswa pendaftar : daftarWisudawan.getAllMahasiswaWisuda()) {
            pendaftar.displayPendaftaranWisuda();
            System.out.println("\n");
        }
}
}