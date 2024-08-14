package LLD.Patterns.structural.flyWeight.with;

public class RobotType {
    //!this class should be immutable
    private Sprites sprites;
    private String type;

    public RobotType(Sprites sprites, String type) {
        this.sprites = sprites;
        this.type = type;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public String getType() {
        return type;
    }
}
