package edu.citytech.server.loadXML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import java.io.File;
import java.util.function.Consumer;
public class XMLUtility {

    public static float getAttributeNumber(Element element, String name){
        return Float.parseFloat(element.getAttribute(name));
    }
    public static float getNumberContent(Element element){
        return Float.parseFloat(element.getTextContent());
    }

    public static void process (String fileName, String tagName, Consumer<Element> consumer) {

      // Instantiate the Factory
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

      try {

          // optional, but recommended
          // process XML securely, avoid attacks like XML External Entities (XXE)
          dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
          // parse XML file
          DocumentBuilder db = dbf.newDocumentBuilder();
          Document doc = db.parse(new File(fileName));
          doc.getDocumentElement().normalize();
//
//          System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
//          System.out.println("------");

          NodeList list = doc.getElementsByTagName(tagName);

          for (int temp = 0; temp < list.getLength(); temp++) {
              Node node = list.item(temp);
              if (node.getNodeType() == Node.ELEMENT_NODE) {
                  Element element = (Element) node;
                 consumer.accept(element);
              }
          }

      } catch (Exception e) {
          e.printStackTrace();
      }

  }

}