_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/ObjectView.java
    private void setParameters(Component comp, AttributeSet attr) {

    /**
     * Initialize this component according the KEY/VALUEs passed in
     * via the &lt;param&gt; elements in the corresponding
     * &lt;object&gt; element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/ObjectView.java
    Component getUnloadableRepresentation() {

    /**
     * Fetch a component that can be used to represent the
     * object if it can't be created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/ObjectView.java
    protected Component createComponent() {

    /**
     * Create the component.  The classid is used
     * as a specification of the classname, which
     * we try to load.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/ObjectView.java
    public ObjectView(Element elem) {

    /**
     * Creates a new ObjectView object.
     *
     * @param elem the element to decorate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/ObjectView.java
public class ObjectView extends ComponentView  {

/**
 * Component decorator that implements the view interface
 * for &lt;object&gt; elements.
 * <p>
 * This view will try to load the class specified by the
 * <code>classid</code> attribute.  If possible, the Classloader
 * used to load the associated Document is used.
 * This would typically be the same as the ClassLoader
 * used to load the EditorKit.  If the document's
 * ClassLoader is null, <code>Class.forName</code> is used.
 * <p>
 * If the class can successfully be loaded, an attempt will
 * be made to create an instance of it by calling
 * <code>Class.newInstance</code>.  An attempt will be made
 * to narrow the instance to type <code>java.awt.Component</code>
 * to display the object.
 * <p>
 * This view can also manage a set of parameters with limitations.
 * The parameters to the &lt;object&gt; element are expected to
 * be present on the associated elements attribute set as simple
 * strings.  Each bean property will be queried as a key on
 * the AttributeSet, with the expectation that a non-null value
 * (of type String) will be present if there was a parameter
 * specification for the property.  Reflection is used to
 * set the parameter.  Currently, this is limited to a very
 * simple single parameter of type String.
 * <p>
 * A simple example HTML invocation is:
 * <pre>
 *      &lt;object classid="javax.swing.JLabel"&gt;
 *      &lt;param name="text" value="sample text"&gt;
 *      &lt;/object&gt;
 * </pre>
 *
 * @author Timothy Prinzing
 */
