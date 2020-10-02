
public class Patient {

	String pName, pGender, pDoctor, pSysptom, pid;
	int  pAge;

	public Patient(String id,String name, String gender, int age, String docter, String symp ) {
		// TODO Auto-generated constructor stub
		//this.pid = id;
		this.pName= name;
		this.pGender = gender;
		this.pAge = age;
		this.pDoctor = docter;
		this.pSysptom = symp;	
		
	}
	

	public Patient() {
		// TODO Auto-generated constructor stub
	}


	public String toString() {
		String Pdetail = pid + pName + pGender + pAge + pDoctor + pSysptom;
		return Pdetail;

	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpGender() {
		return pGender;
	}

	public void setpGender(String pGender) {
		this.pGender = pGender;
	}

	public String getpDoctor() {
		return pDoctor;
	}

	public void setpDoctor(String pDoctor) {
		this.pDoctor = pDoctor;
	}

	public String getpSysptom() {
		return pSysptom;
	}

	public void setpSysptom(String pSysptom) {
		this.pSysptom = pSysptom;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public int getpAge() {
		return pAge;
	}

	public void setpAge(int pAge) {
		this.pAge = pAge;
	}
	

}
