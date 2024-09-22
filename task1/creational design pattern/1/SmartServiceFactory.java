public class SmartServiceFactory {
    public static SmartService getService(String activity, UserProfile userProfile) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        TV tv = new TV();
        SecuritySystem security = new SecuritySystem();

        // Customize service behavior based on user preferences
        thermostat.setTemperature(userProfile.getPreferredTemperature());

        switch (activity) {
            case "Leaving Home":
                return new LeavingHomeService(light, thermostat, security);
            case "Movie Time":
                return new MovieTimeService(light, thermostat, tv);
            default:
                throw new IllegalArgumentException("Invalid activity: " + activity);
        }
    }
}
