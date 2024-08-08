public class BuilderPatternTest {
    public static void main(String[] args) {
        // Create a Computer with only required parameters
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB").build();
        System.out.println(basicComputer);

        // Create a Computer with some optional parameters
        Computer gamingComputer = new Computer.Builder("Intel i7", "16GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA GTX 3080")
                .build();
        System.out.println(gamingComputer);

        // Create a fully customized Computer
        Computer workstation = new Computer.Builder("AMD Ryzen 9", "32GB")
                .setStorage("2TB NVMe SSD")
                .setGraphicsCard("NVIDIA Quadro RTX 6000")
                .setPowerSupply("750W")
                .setCoolingSystem("Liquid Cooling")
                .build();
        System.out.println(workstation);
    }
}
