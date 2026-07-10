//package org.example.assigment.yuki.PetInformationFileSystem;
//
//import org.example.assigment.yuki.PetInformationFileSystem.FileRepository.DBConnection;
//
//import java.sql.Connection;
//
//public class TestConnection {
//
//    public static void MainProgram(String[] args) {
//
//        try(Connection conn = DBConnection.getConnection()){
//
//            if(conn != null){
//                System.out.println("Database connected successfully!");
//            }
//
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//}