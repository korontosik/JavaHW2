import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehavioyr, QueueBehaviour{
    private List<Actor> queue = new ArrayList<>();

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName()+ " встал в очередь");
    }

    @Override
    public void takeOders() {
        //принятие заказа
        for (Actor actor : queue) {
            if (!actor.isMakeOder()) {
                actor.isMakeOder = true; 
                System.out.println(actor.getName()+" сделал заказ");               
            }
        }
    }

    @Override
    public void giveOders() {
        // пердача заказа
        for (Actor actor : queue) {
            if (actor.isMakeOder()) {
                actor.isTakeOder = true; 
                System.out.println(actor.getName()+" получил заказ");               
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseQueue = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOder) {
                System.out.println(actor.getName()+ " вышел из очереди");
                releaseQueue.add(actor);
            }
        }
        releaseFromMarcket(releaseQueue);
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName()+ " попал в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarcket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName()+ " вышел из магазина");
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOders();
        giveOders();
        releaseFromQueue();
    }
    
}
