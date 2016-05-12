_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/util/ValidationEventCollector.java
    public boolean hasEvents() {

    /**
     * Returns true if this event collector contains at least one
     * ValidationEvent.
     *
     * @return true if this event collector contains at least one
     *         ValidationEvent, false otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/util/ValidationEventCollector.java
    public void reset() {

    /**
     * Clear all collected errors and warnings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/util/ValidationEventCollector.java
    public ValidationEvent[] getEvents() {

    /**
     * Return an array of ValidationEvent objects containing a copy of each of
     * the collected errors and warnings.
     *
     * @return
     *      a copy of all the collected errors and warnings or an empty array
     *      if there weren't any
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/util/ValidationEventCollector.java
public class ValidationEventCollector implements ValidationEventHandler

/**
 * {@link javax.xml.bind.ValidationEventHandler ValidationEventHandler}
 * implementation that collects all events.
 *
 * <p>
 * To use this class, create a new instance and pass it to the setEventHandler
 * method of the Validator, Unmarshaller, Marshaller class.  After the call to
 * validate or unmarshal completes, call the getEvents method to retrieve all
 * the reported errors and warnings.
 *
 * @author <ul><li>Kohsuke Kawaguchi, Sun Microsystems, Inc.</li><li>Ryan Shoemaker, Sun Microsystems, Inc.</li><li>Joe Fialli, Sun Microsystems, Inc.</li></ul>
 * @see javax.xml.bind.Validator
 * @see javax.xml.bind.ValidationEventHandler
 * @see javax.xml.bind.ValidationEvent
 * @see javax.xml.bind.ValidationEventLocator
 * @since JAXB1.0
 */
