_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Entity.java
    public static int name2type(String nm) {

    /**
     * Converts <code>nm</code> string to the corresponding
     * entity type.  If the string does not have a corresponding
     * entity type, returns the type corresponding to "CDATA".
     * Valid entity types are: "PUBLIC", "CDATA", "SDATA", "PI",
     * "STARTTAG", "ENDTAG", "MS", "MD", "SYSTEM".
     *
     * @param nm the string to be converted
     * @return the corresponding entity type, or the type corresponding
     *   to "CDATA", if none exists
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Entity.java
    public String getString() {

    /**
     * Returns the data as a <code>String</code>.
     * @return the data as a <code>String</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Entity.java
    public char getData()[] {

    /**
     * Returns the <code>data</code>.
     * @return the <code>data</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Entity.java
    public boolean isGeneral() {

    /**
     * Returns <code>true</code> if it is a general entity.
     * @return <code>true</code> if it is a general entity
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Entity.java
    public boolean isParameter() {

    /**
     * Returns <code>true</code> if it is a parameter entity.
     * @return <code>true</code> if it is a parameter entity
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Entity.java
    public int getType() {

    /**
     * Gets the type of the entity.
     * @return the type of the entity
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Entity.java
    public String getName() {

    /**
     * Gets the name of the entity.
     * @return the name of the entity, as a <code>String</code>
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Entity.java
    public Entity(String name, int type, char data[]) {

    /**
     * Creates an entity.
     * @param name the name of the entity
     * @param type the type of the entity
     * @param data the char array of data
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/Entity.java
public final

/**
 * An entity is described in a DTD using the ENTITY construct.
 * It defines the type and value of the the entity.
 *
 * @see DTD
 * @author Arthur van Hoff
 */
