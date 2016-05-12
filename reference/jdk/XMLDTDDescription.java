_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDDescription.java
    public int hashCode() {

    /**
     * Returns the hash code of this grammar
     * Because our .equals method is so complex, we just return a very
     * simple hash that might avoid calls to the equals method a bit...
     * @return The hash code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDDescription.java
    public boolean equals(Object desc) {

    /**
     * Compares this grammar with the given grammar. Currently, we compare
     * as follows:
     * - if grammar type not equal return false immediately
     * - try and find a common root name:
     *    - if both have roots, use them
     *    - else if one has a root, examine other's possible root's for a match;
     *    - else try all combinations
     *  - test fExpandedSystemId and fPublicId as above
     *
     * @param desc The description of the grammar to be compared with
     * @return     True if they are equal, else false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDDescription.java
    public void setPossibleRoots(Vector possibleRoots) {

    /** Set possible roots **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDDescription.java
    public void setPossibleRoots(ArrayList possibleRoots) {

    /** Set possible roots **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDDescription.java
    public void setRootName(String rootName) {

    /** Set the root name **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDDescription.java
    public String getRootName() {

    /**
     * @return the root name of this DTD or null if root name is unknown
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDDescription.java
public class XMLDTDDescription extends XMLResourceIdentifierImpl

/**
 * All information specific to DTD grammars.
 *
 * @xerces.internal
 *
 * @author Neil Graham, IBM
 * @version $Id: XMLDTDDescription.java,v 1.4 2010/08/11 07:18:38 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLDTDDescription.java
    public String getRootName();

    /**
     * Return the root name of this DTD.
     *
     * @return  the root name. null if the name is unknown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLDTDDescription.java
public interface XMLDTDDescription extends XMLGrammarDescription {

/**
 * All information specific to DTD grammars.
 *
 * @author Sandy Gao, IBM
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDDescription.java
    public int hashCode() {

    /**
     * Returns the hash code of this grammar
     * Because our .equals method is so complex, we just return a very
     * simple hash that might avoid calls to the equals method a bit...
     * @return The hash code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDDescription.java
    public boolean equals(Object desc) {

    /**
     * Compares this grammar with the given grammar. Currently, we compare
     * as follows:
     * - if grammar type not equal return false immediately
     * - try and find a common root name:
     *    - if both have roots, use them
     *    - else if one has a root, examine other's possible root's for a match;
     *    - else try all combinations
     *  - test fExpandedSystemId and fPublicId as above
     *
     * @param desc The description of the grammar to be compared with
     * @return     True if they are equal, else false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDDescription.java
    public void setPossibleRoots(Vector possibleRoots) {

    /** Set possible roots **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDDescription.java
    public void setPossibleRoots(ArrayList possibleRoots) {

    /** Set possible roots **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDDescription.java
    public void setRootName(String rootName) {

    /** Set the root name **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDDescription.java
    public String getRootName() {

    /**
     * @return the root name of this DTD or null if root name is unknown
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/XMLDTDDescription.java
public class XMLDTDDescription extends XMLResourceIdentifierImpl

/**
 * All information specific to DTD grammars.
 *
 * @xerces.internal
 *
 * @author Neil Graham, IBM
 * @version $Id: XMLDTDDescription.java,v 1.4 2010/08/11 07:18:38 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLDTDDescription.java
    public String getRootName();

    /**
     * Return the root name of this DTD.
     *
     * @return  the root name. null if the name is unknown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xni/grammars/XMLDTDDescription.java
public interface XMLDTDDescription extends XMLGrammarDescription {

/**
 * All information specific to DTD grammars.
 *
 * @author Sandy Gao, IBM
 */
