_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/CaretEvent.java
    public abstract int getMark();

    /**
     * Fetches the location of other end of a logical
     * selection.  If there is no selection, this
     * will be the same as dot.
     *
     * @return the mark &gt;= 0
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/CaretEvent.java
    public abstract int getDot();

    /**
     * Fetches the location of the caret.
     *
     * @return the dot &gt;= 0
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/CaretEvent.java
    public CaretEvent(Object source) {

    /**
     * Creates a new CaretEvent object.
     *
     * @param source the object responsible for the event
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/CaretEvent.java
public abstract class CaretEvent extends EventObject {

/**
 * CaretEvent is used to notify interested parties that
 * the text caret has changed in the event source.
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
 * @author  Timothy Prinzing
 */
