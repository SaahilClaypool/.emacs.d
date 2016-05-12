_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DesktopManager.java
    void setBoundsForFrame(JComponent f, int newX, int newY, int newWidth, int newHeight);

    /** This is a primitive reshape method.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DesktopManager.java
    void endResizingFrame(JComponent f);

    /** This method signals the end of the resize session. Any state maintained by
      * the DesktopManager can be removed here.  Normally <b>f</b> will be a JInternalFrame.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DesktopManager.java
    void beginResizingFrame(JComponent f, int direction);

    /** This methods is normally called when the user has indicated that
      * they will begin resizing the frame. This method should be called
      * prior to any resizeFrame() calls to allow the DesktopManager to prepare any
      * necessary state.  Normally <b>f</b> will be a JInternalFrame.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DesktopManager.java
    void dragFrame(JComponent f, int newX, int newY);

    /** The user has moved the frame. Calls to this method will be preceded by calls
      * to beginDraggingFrame().
      *  Normally <b>f</b> will be a JInternalFrame.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DesktopManager.java
    void beginDraggingFrame(JComponent f);

    /** This method is normally called when the user has indicated that
      * they will begin dragging a component around. This method should be called
      * prior to any dragFrame() calls to allow the DesktopManager to prepare any
      * necessary state. Normally <b>f</b> will be a JInternalFrame.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DesktopManager.java
    void deactivateFrame(JInternalFrame f);

    /**
     * Generally, indicate that this frame has lost focus. This is usually called
     * after the JInternalFrame's IS_SELECTED_PROPERTY has been set to false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DesktopManager.java
    void activateFrame(JInternalFrame f);

    /**
     * Generally, indicate that this frame has focus. This is usually called after
     * the JInternalFrame's IS_SELECTED_PROPERTY has been set to true.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DesktopManager.java
    void iconifyFrame(JInternalFrame f);

    /** Generally, remove this frame from it's parent and add an iconic representation. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DesktopManager.java
    void maximizeFrame(JInternalFrame f);

    /** Generally, the frame should be resized to match it's parents bounds. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DesktopManager.java
    void closeFrame(JInternalFrame f);

    /** Generally, this call should remove the frame from it's parent. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DesktopManager.java
    void openFrame(JInternalFrame f);

    /** If possible, display this frame in an appropriate location.
      * Normally, this is not called, as the creator of the JInternalFrame
      * will add the frame to the appropriate parent.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DesktopManager.java
public interface DesktopManager

/** DesktopManager objects are owned by a JDesktopPane object. They are responsible
  * for implementing L&amp;F specific behaviors for the JDesktopPane. JInternalFrame
  * implementations should delegate specific behaviors to the DesktopManager. For
  * instance, if a JInternalFrame was asked to iconify, it should try:
  * <PRE>
  *    getDesktopPane().getDesktopManager().iconifyFrame(frame);
  * </PRE>
  * This delegation allows each L&amp;F to provide custom behaviors for desktop-specific
  * actions. (For example, how and where the internal frame's icon would appear.)
  * <p>This class provides a policy for the various JInternalFrame methods, it is not
  * meant to be called directly rather the various JInternalFrame methods will call
  * into the DesktopManager.</p>
  *
  * @see JDesktopPane
  * @see JInternalFrame
  * @see JInternalFrame.JDesktopIcon
  *
  * @author David Kloba
  */
