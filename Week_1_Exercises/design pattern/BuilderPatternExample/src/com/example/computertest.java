package com.example;

public class computertest {
    public static void main(String[] args) {
        
        computer normalComputer = new computer.Builder()
                .setCPU("Intel i7")
                .setRAM("8GB")
                .setStorage("512GB SSD")
                .build();

        
        computer advancedComputer = new computer.Builder()
                .setCPU("Intel i9")
                .setRAM("64GB")
                .setStorage("4TB SSD")
                .setGPU("NVIDIA GTX 1650")
                .setCoolingSystem("Nitrogen Cooling")
                .build();

        System.out.println("Normal Computer: " + normalComputer);
        System.out.println("Advanced Computer: " + advancedComputer);
}
}
