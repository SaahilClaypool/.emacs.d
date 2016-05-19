_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicDirectoryModel.java
    private synchronized void setBusy(final boolean busy, int fid) {

    /**
     * Set the busy state for the model. The model is considered
     * busy when it is running a separate (interruptable)
     * thread in order to load the contents of a directory.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicDirectoryModel.java
    protected void firePropertyChange(String propertyName,
                                      Object oldValue, Object newValue) {

    /**
     * Support for reporting bound property changes for boolean properties.
     * This method can be called when a bound property has changed and it will
     * send the appropriate PropertyChangeEvent to any registered
     * PropertyChangeListeners.
     *
     * @param propertyName the property whose value has changed
     * @param oldValue the property's previous value
     * @param newValue the property's new value
     *
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicDirectoryModel.java
    public PropertyChangeListener[] getPropertyChangeListeners() {

    /**
     * Returns an array of all the property change listeners
     * registered on this component.
     *
     * @return all of this component's <code>PropertyChangeListener</code>s
     *         or an empty array if no property change
     *         listeners are currently registered
     *
     * @see      #addPropertyChangeListener
     * @see      #removePropertyChangeListener
     * @see      java.beans.PropertyChangeSupport#getPropertyChangeListeners
     *
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicDirectoryModel.java
    public void removePropertyChangeListener(PropertyChangeListener listener) {

    /**
     * Removes a PropertyChangeListener from the listener list.
     * <p>
     * If listener is null, no exception is thrown and no action is performed.
     *
     * @param listener the PropertyChangeListener to be removed
     *
     * @see #addPropertyChangeListener
     * @see #getPropertyChangeListeners
     *
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicDirectoryModel.java
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    /**
     * Adds a PropertyChangeListener to the listener list. The listener is
     * registered for all bound properties of this class.
     * <p>
     * If <code>listener</code> is <code>null</code>,
     * no exception is thrown and no action is performed.
     *
     * @param    listener  the property change listener to be added
     *
     * @see #removePropertyChangeListener
     * @see #getPropertyChangeListeners
     *
     * @since 1.6
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicDirectoryModel.java
    public void intervalRemoved(ListDataEvent e) {

    /**
     * Obsolete - not used.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicDirectoryModel.java
    public void intervalAdded(ListDataEvent e) {

    /**
     * Obsolete - not used.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicDirectoryModel.java
    public boolean renameFile(File oldFile, File newFile) {

    /**
     * Renames a file in the underlying file system.
     *
     * @param oldFile a <code>File</code> object representing
     *        the existing file
     * @param newFile a <code>File</code> object representing
     *        the desired new file name
     * @return <code>true</code> if rename succeeded,
     *        otherwise <code>false</code>
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicDirectoryModel.java
    public void invalidateFileCache() {

    /**
     * This method is used to interrupt file loading thread.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//plaf/basic/BasicDirectoryModel.java
public class BasicDirectoryModel extends AbstractListModel<Object> implements PropertyChangeListener {

/**
 * Basic implementation of a file list.
 *
 * @author Jeff Dinkins
 */
