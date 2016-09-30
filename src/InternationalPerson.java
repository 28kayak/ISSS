
public class InternationalPerson
{
	private String name;
	private String intr_addr;
	//private int id;
	private String tellnum;
	private String us_addr;
	private Visa visa;
	public InternationalPerson(String name, String intr_addr,String tellnum, String us_addr, String visat, int visaperiod, String vexpration )
	{
		this.name = name;
		this.intr_addr = intr_addr;
		this.tellnum = tellnum;
		this.us_addr = us_addr;
		visa = new Visa(visat, visaperiod, vexpration);
	}
	public String getName()
	{
		return name;	
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getIntr_addr()
	{
		return intr_addr;
	}
	public void setIntr_addr(String intr_addr)
	{
		this.intr_addr = intr_addr;
	}
	public String getTellNum()
	{
		return tellnum;
	}
	public void setTellnum(String tellnum)
	{
		this.tellnum = tellnum;
	}
	public String getUsAddr()
	{
		return us_addr;
	}
	public void setUsAddr(String us_addr)
	{
		this.us_addr = us_addr;
	}
	public String getVisatype()
	{
		return visa.visatype;
	}
	public void setVisatype(String visatype)
	{
		visa.visatype = visatype;
	}
	public int getVisaPeriod()
	{
		return visa.period;
	}
	public void setVisaPeriod(int period)
	{
		visa.period = period;
	}
	public String getVisaExp()
	{
		return visa.expiration;
	}

	public void setVisaExp(String expiration)
	{
		visa.expiration = expiration;
	}
	
	public void showVisaStatus()
	{
		System.out.println("========Visa Status=======");
		System.out.println("Visa type: " + visa.visatype);
		System.out.println("Visa period:" + visa.period);
		System.out.println("Visa exparation" + visa.expiration );
		if(visa.visatype.equalsIgnoreCase("F"))
		{
			System.out.println("Student Visa: this visa allows to follow courses, /n IF and only IF the student is paying the fees.");
			
		}else if(visa.visatype.equalsIgnoreCase("J"))
		{
			System.out.println("Professor Visa: this visa allows to work as faculty member for the University");
		}
		else if(visa.visatype.equalsIgnoreCase("H"))
		{
			System.out.println("professional Visa: it allows to work as intern for the University");
		}
			
	}
}
