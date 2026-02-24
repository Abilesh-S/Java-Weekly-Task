package com.kovanlabs.intern.week.task.day13exceptionhandling;

import javax.naming.spi.ResolveResult;

class Resource implements AutoCloseable {
    public void methodCalling() {
        System.out.println("Resource Called");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Closing Resource ");
    }
}

public class AutoCloseableDemoOverriding {
    public static void main(String[] args) {

        try(Resource resource = new Resource();){
            int result = 10 / 0;
            resource.methodCalling();
            System.out.println("Result : "+result);
        }
        catch(Exception e){
            System.out.println("Exception caught"+e.getMessage());
        }
    }

}
