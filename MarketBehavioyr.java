import java.util.List;

public interface MarketBehavioyr {
    void acceptToMarket(Actor actor);
    void releaseFromMarcket(List<Actor> actors);
    void update();

}
