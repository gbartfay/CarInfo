package bme.hu.carinfo.model.sugarorm;

import java.util.Objects;


import com.google.gson.annotations.SerializedName;
import com.orm.SugarRecord;


public class Car  extends SugarRecord {
  
  @SerializedName("brand")
  private String brand = null;
  
  @SerializedName("model")
  private String model = null;
  
  @SerializedName("year")
  private Integer year = null;
  
  @SerializedName("engine")
  private String engine = null;
  
  @SerializedName("weight")
  private Integer weight = null;
  
  @SerializedName("power")
  private Integer power = null;
  
  @SerializedName("doors")
  private Integer doors = null;
  
  @SerializedName("fuel")
  private String fuel = null;
  

  
  /**
   * Brand name
   **/

  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }

  
  /**
   * Model name
   **/

  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  
  /**
   * Year of production
   **/

  public Integer getYear() {
    return year;
  }
  public void setYear(Integer year) {
    this.year = year;
  }

  
  /**
   * Engine description
   **/

  public String getEngine() {
    return engine;
  }
  public void setEngine(String engine) {
    this.engine = engine;
  }

  
  /**
   * Weight of the car
   **/

  public Integer getWeight() {
    return weight;
  }
  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  
  /**
   * Power of the car
   **/

  public Integer getPower() {
    return power;
  }
  public void setPower(Integer power) {
    this.power = power;
  }

  
  /**
   * Number of doors
   **/

  public Integer getDoors() {
    return doors;
  }
  public void setDoors(Integer doors) {
    this.doors = doors;
  }

  
  /**
   * Fuel type
   **/

  public String getFuel() {
    return fuel;
  }
  public void setFuel(String fuel) {
    this.fuel = fuel;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Car car = (Car) o;
    return Objects.equals(brand, car.brand) &&
        Objects.equals(model, car.model) &&
        Objects.equals(year, car.year) &&
        Objects.equals(engine, car.engine) &&
        Objects.equals(weight, car.weight) &&
        Objects.equals(power, car.power) &&
        Objects.equals(doors, car.doors) &&
        Objects.equals(fuel, car.fuel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, model, year, engine, weight, power, doors, fuel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Car {\n");
    
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    power: ").append(toIndentedString(power)).append("\n");
    sb.append("    doors: ").append(toIndentedString(doors)).append("\n");
    sb.append("    fuel: ").append(toIndentedString(fuel)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
