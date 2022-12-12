package Homework1.ModelElements;

public class Flash {

    private Point3D location;
    private Angle3D angle;
    private Color color;
    private Float power;

    public Point3D getLocation() {
        return location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public Color getColor() {
        return color;
    }

    public Float getPower() {
        return power;
    }

    public void setLocation(Point3D location) {
        this.location = location;
    }

    public void setAngle(Angle3D angle) {
        this.angle = angle;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPower(Float power) {
        this.power = power;
    }

    public Flash(Point3D location, Angle3D angle, Color color, Float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public void Rotate(Angle3D angle) {
        //TODO: Поворачивает Flash
    }

    public void Move(Point3D point) {
        //TODO: Перемещает Flash
    }

}
