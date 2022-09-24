package compositionExample;
class Test {

int i;

  // create private constructor
  private Test () {
    i = 5;
  }

  // create a public static method
  public static void instanceMethod() {

    // create an instance of Test class
    Test obj = new Test();
    obj.i = 5;
  }

}

class Main {

  public static void main(String[] args) {

    // call the instanceMethod()
    Test.instanceMethod();
  }
}