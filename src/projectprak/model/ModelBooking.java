/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectprak.model;

import java.sql.*;
import projectprak.Connector;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author user
 */
public class ModelBooking {
    Booking data[] = new Booking[500];
    Connector connector = new Connector();

      public Booking[] getAll(){
         try{
            int jmlData = 0; //menampung jumlah data sebanyak jumlah data yang ada, defaultnya 0
            String query = "Select * from `booking`"; //proses pengambilan data
            connector.statement = connector.koneksi.createStatement();
            ResultSet resultSet = connector.statement.executeQuery(query); //result isinya tabel belum berupa string
            while(resultSet.next()){ //konversi tabel ke string
                int id = resultSet.getInt("id");
                int id_orang = resultSet.getInt("id_orang");
                int id_kamar = resultSet.getInt("id_kamar");
                int jumlah_kamar = resultSet.getInt("jumlah_kamar");
                int total_harga = resultSet.getInt("total_harga");
                String tanggal = resultSet.getString("tanggal");
                
                data[jmlData] = new Booking(id_orang,id_kamar,id,tanggal,jumlah_kamar,total_harga);
                jmlData++;
            }
            connector.statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
    return data;
    }
    
    public Booking getOne(Integer id){
         try{
            String query = "Select * from `booking` where `id` ="+id.toString(); //proses pengambilan data
            connector.statement = connector.koneksi.createStatement();
            ResultSet resultSet = connector.statement.executeQuery(query); //result isinya tabel belum berupa string
            while(resultSet.next()){ //konversi tabel ke string
                int id_orang = resultSet.getInt("id_orang");
                int id_kamar = resultSet.getInt("id_kamar");
                int jumlah_kamar = resultSet.getInt("jumlah_kamar");
                int total_harga = resultSet.getInt("total_harga");
                String tanggal = resultSet.getString("tanggal");
                data[0] = new Booking(id_orang,id_kamar,id,tanggal,jumlah_kamar,total_harga);
            }
            connector.statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
    return data[0];
    }
    
     public String create(Booking booking){
         String message = "Bad Request";
         try{
             SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();
                System.out.println();
                int id_orang = booking.getId_orang();
                int id_kamar = booking.getId_kamar();
                int jumlah_kamar = booking.getJumlah_kamar();
                int total_harga = booking.getTotal_harga();
                String tanggal = formatter.format(date);
            String query = "INSERT INTO `booking`(`id_orang`, `id_kamar`,`tanggal`,`total_harga`,`jumlah_kamar`) VALUES ("+id_orang+","+id_kamar+",'"+tanggal+"',"+total_harga+","+jumlah_kamar+")"; 
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
