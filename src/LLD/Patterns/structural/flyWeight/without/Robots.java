package LLD.Patterns.structural.flyWeight.without;

public class Robots {
    private Sprites sprites;
    private int x;
    private  int y;
    private String type;

    public Robots(Sprites sprites, int x, int y, String type) {
        this.sprites = sprites;
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
