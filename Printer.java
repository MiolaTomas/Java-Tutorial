// This (<T>) is a type parameter, we can call it whatever we want, calling it "T" is just a convention
public class Printer <T> {
    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}
