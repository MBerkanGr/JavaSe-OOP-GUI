public class Drayga extends Beyblade{
    
    private String kutsalcanavar;
    
    public Drayga(String beybladeci, int donushizi, int saldiri,String kutsalcanavar) {
        super(beybladeci, donushizi, saldiri);
        this.kutsalcanavar = kutsalcanavar;
    }

    @Override
    public void bilgigöster() {
        super.bilgigöster(); 
        System.out.println("Kutsal canavar: "+kutsalcanavar);
    }

    @Override
    public void kutsalcanavar() {
        
        System.out.println(getBeybladeci()+" "+kutsalcanavar+" ı çıkarıyor");
        System.out.println(getBeybladeci()+" ın saldırısı: Kaplam pençesi");
    }
    
    
    
}
