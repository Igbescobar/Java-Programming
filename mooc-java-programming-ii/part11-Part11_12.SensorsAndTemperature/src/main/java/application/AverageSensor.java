package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
  private ArrayList<Sensor> listOfSensors;
  private ArrayList<Integer> listOfAverage;

  public AverageSensor() {
    this.listOfSensors = new ArrayList<>();
    this.listOfAverage = new ArrayList<>();
  }

  public boolean isOn() {
    for (Sensor sensor : listOfSensors) {
      if (sensor.isOn() == false) {
        return false;
      }
    }
    return true;
  }

  public void setOn() {
    for (Sensor sensor : listOfSensors) {
      sensor.setOn();
    }
  }

  public void setOff() {
    for (Sensor sensor : listOfSensors) {
      sensor.setOff();
    }
  }

  public int read() {
    if (isOn() == false || listOfSensors.isEmpty()) {
      throw new IllegalStateException();
    }
    int total = 0;
    int number = 0;
    for (Sensor sensor : listOfSensors) {
      total += sensor.read();
      number++;
    }
    int average = total / number;
    listOfAverage.add(average);
    return average;
  }

  public void addSensor(Sensor toAdd) {
    listOfSensors.add(toAdd);
  }

  public List<Integer> readings() {
    return listOfAverage;
  }
}
