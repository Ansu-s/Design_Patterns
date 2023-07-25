package designPattens;

public class FacadePattern {



    static class CPU {
        public void processData() {
            System.out.println("CPU: Processing data...");
        }
    }


    static class Memory {
        public void load() {
            System.out.println("Memory: Loading data...");
        }
    }


    static class HardDrive {
        public void readData() {
            System.out.println("Hard Drive: Reading data...");
        }
    }


    static class ComputerFacade {
        private CPU cpu;
        private Memory memory;
        private HardDrive hardDrive;

        public ComputerFacade() {
            cpu = new CPU();
            memory = new Memory();
            hardDrive = new HardDrive();
        }

        public void startComputer() {
            System.out.println("ComputerFacade: Starting computer...");
            cpu.processData();
            memory.load();
            hardDrive.readData();
            System.out.println("ComputerFacade: Computer started and ready to use.");
        }
    }


        public static void main(String[] args) {

            ComputerFacade computerFacade = new ComputerFacade();
            computerFacade.startComputer();
        }
    }


