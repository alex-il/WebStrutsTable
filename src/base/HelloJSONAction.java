package base;
import java.util.ArrayList;

public class HelloJSONAction{
	private ArrayList<String> list;
	public ArrayList<String> getList() {
		return list;
	}
	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	public String execute(){
		list = new ArrayList<String>();
		list.add("Java");
		list.add("C++");
		list.add("Groovy");
		return "success";
	}
}