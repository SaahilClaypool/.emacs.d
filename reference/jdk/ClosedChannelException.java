_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/ClosedChannelException.java
    public ClosedChannelException() { }

    /**
     * Constructs an instance of this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/ClosedChannelException.java
public class ClosedChannelException

/**
 * Checked exception thrown when an attempt is made to invoke or complete an
 * I/O operation upon channel that is closed, or at least closed to that
 * operation.  That this exception is thrown does not necessarily imply that
 * the channel is completely closed.  A socket channel whose write half has
 * been shut down, for example, may still be open for reading.
 *
 * @since 1.4
 */
