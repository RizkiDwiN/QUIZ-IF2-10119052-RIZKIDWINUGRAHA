package quiz.if2.pkg10119052.rizkidwinugraha;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Hair Cut
 * 
 */
public interface ServiceItem {
    public void displayService(int serviceItem);
    public float getPrice();
    public boolean checkMemberStatus(String statusMember);
    public float getSale(boolean isMember, float parServicePrice);
}
