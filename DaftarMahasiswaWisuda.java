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
    
}
