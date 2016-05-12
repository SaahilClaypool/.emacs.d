_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerProxy.java
public abstract class ErrorHandlerProxy implements ErrorHandler {

/**
 * Wraps {@link XMLErrorHandler} and make it look like a SAX {@link ErrorHandler}.
 *
 * <p>
 * The derived class should override the {@link #getErrorHandler()} method
 * so that it will return the correct {@link XMLErrorHandler} instance.
 * This method will be called whenever an error/warning is found.
 *
 * <p>
 * Experience shows that it is better to store the actual
 * {@link XMLErrorHandler} in one place and looks up that variable,
 * rather than copying it into every component that needs an error handler
 * and update all of them whenever it is changed, IMO.
 *
 * @author Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/ErrorHandlerProxy.java
public abstract class ErrorHandlerProxy implements ErrorHandler {

/**
 * Wraps {@link XMLErrorHandler} and make it look like a SAX {@link ErrorHandler}.
 *
 * <p>
 * The derived class should override the {@link #getErrorHandler()} method
 * so that it will return the correct {@link XMLErrorHandler} instance.
 * This method will be called whenever an error/warning is found.
 *
 * <p>
 * Experience shows that it is better to store the actual
 * {@link XMLErrorHandler} in one place and looks up that variable,
 * rather than copying it into every component that needs an error handler
 * and update all of them whenever it is changed, IMO.
 *
 * @author Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 *
 */
