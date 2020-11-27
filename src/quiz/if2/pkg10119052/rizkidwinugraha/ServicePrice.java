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
public class ServicePrice {
    private float priceService;
    private float discount;

    public float getPriceService(){
        return priceService;
    }
    public void setPriceService(float priceService){
        this.priceService = priceService;
    }
    @Override
    public void displayService(){
        return 
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service List******#");
        System.out.println("1. Haircut : IDR ");
        System.out.println("2. Haircut + Hairwash: IDR");
        System.out.println("3. Hairwash Only : IDR");
        System.out.println("#*************************#");;
    }
    @Override
    public float getPrice(int serviceItem){
        return 0;
    }
    @Override
    public boolean checkMemberStatus(String statusMember){
        return 0;
    }
    @Override
    public float getSale(boolean isMember, float parServicePrice){
        return 0;
    }
    public float getTotalPay(float servicePrice, float discount){
        return 0;
    }
}
