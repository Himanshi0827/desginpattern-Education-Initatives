public interface SmartService {
    void execute();

    void schedule(String time); // Optional: Schedule service at a certain time
}
