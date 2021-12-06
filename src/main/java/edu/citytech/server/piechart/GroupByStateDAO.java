package edu.citytech.server.piechart;

import edu.citytech.server.loadXML.Property;
import edu.citytech.server.loadXML.SQLExecutable;
import edu.citytech.server.loadXML.SQLUtility;

import java.util.List;

import static edu.citytech.server.loadXML.DBConnection.getConnection;

public class GroupByStateDAO {
    public static List<GroupByState> findAll(){

        String sql = """
                select state, count(state) as stateCount, sum(netIncome) as sumOfNetIncome
                from properties
                group by state
                """;

        SQLExecutable<GroupByState> exec = rs -> {
            var groupByState = new GroupByState(
                    rs.getString("state"),
                    rs.getFloat("stateCount"),
                    rs.getFloat("sumOfNetIncome"));

            return groupByState;
        };
        List<GroupByState> list = SQLUtility.findALl(sql, getConnection(), exec);
        return list;
    }
}
