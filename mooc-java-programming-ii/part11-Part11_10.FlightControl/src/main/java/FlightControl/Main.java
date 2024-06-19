package FlightControl;

import java.util.Scanner;

import FlightControl.logic.FlightControl;
import FlightControl.ui.TextUI;

public class Main {

  public static void main(String[] args) {
    FlightControl testFC = new FlightControl();
    Scanner sc = new Scanner(System.in);

    TextUI ui = new TextUI(testFC, sc);

    ui.start();
  }
}
