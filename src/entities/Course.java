package entities;

public class Course extends Content {

	private int workload;

	public Course() {
		super();
	}

	public Course(String title, String description, int workload) {
		super(title, description);
		this.workload = workload;
	}

	public int getWorkload() {
		return workload;
	}

	public void setWorkload(int workload) {
		this.workload = workload;
	}

	@Override
	public String toString() {
		return "Course: title = " + getTitle() + ", description = " + getDescription() + ", workload = " + workload;
	}
	
	@Override
	public double calculator() {
		return XP_PADRAO * workload;
	}
	
}
