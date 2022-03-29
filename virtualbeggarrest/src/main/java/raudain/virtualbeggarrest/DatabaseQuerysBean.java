package raudain.virtualbeggarrest;

/**
 * Helper class for externalization of queries
 */
public class DatabaseQuerysBean {
	
	private String listWorkers = "";
	private String sqlServerListWorkers = "";
	private String updateWorker = "";
	
	public String getListWorkers() {
		return listWorkers;
	}

	public void setListWorkers(String listWorkers) {
		this.listWorkers = listWorkers;
	}
	
	public String getSqlServerListWorkers() {
		return sqlServerListWorkers;
	}

	public void setSqlServerListWorkers(String sqlServerListWorkers) {
		this.sqlServerListWorkers = sqlServerListWorkers;
	}
	
	public String getUpdateWorker() {
		return updateWorker;
	}

	public void setUpdateWorker(String updateEvent) {
		this.updateWorker = updateEvent;
	}
}
