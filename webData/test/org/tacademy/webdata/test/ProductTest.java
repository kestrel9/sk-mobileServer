package org.tacademy.webdata.test;

import java.util.ArrayList;

import org.tacademy.webdata.dao.ProductDAO;
import org.tacademy.webdata.vo.Condition;
import org.tacademy.webdata.vo.Product;

import com.google.gson.Gson;

import net.sf.json.JSON;
import net.sf.json.JSONSerializer;
import net.sf.json.xml.XMLSerializer;

public class ProductTest {

	public ProductTest() {
		// TODO Auto-generated constructor stub
		ProductDAO dao = new ProductDAO();
		Product vo = new Product();
		Condition cn = new Condition();
		
		
		
		cn.setKey("애니팡");
		cn.setCategory("1");
		
		ArrayList<Product> list = dao.doSearchALLConditon(cn);
		
		
		for(Product product : list){
			System.out.println(product);
		}
		
		
//		Gson gson = new Gson();
//		String xml = new XMLSerializer().write(JSONSerializer.toJSON(gson.toJson(list)));
//		System.out.println();
//		dao.doSearchALLConditon(cn);
//		dao.doSearchTitle(cn);
//		dao.doSearchTitleConditon(cn);
		
//		String str = "{'name':'JSON','integer':1,'double':2.0,'boolean':true,'nested':{'id':42},'array':[1,2,3]}";
//        JSON json = JSONSerializer.toJSON(str);
//        XMLSerializer xmlSerializer = new XMLSerializer();
//        String xml = xmlSerializer.write( json );
// 
//        System.out.println(xml);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ProductTest();

	}

}
