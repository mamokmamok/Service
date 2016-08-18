package improject.dl.entities;

import com.google.gson.annotations.SerializedName;
import improject.dl.Type;

/**
 * Created by mamok on 8/17/2016.
 */
public class Motorcycle extends BaseEntity{
    @SerializedName("MotorNumber")
    private String number;
    @SerializedName("MotorType")
    private MotorcycleType motoType;
    @SerializedName("Weight")
    private double weight;
    @SerializedName("Cc")
    private double cc;

    public Motorcycle(Motorcycle motorcycle) {
        this(motorcycle.getId(), motorcycle.getType(), motorcycle.getNumber(), motorcycle.getMotoType(), motorcycle.getWeight(), motorcycle.getCc());
    }

    public Motorcycle(Long id, Type type, String number, MotorcycleType motoType, double weight, double cc) {
        super(id, type);
        this.number = number;
        this.motoType = motoType;
        this.weight = weight;
        this.cc = cc;
    }

    public Motorcycle(BaseEntity entity, String number, MotorcycleType motoType, double weight, double cc) {
        super(entity);
        this.number = number;
        this.motoType = motoType;
        this.weight = weight;
        this.cc = cc;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public MotorcycleType getMotoType() {
        return motoType;
    }

    public void setMotoType(MotorcycleType motoType) {
        this.motoType = motoType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }
}
