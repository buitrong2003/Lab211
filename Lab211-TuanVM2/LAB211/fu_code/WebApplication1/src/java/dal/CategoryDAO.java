/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;
import java.util.ArrayList;
import java.util.List;
import model.Category ;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Nam Ast
 */
public class CategoryDAO {
    private PreparedStatement connection;
    //Lay toan bo du lieu tu bang category ra 
    public List<Category> getAll(){
        List<Category> list = new ArrayList<Category> ();
        String sql = "select * from Categories" ;
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs= st.executeQuery();
            while(rs.next())
            {
                Category c =new Category() ;
                c.setId(sql);
                c.setName(sql);
                c.setDescribe(sql);
                list.add(c) ;
            }
        }
        catch (SQLException e)
                {
                    System.out.println(e);  
                }
        return list ;
    }
    public static void main(String[] args) {
        CategoryDAO c=new CategoryDAO() ;
        List<Category> list = new c.getAll() ;
        System.out.println(list.get(0).getName());
    }
}
