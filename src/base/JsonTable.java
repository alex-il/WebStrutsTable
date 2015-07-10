package base;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.ParentPackage;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@ParentPackage(value = "showcase")
public class JsonTable extends ActionSupport {

	// Your result List
	private List<Customer> gridModel;

	// get how many rows we want to have into the grid - rowNum attribute in the
	// grid
	private Integer rows = 0;

	// Get the requested page. By default grid sets this to 1.
	private Integer page = 0;

	// sorting order - asc or desc
	private String sord;

	// get index row - i.e. user click to sort.
	private String sidx;

	// Search Field
	private String searchField;

	// The Search String
	private String searchString;

	// he Search Operation
	// ['eq','ne','lt','le','gt','ge','bw','bn','in','ni','ew','en','cn','nc']
	private String searchOper;

	// Your Total Pages
	private Integer total = 0;

	// All Record
	private Integer records = 0;

	@Actions({ @Action(value = "/jsontable", results = { @Result(name = "success", type = "json") }) })
	public String execute() {
//		int to = (rows * page);
//		int from = to - rows;

		records = 2;

		gridModel = new ArrayList<Customer>();
		Customer c = new Customer();
		c.setCity("City:ooo");
		c.setCountry("Country");
		c.setCreditLimit(100.00);
		c.setId(1);
		c.setName("Name");
		gridModel.add(c);
		
		
		Customer c2 = new Customer();
		c2.setCity("2City");
		c2.setCountry("Country");
		c2.setCreditLimit(222.22);
		c2.setId(2);
		c2.setName("2Name");
		gridModel.add(c2);
	
		
		Customer c3 = new Customer();
		c3.setCity("3City");
		c3.setCountry("3Country");
		c3.setCreditLimit(33.333);
		c3.setId(3);
		c3.setName("3Name");
		gridModel.add(c3);

		total = (int) Math.ceil((double) records / (double) rows);

		return SUCCESS;
	}

	public String getJSON() {
		return execute();
	}

	public List<Customer> getGridModel() {
		return gridModel;
	}

	public void setGridModel(List<Customer> gridModel) {
		this.gridModel = gridModel;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getSord() {
		return sord;
	}

	public void setSord(String sord) {
		this.sord = sord;
	}

	public String getSidx() {
		return sidx;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	public String getSearchField() {
		return searchField;
	}

	public void setSearchField(String searchField) {
		this.searchField = searchField;
	}

	public String getSearchString() {
		return searchString;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}

	public String getSearchOper() {
		return searchOper;
	}

	public void setSearchOper(String searchOper) {
		this.searchOper = searchOper;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getRecords() {
		return records;
	}

	public void setRecords(Integer records) {
		this.records = records;
	}
}