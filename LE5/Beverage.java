abstract class Beverage{ //error:didn't declare abstract
   
    private void pour(int qty){
        System.out.println("Pour "+qty+" ml of beverage.");
    }
    protected abstract void addCondiment();
    protected void stir(){};//hook always add braces while declaring
    private void serve(){
        System.out.println("Serve through waiter");
    }
    
    public void templateMethod(int qty){
        pour(qty);
        addCondiment();
        stir();
        serve();
    }
}