import java.lang.String;

public class Event {
	
	
	//instance variables
	private String name;
	private String venue;
	private String eventDate;
	private int ticketsSold;
	private int ticketsPrice;
	private int eventOverHead;
	
	private int value;
	
	//constructor with no parameters
	Event(){
		
	}
	
	 public Event(java.lang.String eventName, java.lang.String eventVenue) {
		name = eventName;
		venue = eventVenue;
		
	}
	
	 public Event(java.lang.String eventName, java.lang.String eventVenue, java.lang.String date,
             int ticketSold,int ticketPrice,int overhead) {
		 name = eventName;
		 venue = eventVenue;
		 eventDate = date;
		 ticketsSold = ticketSold;
		 ticketsPrice = ticketPrice;
		 eventOverHead = overhead;
		 
		
		 
	}
	 
	public boolean sellTickets(int numberOfTickets) {
		if(numberOfTickets >= 0) {
			this.ticketsSold = this.ticketsSold + numberOfTickets;
			return true;
			
		} else {
			return false;
		}
	}
	
	public int getProfit() {
		return (this.ticketsSold * ticketsPrice) - eventOverHead;
	}
	
	public int getBreakEvenPoint() {
		int ticketToBreakEven = eventOverHead/ticketsPrice;
		return ticketToBreakEven;
	}
	
	
	
	public int compareName​(Event other) {
		int compare = this.name.compareToIgnoreCase(other.name);
		return compare;
		
	}
	
	public int compareDate​(Event other) {
		int compare = eventDate.compareTo(other.eventDate);
		return compare;
	}
	
	public int compareProfit​(Event other) {
		if(this.getProfit() > other.getProfit()) {
			 value = 1;
		} else if(this.getProfit() == other.getProfit()) {
			 value = 0;
		} else if (this.getProfit() < other.getProfit()) {
			 value = -1;
		}
		
		return value;
	}
	
	public java.lang.String getEventName(){
		return this.name;
	}
	
	public void setEventName​(java.lang.String eventName) {
		name = eventName;
	}
	
	
	public java.lang.String getEventVenue(){
		return this.venue;
	}
	
	public void setEventVenue​(java.lang.String eventVenue) {
		venue = eventVenue;
	}
	
	public int getTicketsSold() {
		return ticketsSold;
	}

	public void setTicketsSold​(int ticketsSold) {
		if(ticketsSold > 0) {
			this.ticketsSold = ticketsSold;
		} 
	}
	
	public int getTicketPrice() {
		return ticketsPrice;
	}
	 
	
	public void setTicketPrice​(int ticketPrice) {
		ticketsPrice = ticketPrice;
	}
	
	public int getOverhead() {
		return eventOverHead;
	}
	
	public void setOverhead​(int overhead) {
		eventOverHead = overhead;
	}
	
	public java.lang.String getDate(){
		return eventDate;
	}
	
	public void setDate​(java.lang.String date) {
		eventDate = date;
	}

	

	public String toString() {
		return "Name: " + this.name + "\n" + "Venue Name: " + this.venue + "\n" + "Event Date: " + this.eventDate
				+ "\n" + "Tickets Sold: " + ticketsSold + "\n" + "Ticket Price: " 
				+ this.ticketsPrice + "\n" + "Event OverHead: " + this.eventOverHead + "\n" 
				+ "Profit: " + this.getProfit() + "\n" +  "Breakeven Point: " + this.getBreakEvenPoint();
	}
	
	
	
	
}
