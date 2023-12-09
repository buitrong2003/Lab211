/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import model.Department;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
import java.sql.SQLException;
import model.Employee;
public class DAO extends DBContext{
      public List<Department> getAll(){
        List<Department> list = new ArrayList<>();
        String sql="select * from department";
        try{          
            PreparedStatement st = connection.prepareStatement(sql);
             ResultSet rs = st.executeQuery();
            while(rs.next()){
            list.add(new Department(rs.getInt("id"), rs.getString("name")));
        }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
    
    public List<Employee> getAllEmp(int did){
        List<Employee> list = new ArrayList<>();
        String sql = "select e.id,e.name,e.dob,e.gender,d.id as did,d.name as dname "
                + " from Employee e inner join Department d\n"
                + " on (d.id=e.did)";
        if(did!=0){
           sql += " where did=" + did;
        }
        try{          
            PreparedStatement st = connection.prepareStatement(sql);
             ResultSet rs = st.executeQuery();
            while(rs.next()){
            Department d = new Department(rs.getInt("did"), rs.getString("dname"));
            Employee e = new Employee(rs.getInt("id"), rs.getString("name"),
                      rs.getString("dob"), rs.getBoolean("gender"), d);
            list.add(e);
        }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
    
    public Employee getEmpById(int id){
        List<Employee> list = new ArrayList<>();
        String sql = "select e.id,e.name,e.dob,e.gender,d.id as did,d.name as dname "
                + " from Employee e inner join Department d\n"
                + " on (d.id=e.did) where e.id=?";
       
        try{          
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
             ResultSet rs = st.executeQuery();
            while(rs.next()){
            Department d = new Department(rs.getInt("did"), rs.getString("dname"));
            Employee e = new Employee(rs.getInt("id"), rs.getString("name"),
                      rs.getString("dob"), rs.getBoolean("gender"), d);
            return e;
        }
        }catch(SQLException e){
            System.out.println(e);
        }
      
      return null;
    }
   public void update(Employee e){
       String sql = "update Employee set name=?, dob=? , gender=?, did =? where id=?";
       try{
           PreparedStatement st = connection.prepareStatement(sql);
           st.setString(1, e.getName());
           st.setString(2, e.getDob());
           st.setBoolean(3, e.isGender());
           st.setInt(4, e.getDept().getId());
           st.setInt(5, e.getId());
           st.executeUpdate();
       }catch(SQLException ex){
           
       }
   }
}

    


