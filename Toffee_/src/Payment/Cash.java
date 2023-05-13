package Payment;
import java.lang.String;
import java.util.Scanner;

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
        checkOut(c);
}

    public boolean checkOut(int x) {
        x=0;
        if(x==1){
            return true;
        }
        return false;
    }

    protected String phoneNum;
    protected String address;

    public String getPhoneNum(){return phoneNum;}
    public void setPhoneNum(String phoneNum){this.phoneNum=phoneNum;}
    public String getِAddress(){return address;}
    public void setAddress(String address){this.address=address;}
}
