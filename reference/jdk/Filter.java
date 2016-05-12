_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/Filter.java
public interface Filter {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/dom/Filter.java
public interface Filter {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/logging/Filter.java
    public boolean isLoggable(LogRecord record);

    /**
     * Check if a given log record should be published.
     * @param record  a LogRecord
     * @return true if the log record should be published.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/logging/Filter.java
@FunctionalInterface

/**
 * A Filter can be used to provide fine grain control over
 * what is logged, beyond the control provided by log levels.
 * <p>
 * Each Logger and each Handler can have a filter associated with it.
 * The Logger or Handler will call the isLoggable method to check
 * if a given LogRecord should be published.  If isLoggable returns
 * false, the LogRecord will be discarded.
 *
 * @since 1.4
 */
