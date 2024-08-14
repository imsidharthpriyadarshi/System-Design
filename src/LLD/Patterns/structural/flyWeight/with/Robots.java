package LLD.Patterns.structural.flyWeight.with;

public class Robots {
    private int x,y;
    private RobotType robotType;

    public RobotType getRobotType() {
        return robotType;
    }

    public void setRobotType(RobotType robotType) {
        this.robotType = robotType;
    }

    public Robots(int x, int y, RobotType type) {
        this.x = x;
        this.y = y;
        this.robotType=type;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
