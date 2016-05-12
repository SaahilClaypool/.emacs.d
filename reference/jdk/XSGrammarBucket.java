_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSGrammarBucket.java
    public void reset() {

    /**
     * Clear the registry.
     * REVISIT: update to use another XSGrammarBucket
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSGrammarBucket.java
    public SchemaGrammar[] getGrammars() {

    /**
     * get all grammars in the registry
     *
     * @return an array of SchemaGrammars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSGrammarBucket.java
    public boolean putGrammar(SchemaGrammar grammar, boolean deep, boolean ignoreConflict) {

    /**
     * put a schema grammar and any grammars imported by it (directly or
     * inderectly) into the registry. when a grammar with the same target
     * namespace is already in the bucket, and different from the one being
     * added, no grammar will be added into the bucket.
     *
     * @param grammar        the grammar to put in the registry
     * @param deep           whether to add imported grammars
     * @param ignoreConflict whether to ignore grammars that already exist in the grammar
     *                       bucket or not - including 'grammar' parameter.
     * @return               whether the process succeeded
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSGrammarBucket.java
    public boolean putGrammar(SchemaGrammar grammar, boolean deep) {

    /**
     * put a schema grammar and any grammars imported by it (directly or
     * inderectly) into the registry. when a grammar with the same target
     * namespace is already in the bucket, and different from the one being
     * added, it's an error, and no grammar will be added into the bucket.
     *
     * @param grammar   the grammar to put in the registry
     * @param deep      whether to add imported grammars
     * @return          whether the process succeeded
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSGrammarBucket.java
    public void putGrammar(SchemaGrammar grammar) {

    /**
     * Put a schema grammar into the registry
     * This method is for internal use only: it assumes that a grammar with
     * the same target namespace is not already in the bucket.
     *
     * @param grammar   the grammar to put in the registry
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSGrammarBucket.java
    public SchemaGrammar getGrammar(String namespace) {

    /**
     * Get the schema grammar for the specified namespace
     *
     * @param namespace
     * @return SchemaGrammar associated with the namespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSGrammarBucket.java
    Map<String, SchemaGrammar> fGrammarRegistry = new HashMap();

    /**
     * Map that maps between Namespace and a Grammar
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSGrammarBucket.java
public class XSGrammarBucket {

/**
 * A class used to hold the internal schema grammar set for the current instance
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 * @version $Id: XSGrammarBucket.java,v 1.7 2010-11-01 04:39:55 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSGrammarBucket.java
    public void reset() {

    /**
     * Clear the registry.
     * REVISIT: update to use another XSGrammarBucket
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSGrammarBucket.java
    public SchemaGrammar[] getGrammars() {

    /**
     * get all grammars in the registry
     *
     * @return an array of SchemaGrammars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSGrammarBucket.java
    public boolean putGrammar(SchemaGrammar grammar, boolean deep, boolean ignoreConflict) {

    /**
     * put a schema grammar and any grammars imported by it (directly or
     * inderectly) into the registry. when a grammar with the same target
     * namespace is already in the bucket, and different from the one being
     * added, no grammar will be added into the bucket.
     *
     * @param grammar        the grammar to put in the registry
     * @param deep           whether to add imported grammars
     * @param ignoreConflict whether to ignore grammars that already exist in the grammar
     *                       bucket or not - including 'grammar' parameter.
     * @return               whether the process succeeded
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSGrammarBucket.java
    public boolean putGrammar(SchemaGrammar grammar, boolean deep) {

    /**
     * put a schema grammar and any grammars imported by it (directly or
     * inderectly) into the registry. when a grammar with the same target
     * namespace is already in the bucket, and different from the one being
     * added, it's an error, and no grammar will be added into the bucket.
     *
     * @param grammar   the grammar to put in the registry
     * @param deep      whether to add imported grammars
     * @return          whether the process succeeded
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSGrammarBucket.java
    public void putGrammar(SchemaGrammar grammar) {

    /**
     * Put a schema grammar into the registry
     * This method is for internal use only: it assumes that a grammar with
     * the same target namespace is not already in the bucket.
     *
     * @param grammar   the grammar to put in the registry
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSGrammarBucket.java
    public SchemaGrammar getGrammar(String namespace) {

    /**
     * Get the schema grammar for the specified namespace
     *
     * @param namespace
     * @return SchemaGrammar associated with the namespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSGrammarBucket.java
    Map<String, SchemaGrammar> fGrammarRegistry = new HashMap();

    /**
     * Map that maps between Namespace and a Grammar
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSGrammarBucket.java
public class XSGrammarBucket {

/**
 * A class used to hold the internal schema grammar set for the current instance
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 * @version $Id: XSGrammarBucket.java,v 1.7 2010-11-01 04:39:55 joehw Exp $
 */
