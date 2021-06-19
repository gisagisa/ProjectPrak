/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectprak.model;

import java.sql.*;
import projectprak.Connector;

/**
 *
 * @author user
 */
public class ModelCustomer {
    Customer data[] = new Customer[500]; 
    Connector connector = new Connector();  
    
    
    public Customer[] getAll(){
         try{
            int jmlData = 0; //menampung jumlah data sebanyak jumlah data yang ada, defaultnya 0
            String query = "Select * from `customer`"; //proses pengambilan data
            connector.statement = connector.koneksi.createStatement();
            ResultSet resultSet = connector.statement.executeQuery(query); //result isinya tabel belum berupa string
            while(resultSet.next()){ //konversi tabel ke string
                int id = resultSet.getInt("id");
                int umur = resultSet.getInt("umur");
                String no_ktp = resultSet.getString("no_ktp");
                String no_telp = resultSet.getString("no_telp");
                String nama = resultSet.getString("nama");
                data[jmlData] = new Customer(nama,no_ktp,no_telp,umur,id);
                jmlData++;
            }
            connector.statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
    return data;
    }
    
    public Customer getOne(String ids){
         try{
            String query = "Select * from `customer` where `nama` ='"+ids+"'"; //proses pengambilan data
            connector.statement = connector.koneksi.createStatement();
            ResultSet resultSet = connector.statement.executeQuery(query); //result isinya tabel belum berupa string
            while(resultSet.next()){ //konversi tabel ke string
                int id = resultSet.getInt("id");
                int umur = resultSet.getInt("umur");
                String no_ktp = resultSet.getString("no_ktp");
                String no_telp = resultSet.getString("no_telp");
                String nama = resultSet.getString("nama");
                data[0] = new Customer(nama,no_ktp,no_telp,umur,id);
            }
            connector.statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
    return data[0];
    }
    
     public String create(Customer customer){
         String message = "Bad Request";
         try{
                int umur = customer.getUmur();
                String no_ktp = customer.getNo_ktp();
                String no_telp = customer.getNo_telp();
                String nama = customer.getNama();
            String query = "INSERT INTO `customer`(`umur`, `no_ktp`,`no_telp`,`nama`) VALUES ("+umur+",'"+no_ktp+"','"+no_telp+"','"+nama+"')"; 
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query); 
            message = "Queri Berhasil";
            connector.statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
    return message;
    }
    
    
    
    
    
}
