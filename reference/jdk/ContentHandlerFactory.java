_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/net/ContentHandlerFactory.java
public interface ContentHandlerFactory {

/**
 * This interface defines a factory for content handlers. An
 * implementation of this interface should map a MIME type into an
 * instance of {@code ContentHandler}.
 * <p>
 * This interface is used by the {@code URLStreamHandler} class
 * to create a {@code ContentHandler} for a MIME type.
 *
 * @author  James Gosling
 * @see     java.net.ContentHandler
 * @see     java.net.URLStreamHandler
 * @since   JDK1.0
 */
