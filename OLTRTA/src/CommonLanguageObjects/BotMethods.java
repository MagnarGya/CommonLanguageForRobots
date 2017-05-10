package CommonLanguageObjects;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import parser.Assignment;

public class BotMethods implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5303195830741992275L;
	public String name;
    public String robot;
    public Declaration[] global_variables;
    public Method setup;
    public Method[] methods;
    public Method[] metamethods;
    public String extension;
    
    public BotMethods(String _robot, String _name) {
        name = _name;
        robot = _robot;
        global_variables = getGlobalVariables();
        setup = getSetup();
        methods = getMethods();
        metamethods = getMetamethods();
        extension = getExtension();
        
    }

	private Declaration[] getGlobalVariables() {
		try {
			List<Declaration> declarations = new ArrayList<Declaration>();
			String path = new File(".\\src\\"+robot+"\\"+name+".xml").getCanonicalPath();
			File file = new File(path);
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document xml = db.parse(file);
			NodeList nl = xml.getElementsByTagName("setup");
			Element setup = (Element)nl.item(0);
			NodeList nl1 = setup.getElementsByTagName("globalvariables");
			Element method = (Element)nl1.item(0);
			NodeList variablelist = method.getChildNodes();
			Assignment[] assign = getAssignments();
			
			for(int i = 1; i < variablelist.getLength(); i+=2){
				Node variable = variablelist.item(i);
				NamedNodeMap attributes = variable.getAttributes();
				String type = attributes.getNamedItem("type").getTextContent();
				String name = attributes.getNamedItem("name").getTextContent();
				for(Assignment as : assign){
					type = type.replaceAll(as.word, as.value);
					name = name.replaceAll(as.word, as.value);
				}
				declarations.add(new Declaration(type + " " + name));
			}
			
			return declarations.toArray(new Declaration[0]);
		} catch (ParserConfigurationException e) {
			System.out.println("Couldn't start documentbuilder");
			return null;
		} catch (SAXException e) {
			System.out.println("Couldn't parse file");
			return null;
		} catch (IOException e) {
			System.out.println("Couldn't find file");
			return null;
		}
	}

	private Method getSetup() {
		
		try {
			Assignment[] assign = getAssignments();
			String path = new File(".\\src\\"+robot+"\\"+name+".xml").getCanonicalPath();
			File file = new File(path);
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document xml = db.parse(file);
			NodeList nl = xml.getElementsByTagName("setup");
			Element setup = (Element)nl.item(0);
			NodeList nl1 = setup.getElementsByTagName("method");
			Element method = (Element)nl1.item(0);
			NodeList nl2 = method.getElementsByTagName("setup");
			Element setupmethod = (Element)nl2.item(0);
			String expressiontext = setupmethod.getTextContent();
			String[] expressions = expressiontext.split(";\n");
			List<Expression> expressionlist = new ArrayList<Expression>();
			for(int i = 0; i < expressions.length; i++){
				for(Assignment as : assign){
					expressions[i] = expressions[i].replaceAll(as.word,as.value);
				}
				expressionlist.add(new Expression(expressions[i]));
			}
			return (new Method(setupmethod.getAttribute("return"),setupmethod.getNodeName(),new Block(expressionlist.toArray(new Expression[0]))));
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	private Method[] getMethods() {
		List<Method> methods = new ArrayList<Method>();
		
		try{
			String path = new File(".\\src\\"+robot+"\\"+name+".xml").getCanonicalPath();
			File file = new File(path);
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Assignment[] assignments = getAssignments();
			Document xml = db.parse(file);
			NodeList nl = xml.getElementsByTagName("robot");
			Element robot = (Element)nl.item(0);
			NodeList nl2 = robot.getElementsByTagName("methods");
			Element metho = (Element)nl2.item(0);
			NodeList methodlist = metho.getChildNodes();
			for(int i = 1; i < methodlist.getLength(); i+=2){
				Element method = (Element)methodlist.item(i);
				String type = method.getAttribute("return");
				String name = method.getNodeName();
				String[] parameter = method.getAttribute("parameter").split(",");
				String block = method.getTextContent();
				for(Assignment assign : assignments){
					type = type.replaceAll(assign.word, assign.value);
					name = name.replaceAll(assign.word, assign.value);
					for(String param : parameter){
						param = param.replaceAll(assign.word, assign.value);
					}
					block = block.replaceAll(assign.word, assign.value);
				}
				List<Parameter> para = new ArrayList<Parameter>();
				for(String param : parameter){
					String[] parameterdetails = param.split(" ");
					if(!(parameterdetails.length<1)){
						para.add(new Parameter(parameterdetails[0],parameterdetails[1]));
					}
				}
				List<Expression> exp = new ArrayList<Expression>();
				String[] blocklines = block.split(";\n");
				for(String bl : blocklines){
					exp.add(new Expression(bl));
				}
				methods.add(new Method(type, name, para.toArray(new Parameter[0]),new Block(exp.toArray(new Expression[0]))));
						
			}
		}catch(ParserConfigurationException e){
			
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return methods.toArray(new Method[0]);
	}

	private Method[] getMetamethods() {
List<Method> methods = new ArrayList<Method>();
		
		try{
			String path = new File(".\\src\\"+robot+"\\"+robot+".xml").getCanonicalPath();
			File file = new File(path);
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Assignment[] assignments = getAssignments();
			Document xml = db.parse(file);
			NodeList nl = xml.getElementsByTagName("robot");
			Element robot = (Element)nl.item(0);
			NodeList nl2 = robot.getElementsByTagName("metamethods");
			Element metho = (Element)nl2.item(0);
			NodeList methodlist = metho.getChildNodes();
			for(int i = 1; i < methodlist.getLength(); i+=2){
				Element method = (Element)methodlist.item(i);
				String type = method.getAttribute("return");
				String name = method.getNodeName();
				String[] parameter = method.getAttribute("parameter").split(",");
				String block = method.getTextContent();
				for(Assignment assign : assignments){
					type = type.replaceAll(assign.word, assign.value);
					name = name.replaceAll(assign.word, assign.value);
					for(String param : parameter){
						param = param.replaceAll(assign.word, assign.value);
					}
					block = block.replaceAll(assign.word, assign.value);
				}
				List<Parameter> para = new ArrayList<Parameter>();
				for(String param : parameter){
					String[] parameterdetails = param.split(" ");
					if(parameterdetails.length>1){
						para.add(new Parameter(parameterdetails[0],parameterdetails[1]));
					}
				}
				List<Expression> exp = new ArrayList<Expression>();
				String[] blocklines = block.split(";\n");
				for(String bl : blocklines){
					exp.add(new Expression(bl));
				}
				methods.add(new Method(type, name, para.toArray(new Parameter[0]),new Block(exp.toArray(new Expression[0]))));
						
			}
		}catch(ParserConfigurationException e){
			
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return methods.toArray(new Method[0]);
	}

	private String getExtension() {
		String extent = "";
		try {
			String path = new File(".\\src\\"+robot+"\\"+robot+".xml").getCanonicalPath();
			File file = new File(path);
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db;
			db = dbf.newDocumentBuilder();
			Document xml = db.parse(file);
			NodeList nl = xml.getElementsByTagName("extension");
			Element ext = (Element)nl.item(0);
			extent = ext.getTextContent();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return extent;
	}
	
	private Assignment[] getAssignments(){
		List<Assignment> assignments = new ArrayList<Assignment>();
		try {
			String path = new File(".\\src\\"+robot+"\\"+name+".xml").getCanonicalPath();
			File file = new File(path);
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document xml = db.parse(file);
			NodeList nl = xml.getElementsByTagName("assignments");
			Element tag = (Element)nl.item(0);
			NodeList assigns = tag.getChildNodes();
			for(int i = 1; i < assigns.getLength(); i+=2){
				Element assign = (Element)assigns.item(i);
				assignments.add(new Assignment(assign.getNodeName(),assign.getAttribute("value")));
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return assignments.toArray(new Assignment[0]);
	}
}
