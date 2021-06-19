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
                int lama_tinggal = resultSet.getInt("lama_tinggal");
                int total_harga = resultSet.getInt("total_harga");
                String tanggal = resultSet.getString("tanggal");
                int status = resultSet.getInt("status");
                String kode = resultSet.getString("kode");
                data[jmlData] = new Booking(id_orang,id_kamar,id,tanggal,lama_tinggal,total_harga,status,kode);
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
                int lama_tinggal = resultSet.getInt("lama_tinggal");
                int total_harga = resultSet.getInt("total_harga");
                String tanggal = resultSet.getString("tanggal");
                int status = resultSet.getInt("status");
                String kode = resultSet.getString("kode");
                data[0] = new Booking(id_orang,id_kamar,id,tanggal,lama_tinggal,total_harga,status,kode);
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
                int lama_tinggal = booking.getLama_tinggal();
                int total_harga = booking.getTotal_harga();
                int status = 0;
                String tanggal = formatter.format(date);
                String kode = "DL-"+id_orang+"-"+(int)(Math.random() * ((50 - 5) + 1)) + 5+"-"+lama_tinggal;
            String query = "INSERT INTO `booking`(`id_orang`, `id_kamar`,`tanggal`,`total_harga`,`lama_tinggal`,`status`,`kode`) VALUES ("+id_orang+","+id_kamar+",'"+tanggal+"',"+total_harga+","+lama_tinggal+","+status+",'"+kode+"')"; 
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
