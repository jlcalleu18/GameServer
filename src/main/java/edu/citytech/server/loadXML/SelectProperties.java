package edu.citytech.server.loadXML;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static edu.citytech.server.loadXML.DBConnection.*;

public class SelectProperties {
    //dynamic code
    final static String sql = "SELECT * FROM Properties";
    public static List<Property> findALl() {

        SQLExecutable<Property> exec = rs -> {
            var property = new Property(
                    rs.getString("id"),
                    rs.getFloat("cost"),
                    rs.getFloat("downPayment"),
                    rs.getString("state"),
                    rs.getFloat("percentage"),
                    rs.getFloat("netIncome"));

            return property;
        };
        List<Property> list = SQLUtility.findALl(sql, getConnection(), exec);
        return list;
    }

    //this is we were using static and not dynamic.
    /*public static List<Property> beforeFindALl() {

        try(var conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ) {
            var list = new ArrayList<Property>();
            while(rs.next()){
                  var property = new Property(
                        rs.getString("id"),
                        rs.getFloat("cost"),
                        rs.getFloat("downPayment"),
                        rs.getString("state"),
                        rs.getFloat("percentage"),
                        rs.getFloat("netIncome"));

                  list.add(property);
            }
            return list;
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ArrayList<>();
    }*/
}
