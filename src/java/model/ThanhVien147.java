/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MY PC
 */
public class ThanhVien147 {
        int id;
        String username , password ;
        int role;
    public ThanhVien147() {
    }

    public ThanhVien147(int id, String username, String password,int role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role= role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    
      public Object[] toObject(){
        return new Object[]{
            id,username,password,role
        };
    }      
}
