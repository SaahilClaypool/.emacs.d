_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//Autoscroller.java
    public void actionPerformed(ActionEvent x) {

    /**
     * ActionListener method. Invoked when the Timer fires. This will scroll
     * if necessary.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//Autoscroller.java
    private void _processMouseDragged(MouseEvent e) {

    /**
     * MouseListener method, invokes start/stop as necessary.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//Autoscroller.java
    private boolean _isRunning(JComponent c) {

    /**
     * Returns true if autoscrolling is currently running for the specified
     * widget.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//Autoscroller.java
    private void _stop(JComponent c) {

    /**
     * Stops scrolling for the passed in widget.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//Autoscroller.java
    private void start(JComponent c, MouseEvent e) {

    /**
     * Starts the timer targeting the passed in component.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//Autoscroller.java
    public static void processMouseDragged(MouseEvent e) {

    /**
     * Invoked when a mouse dragged event occurs, will start the autoscroller
     * if necessary.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//Autoscroller.java
    public static boolean isRunning(JComponent c) {

    /**
     * Stops autoscroll events from happening on the specified component.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//Autoscroller.java
    public static void stop(JComponent c) {

    /**
     * Stops autoscroll events from happening on the specified component.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//Autoscroller.java
    private static Autoscroller sharedInstance = new Autoscroller();

    /**
     * Global Autoscroller.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//Autoscroller.java
class Autoscroller implements ActionListener {

/**
 * Autoscroller is responsible for generating synthetic mouse dragged
 * events. It is the responsibility of the Component (or its MouseListeners)
 * that receive the events to do the actual scrolling in response to the
 * mouse dragged events.
 *
 * @author Dave Moore
 * @author Scott Violet
 */
