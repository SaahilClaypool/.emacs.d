_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitorInputStream.java
    public synchronized void reset() throws IOException {

    /**
     * Overrides <code>FilterInputStream.reset</code>
     * to reset the progress monitor as well as the stream.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitorInputStream.java
    public void close() throws IOException {

    /**
     * Overrides <code>FilterInputStream.close</code>
     * to close the progress monitor as well as the stream.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitorInputStream.java
    public long skip(long n) throws IOException {

    /**
     * Overrides <code>FilterInputStream.skip</code>
     * to update the progress monitor after the skip.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitorInputStream.java
    public int read(byte b[],
                    int off,
                    int len) throws IOException {

    /**
     * Overrides <code>FilterInputStream.read</code>
     * to update the progress monitor after the read.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitorInputStream.java
    public int read(byte b[]) throws IOException {

    /**
     * Overrides <code>FilterInputStream.read</code>
     * to update the progress monitor after the read.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitorInputStream.java
    public int read() throws IOException {

    /**
     * Overrides <code>FilterInputStream.read</code>
     * to update the progress monitor after the read.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitorInputStream.java
    public ProgressMonitor getProgressMonitor() {

    /**
     * Get the ProgressMonitor object being used by this stream. Normally
     * this isn't needed unless you want to do something like change the
     * descriptive text partway through reading the file.
     * @return the ProgressMonitor object used by this object
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitorInputStream.java
    public ProgressMonitorInputStream(Component parentComponent,
                                      Object message,
                                      InputStream in) {

    /**
     * Constructs an object to monitor the progress of an input stream.
     *
     * @param message Descriptive text to be placed in the dialog box
     *                if one is popped up.
     * @param parentComponent The component triggering the operation
     *                        being monitored.
     * @param in The input stream to be monitored.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//ProgressMonitorInputStream.java
public class ProgressMonitorInputStream extends FilterInputStream

/**
 * Monitors the progress of reading from some InputStream. This ProgressMonitor
 * is normally invoked in roughly this form:
 * <pre>
 * InputStream in = new BufferedInputStream(
 *                          new ProgressMonitorInputStream(
 *                                  parentComponent,
 *                                  "Reading " + fileName,
 *                                  new FileInputStream(fileName)));
 * </pre><p>
 * This creates a progress monitor to monitor the progress of reading
 * the input stream.  If it's taking a while, a ProgressDialog will
 * be popped up to inform the user.  If the user hits the Cancel button
 * an InterruptedIOException will be thrown on the next read.
 * All the right cleanup is done when the stream is closed.
 *
 *
 * <p>
 *
 * For further documentation and examples see
 * <a href="https://docs.oracle.com/javase/tutorial/uiswing/components/progress.html">How to Monitor Progress</a>,
 * a section in <em>The Java Tutorial.</em>
 *
 * @see ProgressMonitor
 * @see JOptionPane
 * @author James Gosling
 */
