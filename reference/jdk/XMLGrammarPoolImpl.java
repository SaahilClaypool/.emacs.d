_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLGrammarPoolImpl.java
    protected static final class Entry {

    /**
     * This class is a grammar pool entry. Each entry acts as a node
     * in a linked list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLGrammarPoolImpl.java
    public int hashCode(XMLGrammarDescription desc) {

    /**
     * Returns the hash code value for the given grammar description.
     *
     * @param desc The grammar description
     * @return     The hash code value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLGrammarPoolImpl.java
    public boolean equals(XMLGrammarDescription desc1, XMLGrammarDescription desc2) {

    /**
     * This method checks whether two grammars are the same. Currently, we compare
     * the root element names for DTD grammars and the target namespaces for Schema grammars.
     * The application can override this behaviour and add its own logic.
     *
     * @param desc1 The grammar description
     * @param desc2 The grammar description of the grammar to be compared to
     * @return      True if the grammars are equal, otherwise false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLGrammarPoolImpl.java
    public boolean containsGrammar(XMLGrammarDescription desc) {

    /**
     * Returns true if the grammar pool contains a grammar associated
     * to the specified grammar description. Currently, the root element name
     * is used as the key for DTD grammars and the target namespace  is used
     * as the key for Schema grammars.
     *
     * @param desc The Grammar Description.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLGrammarPoolImpl.java
    public Grammar removeGrammar(XMLGrammarDescription desc) {

    /**
     * Removes the grammar associated to the specified grammar description from the
     * grammar pool and returns the removed grammar. Currently, the root element name
     * is used as the key for DTD grammars and the target namespace  is used
     * as the key for Schema grammars.
     *
     * @param desc The Grammar Description.
     * @return     The removed grammar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLGrammarPoolImpl.java
    public Grammar getGrammar(XMLGrammarDescription desc) {

    /**
     * Returns the grammar associated to the specified grammar description.
     * Currently, the root element name is used as the key for DTD grammars
     * and the target namespace  is used as the key for Schema grammars.
     *
     * @param desc The Grammar Description.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLGrammarPoolImpl.java
    public void putGrammar(Grammar grammar) {

    /**
     * Puts the specified grammar into the grammar pool and associates it to
     * its root element name or its target namespace.
     *
     * @param grammar The Grammar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLGrammarPoolImpl.java
    public XMLGrammarPoolImpl(int initialCapacity) {

    /** Constructs a grammar pool with a specified number of buckets. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLGrammarPoolImpl.java
    public XMLGrammarPoolImpl() {

    /** Constructs a grammar pool with a default number of buckets. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLGrammarPoolImpl.java
    protected Entry[] fGrammars = null;

    /** Grammars. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLGrammarPoolImpl.java
    protected static final int TABLE_SIZE = 11;

    /** Default size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLGrammarPoolImpl.java
public class XMLGrammarPoolImpl implements XMLGrammarPool {

/**
 * Stores grammars in a pool associated to a specific key. This grammar pool
 * implementation stores two types of grammars: those keyed by the root element
 * name, and those keyed by the grammar's target namespace.
 *
 * This is the default implementation of the GrammarPool interface.
 * As we move forward, this will become more function-rich and robust.
 *
 * @author Jeffrey Rodriguez, IBM
 * @author Andy Clark, IBM
 * @author Neil Graham, IBM
 * @author Pavani Mukthipudi, Sun Microsystems
 * @author Neeraj Bajaj, SUN Microsystems
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLGrammarPoolImpl.java
    protected static final class Entry {

    /**
     * This class is a grammar pool entry. Each entry acts as a node
     * in a linked list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLGrammarPoolImpl.java
    public int hashCode(XMLGrammarDescription desc) {

    /**
     * Returns the hash code value for the given grammar description.
     *
     * @param desc The grammar description
     * @return     The hash code value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLGrammarPoolImpl.java
    public boolean equals(XMLGrammarDescription desc1, XMLGrammarDescription desc2) {

    /**
     * This method checks whether two grammars are the same. Currently, we compare
     * the root element names for DTD grammars and the target namespaces for Schema grammars.
     * The application can override this behaviour and add its own logic.
     *
     * @param desc1 The grammar description
     * @param desc2 The grammar description of the grammar to be compared to
     * @return      True if the grammars are equal, otherwise false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLGrammarPoolImpl.java
    public boolean containsGrammar(XMLGrammarDescription desc) {

    /**
     * Returns true if the grammar pool contains a grammar associated
     * to the specified grammar description. Currently, the root element name
     * is used as the key for DTD grammars and the target namespace  is used
     * as the key for Schema grammars.
     *
     * @param desc The Grammar Description.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLGrammarPoolImpl.java
    public Grammar removeGrammar(XMLGrammarDescription desc) {

    /**
     * Removes the grammar associated to the specified grammar description from the
     * grammar pool and returns the removed grammar. Currently, the root element name
     * is used as the key for DTD grammars and the target namespace  is used
     * as the key for Schema grammars.
     *
     * @param desc The Grammar Description.
     * @return     The removed grammar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLGrammarPoolImpl.java
    public Grammar getGrammar(XMLGrammarDescription desc) {

    /**
     * Returns the grammar associated to the specified grammar description.
     * Currently, the root element name is used as the key for DTD grammars
     * and the target namespace  is used as the key for Schema grammars.
     *
     * @param desc The Grammar Description.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLGrammarPoolImpl.java
    public void putGrammar(Grammar grammar) {

    /**
     * Puts the specified grammar into the grammar pool and associates it to
     * its root element name or its target namespace.
     *
     * @param grammar The Grammar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLGrammarPoolImpl.java
    public XMLGrammarPoolImpl(int initialCapacity) {

    /** Constructs a grammar pool with a specified number of buckets. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLGrammarPoolImpl.java
    public XMLGrammarPoolImpl() {

    /** Constructs a grammar pool with a default number of buckets. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLGrammarPoolImpl.java
    protected Entry[] fGrammars = null;

    /** Grammars. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLGrammarPoolImpl.java
    protected static final int TABLE_SIZE = 11;

    /** Default size. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/util/XMLGrammarPoolImpl.java
public class XMLGrammarPoolImpl implements XMLGrammarPool {

/**
 * Stores grammars in a pool associated to a specific key. This grammar pool
 * implementation stores two types of grammars: those keyed by the root element
 * name, and those keyed by the grammar's target namespace.
 *
 * This is the default implementation of the GrammarPool interface.
 * As we move forward, this will become more function-rich and robust.
 *
 * @author Jeffrey Rodriguez, IBM
 * @author Andy Clark, IBM
 * @author Neil Graham, IBM
 * @author Pavani Mukthipudi, Sun Microsystems
 * @author Neeraj Bajaj, SUN Microsystems
 *
 */
