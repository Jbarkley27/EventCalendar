
public class EventTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Event evnt3 = new Event("James's Party","At Home");
		Event evnt4 = new Event("My Party", "At Apartment","2019-11-16", 7, 14, 21);
		Event evnt5 = new Event("Mom's Party", "At Her House", "2019-11-17", 7, 55, 34);
		
		evnt3.sellTickets(14);
		System.out.println(evnt4.getProfit());
		System.out.println(evnt5.getBreakEvenPoint());
		
		System.out.println(evnt3.compareName​(evnt5));
		
		
		
		System.out.println(evnt4.getEventName() + evnt4.getDate() + evnt3.getEventVenue());
		
		evnt4.setEventName​("Boy's night");
		
		
		System.out.println(evnt4.getEventName());
		
		evnt3.setEventVenue​("Home");
		
		
		
		System.out.println(evnt5.compareDate​(evnt4));
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		

	}

}
