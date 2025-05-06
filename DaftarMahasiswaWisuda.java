import java.util.ArrayList;
/**
 * Write a description of class DaftarMahasiswaWisuda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DaftarMahasiswaWisuda{
    
    ArrayList<PendaftaranWisudaMahasiswa> DaftarMahasiswa;
    
    public DaftarMahasiswaWisuda(){
    this.DaftarMahasiswa = new ArrayList<>();
    }
    
    public void addMahasiswa(PendaftaranWisudaMahasiswa mahasiswa){
    DaftarMahasiswa.add(mahasiswa);
    }

    public void removeMahasiswa(PendaftaranWisudaMahasiswa mahasiswa){
    DaftarMahasiswa.remove(mahasiswa);
    }
    
    public ArrayList<PendaftaranWisudaMahasiswa> getAllMahasiswaWisuda(){
        return DaftarMahasiswa;
    }
    
    public PendaftaranWisudaMahasiswa verifikasiDokumen(
        Admin admin,
        PendaftaranWisudaMahasiswa pendaftaran,
        StatusPendaftaran status
    ) {
        int index = DaftarMahasiswa.indexOf(pendaftaran);
        
        if (index == -1) return null;
        
        PendaftaranWisudaMahasiswa p = DaftarMahasiswa.get(index);
        PendaftaranWisudaMahasiswa baru = admin.verifikasiPendaftaran(p, status);
        
        DaftarMahasiswa.set(index, baru);
        
        return baru;
    }
    
}
