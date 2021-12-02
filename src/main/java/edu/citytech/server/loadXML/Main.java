package edu.citytech.server.loadXML;
import static edu.citytech.server.loadXML.XMLUtility.*;

public class Main {
    public static void main(String[] args) {
        XMLUtility.process("/Users/jorgecalle/data/properties.xml", "property", element -> {

            String id = element.getAttribute("id");
            float cost = getAttributeNumber(element, "cost");
            float downPayment = getAttributeNumber(element, "downPayment");
            String state = element.getAttribute("state");
            float percentage = getAttributeNumber(element, "percentage");
            float netIncome = getNumberContent(element);

            System.out.format("id: %s cost: %s downPayment: %s state: %s percentage: %s netIncome: %s \n"
                                ,id, cost, downPayment, state, percentage, netIncome);
        });
    }
}
