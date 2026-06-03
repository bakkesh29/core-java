class ContactDetails{
	static String[] details(String Names,String[] mails,String ph,String address){
		System.out.println("executing a ContactDetails");
		if(Names==null)
		{
			System.out.println("invalid");
			return null;
		}
		if(mails==null)
		{
			System.out.println("invalid");
			return null;
		}
		if(ph==null)
		{
			System.out.println("invalid");
			return null;
		}
		if(address==null)
		{
			System.out.println("invalid");
		}
		System.out.println("Name: " + Names);
		for (String mail : mails) {
			System.out.println("Mail: " + mail);
		}
		System.out.println("phone number: " +ph);
		System.out.println("address: " + address);
		String[] result ={Names,mails[0],ph,address};
		return result;
	}
}