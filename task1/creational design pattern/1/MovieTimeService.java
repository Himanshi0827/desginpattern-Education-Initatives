public class MovieTimeService implements SmartService {
    private Light light;
    private Thermostat thermostat;
    private TV tv;

    public MovieTimeService(Light light, Thermostat thermostat, TV tv) {
        this.light = light;
        this.thermostat = thermostat;
        this.tv = tv;
    }

    @Override
    public void execute() {
        light.dim(30); // Dim lights for movie time
        thermostat.setTemperature(22); // Set a cozy temperature
        tv.turnOn();
        tv.setMode("Movie"); // Switch to movie mode
        System.out.println("Movie Time service executed: lights dimmed, thermostat set, TV on in movie mode.");
    }

    @Override
    public void schedule(String time) {
        System.out.println("Movie Time service scheduled at " + time);
    }
}