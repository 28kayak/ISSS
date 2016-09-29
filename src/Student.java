
public class Student extends InternationalPerson
{
	private int student_id;
	public Student(int id, String name, String intr_addr,String tellnum, String us_addr, String visat, int visaperiod, String vexpration ) 
	{
		super(name, intr_addr, tellnum, us_addr,  visat,  visaperiod, vexpration );
		student_id = id;
	}
	public int getStudentId()
	{
		return student_id;
	}
	public void setStudentId(int id)
	{
		student_id = id;
	}
	

}
