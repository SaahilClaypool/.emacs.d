_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Template.java
    public void parseSimplified(Stylesheet stylesheet, Parser parser) {

    /**
     * When the parser realises that it is dealign with a simplified stylesheet
     * it will create an empty Stylesheet object with the root element of the
     * stylesheet (a LiteralElement object) as its only child. The Stylesheet
     * object will then create this Template object and invoke this method to
     * force some specific behaviour. What we need to do is:
     *  o) create a pattern matching on the root node
     *  o) add the LRE root node (the only child of the Stylesheet) as our
     *     only child node
     *  o) set the empty Stylesheet as our parent
     *  o) set this template as the Stylesheet's only child
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Template.java
    public int compareTo(Object template) {

    /**
     * Compare this template to another. First checks priority, then position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Template.java
public final class Template extends TopLevelElement {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 * @author Erwin Bolwidt <ejb@klomp.org>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Template.java
    public void parseSimplified(Stylesheet stylesheet, Parser parser) {

    /**
     * When the parser realises that it is dealign with a simplified stylesheet
     * it will create an empty Stylesheet object with the root element of the
     * stylesheet (a LiteralElement object) as its only child. The Stylesheet
     * object will then create this Template object and invoke this method to
     * force some specific behaviour. What we need to do is:
     *  o) create a pattern matching on the root node
     *  o) add the LRE root node (the only child of the Stylesheet) as our
     *     only child node
     *  o) set the empty Stylesheet as our parent
     *  o) set this template as the Stylesheet's only child
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Template.java
    public int compareTo(Object template) {

    /**
     * Compare this template to another. First checks priority, then position.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Template.java
public final class Template extends TopLevelElement {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 * @author Erwin Bolwidt <ejb@klomp.org>
 */
