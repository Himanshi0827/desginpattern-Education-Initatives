public class UserProfile {
    private int preferredTemperature;
    private int lightBrightness;

    public UserProfile(int preferredTemperature, int lightBrightness) {
        this.preferredTemperature = preferredTemperature;
        this.lightBrightness = lightBrightness;
    }

    public int getPreferredTemperature() {
        return preferredTemperature;
    }

    public int getLightBrightness() {
        return lightBrightness;
    }
}
