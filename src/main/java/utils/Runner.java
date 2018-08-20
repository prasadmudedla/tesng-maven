package utils;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String []args){
        XmlSuite suite = new XmlSuite();
        suite.setName("YC");

        XmlTest test = new XmlTest(suite);
        test.setName("Lambda");
        List<XmlClass> classes = new ArrayList<XmlClass>();
        classes.add(new XmlClass("tests.YCDemo"));
        test.setXmlClasses(classes) ;

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);
        TestNG tng = new TestNG();
        tng.setXmlSuites(suites);
        tng.run();
    }
}
