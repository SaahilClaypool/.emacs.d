_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/CompoundControl.java
        protected Type(String name) {

        /**
         * Constructs a new compound control type.
         * @param name  the name of the new compound control type
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/CompoundControl.java
    public static class Type extends Control.Type {

    /**
     * An instance of the <code>CompoundControl.Type</code> inner class identifies one kind of
     * compound control.  Static instances are provided for the
     * common types.
     *
     * @author Kara Kytle
     * @since 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/CompoundControl.java
    public String toString() {

    /**
     * Provides a string representation of the control
     * @return a string description
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/CompoundControl.java
    public Control[] getMemberControls() {

    /**
     * Returns the set of member controls that comprise the compound control.
     * @return the set of member controls.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/CompoundControl.java
    protected CompoundControl(Type type, Control[] memberControls) {

    /**
     * Constructs a new compound control object with the given parameters.
     *
     * @param type the type of control represented this compound control object
     * @param memberControls the set of member controls
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/CompoundControl.java
    private Control[] controls;

    /**
     * The set of member controls.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/CompoundControl.java
public abstract class CompoundControl extends Control {

/**
 * A <code>CompoundControl</code>, such as a graphic equalizer, provides control
 * over two or more related properties, each of which is itself represented as
 * a <code>Control</code>.
 *
 * @author Kara Kytle
 * @since 1.3
 */
