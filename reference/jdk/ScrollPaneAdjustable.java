_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    public String paramString() {

    /**
     * Returns a string representing the state of this scrollbar.
     * This method is intended to be used only for debugging purposes,
     * and the content and format of the returned string may vary
     * between implementations.  The returned string may be empty but
     * may not be <code>null</code>.
     *
     * @return      the parameter string of this scrollbar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    public String toString() {

    /**
     * Returns a string representation of this scrollbar and its values.
     * @return    a string representation of this scrollbar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    public synchronized AdjustmentListener[] getAdjustmentListeners() {

    /**
     * Returns an array of all the adjustment listeners
     * registered on this <code>ScrollPaneAdjustable</code>.
     *
     * @return all of this <code>ScrollPaneAdjustable</code>'s
     *         <code>AdjustmentListener</code>s
     *         or an empty array if no adjustment
     *         listeners are currently registered
     *
     * @see           #addAdjustmentListener
     * @see           #removeAdjustmentListener
     * @see           java.awt.event.AdjustmentListener
     * @see           java.awt.event.AdjustmentEvent
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    public synchronized void removeAdjustmentListener(AdjustmentListener l){

    /**
     * Removes the specified adjustment listener so that it no longer
     * receives adjustment events from this <code>ScrollPaneAdjustable</code>.
     * If <code>l</code> is <code>null</code>, no exception is thrown
     * and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param         l     the adjustment listener.
     * @see           #addAdjustmentListener
     * @see           #getAdjustmentListeners
     * @see           java.awt.event.AdjustmentListener
     * @see           java.awt.event.AdjustmentEvent
     * @since         JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    public synchronized void addAdjustmentListener(AdjustmentListener l) {

    /**
     * Adds the specified adjustment listener to receive adjustment
     * events from this <code>ScrollPaneAdjustable</code>.
     * If <code>l</code> is <code>null</code>, no exception is thrown
     * and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the adjustment listener.
     * @see      #removeAdjustmentListener
     * @see      #getAdjustmentListeners
     * @see      java.awt.event.AdjustmentListener
     * @see      java.awt.event.AdjustmentEvent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private void setTypedValue(int v, int type) {

    /**
     * Sets the value of this scrollbar to the specified value.
     * <p>
     * If the value supplied is less than the current minimum or
     * greater than the current maximum, then one of those values is
     * substituted, as appropriate. Also, creates and dispatches
     * the AdjustementEvent with specified type and value.
     *
     * @param v the new value of the scrollbar
     * @param type the type of the scrolling operation occurred
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    public void setValue(int v) {

    /**
     * Sets the value of this scrollbar to the specified value.
     * <p>
     * If the value supplied is less than the current minimum or
     * greater than the current maximum, then one of those values is
     * substituted, as appropriate.
     *
     * @param v the new value of the scrollbar
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    public boolean getValueIsAdjusting() {

    /**
     * Returns true if the value is in the process of changing as a
     * result of actions being taken by the user.
     *
     * @return the value of the <code>valueIsAdjusting</code> property
     * @see #setValueIsAdjusting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    public void setValueIsAdjusting(boolean b) {

    /**
     * Sets the <code>valueIsAdjusting</code> property.
     *
     * @param b new adjustment-in-progress status
     * @see #getValueIsAdjusting
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    public void setVisibleAmount(int v) {

    /**
     * This method should <strong>NOT</strong> be called by user code.
     * This method is public for this class to properly implement
     * <code>Adjustable</code> interface.
     *
     * @throws AWTError Always throws an error when called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    public void setMaximum(int max) {

    /**
     * This method should <strong>NOT</strong> be called by user code.
     * This method is public for this class to properly implement
     * <code>Adjustable</code> interface.
     *
     * @throws AWTError Always throws an error when called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    public void setMinimum(int min) {

    /**
     * This method should <strong>NOT</strong> be called by user code.
     * This method is public for this class to properly implement
     * <code>Adjustable</code> interface.
     *
     * @throws AWTError Always throws an error when called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    public int getOrientation() {

    /**
     * Returns the orientation of this scrollbar.
     * @return    the orientation of this scrollbar, either
     *            <code>Adjustable.HORIZONTAL</code> or
     *            <code>Adjustable.VERTICAL</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    void setSpan(int min, int max, int visible) {

    /**
     * This is called by the scrollpane itself to update the
     * <code>minimum</code>, <code>maximum</code> and
     * <code>visible</code> values.  The scrollpane is the only one
     * that should be changing these since it is the source of these
     * values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    ScrollPaneAdjustable(ScrollPane sp, AdjustmentListener l, int orientation) {

    /**
     * Constructs a new object to represent specified scrollabar
     * of the specified <code>ScrollPane</code>.
     * Only ScrollPane creates instances of this class.
     * @param sp           <code>ScrollPane</code>
     * @param l            <code>AdjustmentListener</code> to add upon creation.
     * @param orientation  specifies which scrollbar this object represents,
     *                     can be either  <code>Adjustable.HORIZONTAL</code>
     *                     or <code>Adjustable.VERTICAL</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private static final long serialVersionUID = -3359745691033257079L;

    /**
     * JDK 1.1 serialVersionUID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method ids.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private static final String SCROLLPANE_ONLY =

    /**
     * Error message for <code>AWTError</code> reported when one of
     * the public but unsupported methods is called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private int blockIncrement = 1;

    /**
     * The amount by which the scrollbar value will change when going
     * up or down by a page.
     * This value should be a non negative integer.
     *
     * @serial
     * @see #getBlockIncrement
     * @see #setBlockIncrement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private int unitIncrement  = 1;

    /**
     * The amount by which the scrollbar value will change when going
     * up or down by a line.
     * This value should be a non negative integer.
     *
     * @serial
     * @see #getUnitIncrement
     * @see #setUnitIncrement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private transient boolean isAdjusting;

    /**
     * The adjusting status of the <code>Scrollbar</code>.
     * True if the value is in the process of changing as a result of
     * actions being taken by the user.
     *
     * @see #getValueIsAdjusting
     * @see #setValueIsAdjusting
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private int visibleAmount;

    /**
     * The size of the visible portion of this scrollbar.
     * This value can only be set by the <code>ScrollPane</code>.
     *
     * @serial
     * @see #getVisibleAmount
     * @see #setSpan(int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private int maximum;

    /**
     * The maximum value of this scrollbar.
     * This value can only be set by the <code>ScrollPane</code>.
     *
     * @serial
     * @see #getMaximum
     * @see #setSpan(int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private int minimum;

    /**
     * The minimum value of this scrollbar.
     * This value can only be set by the <code>ScrollPane</code>.
     * <p>
     * <strong>ATTN:</strong> In current implementation
     * <code>minimum</code> is always <code>0</code>.  This field can
     * only be altered via <code>setSpan</code> method and
     * <code>ScrollPane</code> always calls that method with
     * <code>0</code> for the minimum.  <code>getMinimum</code> method
     * always returns <code>0</code> without checking this field.
     *
     * @serial
     * @see #getMinimum
     * @see #setSpan(int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private int value;

    /**
     * The value of this scrollbar.
     * <code>value</code> should be greater than <code>minimum</code>
     * and less than <code>maximum</code>
     *
     * @serial
     * @see #getValue
     * @see #setValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private int orientation;

    /**
     * Orientation of this scrollbar.
     *
     * @serial
     * @see #getOrientation
     * @see java.awt.Adjustable#HORIZONTAL
     * @see java.awt.Adjustable#VERTICAL
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private ScrollPane sp;

    /**
     * The <code>ScrollPane</code> this object is a scrollbar of.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
public class ScrollPaneAdjustable implements Adjustable, Serializable {

/**
 * This class represents the state of a horizontal or vertical
 * scrollbar of a <code>ScrollPane</code>.  Objects of this class are
 * returned by <code>ScrollPane</code> methods.
 *
 * @since       1.4
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    public String paramString() {

    /**
     * Returns a string representing the state of this scrollbar.
     * This method is intended to be used only for debugging purposes,
     * and the content and format of the returned string may vary
     * between implementations.  The returned string may be empty but
     * may not be <code>null</code>.
     *
     * @return      the parameter string of this scrollbar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    public String toString() {

    /**
     * Returns a string representation of this scrollbar and its values.
     * @return    a string representation of this scrollbar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    public synchronized AdjustmentListener[] getAdjustmentListeners() {

    /**
     * Returns an array of all the adjustment listeners
     * registered on this <code>ScrollPaneAdjustable</code>.
     *
     * @return all of this <code>ScrollPaneAdjustable</code>'s
     *         <code>AdjustmentListener</code>s
     *         or an empty array if no adjustment
     *         listeners are currently registered
     *
     * @see           #addAdjustmentListener
     * @see           #removeAdjustmentListener
     * @see           java.awt.event.AdjustmentListener
     * @see           java.awt.event.AdjustmentEvent
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    public synchronized void removeAdjustmentListener(AdjustmentListener l){

    /**
     * Removes the specified adjustment listener so that it no longer
     * receives adjustment events from this <code>ScrollPaneAdjustable</code>.
     * If <code>l</code> is <code>null</code>, no exception is thrown
     * and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param         l     the adjustment listener.
     * @see           #addAdjustmentListener
     * @see           #getAdjustmentListeners
     * @see           java.awt.event.AdjustmentListener
     * @see           java.awt.event.AdjustmentEvent
     * @since         JDK1.1
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    public synchronized void addAdjustmentListener(AdjustmentListener l) {

    /**
     * Adds the specified adjustment listener to receive adjustment
     * events from this <code>ScrollPaneAdjustable</code>.
     * If <code>l</code> is <code>null</code>, no exception is thrown
     * and no action is performed.
     * <p>Refer to <a href="doc-files/AWTThreadIssues.html#ListenersThreads"
     * >AWT Threading Issues</a> for details on AWT's threading model.
     *
     * @param    l   the adjustment listener.
     * @see      #removeAdjustmentListener
     * @see      #getAdjustmentListeners
     * @see      java.awt.event.AdjustmentListener
     * @see      java.awt.event.AdjustmentEvent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private void setTypedValue(int v, int type) {

    /**
     * Sets the value of this scrollbar to the specified value.
     * <p>
     * If the value supplied is less than the current minimum or
     * greater than the current maximum, then one of those values is
     * substituted, as appropriate. Also, creates and dispatches
     * the AdjustementEvent with specified type and value.
     *
     * @param v the new value of the scrollbar
     * @param type the type of the scrolling operation occurred
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    public void setValue(int v) {

    /**
     * Sets the value of this scrollbar to the specified value.
     * <p>
     * If the value supplied is less than the current minimum or
     * greater than the current maximum, then one of those values is
     * substituted, as appropriate.
     *
     * @param v the new value of the scrollbar
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    public boolean getValueIsAdjusting() {

    /**
     * Returns true if the value is in the process of changing as a
     * result of actions being taken by the user.
     *
     * @return the value of the <code>valueIsAdjusting</code> property
     * @see #setValueIsAdjusting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    public void setValueIsAdjusting(boolean b) {

    /**
     * Sets the <code>valueIsAdjusting</code> property.
     *
     * @param b new adjustment-in-progress status
     * @see #getValueIsAdjusting
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    public void setVisibleAmount(int v) {

    /**
     * This method should <strong>NOT</strong> be called by user code.
     * This method is public for this class to properly implement
     * <code>Adjustable</code> interface.
     *
     * @throws AWTError Always throws an error when called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    public void setMaximum(int max) {

    /**
     * This method should <strong>NOT</strong> be called by user code.
     * This method is public for this class to properly implement
     * <code>Adjustable</code> interface.
     *
     * @throws AWTError Always throws an error when called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    public void setMinimum(int min) {

    /**
     * This method should <strong>NOT</strong> be called by user code.
     * This method is public for this class to properly implement
     * <code>Adjustable</code> interface.
     *
     * @throws AWTError Always throws an error when called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    public int getOrientation() {

    /**
     * Returns the orientation of this scrollbar.
     * @return    the orientation of this scrollbar, either
     *            <code>Adjustable.HORIZONTAL</code> or
     *            <code>Adjustable.VERTICAL</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    void setSpan(int min, int max, int visible) {

    /**
     * This is called by the scrollpane itself to update the
     * <code>minimum</code>, <code>maximum</code> and
     * <code>visible</code> values.  The scrollpane is the only one
     * that should be changing these since it is the source of these
     * values.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    ScrollPaneAdjustable(ScrollPane sp, AdjustmentListener l, int orientation) {

    /**
     * Constructs a new object to represent specified scrollabar
     * of the specified <code>ScrollPane</code>.
     * Only ScrollPane creates instances of this class.
     * @param sp           <code>ScrollPane</code>
     * @param l            <code>AdjustmentListener</code> to add upon creation.
     * @param orientation  specifies which scrollbar this object represents,
     *                     can be either  <code>Adjustable.HORIZONTAL</code>
     *                     or <code>Adjustable.VERTICAL</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private static final long serialVersionUID = -3359745691033257079L;

    /**
     * JDK 1.1 serialVersionUID.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private static native void initIDs();

    /**
     * Initialize JNI field and method ids.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private static final String SCROLLPANE_ONLY =

    /**
     * Error message for <code>AWTError</code> reported when one of
     * the public but unsupported methods is called.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private int blockIncrement = 1;

    /**
     * The amount by which the scrollbar value will change when going
     * up or down by a page.
     * This value should be a non negative integer.
     *
     * @serial
     * @see #getBlockIncrement
     * @see #setBlockIncrement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private int unitIncrement  = 1;

    /**
     * The amount by which the scrollbar value will change when going
     * up or down by a line.
     * This value should be a non negative integer.
     *
     * @serial
     * @see #getUnitIncrement
     * @see #setUnitIncrement
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private transient boolean isAdjusting;

    /**
     * The adjusting status of the <code>Scrollbar</code>.
     * True if the value is in the process of changing as a result of
     * actions being taken by the user.
     *
     * @see #getValueIsAdjusting
     * @see #setValueIsAdjusting
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private int visibleAmount;

    /**
     * The size of the visible portion of this scrollbar.
     * This value can only be set by the <code>ScrollPane</code>.
     *
     * @serial
     * @see #getVisibleAmount
     * @see #setSpan(int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private int maximum;

    /**
     * The maximum value of this scrollbar.
     * This value can only be set by the <code>ScrollPane</code>.
     *
     * @serial
     * @see #getMaximum
     * @see #setSpan(int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private int minimum;

    /**
     * The minimum value of this scrollbar.
     * This value can only be set by the <code>ScrollPane</code>.
     * <p>
     * <strong>ATTN:</strong> In current implementation
     * <code>minimum</code> is always <code>0</code>.  This field can
     * only be altered via <code>setSpan</code> method and
     * <code>ScrollPane</code> always calls that method with
     * <code>0</code> for the minimum.  <code>getMinimum</code> method
     * always returns <code>0</code> without checking this field.
     *
     * @serial
     * @see #getMinimum
     * @see #setSpan(int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private int value;

    /**
     * The value of this scrollbar.
     * <code>value</code> should be greater than <code>minimum</code>
     * and less than <code>maximum</code>
     *
     * @serial
     * @see #getValue
     * @see #setValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private int orientation;

    /**
     * Orientation of this scrollbar.
     *
     * @serial
     * @see #getOrientation
     * @see java.awt.Adjustable#HORIZONTAL
     * @see java.awt.Adjustable#VERTICAL
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
    private ScrollPane sp;

    /**
     * The <code>ScrollPane</code> this object is a scrollbar of.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/ScrollPaneAdjustable.java
public class ScrollPaneAdjustable implements Adjustable, Serializable {

/**
 * This class represents the state of a horizontal or vertical
 * scrollbar of a <code>ScrollPane</code>.  Objects of this class are
 * returned by <code>ScrollPane</code> methods.
 *
 * @since       1.4
 */
