public abstract class Actor implements ActorBehaviour{
    protected String name;
    protected boolean isMakeOder;
    protected boolean isTakeOder;

    abstract String getName();

    public Actor(String name){
        this.name = name;
    }

}
