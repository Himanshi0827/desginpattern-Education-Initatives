public class SmartHomeMain {
    public static void main(String[] args) {
        // Create a user profile
        UserProfile userProfile = new UserProfile(22, 50); // 22°C and 50% light brightness

        // Get the appropriate service based on the user's activity
        SmartService leavingHomeService = SmartServiceFactory.getService("Leaving Home", userProfile);
        SmartService movieTimeService = SmartServiceFactory.getService("Movie Time", userProfile);

        // Execute the services
        leavingHomeService.execute();
        movieTimeService.execute();

        // Schedule a service to run later (optional)
        Scheduler scheduler = new Scheduler();
        scheduler.schedule(leavingHomeService, 5000); // Run after 5 seconds
    }
}
