_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/spi/AbstractSelectionKey.java
    public final void cancel() {

    /**
     * Cancels this key.
     *
     * <p> If this key has not yet been cancelled then it is added to its
     * selector's cancelled-key set while synchronized on that set.  </p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/spi/AbstractSelectionKey.java
    protected AbstractSelectionKey() { }

    /**
     * Initializes a new instance of this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/channels/spi/AbstractSelectionKey.java
public abstract class AbstractSelectionKey

/**
 * Base implementation class for selection keys.
 *
 * <p> This class tracks the validity of the key and implements cancellation.
 *
 * @author Mark Reinhold
 * @author JSR-51 Expert Group
 * @since 1.4
 */
