public interface QueueBehaviour {
    void takeInQueue(Actor actor);
    void takeOders();
    void giveOders();
    void releaseFromQueue();
}
