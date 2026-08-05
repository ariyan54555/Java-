interface Payment{
    void makePayment(double amount);
    void printRecipt();
}
abstract class Order1{
    int orderId;
    String customerName;
    double totalAmount;
    Order1(int orderId, String customerName){
        this.orderId= orderId;
        this.customerName=customerName;
    }
    public void display(){
        System.out.println("Order ID : " + orderId);
        System.out.println("Customer Name : " + customerName);

    }
    abstract void calculateBill();

}
class DineInOrder extends Order1 implements Payment{
    DineInOrder(int orderId, String customerName){
        super(orderId,customerName);
    }
    @Override
    public void makePayment(double amount){
        this.totalAmount=amount;
        System.out.println("Payment Amount : " + amount);
    }
    public void printRecipt(){
        System.out.println("Recipt Printed Successfully");
    }
    public void calculateBill(){
        totalAmount=totalAmount+totalAmount*0.1;
        System.out.println("Service Charge : " + totalAmount*0.1);
        System.out.println("Final Bill : " + totalAmount);
        System.out.println("Payment Successful : " + totalAmount + "Taka");
    }

}
class OnlineOrder extends Order1 implements Payment{
    OnlineOrder(int orderId, String customerName){
        super(orderId,customerName);
    }
    @Override
    public void makePayment(double amount){
        this.totalAmount=amount;
        System.out.println("Payment Amount : " + amount);
    }
    public void printRecipt(){
        System.out.println("Recipt Printed Successfully");
    }
    public void calculateBill(){
        totalAmount=totalAmount+50;
        System.out.println("Service Charge : 50.00" );
        System.out.println("Final Bill : " + totalAmount);
        System.out.println("Payment Successful : " + totalAmount + "Taka");
    }
}
public class oops852026 {
    public static void main(String[] args){

        DineInOrder dineInOrder = new DineInOrder(0,"DineInOrder");
        OnlineOrder onlineOrder = new OnlineOrder(0,"OnlineOrder");
        dineInOrder.display();

        dineInOrder.makePayment(10);
        dineInOrder.calculateBill();
        dineInOrder.printRecipt();

        onlineOrder.makePayment(20);
        onlineOrder.calculateBill();
        onlineOrder.printRecipt();






    }
}
