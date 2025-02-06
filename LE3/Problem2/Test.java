interface Testable{
    void display();
}

class Test implements Testable{
    public void display(){     //Must be declared with an access specfier otherwise gives an error(attempting to assign weaker access privileges; was public)
        System.out.println("test for Test class.");
    }
}