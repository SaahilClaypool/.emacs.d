_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//colorchooser/ColorSelectionModel.java
    void removeChangeListener(ChangeListener listener);

    /**
     * Removes <code>listener</code> as a listener to changes in the model.
     * @param listener the <code>ChangeListener</code> to be removed
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//colorchooser/ColorSelectionModel.java
    void addChangeListener(ChangeListener listener);

    /**
     * Adds <code>listener</code> as a listener to changes in the model.
     * @param listener the <code>ChangeListener</code> to be added
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//colorchooser/ColorSelectionModel.java
    void setSelectedColor(Color color);

    /**
     * Sets the selected color to <code>color</code>.
     * Note that setting the color to <code>null</code>
     * is undefined and may have unpredictable results.
     * This method fires a state changed event if it sets the
     * current color to a new non-<code>null</code> color.
     *
     * @param color the new <code>Color</code>
     * @see   #getSelectedColor
     * @see   #addChangeListener
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//colorchooser/ColorSelectionModel.java
    Color getSelectedColor();

    /**
     * Returns the selected <code>Color</code> which should be
     * non-<code>null</code>.
     *
     * @return  the selected <code>Color</code>
     * @see     #setSelectedColor
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//colorchooser/ColorSelectionModel.java
public interface ColorSelectionModel {

/**
 * A model that supports selecting a <code>Color</code>.
 *
 * @author Steve Wilson
 *
 * @see java.awt.Color
 */
