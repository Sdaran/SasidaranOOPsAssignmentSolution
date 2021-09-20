package department;

import department.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
	public String deparmentName() {
		return " Welcome to Admin Department";
	}
	public String getTodaysWork() {
		return "Complete your documents submission";
	}
	public String getWorkDeadline() {
		return "Complete by EOD ";
	}

}
