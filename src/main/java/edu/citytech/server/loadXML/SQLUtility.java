package edu.citytech.server.loadXML;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

public class SQLUtility {
    public static <T> List<T> findAll(String sql, Connection pConn, SQLExecutable<T> sqlExecutable) {
//        String sql = "SELECT * FROM Properties";
        try(var conn = pConn;
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
        ) {
            var list = new ArrayList<T>();
            while(rs.next()){
                T t = sqlExecutable.exec(rs);
                list.add(t);
            }
            return list;
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
