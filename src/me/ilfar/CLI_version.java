package me.ilfar;

import java.util.Scanner;
import me.ilfar.Bus;

public class CLI_version {
    public static void main(String[] args) {
        boolean notExit=true;
        while(notExit) do {
            System.out.println();
            System.out.println("1. Создать автобус");
            System.out.println("2. Добавить пассажира в автобус");
            System.out.println("3. Поместить автобус в очередь");

            Scanner StringIn = new Scanner(System.in);
            Scanner intIn = new Scanner(System.in);

            int input = intIn.nextInt();

            switch (input) {
                case 1: {
                    String driverName = StringIn.nextLine();
                    String licencePlate = StringIn.nextLine();

                    Bus newBus = new Bus(licencePlate, driverName);
                }
                case 2: {
                    String passengerName = StringIn.nextLine();
                    String passengerFare = StringIn.nextLine();

                    Passenger newPassenger = new Passenger(passengerName, passengerFare); //создали нового пассажира
                    
                    Push(newPassenger);
                }
            }
        }

    }
}
