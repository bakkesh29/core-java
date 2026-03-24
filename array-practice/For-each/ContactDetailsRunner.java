class ContactDetailsRunner 
{
	public static void main(String[] args) 
	{
		
		String[] names = {"Bakkesh", "Raj", "Priya", "Amit", "Sneha", "Vikram", "Lakshmi", "Kiran", "Deepa", "Suresh","Meera", "Arun", "Pooja", "Ravi", "Nisha", "Ganesh", "Swathi", "Mohan", "Reka", "Tejas"};
		
        String[][] mails = {{"btanu1159@gmail.com"}, {"raj@gmail.com"}, {"priya@yahoo.com"}, {"amit@outlook.com"}, {"sneha@gmail.com"},
                           {"vikram@gmail.com"}, {"lakshmi@yahoo.com"}, {"kiran@outlook.com"}, {"deepa@gmail.com"}, {"suresh@gmail.com"},
                           {"meera@yahoo.com"}, {"arun@outlook.com"}, {"pooja@gmail.com"}, {"ravi@yahoo.com"}, {"nisha@outlook.com"},
                           {"ganesh@gmail.com"}, {"swathi@yahoo.com"}, {"mohan@outlook.com"}, {"reka@gmail.com"}, {"tejas@yahoo.com"}};
						   
        String[] phones = {"8867074879", "9876543210", "8765432109", "7654321098", "6543210987", "9988776655", "8877665544", 
                          "7766554433", "6655443322", "5544332211", "4433221100", "3322110099", "2211009988", "1100998877", 
                          "9988777766", "8877666655", "7766555544", "6655444433", "5544333322", "4433222211"};
						  
        String[] addresses = {"Hoshalli Extension, stage 1, vijayanagar 560040", "Jayanagar 4th Block, Bengaluru 560011", 
                             "Whitefield, Bengaluru 560066", "Koramangala, Bengaluru 560034", "Indiranagar, Bengaluru 560038",
                             "Malleshwaram, Bengaluru 560003", "HSR Layout, Bengaluru 560102", "Electronic City, Bengaluru 560100",
                             "BTM Layout, Bengaluru 560076", "Marathahalli, Bengaluru 560037", "Domlur, Bengaluru 560071",
                             "Sadashivnagar, Bengaluru 560080", "Rajajinagar, Bengaluru 560010", "Yelahanka, Bengaluru 560064",
                             "Banashankari, Bengaluru 560070", "JP Nagar, Bengaluru 560078", "Uttarahalli, Bengaluru 560082",
                             "Kengeri, Bengaluru 560060", "Hebbal, Bengaluru 560024", "Yesvantpur, Bengaluru 560022"};
							 
		for(int i = 0; i < 20; i++) 
		{
		String name = names[i];
        String[] maillist = mails[i];
        String ph = phones[i];
		String address = addresses[i];

        ContactDetails.details(name, maillist, ph, address);

        }
    }
}