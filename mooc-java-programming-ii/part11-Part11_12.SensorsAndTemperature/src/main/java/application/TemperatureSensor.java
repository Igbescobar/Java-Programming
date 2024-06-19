package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
  private boolean isOn;

  public TemperatureSensor() {
    this.isOn = false;
  }

  public boolean isOn() {
    return this.isOn;
  }

  public void setOn() {
    this.isOn = true;
  }

  public void setOff() {
    this.isOn = false;
  }

  public int read() {
    if (this.isOn == true) {
      Random random = new Random();
      int randomNumber = random.nextInt(30 - (-30) + 1) + (-30);
      return randomNumber;
    }
    throw new IllegalStateException();
  }
}
