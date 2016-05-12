_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/InterOperableNamingImpl.java
    private String encode( String stringToEncode ) {

    /** Encodes the string according to RFC 2396 IETF spec required by INS.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/InterOperableNamingImpl.java
    public String createURLBasedAddress( String address, String name )

   /**
     * Method which converts the Stringified name  and Host Name Address into
     * a URL based Name
     *
     * @param address which is ip based host name
     * @param name which is the stringified name.
     * @return  url based Name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/InterOperableNamingImpl.java
   private String cleanEscapeCharacter( String theString )

   /** This method cleans the escapes in the Stringified name and returns the
     * correct String
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/InterOperableNamingImpl.java
   private NameComponent createNameComponentFromString(
        String theStringifiedNameComponent )

   /** Step 2: After Breaking the Stringified name into set of NameComponent
     * Strings, The next step is to create Namecomponents from the substring
     * by removing the escapes if there are any.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/InterOperableNamingImpl.java
   private String[] StringComponentsFromIndices( int[] theIndices,
          int indicesCount, String theStringifiedName )

   /** This method breaks one big String into multiple substrings based
     * on the array of index passed in.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/InterOperableNamingImpl.java
   private String[] breakStringToNameComponents( String theStringifiedName ) {

   /** Step1 in converting Stringified name into  array of Name Component
     * is breaking the String into multiple name components
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/InterOperableNamingImpl.java
   public org.omg.CosNaming.NameComponent[] convertToNameComponent(
       String theStringifiedName )

   /**
     * Method which converts the Stringified name into Array of Name Components.
     *
     * @param string which is the stringified name.
     * @return  Array of Name Components (Simple or Compound Names)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/InterOperableNamingImpl.java
   private String addEscape( String value )

   /** This method adds escape '\' for the Namecomponent if neccessary
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/InterOperableNamingImpl.java
    private String convertNameComponentToString(
        org.omg.CosNaming.NameComponent theNameComponent )

   /** This method converts a single Namecomponent to String, By adding Escapes
    *  If neccessary.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/InterOperableNamingImpl.java
    public String convertToString( org.omg.CosNaming.NameComponent[]
                                   theNameComponents )

   /**
     * Method which stringifies the Name Components given as the input
     * parameter.
     *
     * @param n Array of Name Components (Simple or Compound Names)
     * @return string which is the stringified reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/InterOperableNamingImpl.java
public class InterOperableNamingImpl

/**
 * Class InteroperableNamingImpl implements the methods defined
 * for NamingContextExt which is part of Interoperable Naming
 * Service specifications. This class is added for doing more
 * of Parsing and Building of Stringified names according to INS
 * Spec.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/InterOperableNamingImpl.java
    private String encode( String stringToEncode ) {

    /** Encodes the string according to RFC 2396 IETF spec required by INS.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/InterOperableNamingImpl.java
    public String createURLBasedAddress( String address, String name )

   /**
     * Method which converts the Stringified name  and Host Name Address into
     * a URL based Name
     *
     * @param address which is ip based host name
     * @param name which is the stringified name.
     * @return  url based Name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/InterOperableNamingImpl.java
   private String cleanEscapeCharacter( String theString )

   /** This method cleans the escapes in the Stringified name and returns the
     * correct String
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/InterOperableNamingImpl.java
   private NameComponent createNameComponentFromString(
        String theStringifiedNameComponent )

   /** Step 2: After Breaking the Stringified name into set of NameComponent
     * Strings, The next step is to create Namecomponents from the substring
     * by removing the escapes if there are any.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/InterOperableNamingImpl.java
   private String[] StringComponentsFromIndices( int[] theIndices,
          int indicesCount, String theStringifiedName )

   /** This method breaks one big String into multiple substrings based
     * on the array of index passed in.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/InterOperableNamingImpl.java
   private String[] breakStringToNameComponents( String theStringifiedName ) {

   /** Step1 in converting Stringified name into  array of Name Component
     * is breaking the String into multiple name components
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/InterOperableNamingImpl.java
   public org.omg.CosNaming.NameComponent[] convertToNameComponent(
       String theStringifiedName )

   /**
     * Method which converts the Stringified name into Array of Name Components.
     *
     * @param string which is the stringified name.
     * @return  Array of Name Components (Simple or Compound Names)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/InterOperableNamingImpl.java
   private String addEscape( String value )

   /** This method adds escape '\' for the Namecomponent if neccessary
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/InterOperableNamingImpl.java
    private String convertNameComponentToString(
        org.omg.CosNaming.NameComponent theNameComponent )

   /** This method converts a single Namecomponent to String, By adding Escapes
    *  If neccessary.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/InterOperableNamingImpl.java
    public String convertToString( org.omg.CosNaming.NameComponent[]
                                   theNameComponents )

   /**
     * Method which stringifies the Name Components given as the input
     * parameter.
     *
     * @param n Array of Name Components (Simple or Compound Names)
     * @return string which is the stringified reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/naming/cosnaming/InterOperableNamingImpl.java
public class InterOperableNamingImpl

/**
 * Class InteroperableNamingImpl implements the methods defined
 * for NamingContextExt which is part of Interoperable Naming
 * Service specifications. This class is added for doing more
 * of Parsing and Building of Stringified names according to INS
 * Spec.
 */
