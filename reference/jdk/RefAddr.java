_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/RefAddr.java
    private static final long serialVersionUID = -1468165120479154358L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/RefAddr.java
    public String toString(){

    /**
      * Generates the string representation of this address.
      * The string consists of the address's type and contents with labels.
      * This representation is intended for display only and not to be parsed.
      * @return The non-null string representation of this address.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/RefAddr.java
    public int hashCode() {

    /**
      * Computes the hash code of this address using its address type and contents.
      * The hash code is the sum of the hash code of the address type and
      * the hash code of the address contents.
      *
      * @return The hash code of this address as an int.
      * @see java.lang.Object#hashCode
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/RefAddr.java
    public boolean equals(Object obj) {

    /**
      * Determines whether obj is equal to this RefAddr.
      *<p>
      * obj is equal to this RefAddr all of these conditions are true
      *<ul>
      *<li> non-null
      *<li> instance of RefAddr
      *<li> obj has the same address type as this RefAddr (using String.compareTo())
      *<li> both obj and this RefAddr's contents are null or they are equal
      *         (using the equals() test).
      *</ul>
      * @param obj possibly null obj to check.
      * @return true if obj is equal to this refaddr; false otherwise.
      * @see #getContent
      * @see #getType
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/RefAddr.java
    public abstract Object getContent();

    /**
      * Retrieves the contents of this address.
      *
      * @return The possibly null address contents.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/RefAddr.java
    public String getType() {

    /**
      * Retrieves the address type of this address.
      *
      * @return The non-null address type of this address.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/RefAddr.java
    protected RefAddr(String addrType) {

    /**
      * Constructs a new instance of RefAddr using its address type.
      *
      * @param addrType A non-null string describing the type of the address.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/RefAddr.java
    protected String addrType;

    /**
     * Contains the type of this address.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/RefAddr.java
  /*<p>

/**
  * This class represents the address of a communications end-point.
  * It consists of a type that describes the communication mechanism
  * and an address contents determined by an RefAddr subclass.
  *<p>
  * For example, an address type could be "BSD Printer Address",
  * which specifies that it is an address to be used with the BSD printing
  * protocol. Its contents could be the machine name identifying the
  * location of the printer server that understands this protocol.
  *<p>
  * A RefAddr is contained within a Reference.
  *<p>
  * RefAddr is an abstract class. Concrete implementations of it
  * determine its synchronization properties.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  *
  * @see Reference
  * @see LinkRef
  * @see StringRefAddr
  * @see BinaryRefAddr
  * @since 1.3
  */
