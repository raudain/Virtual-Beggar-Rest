package raudain.virtualbeggarrest;

import java.util.List;

public class WorkerRepository {
	
	private WorkerDao dao = new WorkerDao();
	
	List<Worker> getWorkers(String serverType) {
		return dao.getWorkers(serverType);
	}
	
	Worker1 getWorker(short room) {	
		return dao.getWorker(room);
	}

	void create(Worker1 worker) {
		dao.createWorker(worker);
	}
	
	void update(Worker1 updatedWorker) {
		dao.updateWorker(updatedWorker);
	}

	void delete(Short room) {
		dao.delete(room);
	}
}
