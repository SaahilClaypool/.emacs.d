_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMResultBuilder.java
            if ((kidOK[fTarget.getNodeType()] & (1 << node.getNodeType())) == 0) {

            /** Check if this node can be attached to the target. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMResultBuilder.java
        append(fDocument.createProcessingInstruction(node.getTarget(), node.getData()));

        /** Create new ProcessingInstruction node for the target. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMResultBuilder.java
        append(fDocument.createComment(node.getNodeValue()));

        /** Create new Comment node for the target. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMResultBuilder.java
        append(fDocument.createCDATASection(node.getNodeValue()));

        /** Create new CDATASection node for the target. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMResultBuilder.java
        append(fDocument.createTextNode(node.getNodeValue()));

        /** Create new Text node for the target. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMResultBuilder.java
            oldMap = node.getNotations();

            /** Copy notations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMResultBuilder.java
            NamedNodeMap oldMap = node.getEntities();

            /** Copy entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMResultBuilder.java
            if (internalSubset != null) {

            /** Copy internal subset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMResultBuilder.java
        if (fDocumentImpl != null) {

        /** Create new DocumentType node for the target. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMResultBuilder.java
    private final static int[] kidOK;

    /** Table for quick check of child insertion. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMResultBuilder.java
final class DOMResultBuilder implements DOMDocumentHandler {

/**
 * <p>DOM result builder.</p>
 *
 * @author Michael Glavassevich, IBM
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMResultBuilder.java
            if ((kidOK[fTarget.getNodeType()] & (1 << node.getNodeType())) == 0) {

            /** Check if this node can be attached to the target. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMResultBuilder.java
        append(fDocument.createProcessingInstruction(node.getTarget(), node.getData()));

        /** Create new ProcessingInstruction node for the target. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMResultBuilder.java
        append(fDocument.createComment(node.getNodeValue()));

        /** Create new Comment node for the target. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMResultBuilder.java
        append(fDocument.createCDATASection(node.getNodeValue()));

        /** Create new CDATASection node for the target. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMResultBuilder.java
        append(fDocument.createTextNode(node.getNodeValue()));

        /** Create new Text node for the target. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMResultBuilder.java
            oldMap = node.getNotations();

            /** Copy notations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMResultBuilder.java
            NamedNodeMap oldMap = node.getEntities();

            /** Copy entities. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMResultBuilder.java
            if (internalSubset != null) {

            /** Copy internal subset. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMResultBuilder.java
        if (fDocumentImpl != null) {

        /** Create new DocumentType node for the target. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMResultBuilder.java
    private final static int[] kidOK;

    /** Table for quick check of child insertion. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/validation/DOMResultBuilder.java
final class DOMResultBuilder implements DOMDocumentHandler {

/**
 * <p>DOM result builder.</p>
 *
 * @author Michael Glavassevich, IBM
 */
