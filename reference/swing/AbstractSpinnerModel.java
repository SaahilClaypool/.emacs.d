_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//AbstractSpinnerModel.java
    public <T extends EventListener> T[] getListeners(Class<T> listenerType) {

    /**
     * Return an array of all the listeners of the given type that
     * were added to this model.  For example to find all of the
     * ChangeListeners added to this model:
     * <pre>
     * myAbstractSpinnerModel.getListeners(ChangeListener.class);
     * </pre>
     *
     * @param listenerType the type of listeners to return, e.g. ChangeListener.class
     * @return all of the objects receiving <em>listenerType</em> notifications
     *         from this model
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//AbstractSpinnerModel.java
    protected void fireStateChanged()

    /**
     * Run each ChangeListeners stateChanged() method.
     *
     * @see #setValue
     * @see EventListenerList
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//AbstractSpinnerModel.java
    public ChangeListener[] getChangeListeners() {

    /**
     * Returns an array of all the <code>ChangeListener</code>s added
     * to this AbstractSpinnerModel with addChangeListener().
     *
     * @return all of the <code>ChangeListener</code>s added or an empty
     *         array if no listeners have been added
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//AbstractSpinnerModel.java
    public void removeChangeListener(ChangeListener l) {

    /**
     * Removes a ChangeListener from the model's listener list.
     *
     * @param l the ChangeListener to remove
     * @see #addChangeListener
     * @see SpinnerModel#removeChangeListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//AbstractSpinnerModel.java
    public void addChangeListener(ChangeListener l) {

    /**
     * Adds a ChangeListener to the model's listener list.  The
     * ChangeListeners must be notified when the models value changes.
     *
     * @param l the ChangeListener to add
     * @see #removeChangeListener
     * @see SpinnerModel#addChangeListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//AbstractSpinnerModel.java
    protected EventListenerList listenerList = new EventListenerList();

    /**
     * The list of ChangeListeners for this model.  Subclasses may
     * store their own listeners here.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//AbstractSpinnerModel.java
    private transient ChangeEvent changeEvent = null;

    /**
     * Only one ChangeEvent is needed per model instance since the
     * event's only (read-only) state is the source property.  The source
     * of events generated here is always "this".
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//AbstractSpinnerModel.java
public abstract class AbstractSpinnerModel implements SpinnerModel, Serializable

/**
 * This class provides the ChangeListener part of the
 * SpinnerModel interface that should be suitable for most concrete SpinnerModel
 * implementations.  Subclasses must provide an implementation of the
 * <code>setValue</code>, <code>getValue</code>, <code>getNextValue</code> and
 * <code>getPreviousValue</code> methods.
 *
 * @see JSpinner
 * @see SpinnerModel
 * @see SpinnerListModel
 * @see SpinnerNumberModel
 * @see SpinnerDateModel
 *
 * @author Hans Muller
 * @since 1.4
 */
