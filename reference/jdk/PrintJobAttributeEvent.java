_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/event/PrintJobAttributeEvent.java
    public PrintJobAttributeSet getAttributes() {

    /**
     * Determine the printing attributes that changed and their new values.
     *
     * @return  Attributes containing the new values for the print job
     * attributes that changed. The returned set may not be modifiable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/event/PrintJobAttributeEvent.java
    public DocPrintJob getPrintJob() {

    /**
     * Determine the Print Job to which this print job event pertains.
     *
     * @return  Print Job object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/event/PrintJobAttributeEvent.java
    public PrintJobAttributeEvent (DocPrintJob source,
                                   PrintJobAttributeSet attributes)  {

    /**
     * Constructs a PrintJobAttributeEvent object.
     * @param source the print job generating  this event
     * @param attributes the attribute changes being reported
     * @throws IllegalArgumentException if <code>source</code> is
     *         <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/event/PrintJobAttributeEvent.java
public class PrintJobAttributeEvent extends PrintEvent {

/**
 * Class PrintJobAttributeEvent encapsulates an event a PrintService
 * reports to let the client know that one or more printing attributes for a
 * PrintJob have changed.
 */
