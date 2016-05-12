_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    private static final String TSPECIALS = "()<>@,;:\\\"/[]?=";

    /**
     * A string that holds all the special chars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    private static String unquote(String value) {

    /**
     * A routine that knows how to strip the quotes and escape sequences from the given value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    private static String quote(String value) {

    /**
     * A routine that knows how and when to quote and escape the given value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    private static int skipWhiteSpace(String rawdata, int i) {

    /**
     * return the index of the first non white space character in
     * rawdata at or after index i.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    private static boolean isTokenChar(char c) {

    /**
     * Determine whether or not a given character belongs to a legal token.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
     public Object clone() {

    /**
     * @return a clone of this object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    public Enumeration<String> getNames() {

    /**
     * Retrieve an enumeration of all the names in this list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    public void remove(String name) {

    /**
     * Remove any value associated with the given name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    public void set(String name, String value) {

    /**
     * Set the value to be associated with the given name, replacing
     * any previous association.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    public String get(String name) {

    /**
     * Retrieve the value associated with the given name, or null if there
     * is no current association.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    public boolean isEmpty() {

    /**
     * Determine whether or not this list is empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    public int size() {

    /**
     * return the number of name-value pairs in this list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    protected void parse(String rawdata) throws MimeTypeParseException {

    /**
     * A routine for parsing the parameter list out of a String.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    public boolean equals(Object thatObject) {

    /**
     * Two parameter lists are considered equal if they have exactly
     * the same set of parameter names and associated values. The
     * order of the parameters is not considered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    public MimeTypeParameterList() {

    /**
     * Default constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
class MimeTypeParameterList implements Cloneable {

/**
 * An object that encapsulates the parameter list of a MimeType
 * as defined in RFC 2045 and 2046.
 *
 * @author jeff.dunn@eng.sun.com
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    private static final String TSPECIALS = "()<>@,;:\\\"/[]?=";

    /**
     * A string that holds all the special chars.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    private static String unquote(String value) {

    /**
     * A routine that knows how to strip the quotes and escape sequences from the given value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    private static String quote(String value) {

    /**
     * A routine that knows how and when to quote and escape the given value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    private static int skipWhiteSpace(String rawdata, int i) {

    /**
     * return the index of the first non white space character in
     * rawdata at or after index i.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    private static boolean isTokenChar(char c) {

    /**
     * Determine whether or not a given character belongs to a legal token.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
     public Object clone() {

    /**
     * @return a clone of this object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    public Enumeration<String> getNames() {

    /**
     * Retrieve an enumeration of all the names in this list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    public void remove(String name) {

    /**
     * Remove any value associated with the given name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    public void set(String name, String value) {

    /**
     * Set the value to be associated with the given name, replacing
     * any previous association.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    public String get(String name) {

    /**
     * Retrieve the value associated with the given name, or null if there
     * is no current association.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    public boolean isEmpty() {

    /**
     * Determine whether or not this list is empty.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    public int size() {

    /**
     * return the number of name-value pairs in this list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    protected void parse(String rawdata) throws MimeTypeParseException {

    /**
     * A routine for parsing the parameter list out of a String.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    public boolean equals(Object thatObject) {

    /**
     * Two parameter lists are considered equal if they have exactly
     * the same set of parameter names and associated values. The
     * order of the parameters is not considered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
    public MimeTypeParameterList() {

    /**
     * Default constructor.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/datatransfer/MimeTypeParameterList.java
class MimeTypeParameterList implements Cloneable {

/**
 * An object that encapsulates the parameter list of a MimeType
 * as defined in RFC 2045 and 2046.
 *
 * @author jeff.dunn@eng.sun.com
 */
