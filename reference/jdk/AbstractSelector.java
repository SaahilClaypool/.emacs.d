_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/spi/AbstractSelector.java
    protected final void end() {

    /**
     * Marks the end of an I/O operation that might block indefinitely.
     *
     * <p> This method should be invoked in tandem with the {@link #begin begin}
     * method, using a <tt>try</tt>&nbsp;...&nbsp;<tt>finally</tt> block as
     * shown <a href="#be">above</a>, in order to implement interruption for
     * this selector.  </p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/spi/AbstractSelector.java
    protected final void begin() {

    /**
     * Marks the beginning of an I/O operation that might block indefinitely.
     *
     * <p> This method should be invoked in tandem with the {@link #end end}
     * method, using a <tt>try</tt>&nbsp;...&nbsp;<tt>finally</tt> block as
     * shown <a href="#be">above</a>, in order to implement interruption for
     * this selector.
     *
     * <p> Invoking this method arranges for the selector's {@link
     * Selector#wakeup wakeup} method to be invoked if a thread's {@link
     * Thread#interrupt interrupt} method is invoked while the thread is
     * blocked in an I/O operation upon the selector.  </p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/spi/AbstractSelector.java
    protected final void deregister(AbstractSelectionKey key) {

    /**
     * Removes the given key from its channel's key set.
     *
     * <p> This method must be invoked by the selector for each channel that it
     * deregisters.  </p>
     *
     * @param  key
     *         The selection key to be removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/spi/AbstractSelector.java
    protected abstract SelectionKey register(AbstractSelectableChannel ch,
                                             int ops, Object att);

    /**
     * Registers the given channel with this selector.
     *
     * <p> This method is invoked by a channel's {@link
     * AbstractSelectableChannel#register register} method in order to perform
     * the actual work of registering the channel with this selector.  </p>
     *
     * @param  ch
     *         The channel to be registered
     *
     * @param  ops
     *         The initial interest set, which must be valid
     *
     * @param  att
     *         The initial attachment for the resulting key
     *
     * @return  A new key representing the registration of the given channel
     *          with this selector
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/spi/AbstractSelector.java
    protected final Set<SelectionKey> cancelledKeys() {

    /**
     * Retrieves this selector's cancelled-key set.
     *
     * <p> This set should only be used while synchronized upon it.  </p>
     *
     * @return  The cancelled-key set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/spi/AbstractSelector.java
    public final SelectorProvider provider() {

    /**
     * Returns the provider that created this channel.
     *
     * @return  The provider that created this channel
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/spi/AbstractSelector.java
    protected abstract void implCloseSelector() throws IOException;

    /**
     * Closes this selector.
     *
     * <p> This method is invoked by the {@link #close close} method in order
     * to perform the actual work of closing the selector.  This method is only
     * invoked if the selector has not yet been closed, and it is never invoked
     * more than once.
     *
     * <p> An implementation of this method must arrange for any other thread
     * that is blocked in a selection operation upon this selector to return
     * immediately as if by invoking the {@link
     * java.nio.channels.Selector#wakeup wakeup} method. </p>
     *
     * @throws  IOException
     *          If an I/O error occurs while closing the selector
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/spi/AbstractSelector.java
    public final void close() throws IOException {

    /**
     * Closes this selector.
     *
     * <p> If the selector has already been closed then this method returns
     * immediately.  Otherwise it marks the selector as closed and then invokes
     * the {@link #implCloseSelector implCloseSelector} method in order to
     * complete the close operation.  </p>
     *
     * @throws  IOException
     *          If an I/O error occurs
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/spi/AbstractSelector.java
    protected AbstractSelector(SelectorProvider provider) {

    /**
     * Initializes a new instance of this class.
     *
     * @param  provider
     *         The provider that created this selector
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/spi/AbstractSelector.java
public abstract class AbstractSelector

/**
 * Base implementation class for selectors.
 *
 * <p> This class encapsulates the low-level machinery required to implement
 * the interruption of selection operations.  A concrete selector class must
 * invoke the {@link #begin begin} and {@link #end end} methods before and
 * after, respectively, invoking an I/O operation that might block
 * indefinitely.  In order to ensure that the {@link #end end} method is always
 * invoked, these methods should be used within a
 * <tt>try</tt>&nbsp;...&nbsp;<tt>finally</tt> block:
 *
 * <blockquote><pre>
 * try {
 *     begin();
 *     // Perform blocking I/O operation here
 *     ...
 * } finally {
 *     end();
 * }</pre></blockquote>
 *
 * <p> This class also defines methods for maintaining a selector's
 * cancelled-key set and for removing a key from its channel's key set, and
 * declares the abstract {@link #register register} method that is invoked by a
 * selectable channel's {@link AbstractSelectableChannel#register register}
 * method in order to perform the actual work of registering a channel.  </p>
 *
 *
 * @author Mark Reinhold
 * @author JSR-51 Expert Group
 * @since 1.4
 */
