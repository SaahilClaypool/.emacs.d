_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ErrorHandlerAdaptor.java
    protected abstract ErrorHandler getErrorHandler();

    /**
     * Implemented by the derived class to return the actual
     * {@link ErrorHandler} to which errors are sent.
     *
     * @return always return non-null valid object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ErrorHandlerAdaptor.java
    public boolean hadError() { return hadError; }

    /**
     * returns if there was an error since the last invocation of
     * the resetError method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ErrorHandlerAdaptor.java
    private boolean hadError = false;

    /** set to true if there was any error. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ErrorHandlerAdaptor.java
public abstract class ErrorHandlerAdaptor implements XMLErrorHandler

/**
 * Receives errors through Xerces {@link XMLErrorHandler}
 * and pass them down to SAX {@link ErrorHandler}.
 *
 * @author
 *     Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ErrorHandlerAdaptor.java
    protected abstract ErrorHandler getErrorHandler();

    /**
     * Implemented by the derived class to return the actual
     * {@link ErrorHandler} to which errors are sent.
     *
     * @return always return non-null valid object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ErrorHandlerAdaptor.java
    public boolean hadError() { return hadError; }

    /**
     * returns if there was an error since the last invocation of
     * the resetError method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ErrorHandlerAdaptor.java
    private boolean hadError = false;

    /** set to true if there was any error. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/ErrorHandlerAdaptor.java
public abstract class ErrorHandlerAdaptor implements XMLErrorHandler

/**
 * Receives errors through Xerces {@link XMLErrorHandler}
 * and pass them down to SAX {@link ErrorHandler}.
 *
 * @author
 *     Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 */
