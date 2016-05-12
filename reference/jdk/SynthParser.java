_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    private static class LazyImageIcon extends ImageIcon implements UIResource {

    /**
     * ImageIcon that lazily loads the image until needed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    private Insets parseInsets(String insets, String errorMsg) throws

    /**
     * Convenience method to return an Insets object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    private int nextInt(StringTokenizer tok, String errorMsg) throws

    /**
     * Convenience method to return the next int, or throw if there are no
     * more valid ints.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    private void register(String key, Object value) throws SAXException {

    /**
     * Registers an object by name. This will throw an exception if an
     * object has already been registered under the given name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    private Object lookup(String key, Class type) throws SAXException {

    /**
     * Returns an object created with id=key. If the object is not of
     * type type, this will throw an exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    private Object checkCast(Object value, Class type) throws SAXException {

    /**
     * If <code>value</code> is an instance of <code>type</code> it is
     * returned, otherwise a SAXException is thrown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    private DocumentHandler getHandler() {

    /**
     * Handles beans persistance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    private boolean isForwarding() {

    /**
     * Returns true if we are forwarding to persistance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    private void reset() {

    /**
     * Clears our internal state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    private URL getResource(String path) {

    /**
     * Returns the path to a resource.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    public void parse(InputStream inputStream,
                      DefaultSynthStyleFactory factory,
                      URL urlResourceBase, Class<?> classResourceBase,
                      Map<String, Object> defaultsMap)

    /**
     * Parses a set of styles from <code>inputStream</code>, adding the
     * resulting styles to the passed in DefaultSynthStyleFactory.
     * Resources are resolved either from a URL or from a Class. When calling
     * this method, one of the URL or the Class must be null but not both at
     * the same time.
     *
     * @param inputStream XML document containing the styles to read
     * @param factory DefaultSynthStyleFactory that new styles are added to
     * @param urlResourceBase the URL used to resolve any resources, such as Images
     * @param classResourceBase the Class used to resolve any resources, such as Images
     * @param defaultsMap Map that UIDefaults properties are placed in
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    private List<ParsedSynthStyle.PainterInfo> _statePainters;

    /**
     * List of SynthStyle.Painters that will be applied to the current state.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    private List<ParsedSynthStyle.PainterInfo> _stylePainters;

    /**
     * List of SynthStyle.Painters that will be applied to the current style.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    private Map<String, Object> _defaultsMap;

    /**
     * defaultsPropertys are placed here.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    private List<ColorType> _colorTypes;

    /**
     * List of ColorTypes. This is populated in startColorType.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    private Class<?> _classResourceBase;

    /**
     * Based class used to resolve paths.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    private URL _urlResourceBase;

    /**
     * Based URL used to resolve paths.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    private Map<String,Object> _mapping;

    /**
     * Object references outside the scope of persistance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    private String _inputMapID;

    /**
     * ID for the input map. This is cached as
     * the InputMap is created AFTER the inputMapProperty has ended.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    private List<String> _inputMapBindings;

    /**
     * Bindings for the current InputMap
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    private ParsedSynthStyle.StateInfo _stateInfo;

    /**
     * Current state info.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    private ParsedSynthStyle _style;

    /**
     * Current style.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    private List<ParsedSynthStyle.StateInfo> _stateInfos;

    /**
     * Array of state infos for the current style. These are pushed to the
     * style when </style> is received.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    private DefaultSynthStyleFactory _factory;

    /**
     * Factory that new styles are added to.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    private int _depth;

    /**
     * Indicates the depth of how many elements we've encountered but don't
     * understand. This is used when forwarding to beans persistance to know
     * when we hsould stop forwarding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/synth/SynthParser.java
    private DocumentHandler _handler;

    /**
     * Lazily created, used for anything we don't understand.
     */
