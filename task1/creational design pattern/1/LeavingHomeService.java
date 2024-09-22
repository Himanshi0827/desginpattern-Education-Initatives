public class LeavingHomeService implements SmartService {
    private Light light;
    private Thermostat thermostat;
    private SecuritySystem security;

    public LeavingHomeService(Light light, Thermostat thermostat, SecuritySystem security) {
        this.light = light;
        this.thermostat = thermostat;
        this.security = security;
    }

    @Override
    public void execute() {
        light.turnOff();
        thermostat.setTemperature(15); // Lower temperature when no one is home
        security.activate();
        System.out.println("Leaving Home service executed: lights off, thermostat down, security system armed.");
    }

    @Override
    public void schedule(String time) {
        System.out.println("Leaving Home service scheduled at " + time);
    }
}