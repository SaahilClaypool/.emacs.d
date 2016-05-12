_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/event/PrintServiceAttributeListener.java
    public void attributeUpdate(PrintServiceAttributeEvent psae) ;

    /**
     * Called to notify a listener of an event in the print service.
     * The service will call this method on an event notification thread.
     * The client should not perform lengthy processing in this callback
     * or subsequent event notifications may be blocked.
     * @param psae the event being notified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/event/PrintServiceAttributeListener.java
public interface PrintServiceAttributeListener {

/**
  * Implementations of this listener interface are attached to a
  * {@link javax.print.PrintService PrintService} to monitor
  * the status of the print service.
  * <p>
  * To monitor a particular job see {@link PrintJobListener} and
  * {@link PrintJobAttributeListener}.
  */
