_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/InternalFrameListener.java
    public void internalFrameDeactivated(InternalFrameEvent e);

    /**
     * Invoked when an internal frame is de-activated.
     * @see javax.swing.JInternalFrame#setSelected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/InternalFrameListener.java
    public void internalFrameActivated(InternalFrameEvent e);

    /**
     * Invoked when an internal frame is activated.
     * @see javax.swing.JInternalFrame#setSelected
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/InternalFrameListener.java
    public void internalFrameDeiconified(InternalFrameEvent e);

    /**
     * Invoked when an internal frame is de-iconified.
     * @see javax.swing.JInternalFrame#setIcon
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/InternalFrameListener.java
    public void internalFrameIconified(InternalFrameEvent e);

    /**
     * Invoked when an internal frame is iconified.
     * @see javax.swing.JInternalFrame#setIcon
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/InternalFrameListener.java
    public void internalFrameClosed(InternalFrameEvent e);

    /**
     * Invoked when an internal frame has been closed.
     * @see javax.swing.JInternalFrame#setClosed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/InternalFrameListener.java
    public void internalFrameClosing(InternalFrameEvent e);

    /**
     * Invoked when an internal frame is in the process of being closed.
     * The close operation can be overridden at this point.
     * @see javax.swing.JInternalFrame#setDefaultCloseOperation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/event/InternalFrameListener.java
public interface InternalFrameListener extends EventListener {

/**
 * The listener interface for receiving internal frame events.
 * This class is functionally equivalent to the WindowListener class
 * in the AWT.
 * <p>
 * See <a href="https://docs.oracle.com/javase/tutorial/uiswing/events/internalframelistener.html">How to Write an Internal Frame Listener</a>
 * in <em>The Java Tutorial</em> for further documentation.
 *
 * @see java.awt.event.WindowListener
 *
 * @author Thomas Ball
 */
