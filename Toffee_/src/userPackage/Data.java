package userPackage;
public class Data {
    private String Id;
    private String Name;
    private String Email;
    private String pass;
    private String Address;
    private String phoneNum;
    public Data(){}
    public Data(String Name,String Email,String Address,String pass, String phoneNum,String id){
        this.Name=Name;
        this.Email=Email;
        this.Address=Address;
        this.pass=pass;
        this.phoneNum=phoneNum;
        this.Id=id;
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
        return "The full info is (" +"Name : "+Name+", E-mail : "+Email+", Address: " +Address
                +"pass : "+pass+"Phone Number : " +phoneNum+". ";
    }
}