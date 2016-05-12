_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultDesktopManager.java
   private void emergencyCleanup(final JComponent f) {

   /**
     * This method is here to clean up problems associated
     * with a race condition which can occur when the full contents
     * of a copyArea's source argument is not available onscreen.
     * This uses brute force to clean up in case of possible damage
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultDesktopManager.java
    protected boolean wasIcon(JInternalFrame f) {

    /**
     * Returns <code>true</code> if the component has been iconized
     * and the bounds of the <code>desktopIcon</code> are valid,
     * otherwise returns <code>false</code>.
     *
     * @param f the <code>JInternalFrame</code> of interest
     * @return <code>true</code> if the component has been iconized;
     *    otherwise returns <code>false</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultDesktopManager.java
    protected void setWasIcon(JInternalFrame f, Boolean value)  {

    /**
     * Sets that the component has been iconized and the bounds of the
     * <code>desktopIcon</code> are valid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultDesktopManager.java
    protected Rectangle getPreviousBounds(JInternalFrame f)     {

    /**
     * Gets the normal bounds of the component prior to the component
     * being maximized.
     * @param f the <code>JInternalFrame</code> of interest
     * @return the normal bounds of the component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultDesktopManager.java
    protected void setPreviousBounds(JInternalFrame f, Rectangle r)     {

    /**
     * Stores the bounds of the component just before a maximize call.
     * @param f the component about to be resized
     * @param r the normal bounds to be saved away
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultDesktopManager.java
    protected Rectangle getBoundsForIconOf(JInternalFrame f) {

    /** The iconifyFrame() code calls this to determine the proper bounds
      * for the desktopIcon.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultDesktopManager.java
    protected void removeIconFor(JInternalFrame f) {

    /** Convenience method to remove the desktopIcon of <b>f</b> is necessary. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultDesktopManager.java
    public void setBoundsForFrame(JComponent f, int newX, int newY, int newWidth, int newHeight) {

    /** This moves the <code>JComponent</code> and repaints the damaged areas. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultDesktopManager.java
    public void resizeFrame(JComponent f, int newX, int newY, int newWidth, int newHeight) {

    /**
     * Calls <code>setBoundsForFrame</code> with the new values.
     * @param f the component to be resized
     * @param newX the new x-coordinate
     * @param newY the new y-coordinate
     * @param newWidth the new width
     * @param newHeight the new height
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultDesktopManager.java
    public void dragFrame(JComponent f, int newX, int newY) {

    /**
      * Moves the visible location of the frame being dragged
      * to the location specified.  The means by which this occurs can vary depending
      * on the dragging algorithm being used.  The actual logical location of the frame
      * might not change until <code>endDraggingFrame</code> is called.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultDesktopManager.java
    public void activateFrame(JInternalFrame f) {

    /** This will activate <b>f</b> moving it to the front. It will
      * set the current active frame's (if any)
      * <code>IS_SELECTED_PROPERTY</code> to <code>false</code>.
      * There can be only one active frame across all Layers.
      * @param f the <code>JInternalFrame</code> to be activated
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultDesktopManager.java
    public void deiconifyFrame(JInternalFrame f) {

    /**
     * Removes the desktopIcon from its parent and adds its frame
     * to the parent.
     * @param f the <code>JInternalFrame</code> to be de-iconified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultDesktopManager.java
    public void iconifyFrame(JInternalFrame f) {

    /**
     * Removes the frame from its parent and adds its
     * <code>desktopIcon</code> to the parent.
     * @param f the <code>JInternalFrame</code> to be iconified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultDesktopManager.java
    public void minimizeFrame(JInternalFrame f) {

    /**
     * Restores the frame back to its size and position prior
     * to a <code>maximizeFrame</code> call.
     * @param f the <code>JInternalFrame</code> to be restored
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultDesktopManager.java
    public void maximizeFrame(JInternalFrame f) {

    /**
     * Resizes the frame to fill its parents bounds.
     * @param f the frame to be resized
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultDesktopManager.java
    public void closeFrame(JInternalFrame f) {

    /**
     * Removes the frame, and, if necessary, the
     * <code>desktopIcon</code>, from its parent.
     * @param f the <code>JInternalFrame</code> to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultDesktopManager.java
    public void openFrame(JInternalFrame f) {

    /** Normally this method will not be called. If it is, it
      * try to determine the appropriate parent from the desktopIcon of the frame.
      * Will remove the desktopIcon from its parent if it successfully adds the frame.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultDesktopManager.java
    private transient boolean didDrag;

    /**
     * Set to true when the user actually drags a frame vs clicks on it
     * to start the drag operation.  This is only used when dragging with
     * FASTER_DRAG_MODE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultDesktopManager.java
public class DefaultDesktopManager implements DesktopManager, java.io.Serializable {

/** This is an implementation of the <code>DesktopManager</code>.
  * It currently implements the basic behaviors for managing
  * <code>JInternalFrame</code>s in an arbitrary parent.
  * <code>JInternalFrame</code>s that are not children of a
  * <code>JDesktop</code> will use this component
  * to handle their desktop-like actions.
  * <p>This class provides a policy for the various JInternalFrame methods,
  * it is not meant to be called directly rather the various JInternalFrame
  * methods will call into the DesktopManager.</p>
  * @see JDesktopPane
  * @see JInternalFrame
  * @author David Kloba
  * @author Steve Wilson
  */
