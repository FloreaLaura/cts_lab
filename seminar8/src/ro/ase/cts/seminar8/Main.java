package ro.ase.cts.seminar8;

import ro.ase.cts.seminar8.facade.Kitchen;
import ro.ase.cts.seminar8.facade.OrderFacade;
import ro.ase.cts.seminar8.facade.Waiter;

public class Main {

	public static void main(String[] args) {
//		Waiter waiter=new Waiter("Marcel");
//		Kitchen kitchen=new Kitchen();
//		
//		waiter.takeOrder();
//		waiter.sendOrderToKitchen();
//		kitchen.prepareFood();
//		kitchen.callWaiter();
//		waiter.serveCustomer();
//		kitchen.washDishes();
		
		OrderFacade facade=new OrderFacade();
		facade.order();
		
	}

}
