/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0101;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Nam Ast
 */
public class Employee implements Comparable<Employee> {
     private String Id;
    private String FirstName;
    private String LastName;
    private String Phone;
    private String Email;
    private String Address;
    private Date DOB;
    private String Sex;
    private double Salary;
    private String Agency;

    public Employee() {
    }

    public Employee(String Id, String FirstName, String LastName, String Phone, String Email, String Address, Date DOB, String Sex, double Salary, String Agency) {
        this.Id = Id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Phone = Phone;
        this.Email = Email;
        this.Address = Address;
        this.DOB = DOB;
        this.Sex = Sex;
        this.Salary = Salary;
        this.Agency = Agency;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public String getAgency() {
        return Agency;
    }

    public void setAgency(String Agency) {
        this.Agency = Agency;
    }

    @Override
    public String toString() {
        SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
        return  Id + "\t" + FirstName + "\t" + LastName + "\t" + Phone + "\t" + Email + "\t" + Address + "\t" + sm.format(DOB) + "\t" + Sex + "\t" + Salary + "\t" + Agency ;
    }
    
    @Override
    public int compareTo(Employee o) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         return Salary > o.getSalary() ? 1 : -1;
    }
    
    

    
}
