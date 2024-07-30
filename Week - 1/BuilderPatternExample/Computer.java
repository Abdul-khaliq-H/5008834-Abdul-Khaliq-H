package BuilderPatternExample;

public class Computer {
    private String CPU;
    private String RAM;
    private String Storage;
    private String GPU;
    private String PowerSupply;

    // Private constructor to enforce the use of the Builder
    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
        this.GPU = builder.GPU;
        this.PowerSupply = builder.PowerSupply;
    }

    // Getters for Computer attributes
    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return Storage;
    }

    public String getGPU() {
        return GPU;
    }

    public String getPowerSupply() {
        return PowerSupply;
    }

    // Static nested Builder class
    public static class ComputerBuilder {
        private String CPU;
        private String RAM;
        private String Storage;
        private String GPU;
        private String PowerSupply;

        public ComputerBuilder(String CPU) {
            this.CPU = CPU;
        }

        public ComputerBuilder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public ComputerBuilder setStorage(String Storage) {
            this.Storage = Storage;
            return this;
        }

        public ComputerBuilder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public ComputerBuilder setPowerSupply(String PowerSupply) {
            this.PowerSupply = PowerSupply;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

