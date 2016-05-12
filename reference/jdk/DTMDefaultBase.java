_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
         public SuballocatedIntVector getDTMIDs()

         /** Query which DTMIDs this DTM is currently using within the DTMManager.
          *
          * %REVEW% Should this become part of the base DTM API?
          *
          * @return an IntVector, or null if this is a "stand-alone" DTM.
          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
         public DTMManager getManager()

         /** Query which DTMManager this DTM is currently being handled by.
          *
          * %REVEW% Should this become part of the base DTM API?
          *
          * @return a DTMManager, or null if this is a "stand-alone" DTM.
          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
   public void migrateTo(DTMManager mgr)

   /**
    * Migrate a DTM built with an old DTMManager to a new DTMManager.
    * After the migration, the new DTMManager will treat the DTM as
    * one that is built by itself.
    * This is used to support DTM sharing between multiple transformations.
    * @param mgr the DTMManager
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
   public void documentRelease()

  /**
   * A dummy routine to satisify the abstract interface. If the DTM
   * implememtation that extends the default base requires notification
   * when the document is being released, they can override this method
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
   public void documentRegistration()

  /**
   * A dummy routine to satisify the abstract interface. If the DTM
   * implememtation that extends the default base requires notification
   * of registration, they can override this method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected void setShouldStripWhitespace(boolean shouldStrip)

  /**
   * Set whether to strip whitespaces and set the top of the stack to
   * the current value of m_shouldStripWS.
   *
   *
   * @param shouldStrip Flag indicating whether to strip whitespace nodes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected void popShouldStripWhitespace()

  /**
   * Set whether to strip whitespaces at this point by popping out
   * m_shouldStripWhitespaceStack.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected void pushShouldStripWhitespace(boolean shouldStrip)

  /**
   * Set whether to strip whitespaces and push in current value of
   * m_shouldStripWS in m_shouldStripWhitespaceStack.
   *
   * @param shouldStrip Flag indicating whether to strip whitespace nodes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected boolean getShouldStripWhitespace()

  /**
   * Find out whether or not to strip whispace nodes.
   *
   *
   * @return whether or not to strip whispace nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected void error(String msg)

  /**
   * Simple error for asserts and the like.
   *
   * @param msg Error message to report.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public void appendTextChild(String str)

  /**
   * Append a text node child that will be constructed from a string,
   * to the end of the document.
   *
   * <p>%REVIEW% "End of the document" needs to be defined more clearly.
   * Does it become the last child of the Document? Of the root element?</p>
   *
   * @param str Non-null reverence to a string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public void appendChild(int newChild, boolean clone, boolean cloneDepth)

  /**
   * Append a child to the end of the document. Please note that the node
   * is always cloned if it is owned by another document.
   *
   * <p>%REVIEW% "End of the document" needs to be defined more clearly.
   * Does it become the last child of the Document? Of the root element?</p>
   *
   * @param newChild Must be a valid new node handle.
   * @param clone true if the child should be cloned into the document.
   * @param cloneDepth if the clone argument is true, specifies that the
   *                   clone should include all it's children.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public org.w3c.dom.Node getNode(int nodeHandle)

  /**
   * Return an DOM node for the given node.
   *
   * @param nodeHandle The node ID.
   *
   * @return A node representation of the DTM node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract void dispatchToEvents(
    int nodeHandle, org.xml.sax.ContentHandler ch)

  /**
   * Directly create SAX parser events from a subtree.
   *
   * @param nodeHandle The node ID.
   * @param ch A non-null reference to a ContentHandler.
   *
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract void dispatchCharactersEvents(
    int nodeHandle, org.xml.sax.ContentHandler ch, boolean normalize)

  /**
   * Directly call the
   * characters method on the passed ContentHandler for the
   * string-value of the given node (see http://www.w3.org/TR/xpath#data-model
   * for the definition of a node's string-value). Multiple calls to the
   * ContentHandler's characters methods may well occur for a single call to
   * this method.
   *
   * @param nodeHandle The node ID.
   * @param ch A non-null reference to a ContentHandler.
   * @param normalize true if the content should be normalized according to
   * the rules for the XPath
   * <a href="http://www.w3.org/TR/xpath#function-normalize-space">normalize-space</a>
   * function.
   *
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract boolean isAttributeSpecified(int attributeHandle);

  /**
   *     5. [specified] A flag indicating whether this attribute was actually
   *        specified in the start-tag of its element, or was defaulted from the
   *        DTD.
   *
   * @param attributeHandle The attribute handle in question.
   *
   * @return <code>true</code> if the attribute was specified;
   *         <code>false</code> if it was defaulted.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public boolean isDocumentAllDeclarationsProcessed(int documentHandle)

  /**
   *    10. [all declarations processed] This property is not strictly speaking
   *        part of the infoset of the document. Rather it is an indication of
   *        whether the processor has read the complete DTD. Its value is a
   *        boolean. If it is false, then certain properties (indicated in their
   *        descriptions below) may be unknown. If it is true, those properties
   *        are never unknown.
   *
   * @param documentHandle A node handle that must identify a document.
   * @return <code>true</code> if all declarations were processed;
   *         <code>false</code> otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public boolean isCharacterElementContentWhitespace(int nodeHandle)

  /**
   *     2. [element content whitespace] A boolean indicating whether the
   *        character is white space appearing within element content (see [XML],
   *        2.10 "White Space Handling"). Note that validating XML processors are
   *        required by XML 1.0 to provide this information. If there is no
   *        declaration for the containing element, this property has no value for
   *        white space characters. If no declaration has been read, but the [all
   *        declarations processed] property of the document information item is
   *        false (so there may be an unread declaration), then the value of this
   *        property is unknown for white space characters. It is always false for
   *        characters that are not white space.
   *
   * @param nodeHandle the node ID.
   * @return <code>true</code> if the character data is whitespace;
   *         <code>false</code> otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public boolean isNodeAfter(int nodeHandle1, int nodeHandle2)

  /**
   * Figure out whether nodeHandle2 should be considered as being later
   * in the document than nodeHandle1, in Document Order as defined
   * by the XPath model. This may not agree with the ordering defined
   * by other XML applications.
   * <p>
   * There are some cases where ordering isn't defined, and neither are
   * the results of this function -- though we'll generally return false.
   *
   * @param nodeHandle1 Node handle to perform position comparison on.
   * @param nodeHandle2 Second Node handle to perform position comparison on .
   *
   * @return true if node1 comes before node2, otherwise return false.
   * You can think of this as
   * <code>(node1.documentOrderPosition &lt;= node2.documentOrderPosition)</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public boolean supportsPreStripping()

  /**
   * Return true if the xsl:strip-space or xsl:preserve-space was processed
   * during construction of the DTM document.
   *
   * @return true if this DTM supports prestripping.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract String getUnparsedEntityURI(String name);

  /**
   * The getUnparsedEntityURI function returns the URI of the unparsed
   * entity with the specified name in the same document as the context
   * node (see [3.3 Unparsed Entities]). It returns the empty string if
   * there is no such entity.
   * <p>
   * XML processors may choose to use the System Identifier (if one
   * is provided) to resolve the entity, rather than the URI in the
   * Public Identifier. The details are dependent on the processor, and
   * we would have to support some form of plug-in resolver to handle
   * this properly. Currently, we simply return the System Identifier if
   * present, and hope that it a usable URI or that our caller can
   * map it to one.
   * TODO: Resolve Public Identifiers... or consider changing function name.
   * <p>
   * If we find a relative URI
   * reference, XML expects it to be resolved in terms of the base URI
   * of the document. The DOM doesn't do that for us, and it isn't
   * entirely clear whether that should be done here; currently that's
   * pushed up to a higher level of our application. (Note that DOM Level
   * 1 didn't store the document's base URI.)
   * TODO: Consider resolving Relative URIs.
   * <p>
   * (The DOM's statement that "An XML processor may choose to
   * completely expand entities before the structure model is passed
   * to the DOM" refers only to parsed entities, not unparsed, and hence
   * doesn't affect this function.)
   *
   * @param name A string containing the Entity Name of the unparsed
   * entity.
   *
   * @return String containing the URI of the Unparsed Entity, or an
   * empty string if no such entity exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract int getElementById(String elementId);

  /**
   * Returns the <code>Element</code> whose <code>ID</code> is given by
   * <code>elementId</code>. If no such element exists, returns
   * <code>DTM.NULL</code>. Behavior is not defined if more than one element
   * has this <code>ID</code>. Attributes (including those
   * with the name "ID") are not of type ID unless so defined by DTD/Schema
   * information available to the DTM implementation.
   * Implementations that do not know whether attributes are of type ID or
   * not are expected to return <code>DTM.NULL</code>.
   *
   * <p>%REVIEW% Presumably IDs are still scoped to a single document,
   * and this operation searches only within a single document, right?
   * Wouldn't want collisions between DTMs in the same process.</p>
   *
   * @param elementId The unique <code>id</code> value for an element.
   * @return The handle of the matching element.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract String getDocumentTypeDeclarationPublicIdentifier();

  /**
   * Return the public identifier of the external subset,
   * normalized as described in 4.2.2 External Entities [XML]. If there is
   * no external subset or if it has no public identifier, this property
   * has no value.
   *
   * @return the public identifier String object, or null if there is none.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract String getDocumentTypeDeclarationSystemIdentifier();

  /**
   *   A document type declaration information item has the following properties:
   *
   *     1. [system identifier] The system identifier of the external subset, if
   *        it exists. Otherwise this property has no value.
   *
   * @return the system identifier String object, or null if there is none.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public boolean getDocumentAllDeclarationsProcessed()

  /**
   * Return an indication of
   * whether the processor has read the complete DTD. Its value is a
   * boolean. If it is false, then certain properties (indicated in their
   * descriptions below) may be unknown. If it is true, those properties
   * are never unknown.
   *
   * @return <code>true</code> if all declarations were processed;
   *         <code>false</code> otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public String getDocumentVersion(int documentHandle)

  /**
   * Return a string representing the XML version of the document. This
   * property is derived from the XML declaration optionally present at the
   * beginning of the document entity, and has no value if there is no XML
   * declaration.
   *
   * @param documentHandle The document handle
   *
   * @return the document version String object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public String getDocumentStandalone(int nodeHandle)

  /**
   * Return an indication of the standalone status of the document,
   *        either "yes" or "no". This property is derived from the optional
   *        standalone document declaration in the XML declaration at the
   *        beginning of the document entity, and has no value if there is no
   *        standalone document declaration.
   *
   * @param nodeHandle The node id, which can be any valid node handle.
   * @return the document standalone String object, either "yes", "no", or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public String getDocumentEncoding(int nodeHandle)

  /**
   * Return the name of the character encoding scheme
   *        in which the document entity is expressed.
   *
   * @param nodeHandle The node id, which can be any valid node handle.
   * @return the document encoding String object.
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public String getDocumentSystemIdentifier(int nodeHandle)

  /**
   * Return the system identifier of the document entity. If
   * it is not known, the value of this property is unknown.
   *
   * @param nodeHandle The node id, which can be any valid node handle.
   * @return the system identifier String object or null if unknown.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public void setDocumentBaseURI(String baseURI)

  /**
   * Set the base URI of the document entity.
   *
   * @param baseURI the document base URI String object or null if unknown.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public String getDocumentBaseURI()

  /**
   * Return the base URI of the document entity. If it is not known
   * (because the document was parsed from a socket connection or from
   * standard input, for example), the value of this property is unknown.
   *
   * @return the document base URI String object or null if unknown.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public boolean isSupported(String feature, String version)

  /**
   * Tests whether DTM DOM implementation implements a specific feature and
   * that feature is supported by this node.
   *
   * @param feature The name of the feature to test.
   * @param version This is the version number of the feature to test.
   *   If the version is not
   *   specified, supporting any version of the feature will cause the
   *   method to return <code>true</code>.
   * @return Returns <code>true</code> if the specified feature is
   *   supported on this node, <code>false</code> otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getNodeHandle(int nodeId)

  /**
   * Get the handle of this node in the tree
   *
   * @param nodeId The node identity.
   * @return the node handle
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getNodeIdent(int nodeHandle)

  /**
   * Get the identity of this node in the tree
   *
   * @param nodeHandle The node handle.
   * @return the node identity
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public short getLevel(int nodeHandle)

  /**
   * Get the depth level of this node in the tree (equals 1 for
   * a parentless node).
   *
   * @param nodeHandle The node id.
   * @return the number of ancestors, plus one
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public short getNodeType(int nodeHandle)

  /**
   * Given a node handle, return its DOM-style node type.
   * <p>
   * %REVIEW% Generally, returning short is false economy. Return int?
   * %REVIEW% Make assumption that node has already arrived.  Is OK?
   *
   * @param nodeHandle The node id.
   * @return int Node type, as per the DOM's Node._NODE constants.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract String getNodeValue(int nodeHandle);

  /**
   * Given a node handle, return its node value. This is mostly
   * as defined by the DOM, but may ignore some conveniences.
   * <p>
   *
   * @param nodeHandle The node id.
   * @return String Value of this node, or null if not
   * meaningful for this node type.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract String getNamespaceURI(int nodeHandle);

  /**
   * Given a node handle, return its DOM-style namespace URI
   * (As defined in Namespaces, this is the declared URI which this node's
   * prefix -- or default in lieu thereof -- was mapped to.)
   *
   * <p>%REVIEW% Null or ""? -sb</p>
   *
   * @param nodeHandle the id of the node.
   * @return String URI value of this node's namespace, or null if no
   * namespace was resolved.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract String getPrefix(int nodeHandle);

  /**
   * Given a namespace handle, return the prefix that the namespace decl is
   * mapping.
   * Given a node handle, return the prefix used to map to the namespace.
   *
   * <p> %REVIEW% Are you sure you want "" for no prefix?  </p>
   * <p> %REVIEW-COMMENT% I think so... not totally sure. -sb  </p>
   *
   * @param nodeHandle the id of the node.
   * @return String prefix of this node's name, or "" if no explicit
   * namespace prefix was given.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract String getLocalName(int nodeHandle);

  /**
   * Given a node handle, return its XPath-style localname.
   * (As defined in Namespaces, this is the portion of the name after any
   * colon character).
   *
   * @param nodeHandle the id of the node.
   * @return String Local name of this node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
    error(XMLMessages.createXMLMessage(XMLErrorResources.ER_METHOD_NOT_SUPPORTED, null));//"Not yet supported!");

    /** @todo: implement this com.sun.org.apache.xml.internal.dtm.DTMDefaultBase abstract method */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public String getNodeNameX(int nodeHandle)

  /**
   * Given a node handle, return the XPath node name.  This should be
   * the name as described by the XPath data model, NOT the DOM-style
   * name.
   *
   * @param nodeHandle the id of the node.
   * @return String Name of this node, which may be an empty string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract String getNodeName(int nodeHandle);

  /**
   * Given a node handle, return its DOM-style node name. This will
   * include names such as #text or #document.
   *
   * @param nodeHandle the id of the node.
   * @return String Name of this node, which may be an empty string.
   * %REVIEW% Document when empty string is possible...
   * %REVIEW-COMMENT% It should never be empty, should it?
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getNamespaceType(final int nodeHandle)

  /**
   * Returns the namespace type of a specific node
   * @param nodeHandle the id of the node.
   * @return the ID of the namespace.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public String getNamespaceFromExpandedNameID(int expandedNameID)

  /**
   * Given an expanded-name ID, return the namespace URI part.
   *
   * @param expandedNameID an ID that represents an expanded-name.
   * @return String URI value of this node's namespace, or null if no
   * namespace was resolved.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public String getLocalNameFromExpandedNameID(int expandedNameID)

  /**
   * Given an expanded-name ID, return the local name part.
   *
   * @param expandedNameID an ID that represents an expanded-name.
   * @return String Local name of this node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getExpandedTypeID(String namespace, String localName, int type)

  /**
   * Given an expanded name, return an ID.  If the expanded-name does not
   * exist in the internal tables, the entry will be created, and the ID will
   * be returned.  Any additional nodes that are created that have this
   * expanded name will use this ID.
   *
   * @param type The simple type, i.e. one of ELEMENT, ATTRIBUTE, etc.
   *
   * @param namespace The namespace URI, which may be null, may be an empty
   *                  string (which will be the same as null), or may be a
   *                  namespace URI.
   * @param localName The local name string, which must be a valid
   *                  <a href="http://www.w3.org/TR/REC-xml-names/">NCName</a>.
   *
   * @return the expanded-name id of the node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getExpandedTypeID(int nodeHandle)

  /**
   * Given a node handle, return an ID that represents the node's expanded name.
   *
   * @param nodeHandle The handle to the node in question.
   *
   * @return the expanded-name id of the node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public char[] getStringValueChunk(int nodeHandle, int chunkIndex,
                                    int[] startAndLen)

  /**
   * Get a character array chunk in the string-value of a node.
   * (see http://www.w3.org/TR/xpath#data-model
   * for the definition of a node's string-value).
   * Note that a single text node may have multiple text chunks.
   *
   * @param nodeHandle The node ID.
   * @param chunkIndex Which chunk to get.
   * @param startAndLen An array of 2 where the start position and length of
   *                    the chunk will be returned.
   *
   * @return The character array reference where the chunk occurs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getStringValueChunkCount(int nodeHandle)

  /**
   * Get number of character array chunks in
   * the string-value of a node.
   * (see http://www.w3.org/TR/xpath#data-model
   * for the definition of a node's string-value).
   * Note that a single text node may have multiple text chunks.
   *
   * @param nodeHandle The node ID.
   *
   * @return number of character array chunks in
   *         the string-value of a node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract XMLString getStringValue(int nodeHandle);

  /**
   * Get the string-value of a node as a String object
   * (see http://www.w3.org/TR/xpath#data-model
   * for the definition of a node's string-value).
   *
   * @param nodeHandle The node ID.
   *
   * @return A string object that represents the string-value of the given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getDocumentRoot(int nodeHandle)

  /**
   * Given a node handle, find the owning document node.  Unlike the DOM,
   * this considers the owningDocument of a Document to be itself.
   *
   * @param nodeHandle the id of the node.
   * @return int Node handle of owning document, or the nodeHandle if it is
   *             a Document.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getOwnerDocument(int nodeHandle)

  /**
   * Given a node handle, find the owning document node.  This has the exact
   * same semantics as the DOM Document method of the same name, in that if
   * the nodeHandle is a document node, it will return NULL.
   *
   * <p>%REVIEW% Since this is DOM-specific, it may belong at the DOM
   * binding layer. Included here as a convenience function and to
   * aid porting of DOM code to DTM.</p>
   *
   * @param nodeHandle the id of the node.
   * @return int Node handle of owning document, or -1 if the node was a Docment
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getDocument()

  /**
   * Find the Document node handle for the document currently under construction.
   * PLEASE NOTE that most people should use getOwnerDocument(nodeHandle) instead;
   * this version of the operation is primarily intended for use during negotiation
   * with the DTM Manager.
   *
   *  @return int Node handle of document, which should always be valid.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getParent(int nodeHandle)

  /**
   * Given a node handle, find its parent node.
   *
   * @param nodeHandle the id of the node.
   * @return int Node-number of parent,
   * or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getNextNamespaceNode(int baseHandle, int nodeHandle,
                                  boolean inScope)

  /**
   * Given a namespace handle, advance to the next namespace.
   *
   * @param baseHandle handle to original node from where the first namespace
   * was relative to (needed to return nodes in document order).
   * @param nodeHandle A namespace handle for which we will find the next node.
   * @param inScope true if all namespaces that are in scope should be processed,
   * otherwise just process the nodes in the given element handle.
   * @return handle of next namespace, or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getFirstNamespaceNode(int nodeHandle, boolean inScope)

  /**
   * Given a node handle, get the index of the node's first child.
   * If not yet resolved, waits for more nodes to be added to the document and
   * tries again
   *
   * @param nodeHandle handle to node, which should probably be an element
   *                   node, but need not be.
   *
   * @param inScope    true if all namespaces in scope should be returned,
   *                   false if only the namespace declarations should be
   *                   returned.
   * @return handle of first namespace, or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int findInSortedSuballocatedIntVector(SuballocatedIntVector vector, int lookfor)

  /**
     * Subroutine: Locate the specified node within
     * m_namespaceDeclSetElements, or the last element which
     * preceeds it in document order
     *
     * %REVIEW% Inlne this into findNamespaceContext? Create SortedSuballocatedIntVector type?
     *
     * @return If positive or zero, the index of the found item.
     * If negative, index of the point at which it would have appeared,
     * encoded as -1-index and hence reconvertable by subtracting
     * it from -1. (Encoding because I don't want to recompare the strings
     * but don't want to burn bytes on a datatype to hold a flagged value.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected SuballocatedIntVector findNamespaceContext(int elementNodeIndex)

  /** Retrieve list of namespace declaration locations
     * active at this node. List is an SuballocatedIntVector whose
     * entries are the namespace node HANDLES declared at that ID.
     *
     * %REVIEW% Directly managed arrays rather than vectors?
     * %REVIEW% Handles or IDs? Given usage, I think handles.
     * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected void declareNamespaceInContext(int elementNodeIndex,int namespaceNodeIndex)

  /** Build table of namespace declaration
   * locations during DTM construction. Table is a Vector of
   * SuballocatedIntVectors containing the namespace node HANDLES declared at
   * that ID, plus an SuballocatedIntVector of the element node INDEXES at which
   * these declarations appeared.
   *
   * NOTE: Since this occurs during model build, nodes will be encountered
   * in doucment order and thus the table will be ordered by element,
   * permitting binary-search as a possible retrieval optimization.
   *
   * %REVIEW% Directly managed arrays rather than vectors?
   * %REVIEW% Handles or IDs? Given usage, I think handles.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  private Vector m_namespaceLists = null;  // on demand

  /** Lazily created namespace lists. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int getNextAttributeIdentity(int identity) {

  /**
   * Given a node identity for an attribute, advance to the next attribute.
   *
   * @param identity int identity of the attribute node.  This
   * <strong>must</strong> be an attribute node.
   *
   * @return int DTM node-identity of the resolved attr,
   * or DTM.NULL to indicate none exists.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getNextAttribute(int nodeHandle) {

  /**
   * Given a node handle, advance to the next attribute.
   * If an attr, we advance to
   * the next attr on the same node.  If not an attribute, we return NULL.
   *
   * @param nodeHandle int Handle of the node.
   * @return int DTM node-number of the resolved attr,
   * or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getPreviousSibling(int nodeHandle)

  /**
   * Given a node handle, find its preceeding sibling.
   * WARNING: DTM is asymmetric; this operation is resolved by search, and is
   * relatively expensive.
   *
   * @param nodeHandle the id of the node.
   * @return int Node-number of the previous sib,
   * or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getTypedNextSibling(int nodeHandle, int nodeType)

  /**
   * Given a node handle, advance to its next sibling.
   * If not yet resolved, waits for more nodes to be added to the document and
   * tries again.
   * @param nodeHandle int Handle of the node.
   * @return int Node-number of next sibling,
   * or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getNextSibling(int nodeHandle)

  /**
   * Given a node handle, advance to its next sibling.
   * If not yet resolved, waits for more nodes to be added to the document and
   * tries again.
   * @param nodeHandle int Handle of the node.
   * @return int Node-number of next sibling,
   * or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int getTypedAttribute(int nodeHandle, int attType) {

  /**
   * Given a node handle and an expanded type ID, get the index of the node's
   * attribute of that type, if any.
   *
   * @param nodeHandle int Handle of the node.
   * @param attType int expanded type ID of the required attribute.
   * @return Handle of attribute of the required type, or DTM.NULL to indicate
   * none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int getFirstAttributeIdentity(int identity) {

  /**
   * Given a node identity, get the index of the node's first attribute.
   *
   * @param identity int identity of the node.
   * @return Identity of first attribute, or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getFirstAttribute(int nodeHandle)

  /**
   * Given a node handle, get the index of the node's first attribute.
   *
   * @param nodeHandle int Handle of the node.
   * @return Handle of first attribute, or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract int getAttributeNode(int nodeHandle, String namespaceURI,
                                       String name);

  /**
   * Retrieves an attribute node by by qualified name and namespace URI.
   *
   * @param nodeHandle int Handle of the node upon which to look up this attribute..
   * @param namespaceURI The namespace URI of the attribute to
   *   retrieve, or null.
   * @param name The local name of the attribute to
   *   retrieve.
   * @return The attribute node handle with the specified name (
   *   <code>nodeName</code>) or <code>DTM.NULL</code> if there is no such
   *   attribute.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getLastChild(int nodeHandle)

  /**
   * Given a node handle, advance to its last child.
   * If not yet resolved, waits for more nodes to be added to the document and
   * tries again.
   *
   * @param nodeHandle int Handle of the node.
   * @return int Node-number of last child,
   * or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getTypedFirstChild(int nodeHandle, int nodeType)

  /**
   * Given a node handle, get the handle of the node's first child.
   * If not yet resolved, waits for more nodes to be added to the document and
   * tries again.
   *
   * @param nodeHandle int Handle of the node.
   * @return int DTM node-number of first child, or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getFirstChild(int nodeHandle)

  /**
   * Given a node handle, get the handle of the node's first child.
   * If not yet resolved, waits for more nodes to be added to the document and
   * tries again.
   *
   * @param nodeHandle int Handle of the node.
   * @return int DTM node-number of first child, or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  final public int makeNodeIdentity(int nodeHandle)

  /** Given a node handle, return a node identity. If extended addressing
   * has been used (multiple DTM IDs), we need to map the high bits of the
   * identity into the proper DTM ID and thence find the proper offset
   * to add to the low bits of the identity
   *
   * This has been made FINAL to facilitate inlining, since we do not expect
   * any subclass of DTMDefaultBase to ever change the algorithm. (I don't
   * really like doing so, and would love to have an excuse not to...)
   *
   * %OPT% Performance is critical for this operation.
   *
   * %REVIEW% Should this be exposed at the package/public layers?
   *
   * @param nodeHandle (external representation of node)
   * @return nodeIdentity Internal offset to this node's records.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  final public int makeNodeHandle(int nodeIdentity)

  /** Given a node identity, return a node handle. If extended addressing
   * has been used (multiple DTM IDs), we need to map the high bits of the
   * identity into the proper DTM ID.
   *
   * This has been made FINAL to facilitate inlining, since we do not expect
   * any subclass of DTMDefaultBase to ever change the algorithm. (I don't
   * really like doing so, and would love to have an excuse not to...)
   *
   * %REVIEW% Is it worth trying to specialcase small documents?
   * %REVIEW% Should this be exposed at the package/public layers?
   *
   * @param nodeIdentity Internal offset to this node's records.
   * @return NodeHandle (external representation of node)
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public boolean hasChildNodes(int nodeHandle)

  /**
   * Given a node handle, test if it has child nodes.
   * <p> %REVIEW% This is obviously useful at the DOM layer, where it
   * would permit testing this without having to create a proxy
   * node. It's less useful in the DTM API, where
   * (dtm.getFirstChild(nodeHandle)!=DTM.NULL) is just as fast and
   * almost as self-evident. But it's a convenience, and eases porting
   * of DOM code to DTM.  </p>
   *
   * @param nodeHandle int Handle of the node.
   * @return int true if the given node has child nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public void setFeature(String featureId, boolean state){}

  /**
   * Set an implementation dependent feature.
   * <p>
   * %REVIEW% Do we really expect to set features on DTMs?
   *
   * @param featureId A feature URL.
   * @param state true if this feature should be on, false otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public String dumpNode(int nodeHandle)

  /**
   * Diagnostics function to dump a single node.
   *
   * %REVIEW% KNOWN GLITCH: If you pass it a node index rather than a
   * node handle, it works just fine... but the displayed identity
   * number before the colon is different, which complicates comparing
   * it with nodes printed the other way. We could always OR the DTM ID
   * into the value, to suppress that distinction...
   *
   * %REVIEW% This might want to be moved up to DTMDefaultBase, or possibly
   * DTM itself, since it's a useful diagnostic and uses only DTM's public
   * APIs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public void dumpDTM(OutputStream os)

  /**
   * Diagnostics function to dump the DTM.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int _parent(int identity)

  /**
   * Get the parent for the given node identity.
   *
   * @param identity The node identity.
   *
   * @return The parent identity, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int _prevsib(int identity)

  /**
   * Get the previous sibling for the given node identity.
   *
   * @param identity The node identity.
   *
   * @return The previous sibling identity, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int _nextsib(int identity)

  /**
   * Get the next sibling for the given node identity.
   *
   * @param identity The node identity.
   *
   * @return The next sibling identity, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int _firstch(int identity)

  /**
   * Get the first child for the given node identity.
   *
   * @param identity The node identity.
   *
   * @return The first child identity, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int _level(int identity)

  /**
   * Get the level in the tree for the given node identity.
   *
   * @param identity The node identity.
   *
   * @return The tree level, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int _exptype(int identity)

  /**
   * Get the expanded type ID for the given node identity.
   *
   * @param identity The node identity.
   *
   * @return The expanded type ID, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected short _type(int identity)

  /**
   * Get the simple type ID for the given node identity.
   *
   * @param identity The node identity.
   *
   * @return The simple type ID, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
//    protected void ensureSize(int index)

//    /**
//     * Ensure that the size of the information arrays can hold another entry
//     * at the given index.
//     *
//     * @param index On exit from this function, the information arrays sizes must be
//     * at least index+1.
//     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected DTMAxisTraverser[] m_traversers;

  /** Stateless axis traversers, lazely built. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected abstract int getNumberOfNodes();

  /**
   * Get the number of nodes that have been added.
   *
   * @return the number of nodes that have been mapped.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected abstract boolean nextNode();

  /**
   * This method should try and build one or more nodes in the table.
   *
   * @return The true if a next node is found or false if
   *         there are no more nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected abstract int getNextNodeIdentity(int identity);

  /**
   * Get the next node identity value in the list, and call the iterator
   * if it hasn't been added yet.
   *
   * @param identity The node identity (index).
   * @return identity+1, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  int findElementFromIndex(int nsIndex, int lnIndex, int firstPotential)

  /**
   * Find the first matching element from the index at or after the
   * given node.
   *
   * @param nsIndex The namespace index lookup.
   * @param lnIndex The local name index lookup.
   * @param firstPotential The first potential match that is worth looking at.
   *
   * @return The first node that is greater than or equal to the
   *         firstPotential argument, or DTM.NOTPROCESSED if not found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int findGTE(int[] list, int start, int len, int value)

  /**
   * Find the first index that occurs in the list that is greater than or
   * equal to the given value.
   *
   * @param list A list of integers.
   * @param start The start index to begin the search.
   * @param len The number of items to search.
   * @param value Find the slot that has a value that is greater than or
   * identical to this argument.
   *
   * @return The index in the list of the slot that is higher or identical
   * to the identity argument, or -1 if no node is higher or equal.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected void indexNode(int expandedTypeID, int identity)

  /**
   * Add a node to the element indexes. The node will not be added unless
   * it's an element.
   *
   * @param expandedTypeID The expanded type ID of the node.
   * @param identity The node identity index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected void ensureSizeOfIndex(int namespaceID, int LocalNameID)

  /**
   * Ensure that the size of the element indexes can hold the information.
   *
   * @param namespaceID Namespace ID index.
   * @param LocalNameID Local name ID.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public DTMDefaultBase(DTMManager mgr, Source source, int dtmIdentity,
                        DTMWSFilter whiteSpaceFilter,
                        XMLStringFactory xstringfactory, boolean doIndexing,
                        int blocksize, boolean usePrevsib,
                        boolean newNameTable)

  /**
   * Construct a DTMDefaultBase object from a DOM node.
   *
   * @param mgr The DTMManager who owns this DTM.
   * @param source The object that is used to specify the construction source.
   * @param dtmIdentity The DTM identity ID for this DTM.
   * @param whiteSpaceFilter The white space filter for this DTM, which may
   *                         be null.
   * @param xstringfactory The factory to use for creating XMLStrings.
   * @param doIndexing true if the caller considers it worth it to use
   *                   indexing schemes.
   * @param blocksize The block size of the DTM.
   * @param usePrevsib true if we want to build the previous sibling node array.
   * @param newNameTable true if we want to use a new ExpandedNameTable for this DTM.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public DTMDefaultBase(DTMManager mgr, Source source, int dtmIdentity,
                        DTMWSFilter whiteSpaceFilter,
                        XMLStringFactory xstringfactory, boolean doIndexing)

  /**
   * Construct a DTMDefaultBase object using the default block size.
   *
   * @param mgr The DTMManager who owns this DTM.
   * @param source The object that is used to specify the construction source.
   * @param dtmIdentity The DTM identity ID for this DTM.
   * @param whiteSpaceFilter The white space filter for this DTM, which may
   *                         be null.
   * @param xstringfactory The factory to use for creating XMLStrings.
   * @param doIndexing true if the caller considers it worth it to use
   *                   indexing schemes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected boolean m_indexing;

  /** true if indexing is turned on. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected ExpandedNameTable m_expandedNameTable;

  /**
   * The table for exandedNameID lookups.  This may or may not be the same
   * table as is contained in the DTMManagerDefault.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected XMLStringFactory m_xstrf;

  /** The XMLString factory for creating XMLStrings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected BoolStack m_shouldStripWhitespaceStack;

  /** Stack of flags indicating whether to strip whitespace nodes */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected boolean m_shouldStripWS = false;

  /** Flag indicating whether to strip whitespace nodes */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected DTMWSFilter m_wsfilter;

  /**
   * The whitespace filter that enables elements to strip whitespace or not.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected String m_documentBaseURI;

  /** The base URI for this document. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  //protected final static int m_mask = DTMManager.IDENT_NODE_DEFAULT;

  /** The mask for the identity.
      %REVIEW% Should this really be set to the _DEFAULT? What if
      a particular DTM wanted to use another value? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected SuballocatedIntVector m_dtmIdent;

  /** The document identity number(s). If we have overflowed the addressing
   * range of the first that was assigned to us, we may add others. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected DTMManagerDefault m_mgrDefault=null;

  /**
   * m_mgr cast to DTMManagerDefault, or null if it isn't an instance
   * (Efficiency hook)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public DTMManager m_mgr;

  /**
   * The DTM manager who "owns" this DTM.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected static final int NOTPROCESSED = DTM.NULL - 1;

  /**
   * The value to use when the information has not been built yet.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  //protected final int m_blocksize;

  /** The block size of the node arrays */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public static final int DEFAULT_NUMBLOCKS_SMALL = 4;

  /** The number of blocks used for small documents & RTFs */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public static final int DEFAULT_NUMBLOCKS = 32;

  /** The number of blocks for the node arrays */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public static final int DEFAULT_BLOCKSIZE = 512;  // favor small docs.

  /** The default block size of the node arrays */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int[][][] m_elemIndexes;

  /**
   * These hold indexes to elements based on namespace and local name.
   * The base lookup is the the namespace.  The second lookup is the local
   * name, and the last array contains the the first free element
   * at the start, and the list of element handles following.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected SuballocatedIntVector m_namespaceDeclSetElements = null;

  /** SuballocatedIntVector  of elements at which corresponding
   * namespaceDeclSets were defined */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected Vector m_namespaceDeclSets = null;

  /** Vector of SuballocatedIntVectors of NS decl sets */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected SuballocatedIntVector m_parent;

  /** Previous sibling values, one array element for each node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected SuballocatedIntVector m_prevsib;

  /** Previous sibling values, one array element for each node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected SuballocatedIntVector m_nextsib;

  /** Next sibling values, one array element for each node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected SuballocatedIntVector m_firstch;

  /** First child values, one array element for each node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected SuballocatedIntVector m_exptype;

  /** The expanded names, one array element for each node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int m_size = 0;

  /**
   * The number of nodes, which is also used to determine the next
   *  node index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public static final int ROOTNODE = 0;

  /** The identity of the root node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
public abstract class DTMDefaultBase implements DTM

/**
 * The <code>DTMDefaultBase</code> class serves as a helper base for DTMs.
 * It sets up structures for navigation and type, while leaving data
 * management and construction to the derived classes.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
         public SuballocatedIntVector getDTMIDs()

         /** Query which DTMIDs this DTM is currently using within the DTMManager.
          *
          * %REVEW% Should this become part of the base DTM API?
          *
          * @return an IntVector, or null if this is a "stand-alone" DTM.
          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
         public DTMManager getManager()

         /** Query which DTMManager this DTM is currently being handled by.
          *
          * %REVEW% Should this become part of the base DTM API?
          *
          * @return a DTMManager, or null if this is a "stand-alone" DTM.
          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
   public void migrateTo(DTMManager mgr)

   /**
    * Migrate a DTM built with an old DTMManager to a new DTMManager.
    * After the migration, the new DTMManager will treat the DTM as
    * one that is built by itself.
    * This is used to support DTM sharing between multiple transformations.
    * @param mgr the DTMManager
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
   public void documentRelease()

  /**
   * A dummy routine to satisify the abstract interface. If the DTM
   * implememtation that extends the default base requires notification
   * when the document is being released, they can override this method
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
   public void documentRegistration()

  /**
   * A dummy routine to satisify the abstract interface. If the DTM
   * implememtation that extends the default base requires notification
   * of registration, they can override this method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected void setShouldStripWhitespace(boolean shouldStrip)

  /**
   * Set whether to strip whitespaces and set the top of the stack to
   * the current value of m_shouldStripWS.
   *
   *
   * @param shouldStrip Flag indicating whether to strip whitespace nodes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected void popShouldStripWhitespace()

  /**
   * Set whether to strip whitespaces at this point by popping out
   * m_shouldStripWhitespaceStack.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected void pushShouldStripWhitespace(boolean shouldStrip)

  /**
   * Set whether to strip whitespaces and push in current value of
   * m_shouldStripWS in m_shouldStripWhitespaceStack.
   *
   * @param shouldStrip Flag indicating whether to strip whitespace nodes
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected boolean getShouldStripWhitespace()

  /**
   * Find out whether or not to strip whispace nodes.
   *
   *
   * @return whether or not to strip whispace nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected void error(String msg)

  /**
   * Simple error for asserts and the like.
   *
   * @param msg Error message to report.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public void appendTextChild(String str)

  /**
   * Append a text node child that will be constructed from a string,
   * to the end of the document.
   *
   * <p>%REVIEW% "End of the document" needs to be defined more clearly.
   * Does it become the last child of the Document? Of the root element?</p>
   *
   * @param str Non-null reverence to a string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public void appendChild(int newChild, boolean clone, boolean cloneDepth)

  /**
   * Append a child to the end of the document. Please note that the node
   * is always cloned if it is owned by another document.
   *
   * <p>%REVIEW% "End of the document" needs to be defined more clearly.
   * Does it become the last child of the Document? Of the root element?</p>
   *
   * @param newChild Must be a valid new node handle.
   * @param clone true if the child should be cloned into the document.
   * @param cloneDepth if the clone argument is true, specifies that the
   *                   clone should include all it's children.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public org.w3c.dom.Node getNode(int nodeHandle)

  /**
   * Return an DOM node for the given node.
   *
   * @param nodeHandle The node ID.
   *
   * @return A node representation of the DTM node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract void dispatchToEvents(
    int nodeHandle, org.xml.sax.ContentHandler ch)

  /**
   * Directly create SAX parser events from a subtree.
   *
   * @param nodeHandle The node ID.
   * @param ch A non-null reference to a ContentHandler.
   *
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract void dispatchCharactersEvents(
    int nodeHandle, org.xml.sax.ContentHandler ch, boolean normalize)

  /**
   * Directly call the
   * characters method on the passed ContentHandler for the
   * string-value of the given node (see http://www.w3.org/TR/xpath#data-model
   * for the definition of a node's string-value). Multiple calls to the
   * ContentHandler's characters methods may well occur for a single call to
   * this method.
   *
   * @param nodeHandle The node ID.
   * @param ch A non-null reference to a ContentHandler.
   * @param normalize true if the content should be normalized according to
   * the rules for the XPath
   * <a href="http://www.w3.org/TR/xpath#function-normalize-space">normalize-space</a>
   * function.
   *
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract boolean isAttributeSpecified(int attributeHandle);

  /**
   *     5. [specified] A flag indicating whether this attribute was actually
   *        specified in the start-tag of its element, or was defaulted from the
   *        DTD.
   *
   * @param attributeHandle The attribute handle in question.
   *
   * @return <code>true</code> if the attribute was specified;
   *         <code>false</code> if it was defaulted.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public boolean isDocumentAllDeclarationsProcessed(int documentHandle)

  /**
   *    10. [all declarations processed] This property is not strictly speaking
   *        part of the infoset of the document. Rather it is an indication of
   *        whether the processor has read the complete DTD. Its value is a
   *        boolean. If it is false, then certain properties (indicated in their
   *        descriptions below) may be unknown. If it is true, those properties
   *        are never unknown.
   *
   * @param documentHandle A node handle that must identify a document.
   * @return <code>true</code> if all declarations were processed;
   *         <code>false</code> otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public boolean isCharacterElementContentWhitespace(int nodeHandle)

  /**
   *     2. [element content whitespace] A boolean indicating whether the
   *        character is white space appearing within element content (see [XML],
   *        2.10 "White Space Handling"). Note that validating XML processors are
   *        required by XML 1.0 to provide this information. If there is no
   *        declaration for the containing element, this property has no value for
   *        white space characters. If no declaration has been read, but the [all
   *        declarations processed] property of the document information item is
   *        false (so there may be an unread declaration), then the value of this
   *        property is unknown for white space characters. It is always false for
   *        characters that are not white space.
   *
   * @param nodeHandle the node ID.
   * @return <code>true</code> if the character data is whitespace;
   *         <code>false</code> otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public boolean isNodeAfter(int nodeHandle1, int nodeHandle2)

  /**
   * Figure out whether nodeHandle2 should be considered as being later
   * in the document than nodeHandle1, in Document Order as defined
   * by the XPath model. This may not agree with the ordering defined
   * by other XML applications.
   * <p>
   * There are some cases where ordering isn't defined, and neither are
   * the results of this function -- though we'll generally return false.
   *
   * @param nodeHandle1 Node handle to perform position comparison on.
   * @param nodeHandle2 Second Node handle to perform position comparison on .
   *
   * @return true if node1 comes before node2, otherwise return false.
   * You can think of this as
   * <code>(node1.documentOrderPosition &lt;= node2.documentOrderPosition)</code>.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public boolean supportsPreStripping()

  /**
   * Return true if the xsl:strip-space or xsl:preserve-space was processed
   * during construction of the DTM document.
   *
   * @return true if this DTM supports prestripping.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract String getUnparsedEntityURI(String name);

  /**
   * The getUnparsedEntityURI function returns the URI of the unparsed
   * entity with the specified name in the same document as the context
   * node (see [3.3 Unparsed Entities]). It returns the empty string if
   * there is no such entity.
   * <p>
   * XML processors may choose to use the System Identifier (if one
   * is provided) to resolve the entity, rather than the URI in the
   * Public Identifier. The details are dependent on the processor, and
   * we would have to support some form of plug-in resolver to handle
   * this properly. Currently, we simply return the System Identifier if
   * present, and hope that it a usable URI or that our caller can
   * map it to one.
   * TODO: Resolve Public Identifiers... or consider changing function name.
   * <p>
   * If we find a relative URI
   * reference, XML expects it to be resolved in terms of the base URI
   * of the document. The DOM doesn't do that for us, and it isn't
   * entirely clear whether that should be done here; currently that's
   * pushed up to a higher level of our application. (Note that DOM Level
   * 1 didn't store the document's base URI.)
   * TODO: Consider resolving Relative URIs.
   * <p>
   * (The DOM's statement that "An XML processor may choose to
   * completely expand entities before the structure model is passed
   * to the DOM" refers only to parsed entities, not unparsed, and hence
   * doesn't affect this function.)
   *
   * @param name A string containing the Entity Name of the unparsed
   * entity.
   *
   * @return String containing the URI of the Unparsed Entity, or an
   * empty string if no such entity exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract int getElementById(String elementId);

  /**
   * Returns the <code>Element</code> whose <code>ID</code> is given by
   * <code>elementId</code>. If no such element exists, returns
   * <code>DTM.NULL</code>. Behavior is not defined if more than one element
   * has this <code>ID</code>. Attributes (including those
   * with the name "ID") are not of type ID unless so defined by DTD/Schema
   * information available to the DTM implementation.
   * Implementations that do not know whether attributes are of type ID or
   * not are expected to return <code>DTM.NULL</code>.
   *
   * <p>%REVIEW% Presumably IDs are still scoped to a single document,
   * and this operation searches only within a single document, right?
   * Wouldn't want collisions between DTMs in the same process.</p>
   *
   * @param elementId The unique <code>id</code> value for an element.
   * @return The handle of the matching element.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract String getDocumentTypeDeclarationPublicIdentifier();

  /**
   * Return the public identifier of the external subset,
   * normalized as described in 4.2.2 External Entities [XML]. If there is
   * no external subset or if it has no public identifier, this property
   * has no value.
   *
   * @return the public identifier String object, or null if there is none.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract String getDocumentTypeDeclarationSystemIdentifier();

  /**
   *   A document type declaration information item has the following properties:
   *
   *     1. [system identifier] The system identifier of the external subset, if
   *        it exists. Otherwise this property has no value.
   *
   * @return the system identifier String object, or null if there is none.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public boolean getDocumentAllDeclarationsProcessed()

  /**
   * Return an indication of
   * whether the processor has read the complete DTD. Its value is a
   * boolean. If it is false, then certain properties (indicated in their
   * descriptions below) may be unknown. If it is true, those properties
   * are never unknown.
   *
   * @return <code>true</code> if all declarations were processed;
   *         <code>false</code> otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public String getDocumentVersion(int documentHandle)

  /**
   * Return a string representing the XML version of the document. This
   * property is derived from the XML declaration optionally present at the
   * beginning of the document entity, and has no value if there is no XML
   * declaration.
   *
   * @param documentHandle The document handle
   *
   * @return the document version String object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public String getDocumentStandalone(int nodeHandle)

  /**
   * Return an indication of the standalone status of the document,
   *        either "yes" or "no". This property is derived from the optional
   *        standalone document declaration in the XML declaration at the
   *        beginning of the document entity, and has no value if there is no
   *        standalone document declaration.
   *
   * @param nodeHandle The node id, which can be any valid node handle.
   * @return the document standalone String object, either "yes", "no", or null.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public String getDocumentEncoding(int nodeHandle)

  /**
   * Return the name of the character encoding scheme
   *        in which the document entity is expressed.
   *
   * @param nodeHandle The node id, which can be any valid node handle.
   * @return the document encoding String object.
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public String getDocumentSystemIdentifier(int nodeHandle)

  /**
   * Return the system identifier of the document entity. If
   * it is not known, the value of this property is unknown.
   *
   * @param nodeHandle The node id, which can be any valid node handle.
   * @return the system identifier String object or null if unknown.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public void setDocumentBaseURI(String baseURI)

  /**
   * Set the base URI of the document entity.
   *
   * @param baseURI the document base URI String object or null if unknown.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public String getDocumentBaseURI()

  /**
   * Return the base URI of the document entity. If it is not known
   * (because the document was parsed from a socket connection or from
   * standard input, for example), the value of this property is unknown.
   *
   * @return the document base URI String object or null if unknown.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public boolean isSupported(String feature, String version)

  /**
   * Tests whether DTM DOM implementation implements a specific feature and
   * that feature is supported by this node.
   *
   * @param feature The name of the feature to test.
   * @param version This is the version number of the feature to test.
   *   If the version is not
   *   specified, supporting any version of the feature will cause the
   *   method to return <code>true</code>.
   * @return Returns <code>true</code> if the specified feature is
   *   supported on this node, <code>false</code> otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getNodeHandle(int nodeId)

  /**
   * Get the handle of this node in the tree
   *
   * @param nodeId The node identity.
   * @return the node handle
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getNodeIdent(int nodeHandle)

  /**
   * Get the identity of this node in the tree
   *
   * @param nodeHandle The node handle.
   * @return the node identity
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public short getLevel(int nodeHandle)

  /**
   * Get the depth level of this node in the tree (equals 1 for
   * a parentless node).
   *
   * @param nodeHandle The node id.
   * @return the number of ancestors, plus one
   * @xsl.usage internal
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public short getNodeType(int nodeHandle)

  /**
   * Given a node handle, return its DOM-style node type.
   * <p>
   * %REVIEW% Generally, returning short is false economy. Return int?
   * %REVIEW% Make assumption that node has already arrived.  Is OK?
   *
   * @param nodeHandle The node id.
   * @return int Node type, as per the DOM's Node._NODE constants.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract String getNodeValue(int nodeHandle);

  /**
   * Given a node handle, return its node value. This is mostly
   * as defined by the DOM, but may ignore some conveniences.
   * <p>
   *
   * @param nodeHandle The node id.
   * @return String Value of this node, or null if not
   * meaningful for this node type.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract String getNamespaceURI(int nodeHandle);

  /**
   * Given a node handle, return its DOM-style namespace URI
   * (As defined in Namespaces, this is the declared URI which this node's
   * prefix -- or default in lieu thereof -- was mapped to.)
   *
   * <p>%REVIEW% Null or ""? -sb</p>
   *
   * @param nodeHandle the id of the node.
   * @return String URI value of this node's namespace, or null if no
   * namespace was resolved.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract String getPrefix(int nodeHandle);

  /**
   * Given a namespace handle, return the prefix that the namespace decl is
   * mapping.
   * Given a node handle, return the prefix used to map to the namespace.
   *
   * <p> %REVIEW% Are you sure you want "" for no prefix?  </p>
   * <p> %REVIEW-COMMENT% I think so... not totally sure. -sb  </p>
   *
   * @param nodeHandle the id of the node.
   * @return String prefix of this node's name, or "" if no explicit
   * namespace prefix was given.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract String getLocalName(int nodeHandle);

  /**
   * Given a node handle, return its XPath-style localname.
   * (As defined in Namespaces, this is the portion of the name after any
   * colon character).
   *
   * @param nodeHandle the id of the node.
   * @return String Local name of this node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
    error(XMLMessages.createXMLMessage(XMLErrorResources.ER_METHOD_NOT_SUPPORTED, null));//"Not yet supported!");

    /** @todo: implement this com.sun.org.apache.xml.internal.dtm.DTMDefaultBase abstract method */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public String getNodeNameX(int nodeHandle)

  /**
   * Given a node handle, return the XPath node name.  This should be
   * the name as described by the XPath data model, NOT the DOM-style
   * name.
   *
   * @param nodeHandle the id of the node.
   * @return String Name of this node, which may be an empty string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract String getNodeName(int nodeHandle);

  /**
   * Given a node handle, return its DOM-style node name. This will
   * include names such as #text or #document.
   *
   * @param nodeHandle the id of the node.
   * @return String Name of this node, which may be an empty string.
   * %REVIEW% Document when empty string is possible...
   * %REVIEW-COMMENT% It should never be empty, should it?
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getNamespaceType(final int nodeHandle)

  /**
   * Returns the namespace type of a specific node
   * @param nodeHandle the id of the node.
   * @return the ID of the namespace.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public String getNamespaceFromExpandedNameID(int expandedNameID)

  /**
   * Given an expanded-name ID, return the namespace URI part.
   *
   * @param expandedNameID an ID that represents an expanded-name.
   * @return String URI value of this node's namespace, or null if no
   * namespace was resolved.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public String getLocalNameFromExpandedNameID(int expandedNameID)

  /**
   * Given an expanded-name ID, return the local name part.
   *
   * @param expandedNameID an ID that represents an expanded-name.
   * @return String Local name of this node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getExpandedTypeID(String namespace, String localName, int type)

  /**
   * Given an expanded name, return an ID.  If the expanded-name does not
   * exist in the internal tables, the entry will be created, and the ID will
   * be returned.  Any additional nodes that are created that have this
   * expanded name will use this ID.
   *
   * @param type The simple type, i.e. one of ELEMENT, ATTRIBUTE, etc.
   *
   * @param namespace The namespace URI, which may be null, may be an empty
   *                  string (which will be the same as null), or may be a
   *                  namespace URI.
   * @param localName The local name string, which must be a valid
   *                  <a href="http://www.w3.org/TR/REC-xml-names/">NCName</a>.
   *
   * @return the expanded-name id of the node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getExpandedTypeID(int nodeHandle)

  /**
   * Given a node handle, return an ID that represents the node's expanded name.
   *
   * @param nodeHandle The handle to the node in question.
   *
   * @return the expanded-name id of the node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public char[] getStringValueChunk(int nodeHandle, int chunkIndex,
                                    int[] startAndLen)

  /**
   * Get a character array chunk in the string-value of a node.
   * (see http://www.w3.org/TR/xpath#data-model
   * for the definition of a node's string-value).
   * Note that a single text node may have multiple text chunks.
   *
   * @param nodeHandle The node ID.
   * @param chunkIndex Which chunk to get.
   * @param startAndLen An array of 2 where the start position and length of
   *                    the chunk will be returned.
   *
   * @return The character array reference where the chunk occurs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getStringValueChunkCount(int nodeHandle)

  /**
   * Get number of character array chunks in
   * the string-value of a node.
   * (see http://www.w3.org/TR/xpath#data-model
   * for the definition of a node's string-value).
   * Note that a single text node may have multiple text chunks.
   *
   * @param nodeHandle The node ID.
   *
   * @return number of character array chunks in
   *         the string-value of a node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract XMLString getStringValue(int nodeHandle);

  /**
   * Get the string-value of a node as a String object
   * (see http://www.w3.org/TR/xpath#data-model
   * for the definition of a node's string-value).
   *
   * @param nodeHandle The node ID.
   *
   * @return A string object that represents the string-value of the given node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getDocumentRoot(int nodeHandle)

  /**
   * Given a node handle, find the owning document node.  Unlike the DOM,
   * this considers the owningDocument of a Document to be itself.
   *
   * @param nodeHandle the id of the node.
   * @return int Node handle of owning document, or the nodeHandle if it is
   *             a Document.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getOwnerDocument(int nodeHandle)

  /**
   * Given a node handle, find the owning document node.  This has the exact
   * same semantics as the DOM Document method of the same name, in that if
   * the nodeHandle is a document node, it will return NULL.
   *
   * <p>%REVIEW% Since this is DOM-specific, it may belong at the DOM
   * binding layer. Included here as a convenience function and to
   * aid porting of DOM code to DTM.</p>
   *
   * @param nodeHandle the id of the node.
   * @return int Node handle of owning document, or -1 if the node was a Docment
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getDocument()

  /**
   * Find the Document node handle for the document currently under construction.
   * PLEASE NOTE that most people should use getOwnerDocument(nodeHandle) instead;
   * this version of the operation is primarily intended for use during negotiation
   * with the DTM Manager.
   *
   *  @return int Node handle of document, which should always be valid.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getParent(int nodeHandle)

  /**
   * Given a node handle, find its parent node.
   *
   * @param nodeHandle the id of the node.
   * @return int Node-number of parent,
   * or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getNextNamespaceNode(int baseHandle, int nodeHandle,
                                  boolean inScope)

  /**
   * Given a namespace handle, advance to the next namespace.
   *
   * @param baseHandle handle to original node from where the first namespace
   * was relative to (needed to return nodes in document order).
   * @param nodeHandle A namespace handle for which we will find the next node.
   * @param inScope true if all namespaces that are in scope should be processed,
   * otherwise just process the nodes in the given element handle.
   * @return handle of next namespace, or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getFirstNamespaceNode(int nodeHandle, boolean inScope)

  /**
   * Given a node handle, get the index of the node's first child.
   * If not yet resolved, waits for more nodes to be added to the document and
   * tries again
   *
   * @param nodeHandle handle to node, which should probably be an element
   *                   node, but need not be.
   *
   * @param inScope    true if all namespaces in scope should be returned,
   *                   false if only the namespace declarations should be
   *                   returned.
   * @return handle of first namespace, or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int findInSortedSuballocatedIntVector(SuballocatedIntVector vector, int lookfor)

  /**
     * Subroutine: Locate the specified node within
     * m_namespaceDeclSetElements, or the last element which
     * preceeds it in document order
     *
     * %REVIEW% Inlne this into findNamespaceContext? Create SortedSuballocatedIntVector type?
     *
     * @return If positive or zero, the index of the found item.
     * If negative, index of the point at which it would have appeared,
     * encoded as -1-index and hence reconvertable by subtracting
     * it from -1. (Encoding because I don't want to recompare the strings
     * but don't want to burn bytes on a datatype to hold a flagged value.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected SuballocatedIntVector findNamespaceContext(int elementNodeIndex)

  /** Retrieve list of namespace declaration locations
     * active at this node. List is an SuballocatedIntVector whose
     * entries are the namespace node HANDLES declared at that ID.
     *
     * %REVIEW% Directly managed arrays rather than vectors?
     * %REVIEW% Handles or IDs? Given usage, I think handles.
     * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected void declareNamespaceInContext(int elementNodeIndex,int namespaceNodeIndex)

  /** Build table of namespace declaration
   * locations during DTM construction. Table is a Vector of
   * SuballocatedIntVectors containing the namespace node HANDLES declared at
   * that ID, plus an SuballocatedIntVector of the element node INDEXES at which
   * these declarations appeared.
   *
   * NOTE: Since this occurs during model build, nodes will be encountered
   * in doucment order and thus the table will be ordered by element,
   * permitting binary-search as a possible retrieval optimization.
   *
   * %REVIEW% Directly managed arrays rather than vectors?
   * %REVIEW% Handles or IDs? Given usage, I think handles.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  private Vector m_namespaceLists = null;  // on demand

  /** Lazily created namespace lists. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int getNextAttributeIdentity(int identity) {

  /**
   * Given a node identity for an attribute, advance to the next attribute.
   *
   * @param identity int identity of the attribute node.  This
   * <strong>must</strong> be an attribute node.
   *
   * @return int DTM node-identity of the resolved attr,
   * or DTM.NULL to indicate none exists.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getNextAttribute(int nodeHandle) {

  /**
   * Given a node handle, advance to the next attribute.
   * If an attr, we advance to
   * the next attr on the same node.  If not an attribute, we return NULL.
   *
   * @param nodeHandle int Handle of the node.
   * @return int DTM node-number of the resolved attr,
   * or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getPreviousSibling(int nodeHandle)

  /**
   * Given a node handle, find its preceeding sibling.
   * WARNING: DTM is asymmetric; this operation is resolved by search, and is
   * relatively expensive.
   *
   * @param nodeHandle the id of the node.
   * @return int Node-number of the previous sib,
   * or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getTypedNextSibling(int nodeHandle, int nodeType)

  /**
   * Given a node handle, advance to its next sibling.
   * If not yet resolved, waits for more nodes to be added to the document and
   * tries again.
   * @param nodeHandle int Handle of the node.
   * @return int Node-number of next sibling,
   * or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getNextSibling(int nodeHandle)

  /**
   * Given a node handle, advance to its next sibling.
   * If not yet resolved, waits for more nodes to be added to the document and
   * tries again.
   * @param nodeHandle int Handle of the node.
   * @return int Node-number of next sibling,
   * or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int getTypedAttribute(int nodeHandle, int attType) {

  /**
   * Given a node handle and an expanded type ID, get the index of the node's
   * attribute of that type, if any.
   *
   * @param nodeHandle int Handle of the node.
   * @param attType int expanded type ID of the required attribute.
   * @return Handle of attribute of the required type, or DTM.NULL to indicate
   * none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int getFirstAttributeIdentity(int identity) {

  /**
   * Given a node identity, get the index of the node's first attribute.
   *
   * @param identity int identity of the node.
   * @return Identity of first attribute, or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getFirstAttribute(int nodeHandle)

  /**
   * Given a node handle, get the index of the node's first attribute.
   *
   * @param nodeHandle int Handle of the node.
   * @return Handle of first attribute, or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public abstract int getAttributeNode(int nodeHandle, String namespaceURI,
                                       String name);

  /**
   * Retrieves an attribute node by by qualified name and namespace URI.
   *
   * @param nodeHandle int Handle of the node upon which to look up this attribute..
   * @param namespaceURI The namespace URI of the attribute to
   *   retrieve, or null.
   * @param name The local name of the attribute to
   *   retrieve.
   * @return The attribute node handle with the specified name (
   *   <code>nodeName</code>) or <code>DTM.NULL</code> if there is no such
   *   attribute.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getLastChild(int nodeHandle)

  /**
   * Given a node handle, advance to its last child.
   * If not yet resolved, waits for more nodes to be added to the document and
   * tries again.
   *
   * @param nodeHandle int Handle of the node.
   * @return int Node-number of last child,
   * or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getTypedFirstChild(int nodeHandle, int nodeType)

  /**
   * Given a node handle, get the handle of the node's first child.
   * If not yet resolved, waits for more nodes to be added to the document and
   * tries again.
   *
   * @param nodeHandle int Handle of the node.
   * @return int DTM node-number of first child, or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public int getFirstChild(int nodeHandle)

  /**
   * Given a node handle, get the handle of the node's first child.
   * If not yet resolved, waits for more nodes to be added to the document and
   * tries again.
   *
   * @param nodeHandle int Handle of the node.
   * @return int DTM node-number of first child, or DTM.NULL to indicate none exists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  final public int makeNodeIdentity(int nodeHandle)

  /** Given a node handle, return a node identity. If extended addressing
   * has been used (multiple DTM IDs), we need to map the high bits of the
   * identity into the proper DTM ID and thence find the proper offset
   * to add to the low bits of the identity
   *
   * This has been made FINAL to facilitate inlining, since we do not expect
   * any subclass of DTMDefaultBase to ever change the algorithm. (I don't
   * really like doing so, and would love to have an excuse not to...)
   *
   * %OPT% Performance is critical for this operation.
   *
   * %REVIEW% Should this be exposed at the package/public layers?
   *
   * @param nodeHandle (external representation of node)
   * @return nodeIdentity Internal offset to this node's records.
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  final public int makeNodeHandle(int nodeIdentity)

  /** Given a node identity, return a node handle. If extended addressing
   * has been used (multiple DTM IDs), we need to map the high bits of the
   * identity into the proper DTM ID.
   *
   * This has been made FINAL to facilitate inlining, since we do not expect
   * any subclass of DTMDefaultBase to ever change the algorithm. (I don't
   * really like doing so, and would love to have an excuse not to...)
   *
   * %REVIEW% Is it worth trying to specialcase small documents?
   * %REVIEW% Should this be exposed at the package/public layers?
   *
   * @param nodeIdentity Internal offset to this node's records.
   * @return NodeHandle (external representation of node)
   * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public boolean hasChildNodes(int nodeHandle)

  /**
   * Given a node handle, test if it has child nodes.
   * <p> %REVIEW% This is obviously useful at the DOM layer, where it
   * would permit testing this without having to create a proxy
   * node. It's less useful in the DTM API, where
   * (dtm.getFirstChild(nodeHandle)!=DTM.NULL) is just as fast and
   * almost as self-evident. But it's a convenience, and eases porting
   * of DOM code to DTM.  </p>
   *
   * @param nodeHandle int Handle of the node.
   * @return int true if the given node has child nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public void setFeature(String featureId, boolean state){}

  /**
   * Set an implementation dependent feature.
   * <p>
   * %REVIEW% Do we really expect to set features on DTMs?
   *
   * @param featureId A feature URL.
   * @param state true if this feature should be on, false otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public String dumpNode(int nodeHandle)

  /**
   * Diagnostics function to dump a single node.
   *
   * %REVIEW% KNOWN GLITCH: If you pass it a node index rather than a
   * node handle, it works just fine... but the displayed identity
   * number before the colon is different, which complicates comparing
   * it with nodes printed the other way. We could always OR the DTM ID
   * into the value, to suppress that distinction...
   *
   * %REVIEW% This might want to be moved up to DTMDefaultBase, or possibly
   * DTM itself, since it's a useful diagnostic and uses only DTM's public
   * APIs.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public void dumpDTM(OutputStream os)

  /**
   * Diagnostics function to dump the DTM.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int _parent(int identity)

  /**
   * Get the parent for the given node identity.
   *
   * @param identity The node identity.
   *
   * @return The parent identity, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int _prevsib(int identity)

  /**
   * Get the previous sibling for the given node identity.
   *
   * @param identity The node identity.
   *
   * @return The previous sibling identity, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int _nextsib(int identity)

  /**
   * Get the next sibling for the given node identity.
   *
   * @param identity The node identity.
   *
   * @return The next sibling identity, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int _firstch(int identity)

  /**
   * Get the first child for the given node identity.
   *
   * @param identity The node identity.
   *
   * @return The first child identity, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int _level(int identity)

  /**
   * Get the level in the tree for the given node identity.
   *
   * @param identity The node identity.
   *
   * @return The tree level, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int _exptype(int identity)

  /**
   * Get the expanded type ID for the given node identity.
   *
   * @param identity The node identity.
   *
   * @return The expanded type ID, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected short _type(int identity)

  /**
   * Get the simple type ID for the given node identity.
   *
   * @param identity The node identity.
   *
   * @return The simple type ID, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
//    protected void ensureSize(int index)

//    /**
//     * Ensure that the size of the information arrays can hold another entry
//     * at the given index.
//     *
//     * @param index On exit from this function, the information arrays sizes must be
//     * at least index+1.
//     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected DTMAxisTraverser[] m_traversers;

  /** Stateless axis traversers, lazely built. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected abstract int getNumberOfNodes();

  /**
   * Get the number of nodes that have been added.
   *
   * @return the number of nodes that have been mapped.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected abstract boolean nextNode();

  /**
   * This method should try and build one or more nodes in the table.
   *
   * @return The true if a next node is found or false if
   *         there are no more nodes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected abstract int getNextNodeIdentity(int identity);

  /**
   * Get the next node identity value in the list, and call the iterator
   * if it hasn't been added yet.
   *
   * @param identity The node identity (index).
   * @return identity+1, or DTM.NULL.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  int findElementFromIndex(int nsIndex, int lnIndex, int firstPotential)

  /**
   * Find the first matching element from the index at or after the
   * given node.
   *
   * @param nsIndex The namespace index lookup.
   * @param lnIndex The local name index lookup.
   * @param firstPotential The first potential match that is worth looking at.
   *
   * @return The first node that is greater than or equal to the
   *         firstPotential argument, or DTM.NOTPROCESSED if not found.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int findGTE(int[] list, int start, int len, int value)

  /**
   * Find the first index that occurs in the list that is greater than or
   * equal to the given value.
   *
   * @param list A list of integers.
   * @param start The start index to begin the search.
   * @param len The number of items to search.
   * @param value Find the slot that has a value that is greater than or
   * identical to this argument.
   *
   * @return The index in the list of the slot that is higher or identical
   * to the identity argument, or -1 if no node is higher or equal.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected void indexNode(int expandedTypeID, int identity)

  /**
   * Add a node to the element indexes. The node will not be added unless
   * it's an element.
   *
   * @param expandedTypeID The expanded type ID of the node.
   * @param identity The node identity index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected void ensureSizeOfIndex(int namespaceID, int LocalNameID)

  /**
   * Ensure that the size of the element indexes can hold the information.
   *
   * @param namespaceID Namespace ID index.
   * @param LocalNameID Local name ID.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public DTMDefaultBase(DTMManager mgr, Source source, int dtmIdentity,
                        DTMWSFilter whiteSpaceFilter,
                        XMLStringFactory xstringfactory, boolean doIndexing,
                        int blocksize, boolean usePrevsib,
                        boolean newNameTable)

  /**
   * Construct a DTMDefaultBase object from a DOM node.
   *
   * @param mgr The DTMManager who owns this DTM.
   * @param source The object that is used to specify the construction source.
   * @param dtmIdentity The DTM identity ID for this DTM.
   * @param whiteSpaceFilter The white space filter for this DTM, which may
   *                         be null.
   * @param xstringfactory The factory to use for creating XMLStrings.
   * @param doIndexing true if the caller considers it worth it to use
   *                   indexing schemes.
   * @param blocksize The block size of the DTM.
   * @param usePrevsib true if we want to build the previous sibling node array.
   * @param newNameTable true if we want to use a new ExpandedNameTable for this DTM.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public DTMDefaultBase(DTMManager mgr, Source source, int dtmIdentity,
                        DTMWSFilter whiteSpaceFilter,
                        XMLStringFactory xstringfactory, boolean doIndexing)

  /**
   * Construct a DTMDefaultBase object using the default block size.
   *
   * @param mgr The DTMManager who owns this DTM.
   * @param source The object that is used to specify the construction source.
   * @param dtmIdentity The DTM identity ID for this DTM.
   * @param whiteSpaceFilter The white space filter for this DTM, which may
   *                         be null.
   * @param xstringfactory The factory to use for creating XMLStrings.
   * @param doIndexing true if the caller considers it worth it to use
   *                   indexing schemes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected boolean m_indexing;

  /** true if indexing is turned on. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected ExpandedNameTable m_expandedNameTable;

  /**
   * The table for exandedNameID lookups.  This may or may not be the same
   * table as is contained in the DTMManagerDefault.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected XMLStringFactory m_xstrf;

  /** The XMLString factory for creating XMLStrings. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected BoolStack m_shouldStripWhitespaceStack;

  /** Stack of flags indicating whether to strip whitespace nodes */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected boolean m_shouldStripWS = false;

  /** Flag indicating whether to strip whitespace nodes */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected DTMWSFilter m_wsfilter;

  /**
   * The whitespace filter that enables elements to strip whitespace or not.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected String m_documentBaseURI;

  /** The base URI for this document. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  //protected final static int m_mask = DTMManager.IDENT_NODE_DEFAULT;

  /** The mask for the identity.
      %REVIEW% Should this really be set to the _DEFAULT? What if
      a particular DTM wanted to use another value? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected SuballocatedIntVector m_dtmIdent;

  /** The document identity number(s). If we have overflowed the addressing
   * range of the first that was assigned to us, we may add others. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected DTMManagerDefault m_mgrDefault=null;

  /**
   * m_mgr cast to DTMManagerDefault, or null if it isn't an instance
   * (Efficiency hook)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public DTMManager m_mgr;

  /**
   * The DTM manager who "owns" this DTM.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected static final int NOTPROCESSED = DTM.NULL - 1;

  /**
   * The value to use when the information has not been built yet.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  //protected final int m_blocksize;

  /** The block size of the node arrays */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public static final int DEFAULT_NUMBLOCKS_SMALL = 4;

  /** The number of blocks used for small documents & RTFs */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public static final int DEFAULT_NUMBLOCKS = 32;

  /** The number of blocks for the node arrays */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public static final int DEFAULT_BLOCKSIZE = 512;  // favor small docs.

  /** The default block size of the node arrays */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int[][][] m_elemIndexes;

  /**
   * These hold indexes to elements based on namespace and local name.
   * The base lookup is the the namespace.  The second lookup is the local
   * name, and the last array contains the the first free element
   * at the start, and the list of element handles following.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected SuballocatedIntVector m_namespaceDeclSetElements = null;

  /** SuballocatedIntVector  of elements at which corresponding
   * namespaceDeclSets were defined */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected Vector m_namespaceDeclSets = null;

  /** Vector of SuballocatedIntVectors of NS decl sets */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected SuballocatedIntVector m_parent;

  /** Previous sibling values, one array element for each node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected SuballocatedIntVector m_prevsib;

  /** Previous sibling values, one array element for each node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected SuballocatedIntVector m_nextsib;

  /** Next sibling values, one array element for each node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected SuballocatedIntVector m_firstch;

  /** First child values, one array element for each node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected SuballocatedIntVector m_exptype;

  /** The expanded names, one array element for each node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  protected int m_size = 0;

  /**
   * The number of nodes, which is also used to determine the next
   *  node index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
  public static final int ROOTNODE = 0;

  /** The identity of the root node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBase.java
public abstract class DTMDefaultBase implements DTM

/**
 * The <code>DTMDefaultBase</code> class serves as a helper base for DTMs.
 * It sets up structures for navigation and type, while leaving data
 * management and construction to the derived classes.
 */
