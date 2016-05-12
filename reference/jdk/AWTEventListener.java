_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AWTEventListener.java
    public void eventDispatched(AWTEvent event);

    /**
     * Invoked when an event is dispatched in the AWT.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AWTEventListener.java
public interface AWTEventListener extends EventListener {

/**
 * The listener interface for receiving notification of events
 * dispatched to objects that are instances of Component or
 * MenuComponent or their subclasses.  Unlike the other EventListeners
 * in this package, AWTEventListeners passively observe events
 * being dispatched in the AWT, system-wide.  Most applications
 * should never use this class; applications which might use
 * AWTEventListeners include event recorders for automated testing,
 * and facilities such as the Java Accessibility package.
 * <p>
 * The class that is interested in monitoring AWT events
 * implements this interface, and the object created with that
 * class is registered with the Toolkit, using the Toolkit's
 * <code>addAWTEventListener</code> method.  When an event is
 * dispatched anywhere in the AWT, that object's
 * <code>eventDispatched</code> method is invoked.
 *
 * @see java.awt.AWTEvent
 * @see java.awt.Toolkit#addAWTEventListener
 * @see java.awt.Toolkit#removeAWTEventListener
 *
 * @author Fred Ecks
 * @since 1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AWTEventListener.java
    public void eventDispatched(AWTEvent event);

    /**
     * Invoked when an event is dispatched in the AWT.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/AWTEventListener.java
public interface AWTEventListener extends EventListener {

/**
 * The listener interface for receiving notification of events
 * dispatched to objects that are instances of Component or
 * MenuComponent or their subclasses.  Unlike the other EventListeners
 * in this package, AWTEventListeners passively observe events
 * being dispatched in the AWT, system-wide.  Most applications
 * should never use this class; applications which might use
 * AWTEventListeners include event recorders for automated testing,
 * and facilities such as the Java Accessibility package.
 * <p>
 * The class that is interested in monitoring AWT events
 * implements this interface, and the object created with that
 * class is registered with the Toolkit, using the Toolkit's
 * <code>addAWTEventListener</code> method.  When an event is
 * dispatched anywhere in the AWT, that object's
 * <code>eventDispatched</code> method is invoked.
 *
 * @see java.awt.AWTEvent
 * @see java.awt.Toolkit#addAWTEventListener
 * @see java.awt.Toolkit#removeAWTEventListener
 *
 * @author Fred Ecks
 * @since 1.2
 */
