package userPackage;
public class Data {
    private String Id;
    private String Name;
    private String Email;
    private String pass;
    private String Address;
    private String phoneNum;
    public Data (Data d){
        this.Name=d.Name;
        this.Email=d.Email;
        this.Address=d.Address;
        this.pass=d.pass;
        this.phoneNum=d.phoneNum;
        this.Id=d.Id;
    }
    public Data(){}
    public Data(String Name,String Email,String Address,String pass, String phoneNum){
        this.Name=Name;
        this.Email=Email;
        this.Address=Address;
        this.pass=pass;
        this.phoneNum=phoneNum;
    }
    public void setId(String id) {
        Id=id;
    }
    public String getId() {
        return Id;
    }
    public void setPhoneNum(String PhoneNum) {
        phoneNum=PhoneNum;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getName() {
        return Name;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getEmail() {
        return Email;
    }
    public void setPass(String Pass) {
        pass = Pass;
    }
    public String getPass() {
        return pass;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public String getAddress() {
        return Address;
    }
    public String ReturnInfo(){
        return "The full info is (" +"Name : "+Name+", E-mail : "+Email+", Address: " +Address+" Phone Number : " +phoneNum+")";
    }
}