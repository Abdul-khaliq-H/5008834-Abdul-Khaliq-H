package BuilderPatternExample;

public class TestBuilderPattern {
    public static void main(String[] args) {
        // Creating a Computer object with all attributes
        Computer gamingPC = new Computer.ComputerBuilder("Intel Core i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA GeForce RTX 3080")
                .setPowerSupply("750W")
                .build();

        // Creating a Computer object with only essential attributes
        Computer officePC = new Computer.ComputerBuilder("Intel Core i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .build();

        // Displaying the configurations
        System.out.println("Gaming PC Configuration:");
        System.out.println("CPU: " + gamingPC.getCPU());
        System.out.println("RAM: " + gamingPC.getRAM());
        System.out.println("Storage: " + gamingPC.getStorage());
        System.out.println("GPU: " + gamingPC.getGPU());
        System.out.println("Power Supply: " + gamingPC.getPowerSupply());

        System.out.println("\nOffice PC Configuration:");
        System.out.println("CPU: " + officePC.getCPU());
        System.out.println("RAM: " + officePC.getRAM());
        System.out.println("Storage: " + officePC.getStorage());
    }
}

// Output:
// Gaming PC Configuration:
// CPU: Intel Core i9
// RAM: 32GB
// Storage: 1TB SSD
// GPU: NVIDIA GeForce RTX 3080
// Power Supply: 750W

// Office PC Configuration:
// CPU: Intel Core i5
// RAM: 16GB
// Storage: 512GB SSD

