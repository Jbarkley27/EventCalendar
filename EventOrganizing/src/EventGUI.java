
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.util.ArrayList;



public class EventGUI {
	
	//instance variables 
	 TRAPSCalendar cal = new TRAPSCalendar();
	 JLabel evnName;
	 JTextField evnNameText;
	
	 JLabel evnVen;
	 JTextField evnVenText;
	
	 JLabel evnDate;
	 JTextField evnDateText;
	
	 JLabel evnTickSold;
	 JTextField evnTickSoldText;
	
	 JLabel evnTickPrice;
	 JTextField evnTickPriceText;
	
	 JLabel evnOverH;
	 JTextField evnOverHText;
	 
	 
	
	 JLabel amountOfEventsLabel;
	 
	
	 JButton createEvnButton;
	 JButton sellTicketButton;
	 JButton resetListButton;
	 JButton sortByNameButton;
	 JButton sortByDateButton;
	 JButton changeTicketPrice;
	 
	 JLabel displayArea;
	 JTextArea consoleArea;
	
	
	public EventGUI() {
		
		 WidgetViewer wv = new WidgetViewer();
		
		

		//creating my buttons and labels for the GUI
		evnName = new JLabel("Event Name");
		evnNameText = new JTextField();
		
		evnVen = new JLabel("Event Venue");
		evnVenText = new JTextField();
		
		evnDate = new JLabel("Event Date");
		evnDateText = new JTextField("YYYY-MM-DD");
		
		evnTickSold = new JLabel("Tickets Sold");
		evnTickSoldText = new JTextField();
		
		evnTickPrice = new JLabel("Ticket Price");
		evnTickPriceText = new JTextField();
		
		evnOverH = new JLabel("Overhead Costs");
		evnOverHText = new JTextField();
		
		//Extra feature i add for testing purposes but actually seems useful for the user
		amountOfEventsLabel = new JLabel("Amount of Events in Calendar:0" );
		
		
		createEvnButton = new JButton("Create an Event");
		sellTicketButton = new JButton("Sell Tickets");
		resetListButton = new JButton("Reset List");
		sortByNameButton = new JButton("Sort by Name");
		sortByDateButton = new JButton("Sort by Date");
		changeTicketPrice = new JButton("Change Ticket Price");
		
		displayArea = new JLabel("Display Area");
		consoleArea = new JTextArea("");
		
		JScrollPane scroll = new JScrollPane(consoleArea);
		
		//adding my buttons,lables,and textareas
		wv.add(evnName);
		wv.add(evnNameText);
		wv.add(evnVen);
		wv.add(evnVenText);
		wv.add(evnDate);
		wv.add(evnDateText);
		wv.add(evnTickSold);
		wv.add(evnTickSoldText);
		wv.add(evnTickPrice);
		wv.add(evnTickPriceText);
		wv.add(evnOverH);
		wv.add(evnOverHText);
		wv.add(amountOfEventsLabel);
		
		 
		wv.add(createEvnButton);
		wv.add(sellTicketButton);
		wv.add(resetListButton);
		wv.add(sortByNameButton);
		wv.add(sortByDateButton);
		wv.add(changeTicketPrice);
		
		//aligning my display area to the right
		wv.add(displayArea, 300,31,200,30);
		wv.add(scroll, 300,55,400,370);
		
		//creating all of my actions for the different buttons
		createEvent action = new createEvent();
		sellTickets action1 = new sellTickets();
		resetList action2 = new resetList();
		sortByName action3 = new sortByName();
		sortByDate action4 = new sortByDate();
		chngeTicketPrice action5 = new chngeTicketPrice();
		
		//adding my created actions/methods to the corresponding button
		createEvnButton.addActionListener(action);
		sellTicketButton.addActionListener(action1);
		resetListButton.addActionListener(action2);
		sortByNameButton.addActionListener(action3);
		sortByDateButton.addActionListener(action4);
		changeTicketPrice.addActionListener(action5);
	}
		class createEvent extends WidgetViewerActionEvent{
			@Override
			public void actionPerformed(ActionEvent e) {
				
			Event temp = new Event(evnNameText.getText(), evnVenText.getText(), evnDateText.getText(),
						Integer.parseInt(evnTickSoldText.getText()), Integer.parseInt(evnTickPriceText.getText()),
						Integer.parseInt(evnOverHText.getText()));
		
		
		
	    
			//adding newly created event to the array
			cal.add(temp);
			consoleArea.setText(cal.toString());
	    
			
			//this is to clear the text fields for next input
			evnNameText.setText("");
			evnVenText.setText("");
			evnDateText.setText("YYYY-MM-DD");
			evnTickSoldText.setText("");
			evnTickPriceText.setText("");
			evnOverHText.setText("");
	    
			//updating how many events have been added to the GUI
			amountOfEventsLabel.setText("Amount of Events in Calendar:" + String.valueOf(cal.size()));
				
				
			}
		}
		
		class sellTickets extends WidgetViewerActionEvent{
			@Override
			public void actionPerformed(ActionEvent e) {
				int temp = Integer.parseInt(evnTickSoldText.getText());
				cal.get(evnNameText.getText()).sellTickets(temp);
				
				consoleArea.setText(cal.toString());
	    		
				evnNameText.setText("");
	    	    evnVenText.setText("");
	    	    evnDateText.setText("YYYY-MM-DD");
	    	    evnTickSoldText.setText("");
	    	    evnTickPriceText.setText("");
	    	    evnOverHText.setText("");
			}
			
		}
		
		class resetList extends WidgetViewerActionEvent{
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//this will output the original order of added events
				consoleArea.setText(cal.toString());
				
			}
			
		}
		
		class sortByName extends WidgetViewerActionEvent{
			@Override
			public void actionPerformed(ActionEvent e) {
				
				TRAPSCalendar calSortByName = new TRAPSCalendar();
				ArrayList<Event>calendarSortedByNameTemp = cal.sortByName();
				
				for(int i = 0; i < calendarSortedByNameTemp.size();i++) {
					calSortByName.add(calendarSortedByNameTemp.get(i));
					
				}
	    		
				consoleArea.setText(calSortByName.toString());
				
			}
			
		}
		
		class sortByDate extends WidgetViewerActionEvent{
			@Override
			public void actionPerformed(ActionEvent e) {
				
				TRAPSCalendar calSortByDate = new TRAPSCalendar();
				ArrayList<Event>calendarSortedByDateTemp = cal.sortByDate();
				
				for(int i = 0; i < calendarSortedByDateTemp.size();i++) {
					calSortByDate.add(calendarSortedByDateTemp.get(i));
					
				}
	    		
				consoleArea.setText(calSortByDate.toString());
				
			}
			
		}
		
		class chngeTicketPrice extends WidgetViewerActionEvent{
			@Override
			public void actionPerformed(ActionEvent e) {
				int temp = Integer.parseInt(evnTickPriceText.getText());
				cal.get(evnNameText.getText()).setTicketPrice​(temp);
				
				consoleArea.setText(cal.toString());
	    		
				evnNameText.setText("");
	    	    evnVenText.setText("");
	    	    evnDateText.setText("YYYY-MM-DD");
	    	    evnTickSoldText.setText("");
	    	    evnTickPriceText.setText("");
	    	    evnOverHText.setText("");
			}
			
		}
		
		
		
		
	}

	
	
	

