public class Human extends Actor {

    public Human(String name){
        super(name);
    }
    @Override
    public
    void setMarketOrder(boolean makeOder){
        super.isMakeOder = makeOder;
    }
    @Override
    public
    void setTaskOder(boolean takeOder){
        super.isTakeOder = takeOder;
    }
    @Override
    public
    boolean isMakeOder(){
        return super.isMakeOder;
    }
    @Override
    public
    boolean isTakeOder(){
        return super.isTakeOder;
    }
    @Override
    String getName() {
       return super.name;
    }
}
