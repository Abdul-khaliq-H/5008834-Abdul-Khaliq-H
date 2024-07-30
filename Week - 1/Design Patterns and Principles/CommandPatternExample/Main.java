package CommandPatternExample;

public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        
        RemoteControl remote = new RemoteControl();
        
        // Turn the light on
        remote.setCommand(lightOn);
        remote.pressButton();
        
        // Turn the light off
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}

// Output:

// The light is ON
// The light is OFF