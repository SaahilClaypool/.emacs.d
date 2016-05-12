_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HiddenTagView.java
    float yAlign;

    /** Alignment along the y axis, based on the font of the textfield. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HiddenTagView.java
    void _updateModelFromText() {

    /**
     * This copies the text from the text component we've created
     * to the Element's AttributeSet we represent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HiddenTagView.java
    void updateModelFromText() {

    /**
     * This copies the text from the text component we've created
     * to the Element's AttributeSet we represent.
     * <p>If this is invoked on the event dispatching thread, this
     * directly invokes <code>_updateModelFromText</code>, otherwise
     * <code>SwingUtilities.invokeLater</code> is used to schedule execution
     * of <code>_updateModelFromText</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HiddenTagView.java
    void _setTextFromModel() {

    /**
     * This resets the text on the text component we created to match
     * that of the AttributeSet for the Element we represent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HiddenTagView.java
    void setTextFromModel() {

    /**
     * This resets the text on the text component we created to match
     * that of the AttributeSet for the Element we represent.
     * <p>If this is invoked on the event dispatching thread, this
     * directly invokes <code>_setTextFromModel</code>, otherwise
     * <code>SwingUtilities.invokeLater</code> is used to schedule execution
     * of <code>_setTextFromModel</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/HiddenTagView.java
class HiddenTagView extends EditableView implements DocumentListener {

/**
 * HiddenTagView subclasses EditableView to contain a JTextField showing
 * the element name. When the textfield is edited the element name is
 * reset. As this inherits from EditableView if the JTextComponent is
 * not editable, the textfield will not be visible.
 *
 * @author  Scott Violet
 */
