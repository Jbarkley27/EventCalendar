
public class TRAPSCalendarTester {

	public static void main(String[] args) {
		TRAPSCalendar asd = new TRAPSCalendar();
		
		Event evt1 = new Event("James","House","1999-12-10", 3 , 3, 3);
		
		asd.add(evt1);
		Event evt2 = new Event("A","House","2001-12-10", 3 , 3, 3);

		asd.add(evt2);
		Event evt3 = new Event("B","House","2004-12-10", 3 , 3, 3);

		asd.add(evt3);
		Event evt4 = new Event("Z","House","2004-12-09", 3 , 3, 3);

		asd.add(evt4);
		
		System.out.println(asd);
		
		System.out.println(asd.sortByDate());
		System.out.println("---------------------------------");
		
		System.out.println(asd.sortByName());

	}

}
