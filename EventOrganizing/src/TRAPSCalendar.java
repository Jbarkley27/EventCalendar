import java.util.ArrayList;


public class TRAPSCalendar {

	Event evnts = new Event();
	ArrayList<Event>calendar = new ArrayList<Event>();
	
	

	public TRAPSCalendar(){
		
	}
	
	
	public boolean add(Event evt) {
		return calendar.add(evt);
		
	}
	
	public Event get(int i) {
		return calendar.get(i);
	}
	
	
	public Event get(String name) {
		
		
		
		for(int i = 0; i<calendar.size();i++) {
			if(calendar.get(i).getEventName().equalsIgnoreCase(name)) {
				return calendar.get(i);
			} 
			
			
			
		}
		return null;
		
	}
	
	
	public int size() {
		return calendar.size();
	}
	
	public java.util.ArrayList<Event> list(){
		return calendar;
	}
	
	public String toString() {
		String hold ="";
		for(int j = 0; j<calendar.size();j++) {
			hold += calendar.get(j) + "\n\n\n";
			
		}
		return hold;
	}


	public ArrayList<Event> sortByDate() {
		// TODO Auto-generated method stub
		ArrayList<Event>calendarSortedByDate = new ArrayList();
		for(int j = 0; j<calendar.size(); j++) {
			calendarSortedByDate.add(calendar.get(j));
			
		}
		
		for (int i = 0; i < calendarSortedByDate.size() - 1; i++) {
		     // Find the minimum in the list[i..list.size-1]
		      Event currentMin = calendarSortedByDate.get(i);
		      int currentMinIndex = i;

		      for (int j = i + 1; j < calendarSortedByDate.size(); j++) {
		        if (currentMin.compareDate​(calendarSortedByDate.get(j)) > 0) {
		          currentMin = calendarSortedByDate.get(j);
		          currentMinIndex = j;
		        }
		      }

		      // Swap list[i] with list[currentMinIndex] if necessary;
		      if (currentMinIndex != i) {
		    	  calendarSortedByDate.set(currentMinIndex, calendarSortedByDate.get(i));
		    	  calendarSortedByDate.set(i, currentMin);
		      }
		    }
		return calendarSortedByDate;
	}


	public ArrayList<Event> sortByName() {
	
		
		ArrayList<Event>calendarSortedByDate = new ArrayList();
		for(int j = 0; j<calendar.size(); j++) {
			calendarSortedByDate.add(calendar.get(j));
			
		}
		
		for (int i = 0; i < calendarSortedByDate.size() - 1; i++) {
		     // Find the minimum in the list[i..list.size-1]
		      Event currentMin = calendarSortedByDate.get(i);
		      int currentMinIndex = i;

		      for (int j = i + 1; j < calendarSortedByDate.size(); j++) {
		        if (currentMin.compareName​(calendarSortedByDate.get(j)) > 0) {
		          currentMin = calendarSortedByDate.get(j);
		          currentMinIndex = j;
		        }
		      }

		      // Swap list[i] with list[currentMinIndex] if necessary;
		      if (currentMinIndex != i) {
		    	  calendarSortedByDate.set(currentMinIndex, calendarSortedByDate.get(i));
		    	  calendarSortedByDate.set(i, currentMin);
		      }
		    }
		return calendarSortedByDate;

		
	}
	
	
}
