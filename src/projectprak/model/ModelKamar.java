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
public class ModelKamar {
    Kamar data[] = new Kamar[100]; 
    Connector connector = new Connector();  
    
    
    public Kamar[] getAll(){
         try{
            int jmlData = 0; //menampung jumlah data sebanyak jumlah data yang ada, defaultnya 0
            String query = "Select * from `kamar`"; //proses pengambilan data
            connector.statement = connector.koneksi.createStatement();
            ResultSet resultSet = connector.statement.executeQuery(query); //result isinya tabel belum berupa string
            while(resultSet.next()){ //konversi tabel ke string
                int id = resultSet.getInt("id");
                int status = resultSet.getInt("status");
                int kapasitas = resultSet.getInt("kapasitas");
                int harga = resultSet.getInt("harga");
                String tipe = resultSet.getString("tipe");
                String nomor = resultSet.getString("nomor");
                data[jmlData] = new Kamar(status,tipe,kapasitas,nomor,harga,id);
                jmlData++;
            }
            connector.statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
    return data;
    }
    
    public Kamar getOne(String ids){
         try{
            String query = "Select * from `kamar` where `nomor` ='"+ids+"'"; //proses pengambilan data
            connector.statement = connector.koneksi.createStatement();
            ResultSet resultSet = connector.statement.executeQuery(query); //result isinya tabel belum berupa string
            while(resultSet.next()){ //konversi tabel ke string
                int id = resultSet.getInt("id");
                int status = resultSet.getInt("status");
                int kapasitas = resultSet.getInt("kapasitas");
                int harga = resultSet.getInt("harga");
                String tipe = resultSet.getString("tipe");
                String nomor = resultSet.getString("nomor");
                data[0] = new Kamar(status,tipe,kapasitas,nomor,harga,id);
            }
            connector.statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
    return data[0];
    }
    
     public String create(Kamar kamar){
         String message = "Bad Request";
         try{
                int status = 0;
                int kapasitas = kamar.getKapasitas();
                int harga = kamar.getHarga();
                String tipe = kamar.getTipe();
                String nomor = kamar.getNomor();
            String query = "INSERT INTO `kamar`(`status`, `kapasitas`,`harga`,`tipe`,`nomor`) VALUES ("+status+","+kapasitas+","+harga+",'"+tipe+"','"+nomor+"')"; 
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
    public String update_status(int id, int status) {
        String message = "Bad Request";
        try {
            String query = "UPDATE kamar SET status = " + status + " WHERE id = '" + id + "'";
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query);
            message = "Queri Berhasil";
            connector.statement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
        return message;
    }
    
}
