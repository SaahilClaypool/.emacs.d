_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/ObjectKeyFactoryImpl.java
    private ObjectKeyTemplate create( InputStream is, Handler handler,
        OctetSeqHolder osh )

    /** Creates an ObjectKeyTemplate from the InputStream.  Most of the
    * decoding is done inside the handler.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/ObjectKeyFactoryImpl.java
    private boolean validMagic( int magic )

    /** Returns true iff magic is in the range of valid magic numbers
    * for our ORB.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/ObjectKeyFactoryImpl.java
    private Handler oktempOnly = new Handler() {

    /** This handler reads only the oktemp.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/ObjectKeyFactoryImpl.java
    private Handler fullKey = new Handler() {

    /** This handler reads the full object key, both the oktemp
    * and the ID.
    */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/ObjectKeyFactoryImpl.java
public class ObjectKeyFactoryImpl implements ObjectKeyFactory

/** Singleton used to manufacture ObjectKey and ObjectKeyTemplate
 * instances.
 * @author Ken Cavanaugh
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/ior/ObjectKeyFactoryImpl.java
interface Handler {

/** Based on the magic and scid, return the appropriate
* ObjectKeyTemplate.  Expects to be called with a valid
* magic.  If scid is not valid, null should be returned.
*/
