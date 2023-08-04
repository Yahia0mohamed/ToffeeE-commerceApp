package DataHandeler;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import displayPackage.Item;
import displayPackage.Order;
import userPackage.*;

public class SQLDataBase {
    Connection DataBase;
    public SQLDataBase(){
        String URL="jdbc:sqlserver://localhost:1433;databaseName=store";
        String username="MyProject";
        String password="1234";
        try {
            this.DataBase=DriverManager.getConnection(URL, username, password);
        } catch (SQLException e) {
            System.out.println("nooo error");
        }
    }
    /**
     * this function saves users data in database
     * @param d data to be saved
     */
    public void saveUser(Data d){
        String name=d.getName();
        String address=d.getAddress();
        String email=d.getEmail();
        String pass=d.getPass();
        String Phone=d.getPhoneNum();
        String Query="insert into Users(customerID,name,address,email,password,phoneNUM)values(?,?,?,?,?,?)";
        try{
            PreparedStatement sql=DataBase.prepareStatement(Query);
            sql.setString(1,getAlphaNumericString(10));
            sql.setString(2, name);
            sql.setString(3, address);
            sql.setString(4, email);
            sql.setString(5, pass);
            sql.setString(6, Phone);
            System.out.println("one user added");
            sql.executeUpdate();
        }catch(SQLException e){
            System.out.println("none changed");
        }
    }
    /**
     * this function saves the order important information
     * @param cID the customer id
     * @param o order object
     */
    public void saveOrder(String cID,Order o){
        String Query="insert into Orders(customerID,price,delivered,address,phoneNUM)values(?,?,?,?,?)";
        try{
            PreparedStatement sql=DataBase.prepareStatement(Query);
            sql.setString(1, cID);
            sql.setDouble(2, o.getPrice());
            sql.setBoolean(3, o.getState());
            sql.setString(4, o.getP_Type().getِAddress());
            sql.setString(5, o.getP_Type().getPhoneNum());
            System.out.println("order is added");
            sql.executeUpdate();
        }catch(SQLException e){
            System.out.println("none changed");
        }
    }
    /**
     * this functon is used to authenticate the data
     * @param em the user email
     * @param pass the user password
     * @return data of the user if found
     */
    public Data loadUser(String em,String pass){
        String Query="select * from Users where Users.email=? and Users.password=?";
        try{
            PreparedStatement sql=DataBase.prepareStatement(Query);
            sql.setString(1,em);
            sql.setString(2, pass);
            ResultSet u= sql.executeQuery();
            Data User=new Data();
            if(u.next()==false){
                System.out.println("no user found");
                return User;
            }else{
                User.setEmail(u.getString("email"));
                User.setAddress(u.getString("address"));
                User.setPass(u.getString("password"));
                User.setId(u.getString("customerID"));
                User.setName(u.getString("name"));
                User.setPhoneNum(u.getString("phoneNUM"));
                return User;
            }
        }catch(SQLException e){
            System.out.println("not found");
        }
        return new Data();
    }
    /**
     * this function loads the cataloge from our data base
     * @return array of items
     */
    public ArrayList<Item> loadCataloge(){
        String Query="select * from items";
        try{
            PreparedStatement sql=DataBase.prepareStatement(Query);
            ResultSet rs=sql.executeQuery();
            ArrayList<Item> ret=new ArrayList<Item>();
            while(rs.next()){
                Item toadd=new Item(rs.getString("name"),rs.getFloat("price"),rs.getString("itemID"),rs.getFloat("discountVal"),rs.getInt("stored"));
                ret.add(toadd);
            }
            return ret;
        }catch(SQLException e){
            System.out.println("none changed");
        }
        return new ArrayList<Item>();
    }
    /**
     * set the id's for the all generated users or items
     * @param n
     * @return
     */
    static String getAlphaNumericString(int n){
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+ "0123456789"+ "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            int index= (int)(AlphaNumericString.length()* Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }
}
