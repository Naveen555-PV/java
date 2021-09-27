package day2;


public class Student {
	private int sId;
	private String sName;
	private String sBranch;
	private long phNo;
	
	Student()
	{
		
	}
	public Student(int sId,String sName,String sBranch,long phNo )
	{
		this.sId=sId;
		this.sName=sName;
		this.sBranch=sBranch;
		this.phNo=phNo;
	}
	
	public Student(int sId,String sName)
	{
		this.sId=sId;
		this.sName=sName;
	}
	public Student(String sBranch,long phNo)
	{
		this.sBranch=sBranch;
		this.phNo=phNo;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsBranch() {
		return sBranch;
	}
	public void setsBranch(String sBranch) {
		this.sBranch = sBranch;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	
	}
	


