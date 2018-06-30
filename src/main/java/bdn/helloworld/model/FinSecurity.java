package bdn.helloworld.model;

public class FinSecurity {

	private String id;
	private String ticker;
	private String fullName;

	public FinSecurity() {
	}

	public String getFullName() {
		return fullName;
	}

	public String getId() {
		return id;
	}

	public String getTicker() {
		return ticker;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

}
