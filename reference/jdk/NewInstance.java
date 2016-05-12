_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/NewInstance.java
    static Object newInstance (ClassLoader classLoader, String className)

    /**
     * Creates a new instance of the specified class name
     *
     * Package private so this code is not exposed at the API level.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/xml/sax/helpers/NewInstance.java
class NewInstance {

/**
 * Create a new instance of a class by name.
 *
 * <blockquote>
 * <em>This module, both source code and documentation, is in the
 * Public Domain, and comes with <strong>NO WARRANTY</strong>.</em>
 * See <a href='http://www.saxproject.org'>http://www.saxproject.org</a>
 * for further information.
 * </blockquote>
 *
 * <p>This class contains a static method for creating an instance of a
 * class from an explicit class name.  It tries to use the thread's context
 * ClassLoader if possible and falls back to using
 * Class.forName(String).</p>
 *
 * <p>This code is designed to compile and run on JDK version 1.1 and later
 * including versions of Java 2.</p>
 *
 * @author Edwin Goei, David Brownell
 * @version 2.0.1 (sax2r2)
 */
