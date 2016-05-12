_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/event/PrintServiceAttributeEvent.java
    public PrintServiceAttributeSet getAttributes() {

    /**
     * Determine the printing service attributes that changed and their new
     * values.
     *
     * @return  Attributes containing the new values for the service
     * attributes that changed. The returned set may be unmodifiable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/event/PrintServiceAttributeEvent.java
    public PrintService getPrintService() {

    /**
     * Returns the print service.

     * @return  Print Service object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/event/PrintServiceAttributeEvent.java
    public PrintServiceAttributeEvent(PrintService source,
                                      PrintServiceAttributeSet attributes) {

    /**
     * Constructs a PrintServiceAttributeEvent object.
     *
     * @param source the print job generating  this event
     * @param attributes the attribute changes being reported
     * @throws IllegalArgumentException if <code>source</code> is
     *         <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/event/PrintServiceAttributeEvent.java
public class PrintServiceAttributeEvent extends PrintEvent {

/**
 *
 * Class PrintServiceAttributeEvent encapsulates an event a
 * Print Service instance reports to let the client know of
 * changes in the print service state.
 */
