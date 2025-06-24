package web;
import java.io.Serializable;
@SuppressWarnings("serial")
public class ProductBean implements Serializable {

	private String procode;
	private String proname;
	private Long proprice;
	private String prostock;
	
	public ProductBean() {
		
	}
	

	public ProductBean(String procode, String proname, Long proprice, String prostock) {
		this.procode = procode;
		this.proname = proname;
		this.proprice = proprice;
		this.prostock = prostock;
	}


	public String getProcode() {
		return procode;
	}

	public void setProcode(String procode) {
		this.procode = procode;
	}

	public String getProname() {
		return proname;
	}

	public void setProname(String proname) {
		this.proname = proname;
	}

	public Long getProprice() {
		return proprice;
	}

	public void setProprice(Long proprice) {
		this.proprice = proprice;
	}

	public String getProstock() {
		return prostock;
	}

	public void setProstock(String prostock) {
		this.prostock = prostock;
	}

	
	
	
}
