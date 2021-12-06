package edu.citytech.server.loadXML;

import edu.citytech.server.piechart.GroupByStateDAO;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GroupByStateDAO.findAll().forEach(System.out::println);
        //SelectProperties.findALl().forEach(System.out::println);
    }
    public static void loadDataFromXML() {
        List<Property> propertyList = new ArrayList<>();
        XMLUtility.process("/Users/jorgecalle/data/properties.xml", "property", element -> {
            var property = new Property(element);
            propertyList.add(property);
        });
        PropertyInsert.process(propertyList);
    }
    public static void getXML() {
        XMLUtility.process("/Users/jorgecalle/data/properties.xml", "property", element -> {
            var properties = new Property(element);
            System.out.println(properties);

        });
    }
}
