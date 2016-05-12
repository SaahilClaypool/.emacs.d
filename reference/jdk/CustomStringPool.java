_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/CustomStringPool.java
    @Override

    /**
     * @return integer index uniquely identifying the value of this string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/CustomStringPool.java
    @Override

    /**
     * @return string whose value is uniquely identified by this integer index.
     * @throws java.lang.ArrayIndexOutOfBoundsException if index doesn't map to
     * a string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/CustomStringPool.java
public class CustomStringPool extends DTMStringPool {

/**
 * CustomStringPool is an example of an application-provided data structure for a
 * DTM implementation to hold symbol references, e.g. element names. It will
 * follow the DTMStringPool interface and use two simple methods
 * indexToString(int i) and stringToIndex(String s) to map between a set of
 * string values and a set of integer index values. Therefore, an application
 * may improve DTM processing speed by substituting the DTM symbol resolution
 * tables with application specific quick symbol resolution tables.
 * <p>
 * %REVIEW% The only difference between this an DTMStringPool seems to be that
 * it uses a java.lang.Hashtable full of Integers rather than implementing its
 * own hashing. Joe deliberately avoided that approach when writing
 * DTMStringPool, since it is both much more memory-hungry and probably slower
 * -- especially in JDK 1.1.x, where Hashtable is synchronized. We need to
 * either justify this implementation or discard it.
 *
 * <p>
 * Status: In progress, under discussion.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/CustomStringPool.java
    @Override

    /**
     * @return integer index uniquely identifying the value of this string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/CustomStringPool.java
    @Override

    /**
     * @return string whose value is uniquely identified by this integer index.
     * @throws java.lang.ArrayIndexOutOfBoundsException if index doesn't map to
     * a string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/CustomStringPool.java
public class CustomStringPool extends DTMStringPool {

/**
 * CustomStringPool is an example of an application-provided data structure for a
 * DTM implementation to hold symbol references, e.g. element names. It will
 * follow the DTMStringPool interface and use two simple methods
 * indexToString(int i) and stringToIndex(String s) to map between a set of
 * string values and a set of integer index values. Therefore, an application
 * may improve DTM processing speed by substituting the DTM symbol resolution
 * tables with application specific quick symbol resolution tables.
 * <p>
 * %REVIEW% The only difference between this an DTMStringPool seems to be that
 * it uses a java.lang.Hashtable full of Integers rather than implementing its
 * own hashing. Joe deliberately avoided that approach when writing
 * DTMStringPool, since it is both much more memory-hungry and probably slower
 * -- especially in JDK 1.1.x, where Hashtable is synchronized. We need to
 * either justify this implementation or discard it.
 *
 * <p>
 * Status: In progress, under discussion.
 *
 */
