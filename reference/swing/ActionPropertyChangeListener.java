_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ActionPropertyChangeListener.java
    protected abstract void actionPropertyChanged(T target, Action action,
                                                  PropertyChangeEvent e);

    /**
     * Invoked when a property changes on the Action and the target
     * still exists.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ActionPropertyChangeListener.java
    public final void propertyChange(PropertyChangeEvent e) {

    /**
     * PropertyChangeListener method.  If the target has been gc'ed this
     * will remove the <code>PropertyChangeListener</code> from the Action,
     * otherwise this will invoke actionPropertyChanged.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ActionPropertyChangeListener.java
abstract class ActionPropertyChangeListener<T extends JComponent>

/**
 * A package-private PropertyChangeListener which listens for
 * property changes on an Action and updates the properties
 * of an ActionEvent source.
 * <p>
 * Subclasses must override the actionPropertyChanged method,
 * which is invoked from the propertyChange method as long as
 * the target is still valid.
 * </p>
 * <p>
 * WARNING WARNING WARNING WARNING WARNING WARNING:<br>
 * Do NOT create an annonymous inner class that extends this!  If you do
 * a strong reference will be held to the containing class, which in most
 * cases defeats the purpose of this class.
 *
 * @param T the type of JComponent the underlying Action is attached to
 *
 * @author Georges Saab
 * @see AbstractButton
 */
