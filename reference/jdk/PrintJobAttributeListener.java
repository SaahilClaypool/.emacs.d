_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/event/PrintJobAttributeListener.java
    public void attributeUpdate(PrintJobAttributeEvent pjae) ;

    /**
     * Notifies the listener of a change in some print job attributes.
     * One example of an occurrence triggering this event is if the
     * {@link javax.print.attribute.standard.JobState JobState}
     * attribute changed from
     * <code>PROCESSING</code> to <code>PROCESSING_STOPPED</code>.
     * @param pjae the event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/event/PrintJobAttributeListener.java
public interface PrintJobAttributeListener {

/**
  * Implementations of this interface are attached to a
  * {@link javax.print.DocPrintJob DocPrintJob} to monitor
  * the status of attribute changes associated with the print job.
  *
  */
