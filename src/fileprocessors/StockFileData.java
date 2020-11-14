package fileprocessors;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class StockFileData {
	
	List<HashMap<String, Double>> data = new LinkedList<>();
	
	public void printData(){

		for(HashMap<String, Double> line : data) {
			System.out.println(line);
		}
	}
	
	public void addData(List<HashMap<String, Double>> dataIn){
		data = dataIn;
	}
}
