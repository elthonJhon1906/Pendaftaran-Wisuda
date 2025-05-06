/**
 * Write a description of class PendaftaranWisuda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PendaftaranWisudaMahasiswa{
    private int id;
    private static int idCounter = 1;
    private Mahasiswa mahasiswa;
    private Dokumen dokumen;
    private String tanggalPendaftaran;
    private String tanggalWisuda;
    private static String tempatWisuda = "Gedung Serba Guna Universitas Lampung";
    private StatusPendaftaran statusPenerimaanWisuda = StatusPendaftaran.PENDING; 
    
    public PendaftaranWisudaMahasiswa(Mahasiswa mahasiswa, Dokumen dokumen, String tanggalPendaftaran, String tanggalWisuda){
        this.id = idCounter++;
        this.mahasiswa = mahasiswa;
        this.dokumen = dokumen;
        this.tanggalPendaftaran = tanggalPendaftaran;
        this.tanggalWisuda = tanggalWisuda;
    }
    
    public void displayPendaftaranWisuda(){
        mahasiswa.displayDataMahasiswa();
        dokumen.displayDokumen();
        System.out.println("Tanggal Pendaftaran : " + tanggalPendaftaran);
        System.out.println("Tanggal Wisuda : " + tanggalWisuda);
        if(statusPenerimaanWisuda == StatusPendaftaran.DITERIMA) {
            System.out.println("Status Wisuda Diterima");
        } else if (statusPenerimaanWisuda == StatusPendaftaran.PENDING) {
            System.out.println("Status Penerimaan Diproses");
        } else {
            System.out.println("Status Penerimaan Ditolak");
        }
    }
    
    public void verifikasiDokumen(Admin admin, StatusPendaftaran status) {
        this.statusPenerimaanWisuda = status;
    }
    
    
}
