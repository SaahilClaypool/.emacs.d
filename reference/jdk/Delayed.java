_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/Delayed.java
    long getDelay(TimeUnit unit);

    /**
     * Returns the remaining delay associated with this object, in the
     * given time unit.
     *
     * @param unit the time unit
     * @return the remaining delay; zero or negative values indicate
     * that the delay has already elapsed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/concurrent/Delayed.java
public interface Delayed extends Comparable<Delayed> {

/**
 * A mix-in style interface for marking objects that should be
 * acted upon after a given delay.
 *
 * <p>An implementation of this interface must define a
 * {@code compareTo} method that provides an ordering consistent with
 * its {@code getDelay} method.
 *
 * @since 1.5
 * @author Doug Lea
 */
