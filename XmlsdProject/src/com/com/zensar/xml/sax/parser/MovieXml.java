package com.zensar.xml.sax.parser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

public class MovieXml {
  public static void main(String args[]) throws SAXException, IOException, ParserConfigurationException{
	
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser =factory.newSAXParser();
		parser.parse(new File("./src/moviedetail.xml"), new MovieXmlHandler());
	
 
}
}