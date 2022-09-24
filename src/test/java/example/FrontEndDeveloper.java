package example;

public class FrontEndDeveloper implements Developer {

    public void develop() {
        this.writeJavaScript();
    }

    public void writeJavaScript() {
        System.out.println("Writes java script code");
    }
}
