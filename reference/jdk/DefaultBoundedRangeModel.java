_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultBoundedRangeModel.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Returns an array of all the objects currently registered as
     * <code><em>Foo</em>Listener</code>s
     * upon this model.
     * <code><em>Foo</em>Listener</code>s
     * are registered using the <code>add<em>Foo</em>Listener</code> method.
     * <p>
     * You can specify the <code>listenerType</code> argument
     * with a class literal, such as <code><em>Foo</em>Listener.class</code>.
     * For example, you can query a <code>DefaultBoundedRangeModel</code>
     * instance <code>m</code>
     * for its change listeners
     * with the following code:
     *
     * <pre>ChangeListener[] cls = (ChangeListener[])(m.getListeners(ChangeListener.class));</pre>
     *
     * If no such listeners exist,
     * this method returns an empty array.
     *
     * @param listenerType  the type of listeners requested;
     *          this parameter should specify an interface
     *          that descends from <code>java.util.EventListener</code>
     * @return an array of all objects registered as
     *          <code><em>Foo</em>Listener</code>s
     *          on this model,
     *          or an empty array if no such
     *          listeners have been added
     * @exception ClassCastException if <code>listenerType</code> doesn't
     *          specify a class or interface that implements
     *          <code>java.util.EventListener</code>
     *
     * @see #getChangeListeners
     *
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultBoundedRangeModel.java
    public String toString()  {

    /**
     * Returns a string that displays all of the
     * <code>BoundedRangeModel</code> properties.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultBoundedRangeModel.java
    protected void fireStateChanged()

    /**
     * Runs each <code>ChangeListener</code>'s <code>stateChanged</code> method.
     *
     * @see #setRangeProperties
     * @see EventListenerList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultBoundedRangeModel.java
    public ChangeListener[] getChangeListeners() {

    /**
     * Returns an array of all the change listeners
     * registered on this <code>DefaultBoundedRangeModel</code>.
     *
     * @return all of this model's <code>ChangeListener</code>s
     *         or an empty
     *         array if no change listeners are currently registered
     *
     * @see #addChangeListener
     * @see #removeChangeListener
     *
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultBoundedRangeModel.java
    public void removeChangeListener(ChangeListener l) {

    /**
     * Removes a <code>ChangeListener</code>.
     *
     * @param l the <code>ChangeListener</code> to remove
     * @see #addChangeListener
     * @see BoundedRangeModel#removeChangeListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultBoundedRangeModel.java
    public void addChangeListener(ChangeListener l) {

    /**
     * Adds a <code>ChangeListener</code>.  The change listeners are run each
     * time any one of the Bounded Range model properties changes.
     *
     * @param l the ChangeListener to add
     * @see #removeChangeListener
     * @see BoundedRangeModel#addChangeListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultBoundedRangeModel.java
    public void setRangeProperties(int newValue, int newExtent, int newMin, int newMax, boolean adjusting)

    /**
     * Sets all of the <code>BoundedRangeModel</code> properties after forcing
     * the arguments to obey the usual constraints:
     * <pre>
     *     minimum &lt;= value &lt;= value+extent &lt;= maximum
     * </pre>
     * <p>
     * At most, one <code>ChangeEvent</code> is generated.
     *
     * @see BoundedRangeModel#setRangeProperties
     * @see #setValue
     * @see #setExtent
     * @see #setMinimum
     * @see #setMaximum
     * @see #setValueIsAdjusting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultBoundedRangeModel.java
    public boolean getValueIsAdjusting() {

    /**
     * Returns true if the value is in the process of changing
     * as a result of actions being taken by the user.
     *
     * @return the value of the <code>valueIsAdjusting</code> property
     * @see #setValue
     * @see BoundedRangeModel#getValueIsAdjusting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultBoundedRangeModel.java
    public void setValueIsAdjusting(boolean b) {

    /**
     * Sets the <code>valueIsAdjusting</code> property.
     *
     * @see #getValueIsAdjusting
     * @see #setValue
     * @see BoundedRangeModel#setValueIsAdjusting
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultBoundedRangeModel.java
    public void setMaximum(int n) {

    /**
     * Sets the maximum to <I>n</I> after ensuring that <I>n</I>
     * that the other three properties obey the model's constraints:
     * <pre>
     *     minimum &lt;= value &lt;= value+extent &lt;= maximum
     * </pre>
     * @see BoundedRangeModel#setMaximum
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultBoundedRangeModel.java
    public void setMinimum(int n) {

    /**
     * Sets the minimum to <I>n</I> after ensuring that <I>n</I>
     * that the other three properties obey the model's constraints:
     * <pre>
     *     minimum &lt;= value &lt;= value+extent &lt;= maximum
     * </pre>
     * @see #getMinimum
     * @see BoundedRangeModel#setMinimum
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultBoundedRangeModel.java
    public void setExtent(int n) {

    /**
     * Sets the extent to <I>n</I> after ensuring that <I>n</I>
     * is greater than or equal to zero and falls within the model's
     * constraints:
     * <pre>
     *     minimum &lt;= value &lt;= value+extent &lt;= maximum
     * </pre>
     * @see BoundedRangeModel#setExtent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultBoundedRangeModel.java
    public void setValue(int n) {

    /**
     * Sets the current value of the model. For a slider, that
     * determines where the knob appears. Ensures that the new
     * value, <I>n</I> falls within the model's constraints:
     * <pre>
     *     minimum &lt;= value &lt;= value+extent &lt;= maximum
     * </pre>
     *
     * @see BoundedRangeModel#setValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultBoundedRangeModel.java
    public int getMaximum() {

    /**
     * Returns the model's maximum.
     * @return  the model's maximum
     * @see #setMaximum
     * @see BoundedRangeModel#getMaximum
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultBoundedRangeModel.java
    public int getMinimum() {

    /**
     * Returns the model's minimum.
     * @return the model's minimum
     * @see #setMinimum
     * @see BoundedRangeModel#getMinimum
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultBoundedRangeModel.java
    public int getExtent() {

    /**
     * Returns the model's extent.
     * @return the model's extent
     * @see #setExtent
     * @see BoundedRangeModel#getExtent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultBoundedRangeModel.java
    public int getValue() {

    /**
     * Returns the model's current value.
     * @return the model's current value
     * @see #setValue
     * @see BoundedRangeModel#getValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultBoundedRangeModel.java
    public DefaultBoundedRangeModel(int value, int extent, int min, int max)

    /**
     * Initializes value, extent, minimum and maximum. Adjusting is false.
     * Throws an <code>IllegalArgumentException</code> if the following
     * constraints aren't satisfied:
     * <pre>
     * min &lt;= value &lt;= value+extent &lt;= max
     * </pre>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultBoundedRangeModel.java
    public DefaultBoundedRangeModel() {

    /**
     * Initializes all of the properties with default values.
     * Those values are:
     * <ul>
     * <li><code>value</code> = 0
     * <li><code>extent</code> = 0
     * <li><code>minimum</code> = 0
     * <li><code>maximum</code> = 100
     * <li><code>adjusting</code> = false
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultBoundedRangeModel.java
    protected EventListenerList listenerList = new EventListenerList();

    /** The listeners waiting for model changes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultBoundedRangeModel.java
    protected transient ChangeEvent changeEvent = null;

    /**
     * Only one <code>ChangeEvent</code> is needed per model instance since the
     * event's only (read-only) state is the source property.  The source
     * of events generated here is always "this".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/DefaultBoundedRangeModel.java
public class DefaultBoundedRangeModel implements BoundedRangeModel, Serializable

/**
 * A generic implementation of BoundedRangeModel.
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running
 * the same version of Swing.  As of 1.4, support for long term storage
 * of all JavaBeans&trade;
 * has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 *
 * @author David Kloba
 * @author Hans Muller
 * @see BoundedRangeModel
 */
