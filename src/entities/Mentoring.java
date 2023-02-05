package entities;

import java.time.LocalDate;

public class Mentoring extends Content {

	LocalDate date;
	
	public Mentoring() {
		super();
	}
	
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public double calculator() {
		return XP_PADRAO * 20d;
	}
	
	@Override
	public String toString() {
		return "Mentoring: title = " + getTitle() + " ,description = " + getDescription() + ", date = " + getDate(); 
	}
	
}
