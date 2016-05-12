_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/Messager.java
    void printMessage(Diagnostic.Kind kind,
                      CharSequence msg,
                      Element e,
                      AnnotationMirror a,
                      AnnotationValue v);

    /**
     * Prints a message of the specified kind at the location of the
     * annotation value inside the annotation mirror of the annotated
     * element.
     *
     * @param kind the kind of message
     * @param msg  the message, or an empty string if none
     * @param e    the annotated element
     * @param a    the annotation containing the annotation value
     * @param v    the annotation value to use as a position hint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/Messager.java
    void printMessage(Diagnostic.Kind kind, CharSequence msg, Element e, AnnotationMirror a);

    /**
     * Prints a message of the specified kind at the location of the
     * annotation mirror of the annotated element.
     *
     * @param kind the kind of message
     * @param msg  the message, or an empty string if none
     * @param e    the annotated element
     * @param a    the annotation to use as a position hint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/Messager.java
    void printMessage(Diagnostic.Kind kind, CharSequence msg, Element e);

    /**
     * Prints a message of the specified kind at the location of the
     * element.
     *
     * @param kind the kind of message
     * @param msg  the message, or an empty string if none
     * @param e    the element to use as a position hint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/annotation/processing/Messager.java
public interface Messager {

/**
 * A {@code Messager} provides the way for an annotation processor to
 * report error messages, warnings, and other notices.  Elements,
 * annotations, and annotation values can be passed to provide a
 * location hint for the message.  However, such location hints may be
 * unavailable or only approximate.
 *
 * <p>Printing a message with an {@linkplain
 * javax.tools.Diagnostic.Kind#ERROR error kind} will {@linkplain
 * RoundEnvironment#errorRaised raise an error}.
 *
 * <p>Note that the messages &quot;printed&quot; by methods in this
 * interface may or may not appear as textual output to a location
 * like {@link System#out} or {@link System#err}.  Implementations may
 * choose to present this information in a different fashion, such as
 * messages in a window.
 *
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @see ProcessingEnvironment#getLocale
 * @since 1.6
 */
