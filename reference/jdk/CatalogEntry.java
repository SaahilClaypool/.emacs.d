_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  public void setEntryArg(int argNum, String newspec)

  /**
   * Set an entry argument.
   *
   * <p>Catalogs sometimes need to adjust the catlog entry parameters,
   * for example to make a relative URI absolute with respect to the
   * current base URI. But in general, this function should only be
   * called shortly after object creation to do some sort of cleanup.
   * Catalog entries should not mutate over time.</p>
   *
   * @param argNum The argument number (arguments are numbered from 0).
   * @throws ArrayIndexOutOfBoundsException if an invalid argument
   * number is provided.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  public String getEntryArg(int argNum) {

  /**
   * Get an entry argument.
   *
   * @param argNum The argument number (arguments are numbered from 0).
   * @return The specified argument or null if an invalid argNum is
   * provided.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  public int getEntryType() {

  /**
   * Get the entry type.
   *
   * @return The entry type of the CatalogEntry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  public CatalogEntry(int type, Vector args)

  /**
   * Construct a catalog entry of the specified type.
   *
   * @param type The entry type
   * @param args A String Vector of arguments
   * @throws InvalidCatalogEntryTypeException if no such entry type
   * exists.
   * @throws InvalidCatalogEntryException if the wrong number of arguments
   * is passed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  public CatalogEntry(String name, Vector args)

  /**
   * Construct a catalog entry of the specified type.
   *
   * @param name The name of the entry type
   * @param args A String Vector of arguments
   * @throws InvalidCatalogEntryTypeException if no such entry type
   * exists.
   * @throws InvalidCatalogEntryException if the wrong number of arguments
   * is passed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  public CatalogEntry() {}

  /**
   * Null constructor; something for subclasses to call.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  protected Vector args = null;

  /** The arguments associated with this entry */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  protected int entryType = 0;

  /** The entry type of this entry */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  public static int getEntryArgCount(int type)

  /**
   * Find out how many arguments an entry is required to have.
   *
   * @param type A valid catalog entry type.
   * @return The number of arguments that entry type is required to have.
   * @throws InvalidCatalogEntryTypeException if the type is invalid.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  public static int getEntryArgCount(String name)

  /**
   * Find out how many arguments an entry is required to have.
   *
   * @param name The name of the catalog entry type.
   * @return The number of arguments that entry type is required to have.
   * @throws InvalidCatalogEntryTypeException if no entry has the
   * specified name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  public static int getEntryType(String name)

  /**
   * Lookup an entry type
   *
   * @param name The name of the catalog entry type.
   * @return The type of the catalog entry with the specified name.
   * @throws InvalidCatalogEntryTypeException if no entry has the
   * specified name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  static int addEntryType(String name, int numArgs) {

  /**
   * Adds a new catalog entry type.
   *
   * @param name The name of the catalog entry type. This must be
   * unique among all types and is case-sensitive. (Adding a duplicate
   * name effectively replaces the old type with the new type.)
   * @param numArgs The number of arguments that this entry type
   * is required to have. There is no provision for variable numbers
   * of arguments.
   * @return The type for the new entry.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  protected static Vector entryArgs = new Vector();

  /** The entryTypes vector maps catalog entry types to the
      number of arguments they're required to have. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  protected static final Map<String, Integer> entryTypes = new ConcurrentHashMap<>();

  /**
   * The entryTypes vector maps catalog entry names
   * (e.g., 'BASE' or 'SYSTEM') to their type (1, 2, etc.).
   * Names are case sensitive.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
public class CatalogEntry {

/**
 * Represents a Catalog entry.
 *
 * <p>Instances of this class represent individual entries
 * in a Catalog.</p>
 *
 * <p>Each catalog entry has a unique name and is associated with
 * an arbitrary number of arguments (all strings). For example, the
 * TR9401 catalog entry "PUBLIC" has two arguments, a public identifier
 * and a system identifier. Each entry has a unique numeric type,
 * assigned automatically when the entry type is created.</p>
 *
 * <p>The number and type of catalog entries is maintained
 * <em>statically</em>. Catalog classes, or their subclasses, can add
 * new entry types, but all Catalog objects share the same global pool
 * of types.</p>
 *
 * <p>Initially there are no valid entries.</p>
 *
 * @see Catalog
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  public void setEntryArg(int argNum, String newspec)

  /**
   * Set an entry argument.
   *
   * <p>Catalogs sometimes need to adjust the catlog entry parameters,
   * for example to make a relative URI absolute with respect to the
   * current base URI. But in general, this function should only be
   * called shortly after object creation to do some sort of cleanup.
   * Catalog entries should not mutate over time.</p>
   *
   * @param argNum The argument number (arguments are numbered from 0).
   * @throws ArrayIndexOutOfBoundsException if an invalid argument
   * number is provided.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  public String getEntryArg(int argNum) {

  /**
   * Get an entry argument.
   *
   * @param argNum The argument number (arguments are numbered from 0).
   * @return The specified argument or null if an invalid argNum is
   * provided.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  public int getEntryType() {

  /**
   * Get the entry type.
   *
   * @return The entry type of the CatalogEntry
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  public CatalogEntry(int type, Vector args)

  /**
   * Construct a catalog entry of the specified type.
   *
   * @param type The entry type
   * @param args A String Vector of arguments
   * @throws InvalidCatalogEntryTypeException if no such entry type
   * exists.
   * @throws InvalidCatalogEntryException if the wrong number of arguments
   * is passed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  public CatalogEntry(String name, Vector args)

  /**
   * Construct a catalog entry of the specified type.
   *
   * @param name The name of the entry type
   * @param args A String Vector of arguments
   * @throws InvalidCatalogEntryTypeException if no such entry type
   * exists.
   * @throws InvalidCatalogEntryException if the wrong number of arguments
   * is passed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  public CatalogEntry() {}

  /**
   * Null constructor; something for subclasses to call.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  protected Vector args = null;

  /** The arguments associated with this entry */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  protected int entryType = 0;

  /** The entry type of this entry */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  public static int getEntryArgCount(int type)

  /**
   * Find out how many arguments an entry is required to have.
   *
   * @param type A valid catalog entry type.
   * @return The number of arguments that entry type is required to have.
   * @throws InvalidCatalogEntryTypeException if the type is invalid.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  public static int getEntryArgCount(String name)

  /**
   * Find out how many arguments an entry is required to have.
   *
   * @param name The name of the catalog entry type.
   * @return The number of arguments that entry type is required to have.
   * @throws InvalidCatalogEntryTypeException if no entry has the
   * specified name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  public static int getEntryType(String name)

  /**
   * Lookup an entry type
   *
   * @param name The name of the catalog entry type.
   * @return The type of the catalog entry with the specified name.
   * @throws InvalidCatalogEntryTypeException if no entry has the
   * specified name.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  static int addEntryType(String name, int numArgs) {

  /**
   * Adds a new catalog entry type.
   *
   * @param name The name of the catalog entry type. This must be
   * unique among all types and is case-sensitive. (Adding a duplicate
   * name effectively replaces the old type with the new type.)
   * @param numArgs The number of arguments that this entry type
   * is required to have. There is no provision for variable numbers
   * of arguments.
   * @return The type for the new entry.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  protected static Vector entryArgs = new Vector();

  /** The entryTypes vector maps catalog entry types to the
      number of arguments they're required to have. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
  protected static final Map<String, Integer> entryTypes = new ConcurrentHashMap<>();

  /**
   * The entryTypes vector maps catalog entry names
   * (e.g., 'BASE' or 'SYSTEM') to their type (1, 2, etc.).
   * Names are case sensitive.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/resolver/CatalogEntry.java
public class CatalogEntry {

/**
 * Represents a Catalog entry.
 *
 * <p>Instances of this class represent individual entries
 * in a Catalog.</p>
 *
 * <p>Each catalog entry has a unique name and is associated with
 * an arbitrary number of arguments (all strings). For example, the
 * TR9401 catalog entry "PUBLIC" has two arguments, a public identifier
 * and a system identifier. Each entry has a unique numeric type,
 * assigned automatically when the entry type is created.</p>
 *
 * <p>The number and type of catalog entries is maintained
 * <em>statically</em>. Catalog classes, or their subclasses, can add
 * new entry types, but all Catalog objects share the same global pool
 * of types.</p>
 *
 * <p>Initially there are no valid entries.</p>
 *
 * @see Catalog
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 */
