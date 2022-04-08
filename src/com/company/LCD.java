package com.company;

public class LCD {
    public static int HEIGHT = 25; //default HEIGHT for the LCD display
    public static int WIDTH = 80;  //default WIDE for the LCD display

    public static void clearScreen() {

        for (int i = 0; i <= HEIGHT; i++ ) {
            System.out.println();
        }

    }

    public static void showMainMenu() {
        clearScreen();
        {
          // ALT+218 = ┌  //ALT+191 = ┐ // ALT+179 = │ // ALT+196 = ─ //ALT+192 = └ //ALT+217 = ┘

            System.out.print("┌"); // top right conner
            dashLine(); //Dash between Top right conner and Left conner
            System.out.println("┐"); // top left conner

            System.out.println("|    Welcome to Stamford LCD Library Demo  |");
            System.out.println("|                                          |");
            System.out.println("|        Select a Function (1-3)           |");

            System.out.print("│"); //Middle left
            dashLine();// A dash line between Middle Left and Middle right line
            System.out.println("│");//Middle right

            System.out.println("|                                          |");
            System.out.println("|                  1. Login                |");
            System.out.println("|                  2. Restart              |");
            System.out.println("|                  3. Shutdown             |");

            System.out.print("└"); // Bottom left conner
            dashLine(); //dash line between bottom left conner and right conner
            System.out.println("┘"); // Bottom right conner
        }

    }

    public static void dashLine() {
        for(int i = 0; i <= WIDTH-2; i++) {
            System.out.print("─");
        }
    }




    public static void showLoginMenu() {
        System.out.println(" -------------------------------------------- ");
        System.out.println("| Login Menu. Press F1 for more information. |");
        System.out.println("|--------------------------------------------|");
        System.out.println("|                                            |");
        System.out.println("| Enter Username:                            |");
        System.out.println(" -------------------------------------------- ");
    }

    public static void showSystemMenu() {

        System.out.println(" ------------------------------------------ ");
        System.out.println("| Select a Function (1-4).                 |");
        System.out.println("|------------------------------------------|");
        System.out.println("|                                          |");
        System.out.println("| 1. Change AC Temperature set point       |");
        System.out.println("| 2. Enable/Disable IP Camera              |");
        System.out.println("| 3. Turn anti-theft system on/off.        |");
        System.out.println("| 4. Exit                                  |");
        System.out.println(" ------------------------------------------ ");
    }

    public static void changeACSetP() {

        System.out.println(" ------------------------------------------ ");
        System.out.println("| Applying New Temperature Set Point.      |");
        System.out.println("|------------------------------------------|");
        System.out.println("|                                          |");
        System.out.println("| New temperature set point will be in     |");
        System.out.println("| effect soon...                           |");
        System.out.println(" ------------------------------------------ ");
        showRestart();

    }

    public static void confirmRestart() {
        System.out.println(" ------------------------------------------ ");
        System.out.println("| Restart Confirmation                     |");
        System.out.println("|------------------------------------------|");
        System.out.println("|                                          |");
        System.out.println("| Are you sure that you want to restart    |");
        System.out.println("| the system? (Y/N)                        |");
        System.out.println(" ------------------------------------------ ");

    }

    public static void confirmShutdown() {

        System.out.println(" ------------------------------------------ ");
        System.out.println("| Shutdown Confirmation                    |");
        System.out.println("|------------------------------------------|");
        System.out.println("|                                          |");
        System.out.println("| Are you sure that you want to shutdown   |");
        System.out.println("| the system? (Y/N)                        |");
        System.out.println(" ------------------------------------------ ");
    }
    public static void showRestart() {

        System.out.println(" ------------------------------------------ ");
        System.out.println("| Restarting ....                          |");
        System.out.println("|------------------------------------------|");
        System.out.println("|                                          |");
        System.out.println("| Please wait while the system is          |");
        System.out.println("| preparing for a restart.                 |");
        System.out.println(" ------------------------------------------ ");
    }
    public static void showShutdown() {

        System.out.println(" ------------------------------------------ ");
        System.out.println("| Shutting down ....                       |");
        System.out.println("|------------------------------------------|");
        System.out.println("|                                          |");
        System.out.println("| Please wait while the system is          |");
        System.out.println("| preparing for a shutdown.                |");
        System.out.println(" ------------------------------------------ ");
}

}


