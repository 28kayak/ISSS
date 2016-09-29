
public class Prof extends InternationalPerson
{
	private int prof_id;
	public Prof(int prof_id, String name, String intr_addr,String tellnum, String us_addr, String visat, int visaperiod, String vexpration )
	{
		super(name, intr_addr, tellnum, us_addr,  visat,  visaperiod, vexpration );
		this.prof_id = prof_id;
	}
	public int getProfId()
	{
		return prof_id;
	}
	public void setProfId(int prof_id)
	{
		this.prof_id = prof_id;
	}

}
