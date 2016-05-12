_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/event/NamingExceptionEvent.java
    public void dispatch(NamingListener listener) {

    /**
     * Invokes the <tt>namingExceptionThrown()</tt> method on
     * a listener using this event.
     * @param listener The non-null naming listener on which to invoke
     * the method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/event/NamingExceptionEvent.java
    public EventContext getEventContext() {

    /**
     * Retrieves the <tt>EventContext</tt> that fired this event.
     * This returns the same object as <tt>EventObject.getSource()</tt>.
     * @return The non-null <tt>EventContext</tt> that fired this event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/event/NamingExceptionEvent.java
    public NamingException getException() {

    /**
     * Retrieves the exception that was thrown.
     * @return The exception that was thrown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/event/NamingExceptionEvent.java
    public NamingExceptionEvent(EventContext source, NamingException exc) {

    /**
     * Constructs an instance of <tt>NamingExceptionEvent</tt> using
     * the context in which the <tt>NamingException</tt> was thrown and the exception
     * that was thrown.
     *
     * @param source The non-null context in which the exception was thrown.
     * @param exc    The non-null <tt>NamingException</tt> that was thrown.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/event/NamingExceptionEvent.java
public class NamingExceptionEvent extends java.util.EventObject {

/**
  * This class represents an event fired when the procedures/processes
  * used to collect information for notifying listeners of
  * <tt>NamingEvent</tt>s threw a <tt>NamingException</tt>.
  * This can happen, for example, if the server which the listener is using
  * aborts subsequent to the <tt>addNamingListener()</tt> call.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  *
  * @see NamingListener#namingExceptionThrown
  * @see EventContext
  * @since 1.3
  */
