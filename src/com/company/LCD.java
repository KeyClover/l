package com.company;

public class LCD {
    public static int HEIGHT = 25; //default HEIGHT for the LCD display
    public static int WIDTH = 80;  //default WIDE for the LCD display
    public static int CENTER = 1; // alignment to the center
    public static int RIGHT =2;   // alignment to the right
    public static int LEFT = 3;  //alignment to the left

    public static void clearScreen() {

        for (int i = 0; i <= 25; i++ ) {
            System.out.println();
        }

    }

    // ALT+218 = ┌  //ALT+191 = ┐ // ALT+179 = │ // ALT+196 = ─ //ALT+192 = └ //ALT+217 = ┘
    //ALT+195 =├ //ALT+180= ┤

    public static void showMainMenu() {
        clearScreen();
        {
            topConner();

            printMessage("Welcome to Stamford LCD Library Demo", CENTER);
            blankLine();
            printMessage("Select a Function (1-3)", 1); // alignment is CENTER

            middleLine();

            blankLine();
            printMessage("1. Login", 3);
            printMessage("2. Restart", 3);
            printMessage("3. Shutdown",3);
            bottomConner();
        }

    }
    public static void printMessage(String message, int alignment) {
        System.out.print("│ ");
        System.out.print("message length =" + message.length());
        System.out.println(message);

    }

    public static void topConner() {
        System.out.print("┌"); // top right conner
        dashLine(); //Dash between Top right conner and Left conner
        System.out.println("┐"); // top left conner
    }

    public static void middleLine() {
        System.out.print("├"); //Middle left
        dashLine();// A dash line between Middle Left and Middle right line
        System.out.println("┤");//Middle right


    }

    public static void bottomConner() {
        System.out.print("└"); // Bottom left conner
        dashLine(); //dash line between bottom left conner and right conner
        System.out.println("┘"); // Bottom right conner

    }

    public static void dashLine() {
        for(int i = 0; i <= WIDTH-2; i++) {
            System.out.print("─");
        }
    }

    public static void blankLine() {
        System.out.print("│");
        for(int i = 0; i<= WIDTH-2; i++) {
            System.out.print(" ");
        }
        System.out.println("│");
    }



    public static void showLoginMenu() {
        topConner();
        printMessage("Login Menu. Press F1 for more information", 3);
        blankLine();
        printMessage("Enter Username:",3);
        bottomConner();
    }

    public static void showSystemMenu() {

        topConner();
        printMessage(" Select a Function (1-4).",3);
        middleLine();
        blankLine();
        printMessage("1. Change AC Temperature set point",3);
        printMessage("2. Enable/Disable IP Camera",3);
        printMessage("3. Turn anti-theft system on/off.",3);
        printMessage("4. Exit",3);
        bottomConner();
    }

    public static void changeACSetP() {

        topConner();
        printMessage("Applying New Temperature Set Point.",3);
        middleLine();
        blankLine();
        printMessage("New temperature set point will be in",3);
        printMessage("effect soon...",3);
        bottomConner();
        showRestart();

    }

    public static void confirmRestart() {
        topConner();
        printMessage("Restart Confirmation",3);
        middleLine();
        blankLine();
        printMessage("Are you sure that you want to restart",3);
        printMessage("the system? (Y/N)", 3);
        bottomConner();

    }

    public static void confirmShutdown() {

        topConner();
        printMessage("Shutdown Confirmation", 3);
        middleLine();
        blankLine();
        printMessage("Are you sure that you want to shutdown",3);
        printMessage("the system? (Y/N)",3);
        bottomConner();
    }
    public static void showRestart() {

        topConner();
        printMessage("Restarting ....",3);
        middleLine();
        blankLine();
        printMessage("Please wait while the system is",3);
        printMessage("preparing for a restart.",3);
        bottomConner();
    }
    public static void showShutdown() {

        topConner();
        printMessage("Shutting down ....",3);
        middleLine();
        blankLine();
        printMessage("Please wait while the system is",3);
        printMessage("preparing for a shutdown.",3);
        bottomConner();
}

}


