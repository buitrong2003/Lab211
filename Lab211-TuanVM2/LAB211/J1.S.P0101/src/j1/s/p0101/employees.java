/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0101;

import java.util.Date;

/**
 *
 * @author Nam Ast
 */
class employees implements Comparable<employees> {
    private String ID;
    private String Firstname;
    private String Lastname;
    private String Phone;   
    private String Email;
    private String Address;
    private Date DOB;
    private String Sex ; 
    private double Salary ;
    private String Agency;

    public employees() {
    }

    public employees(String ID, String Firstname, String Lastname, String Phone,String Email, String Address, Date DOB, String Sex, double Salary, String Agency) {
        this.ID = ID;
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Phone = Phone;
        this.Email = Email ;
        this.Address = Address;
        this.DOB = DOB;
        this.Sex = Sex;
        this.Salary = Salary;
        this.Agency = Agency;
    }

    public String getID() {
        return ID;
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getPhone() {
        return Phone;
    }

    public String getAddress() {
        return Address;
    }

    public Date getDOB() {
        return DOB;
    }

    public String getSex() {
        return Sex;
    }

    public double getSalary() {
        return Salary;
    }

    public String getAgency() {
        return Agency;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    @Override
    public String toString() {
        return  ID + "\t" + Firstname+ "\t" + Lastname+ "\t" + Phone+ "\t" + Email+ "\t" + Address+ "\t" +DOB+ "\t" +Sex+ "\t" + Salary+ "\t" + Agency ;
    }

   

    @Override
    public int compareTo(employees o) {
        return Salary > o.getSalary() ? 1 : -1 ;
    }
    
}
