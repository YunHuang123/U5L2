public class Prism {
    private int length;
    private int width;
    private int height;

    public Prism (int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }
    public Prism (int s) {
        length = s;
        width = s;
        height = s;
    }
    public Prism () {
        int random = (int)(Math.random() * 91) + 10;
        length = random;
        width = random;
        height = random;
    }


    public void setLength (int l) {
        length = l;
    }
    public void setWidth (int w) {
        width = w;
    }
    public void setHeight (int h) {
        height = h;
    }

    public String toString () {
        return "Length: " + length + "\nWidth: " + width + "\nHeight: " + height;
    }

    public int getVolume () {
        return length * width * height;
    }
    public int getSurfaceArea () {
        return 2 * (length * width) + 2 * (length * height) + 2 * (width * height);
    }

}
