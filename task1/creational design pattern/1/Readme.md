### Smart Home Device Management (Factory Method Pattern)

#### Project: SmartHomeMain
This project demonstrates the Factory Method Design Pattern in a smart home environment. The Factory Method pattern is used to create different smart services based on the user’s current activity or situation.

#### **Use Case: Smart Home Device Management**
In this system, different services are instantiated dynamically based on the user's activity such as "Leaving Home" or "Movie Time." Each service controls multiple devices (e.g., lights, thermostat, security).

#### **Class Overview**:
1. **SmartServiceFactory**: A factory that creates specific services depending on the current scenario (e.g., "Leaving Home").
2. **SmartService (Interface)**: Defines methods that every service must implement.
3. **LeavingHomeService**: Implements the SmartService, managing devices such as lights, doors, and alarms when the user leaves home.
4. **MovieTimeService**: Implements the SmartService, managing devices like lights, thermostat, and TV for a movie experience.
5. **Device Classes**: Each device (e.g., Light, Thermostat, Alarm) is encapsulated and controlled through service classes.

#### **Features**:
- **Leaving Home**: Turns off lights, locks doors, and activates the alarm.
- **Movie Time**: Dims lights, adjusts the thermostat, and turns on the TV.

#### **How to Run**:
1. Create and build the project.
2. Run the main class `SmartHomeMain`.
3. Select an activity (e.g., "Leaving Home", "Movie Time") and observe how the appropriate devices are controlled.

