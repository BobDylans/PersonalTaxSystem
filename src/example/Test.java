package example;

import example.Client.TaxserviceLocator;
import example.Client.Tax_PortType;

public class Test {
    public static void main(String[] argv) {
        try {
            TaxserviceLocator locator = new TaxserviceLocator();
            Tax_PortType service = locator.getCalTax();
            // If authorization is required
            //((HelloWorldSoapBindingStub)service).setUsername("user3");
            //((HelloWorldSoapBindingStub)service).setPassword("pass3");
            // invoke business method
            System.out.println(service.calTax("36000"));
        } catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
        }
    }
}