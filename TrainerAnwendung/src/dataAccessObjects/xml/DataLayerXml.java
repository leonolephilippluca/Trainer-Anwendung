package dataAccessObjects.xml;

import java.util.List;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;

import businessObjects.ITrainer;
import dataAccessObjects.interfaces.ITrainerDao;
import dataLayer.Trainer;

public class DataLayerXml implements ITrainerDao {

	private Document createDoc()
	{
		DocumentBuilder builder = null;
		ByteArrayInputStream input = null;
		Document doc = null;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try 
		{
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		StringBuilder xmlStringBuilder = new StringBuilder();
		
		xmlStringBuilder.append("<?cml version='1.0'?> <class></class>");
		try 
		{
			input = new ByteArrayInputStream(xmlStringBuilder.toString().getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try 
		{
			doc = builder.parse(input);
		} catch (SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return doc;		
	}
	
	
	
	@Override
	public ITrainer create() {
		// TODO Auto-generated method stub
		return new Trainer();
	}

	@Override
	public void delete(ITrainer trainer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ITrainer first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITrainer last() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITrainer next(ITrainer trainer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITrainer previous(ITrainer trainer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void safe(ITrainer trainer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void select(List<ITrainer> trainerList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ITrainer select(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
