_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/WindowConstants.java
    public static final int EXIT_ON_CLOSE = 3;

    /**
     * The exit application default window close operation. Attempting
     * to set this on Windows that support this, such as
     * <code>JFrame</code>, may throw a <code>SecurityException</code> based
     * on the <code>SecurityManager</code>.
     * It is recommended you only use this in an application.
     *
     * @since 1.4
     * @see JFrame#setDefaultCloseOperation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/WindowConstants.java
    public static final int DISPOSE_ON_CLOSE = 2;

    /**
     * The dispose-window default window close operation.
     * <p>
     * <b>Note</b>: When the last displayable window
     * within the Java virtual machine (VM) is disposed of, the VM may
     * terminate.  See <a href="../../java/awt/doc-files/AWTThreadIssues.html">
     * AWT Threading Issues</a> for more information.
     * @see java.awt.Window#dispose()
     * @see JInternalFrame#dispose()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/WindowConstants.java
    public static final int HIDE_ON_CLOSE = 1;

    /**
     * The hide-window default window close operation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/WindowConstants.java
    public static final int DO_NOTHING_ON_CLOSE = 0;

    /**
     * The do-nothing default window close operation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/WindowConstants.java
public interface WindowConstants

/**
 * Constants used to control the window-closing operation.
 * The <code>setDefaultCloseOperation</code> and
 * <code>getDefaultCloseOperation</code> methods
 * provided by <code>JFrame</code>,
 * <code>JInternalFrame</code>, and
 * <code>JDialog</code>
 * use these constants.
 * For examples of setting the default window-closing operation, see
 * <a
 href="https://docs.oracle.com/javase/tutorial/uiswing/components/frame.html#windowevents">Responding to Window-Closing Events</a>,
 * a section in <em>The Java Tutorial</em>.
 * @see JFrame#setDefaultCloseOperation(int)
 * @see JDialog#setDefaultCloseOperation(int)
 * @see JInternalFrame#setDefaultCloseOperation(int)
 *
 *
 * @author Amy Fowler
 */
