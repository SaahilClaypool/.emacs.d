_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowAdapter.java
    public void windowLostFocus(WindowEvent e) {}

    /**
     * Invoked when the Window is no longer the focused Window, which means
     * that keyboard events will no longer be delivered to the Window or any of
     * its subcomponents.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowAdapter.java
    public void windowGainedFocus(WindowEvent e) {}

    /**
     * Invoked when the Window is set to be the focused Window, which means
     * that the Window, or one of its subcomponents, will receive keyboard
     * events.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowAdapter.java
    public void windowStateChanged(WindowEvent e) {}

    /**
     * Invoked when a window state is changed.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowAdapter.java
    public void windowDeactivated(WindowEvent e) {}

    /**
     * Invoked when a window is de-activated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowAdapter.java
    public void windowActivated(WindowEvent e) {}

    /**
     * Invoked when a window is activated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowAdapter.java
    public void windowDeiconified(WindowEvent e) {}

    /**
     * Invoked when a window is de-iconified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowAdapter.java
    public void windowIconified(WindowEvent e) {}

    /**
     * Invoked when a window is iconified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowAdapter.java
    public void windowClosed(WindowEvent e) {}

    /**
     * Invoked when a window has been closed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowAdapter.java
    public void windowClosing(WindowEvent e) {}

    /**
     * Invoked when a window is in the process of being closed.
     * The close operation can be overridden at this point.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowAdapter.java
    public void windowOpened(WindowEvent e) {}

    /**
     * Invoked when a window has been opened.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowAdapter.java
public abstract class WindowAdapter

/**
 * An abstract adapter class for receiving window events.
 * The methods in this class are empty. This class exists as
 * convenience for creating listener objects.
 * <P>
 * Extend this class to create a <code>WindowEvent</code> listener
 * and override the methods for the events of interest. (If you implement the
 * <code>WindowListener</code> interface, you have to define all of
 * the methods in it. This abstract class defines null methods for them
 * all, so you can only have to define methods for events you care about.)
 * <P>
 * Create a listener object using the extended class and then register it with
 * a Window using the window's <code>addWindowListener</code>
 * method. When the window's status changes by virtue of being opened,
 * closed, activated or deactivated, iconified or deiconified,
 * the relevant method in the listener
 * object is invoked, and the <code>WindowEvent</code> is passed to it.
 *
 * @see WindowEvent
 * @see WindowListener
 * @see <a href="https://docs.oracle.com/javase/tutorial/uiswing/events/windowlistener.html">Tutorial: Writing a Window Listener</a>
 *
 * @author Carl Quinn
 * @author Amy Fowler
 * @author David Mendenhall
 * @since 1.1
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowAdapter.java
    public void windowLostFocus(WindowEvent e) {}

    /**
     * Invoked when the Window is no longer the focused Window, which means
     * that keyboard events will no longer be delivered to the Window or any of
     * its subcomponents.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowAdapter.java
    public void windowGainedFocus(WindowEvent e) {}

    /**
     * Invoked when the Window is set to be the focused Window, which means
     * that the Window, or one of its subcomponents, will receive keyboard
     * events.
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowAdapter.java
    public void windowStateChanged(WindowEvent e) {}

    /**
     * Invoked when a window state is changed.
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowAdapter.java
    public void windowDeactivated(WindowEvent e) {}

    /**
     * Invoked when a window is de-activated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowAdapter.java
    public void windowActivated(WindowEvent e) {}

    /**
     * Invoked when a window is activated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowAdapter.java
    public void windowDeiconified(WindowEvent e) {}

    /**
     * Invoked when a window is de-iconified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowAdapter.java
    public void windowIconified(WindowEvent e) {}

    /**
     * Invoked when a window is iconified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowAdapter.java
    public void windowClosed(WindowEvent e) {}

    /**
     * Invoked when a window has been closed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowAdapter.java
    public void windowClosing(WindowEvent e) {}

    /**
     * Invoked when a window is in the process of being closed.
     * The close operation can be overridden at this point.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowAdapter.java
    public void windowOpened(WindowEvent e) {}

    /**
     * Invoked when a window has been opened.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/event/WindowAdapter.java
public abstract class WindowAdapter

/**
 * An abstract adapter class for receiving window events.
 * The methods in this class are empty. This class exists as
 * convenience for creating listener objects.
 * <P>
 * Extend this class to create a <code>WindowEvent</code> listener
 * and override the methods for the events of interest. (If you implement the
 * <code>WindowListener</code> interface, you have to define all of
 * the methods in it. This abstract class defines null methods for them
 * all, so you can only have to define methods for events you care about.)
 * <P>
 * Create a listener object using the extended class and then register it with
 * a Window using the window's <code>addWindowListener</code>
 * method. When the window's status changes by virtue of being opened,
 * closed, activated or deactivated, iconified or deiconified,
 * the relevant method in the listener
 * object is invoked, and the <code>WindowEvent</code> is passed to it.
 *
 * @see WindowEvent
 * @see WindowListener
 * @see <a href="https://docs.oracle.com/javase/tutorial/uiswing/events/windowlistener.html">Tutorial: Writing a Window Listener</a>
 *
 * @author Carl Quinn
 * @author Amy Fowler
 * @author David Mendenhall
 * @since 1.1
 */
