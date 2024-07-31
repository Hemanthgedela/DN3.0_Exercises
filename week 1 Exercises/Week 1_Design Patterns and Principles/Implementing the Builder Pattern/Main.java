
public class Main {
    public static void main(String[] args) {
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3080")
                .setOperatingSystem("Windows 11")
                .build();

        Computer officeComputer = new Computer.Builder("Intel i5", "16GB")
                .setStorage("512GB SSD")
                .setOperatingSystem("Windows 10")
                .build();

        Computer basicComputer = new Computer.Builder("Intel i3", "8GB")
                .build();

        System.out.println(gamingComputer);
        System.out.println(officeComputer);
        System.out.println(basicComputer);
    }
}

