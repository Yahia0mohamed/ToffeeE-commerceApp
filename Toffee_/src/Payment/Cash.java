package Payment;
import java.util.*;

public class Cash implements Payment{
    Scanner input=new Scanner(System.in);
    public void startPayment(){
        System.out.println("Enter the shipping address");
        String x =input.nextLine();
        setAddress(x);
        System.out.println("Enter your phone number");
        String n=input.nextLine();
        setPhoneNum(n);
        System.out.println("Do you want to checkout \n(1)Yes  (2)No");
        int c =input.nextInt();
        if(c==1){
            System.out.println("save purchase");
            return;
        }else{
            System.exit(0);
        }
}
    protected String phoneNum;
    protected String address;

    public String getPhoneNum(){return phoneNum;}
    public void setPhoneNum(String phoneNum){this.phoneNum=phoneNum;}
    public String getِAddress(){return address;}
    public void setAddress(String address){this.address=address;}
}
