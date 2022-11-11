package AdminAccess;

public class delivery {
	
	private int deliTime;
	private String deliName,deliLocation,deliStatus,deliRestauraunt;
	
	public delivery(String deliName, int deliTime, String deliLocation, String deliStatus, String deliRestauraunt) {
		super();
		this.deliName = deliName;
		this.deliTime = deliTime;
		this.deliLocation = deliLocation;
		this.deliStatus = deliStatus;
		this.deliRestauraunt = deliRestauraunt;
	}
	

	public int getDeliTime() {
		return deliTime;
	}
	
	public void setDeliTime(int deliTime) {
		this.deliTime = deliTime;
	}
	
	public String getDeliName() {
		return deliName;
	}
	
	public void setDeliName(String deliName) {
		this.deliName = deliName;
	}
	
	public String getDeliLocation() {
		return deliLocation;
	}
	
	public void setDeliLocation(String deliLocation) {
		this.deliLocation = deliLocation;
	}


	public String getDeliStatus() {
		return deliStatus;
	}


	public void setDeliStatus(String deliStatus) {
		this.deliStatus = deliStatus;
	}


	public String getDeliRestauraunt() {
		return deliRestauraunt;
	}


	public void setDeliRestauraunt(String deliRestauraunt) {
		this.deliRestauraunt = deliRestauraunt;
	}
	
}
