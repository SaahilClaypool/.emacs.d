_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/LayoutQueue.java
    class LayoutThread extends Thread {

    /**
     * low priority thread to perform layout work forever
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/LayoutQueue.java
    protected synchronized Runnable waitForWork() {

    /**
     * Used by the worker thread to get a new task to execute
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/LayoutQueue.java
    public synchronized void addTask(Runnable task) {

    /**
     * Add a task that is not needed immediately because
     * the results are not believed to be visible.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/LayoutQueue.java
    public static void setDefaultQueue(LayoutQueue q) {

    /**
     * Set the default layout queue.
     *
     * @param q the new queue.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/LayoutQueue.java
    public static LayoutQueue getDefaultQueue() {

    /**
     * Fetch the default layout queue.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/LayoutQueue.java
    public LayoutQueue() {

    /**
     * Construct a layout queue.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/LayoutQueue.java
public class LayoutQueue {

/**
 * A queue of text layout tasks.
 *
 * @author  Timothy Prinzing
 * @see     AsyncBoxView
 * @since   1.3
 */
