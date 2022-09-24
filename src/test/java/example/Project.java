package example;

public class Project {
    private BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
    private FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();

    Project() {
        backEndDeveloper.writeJava();
    }

    public void implement(Developer developer) {
        developer.develop();
        /*backEndDeveloper.writeJava();
        frontEndDeveloper.writeJavaScript();*/
    }
}
