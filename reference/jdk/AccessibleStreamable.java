_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleStreamable.java
     InputStream getStream(DataFlavor flavor);

    /**
      * Returns an InputStream for a DataFlavor
      *
      * @param flavor the DataFlavor
      * @return an ImputStream if an ImputStream for this DataFlavor exists.
      * Otherwise, null is returned.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleStreamable.java
public interface AccessibleStreamable {

/**
 *
 * The <code>AccessibleStreamable</code> interface should be implemented
 * by the <code>AccessibleContext</code> of any component that presents the
 * raw stream behind a component on the display screen.  Examples of such
 * components are HTML, bitmap images and MathML.  An object that implements
 * <code>AccessibleStreamable</code> provides two things: a list of MIME
 * types supported by the object and a streaming interface for each MIME type to
 * get the data.
 *
 * @author Lynn Monsanto
 * @author Peter Korn
 *
 * @see javax.accessibility.AccessibleContext
 * @since 1.5
 */
