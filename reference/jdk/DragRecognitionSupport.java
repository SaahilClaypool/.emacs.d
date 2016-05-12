_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/DragRecognitionSupport.java
    private boolean mouseDraggedImpl(MouseEvent me, BeforeDrag bd) {

    /**
     * Returns whether or not a drag gesture recognition is ongoing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/DragRecognitionSupport.java
    private MouseEvent mouseReleasedImpl(MouseEvent me) {

    /**
     * If a dnd recognition has been going on, return the MouseEvent
     * that started the recognition. Otherwise, return null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/DragRecognitionSupport.java
    private boolean mousePressedImpl(MouseEvent me) {

    /**
     * Returns whether or not the event is potentially part of a drag sequence.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/DragRecognitionSupport.java
    public static boolean mouseDragged(MouseEvent me, BeforeDrag bd) {

    /**
     * Returns whether or not a drag gesture recognition is ongoing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/DragRecognitionSupport.java
    public static MouseEvent mouseReleased(MouseEvent me) {

    /**
     * If a dnd recognition has been going on, return the MouseEvent
     * that started the recognition. Otherwise, return null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/DragRecognitionSupport.java
    public static boolean mousePressed(MouseEvent me) {

    /**
     * Returns whether or not the event is potentially part of a drag sequence.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/DragRecognitionSupport.java
    private static DragRecognitionSupport getDragRecognitionSupport() {

    /**
     * Returns the DragRecognitionSupport for the caller's AppContext.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/DragRecognitionSupport.java
    public static interface BeforeDrag {

    /**
     * This interface allows us to pass in a handler to mouseDragged,
     * so that we can be notified immediately before a drag begins.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/basic/DragRecognitionSupport.java
class DragRecognitionSupport {

/**
 * Drag gesture recognition support for classes that have a
 * <code>TransferHandler</code>. The gesture for a drag in this class is a mouse
 * press followed by movement by <code>DragSource.getDragThreshold()</code>
 * pixels. An instance of this class is maintained per AppContext, and the
 * public static methods call into the appropriate instance.
 *
 * @author Shannon Hickey
 */
