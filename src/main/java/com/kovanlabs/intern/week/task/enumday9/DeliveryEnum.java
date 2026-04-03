package com.kovanlabs.intern.week.task.enumday9;

enum OrderState{
    NEW,
    PROCESSING,
    SHIPPED,
    DELIVERED;
}
class Order{
    private OrderState state = OrderState.NEW;
    public void moveToProcessing() {
        if(state == OrderState.NEW) {
            state = OrderState.PROCESSING;
            System.out.println("New Order Moved To Processing State");
        }
        else{
            throw new IllegalStateException("Order Currently in Processing State but trying to move to "+state);
        }
    }
    public void moveToShipped() {
        if(state == OrderState.PROCESSING) {
            state = OrderState.SHIPPED;
            System.out.println("Processing State to Shipped State");
        }
        else {
            throw new IllegalStateException("Order Currently in Shipped State but trying to move to "+state);
        }
    }
    public void moveToDelivered() {
        if(state == OrderState.SHIPPED) {
            state = OrderState.DELIVERED;
            System.out.println("Shiped State to Delivered State");
        }
        else{
            throw new IllegalStateException("Order Currently in Delivered State but trying to move to "+state);
        }
    }
}

public class DeliveryEnum {

    public static void main(String[] args) {
        Order  order = new Order();
        order.moveToProcessing();
        order.moveToDelivered();
    }
}
