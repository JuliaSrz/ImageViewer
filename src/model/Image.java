package model;

public class Image {
    private final String name;
    private Bitmap Bitmap;
    private Image prev;
    private Image next;

    public Image(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Bitmap getBitmap() {
        return Bitmap;
    }

    public Image getPrev() {
        return prev;
    }

    public Image getNext() {
        return next;
    }

    public void setBitmap(Bitmap Bitmap) {
        this.Bitmap = Bitmap;
    }

    public void setPrev(Image prev) {
        this.prev = prev;
    }

    public void setNext(Image next) {
        this.next = next;
    }    
    
}
