package nsbmstudentenrollmentsystem;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class DBOperation {
    String url = "jdbc:mysql://localhost:3306/nsbm";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    int usernamePassword(String username,String password){
        try{
            
            con = (Connection)DriverManager.getConnection(url,this.username,this.password);
            String query = "SELECT * FROM usernamepassword username = ? and password = ?";
            pst = (PreparedStatement)con.prepareStatement(query);
            pst.setString(1,username);
            pst.setString(2,password);
            rs = pst.executeQuery();
            if(rs.next())
                return 1;
            return 1;
        }catch(Exception e){
            System.out.println(5);
            return 1;
        }
    }
    
    void addUStudent(UndergraduateDetails ud){
        try{
           con = (Connection)DriverManager.getConnection(url,this.username,this.password);
           String query = "INSERT INTO undergraduate_student VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
           pst = (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,ud.getUid());
           pst.setString(2,ud.getIname());
           pst.setString(3,ud.getFname());
           pst.setString(4,ud.getAddress());
           pst.setInt(5, ud.getDob());
           pst.setString(6,ud.getGender());
           pst.setInt(7,ud.getMobile());
           pst.setString(8,ud.getEmail());
           pst.setString(9,ud.getScheme());
           pst.setInt(10,ud.getYear());
           pst.setInt(11,ud.getIndex());
           pst.setString(12,ud.getZscore());
           pst.setString(13,ud.getSub1());
           pst.setString(14,ud.getSub2());
           pst.setString(15,ud.getSub3());
           pst.setString(16,ud.getRes1());
           pst.setString(17,ud.getRes2());
           pst.setString(18,ud.getRes3());
           pst.setString(19,ud.getFaculty());
           pst.setString(20,ud.getIntake());
           
           pst.executeUpdate();
        
        }catch(Exception e){}
        
    }
    void updateUStudent(UndergraduateDetails ud,String s){
        try{
           con = (Connection)DriverManager.getConnection(url,this.username,this.password);
           String query = "UPDATE undergraduate_student SET iname = ?,fname=?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) WHERE uid = ?";
           pst = (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,ud.getUid());
           pst.setString(2,ud.getIname());
           pst.setString(3,ud.getFname());
           pst.setString(4,ud.getAddress());
           pst.setInt(5, ud.getDob());
           pst.setString(6,ud.getGender());
           pst.setInt(7,ud.getMobile());
           pst.setString(8,ud.getEmail());
           pst.setString(9,ud.getScheme());
           pst.setInt(10,ud.getYear());
           pst.setInt(11,ud.getIndex());
           pst.setString(12,ud.getZscore());
           pst.setString(13,ud.getSub1());
           pst.setString(14,ud.getSub2());
           pst.setString(15,ud.getSub3());
           pst.setString(16,ud.getRes1());
           pst.setString(17,ud.getRes2());
           pst.setString(18,ud.getRes3());
           pst.setString(19,ud.getFaculty());
           pst.setString(20,ud.getIntake());
           pst.setString(21, s);
           
           pst.executeUpdate();
        
        }catch(Exception e){System.out.println(e);}
        
    }
    void deleteUStudent(String s){
        try{
           con = (Connection)DriverManager.getConnection(url,this.username,this.password);
           String query = "DELETE FROM undergraduate_student WHERE uid = ?";
           pst = (PreparedStatement)con.prepareStatement(query);
           pst.setString(1,s);
           
           pst.executeUpdate();
        
        }catch(Exception e){System.out.println(e);}
    }
    
    
    void addPStudent(PostgraduateDetails pd){
        try{
           con = (Connection)DriverManager.getConnection(url,this.username,this.password);
           String query = "INSERT INTO postgraduate_student VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
           pst = (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,pd.getUid());
           pst.setString(2,pd.getIname());
           pst.setString(3,pd.getFname());
           pst.setString(4,pd.getAddress());
           pst.setInt(5, pd.getDob());
           pst.setString(6,pd.getGender());
           pst.setInt(7,pd.getMobile());
           pst.setString(8,pd.getEmail());
           pst.setString(9,pd.getUgdegree());
           pst.setString(10,pd.getInstitute());
           pst.setInt(11,pd.getYear());
           pst.setString(12,pd.getFaculty());
           
           pst.executeUpdate();
        
        }catch(Exception e){JOptionPane.showMessageDialog(null, "Invalid Data Entry in One or More Fields,Please Check!!!");}
    }
    
    void updatePStudent(PostgraduateDetails pd,String s){
        try{
           con = (Connection)DriverManager.getConnection(url,this.username,this.password);
           String query = "INSERT INTO postgraduate_student VALUES (?,?,?,?,?,?,?,?,?,?,?,?) WHERE pid = ?";
           pst = (PreparedStatement)con.prepareStatement(query);
           pst.setInt(1,pd.getUid());
           pst.setString(2,pd.getIname());
           pst.setString(3,pd.getFname());
           pst.setString(4,pd.getAddress());
           pst.setInt(5, pd.getDob());
           pst.setString(6,pd.getGender());
           pst.setInt(7,pd.getMobile());
           pst.setString(8,pd.getEmail());
           pst.setString(9,pd.getUgdegree());
           pst.setString(10,pd.getInstitute());
           pst.setInt(11,pd.getYear());
           pst.setString(12,pd.getFaculty());
           pst.setString(13, s);
           
           pst.executeUpdate();
        
        }catch(Exception e){JOptionPane.showMessageDialog(null, "Invalid Data Entry in One or More Fields,Please Check!!!");}
    }
    void deletePStudent(String s){
        try{
           con = (Connection)DriverManager.getConnection(url,this.username,this.password);
           String query = "DELETE FROM postgraduate_student WHERE pid = ?";
           pst = (PreparedStatement)con.prepareStatement(query);
           pst.setString(1,s);
           
           pst.executeUpdate();
        
        }catch(Exception e){System.out.println(e);}
    }
    
    
    public ResultSet find(String s){
        try{
           con = (Connection)DriverManager.getConnection(url,this.username,this.password);
           String query = "SELECT * FROM subject WHERE subject_id = ?";
           pst = (PreparedStatement)con.prepareStatement(query);
           pst.setString(1, s);
           rs = pst.executeQuery();
        }catch(Exception e){}
        
        return rs;
    }
    
    public ResultSet findUStudent(String s){
        try{
           con = (Connection)DriverManager.getConnection(url,this.username,this.password);
           String query = "SELECT * FROM undergraduate_student WHERE uid = ?";
           pst = (PreparedStatement)con.prepareStatement(query);
           pst.setString(1, s);
           rs = pst.executeQuery();
        }catch(Exception e){}
        
        return rs;
    }
    
    public ResultSet findPStudent(String s){
        try{
           con = (Connection)DriverManager.getConnection(url,this.username,this.password);
           String query = "SELECT * FROM postgraduate_student WHERE pid = ?";
           pst = (PreparedStatement)con.prepareStatement(query);
           pst.setString(1, s);
           rs = pst.executeQuery();
        }catch(Exception e){}
        
        return rs;
    }
    
    public Connection getConnection(){
        try{
            con = (Connection)DriverManager.getConnection(url,this.username,this.password);
        }
        catch(Exception e){}
        return con;
    }
    
    public ResultSet findResult(String s){
        try{
           con = (Connection)DriverManager.getConnection(url,this.username,this.password);
           String query = "SELECT * FROM result WHERE IndexNo = ?";
           pst = (PreparedStatement)con.prepareStatement(query);
           pst.setString(1, s);
           rs = pst.executeQuery();
        }catch(Exception e){}
        
        return rs;
    }
    
    
    
    
}

