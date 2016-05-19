_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//colorchooser/DefaultColorSelectionModel.java
    protected void fireStateChanged()

    /**
     * Runs each <code>ChangeListener</code>'s
     * <code>stateChanged</code> method.
     *
     * <!-- @see #setRangeProperties    //bad link-->
     * @see EventListenerList
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//colorchooser/DefaultColorSelectionModel.java
    public ChangeListener[] getChangeListeners() {

    /**
     * Returns an array of all the <code>ChangeListener</code>s added
     * to this <code>DefaultColorSelectionModel</code> with
     * <code>addChangeListener</code>.
     *
     * @return all of the <code>ChangeListener</code>s added, or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//colorchooser/DefaultColorSelectionModel.java
    public void removeChangeListener(ChangeListener l) {

    /**
     * Removes a <code>ChangeListener</code> from the model.
     * @param l the <code>ChangeListener</code> to be removed
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//colorchooser/DefaultColorSelectionModel.java
    public void addChangeListener(ChangeListener l) {

    /**
     * Adds a <code>ChangeListener</code> to the model.
     *
     * @param l the <code>ChangeListener</code> to be added
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//colorchooser/DefaultColorSelectionModel.java
    public void setSelectedColor(Color color) {

    /**
     * Sets the selected color to <code>color</code>.
     * Note that setting the color to <code>null</code>
     * is undefined and may have unpredictable results.
     * This method fires a state changed event if it sets the
     * current color to a new non-<code>null</code> color;
     * if the new color is the same as the current color,
     * no event is fired.
     *
     * @param color the new <code>Color</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//colorchooser/DefaultColorSelectionModel.java
    public Color getSelectedColor() {

    /**
     * Returns the selected <code>Color</code> which should be
     * non-<code>null</code>.
     *
     * @return the selected <code>Color</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//colorchooser/DefaultColorSelectionModel.java
    public DefaultColorSelectionModel(Color color) {

    /**
     * Creates a <code>DefaultColorSelectionModel</code> with the
     * current color set to <code>color</code>, which should be
     * non-<code>null</code>.  Note that setting the color to
     * <code>null</code> is undefined and may have unpredictable
     * results.
     *
     * @param color the new <code>Color</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//colorchooser/DefaultColorSelectionModel.java
    public DefaultColorSelectionModel() {

    /**
     * Creates a <code>DefaultColorSelectionModel</code> with the
     * current color set to <code>Color.white</code>.  This is
     * the default constructor.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//colorchooser/DefaultColorSelectionModel.java
    protected transient ChangeEvent changeEvent = null;

    /**
     * Only one <code>ChangeEvent</code> is needed per model instance
     * since the event's only (read-only) state is the source property.
     * The source of events generated here is always "this".
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//colorchooser/DefaultColorSelectionModel.java
public class DefaultColorSelectionModel implements ColorSelectionModel, Serializable {

/**
 * A generic implementation of <code>ColorSelectionModel</code>.
 *
 * @author Steve Wilson
 *
 * @see java.awt.Color
 */
