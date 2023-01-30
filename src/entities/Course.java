package entities;

public class Course {

	protected String title;
	protected String description;
	private int workload;

	public Course() {
		super();
	}

	public Course(String title, String description, int workload) {
		this.title = title;
		this.description = description;
		this.workload = workload;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getWorkload() {
		return workload;
	}

	public void setWorkload(int workload) {
		this.workload = workload;
	}

	@Override
	public String toString() {
		return "Course [title=" + title + ", description=" + description + ", workload=" + workload + "]";
	}

}
