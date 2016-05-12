_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/orbutil/ORBConstants.java

    //***************** Constants for Logging ****************

    public static final String LOG_LEVEL_PROPERTY               = SUN_PREFIX + "ORBLogLevel";

    public static final String LOG_RESOURCE_FILE                =
        "com.sun.corba.se.impl.logging.LogStrings";

    // Constants for initial references *************************************************************

    public static final String TRANSIENT_NAME_SERVICE_NAME = "TNameService" ;
    public static final String PERSISTENT_NAME_SERVICE_NAME = "NameService" ;

    // A large Number to make sure that other ServerIds doesn't collide
    // with NameServer Persistent Server Id
    public static final String NAME_SERVICE_SERVER_ID   = "1000000" ;

    public static final String ROOT_POA_NAME            = "RootPOA" ;
    public static final String POA_CURRENT_NAME         = "POACurrent" ;
    public static final String SERVER_ACTIVATOR_NAME    = "ServerActivator" ;
    public static final String SERVER_LOCATOR_NAME      = "ServerLocator" ;
    public static final String SERVER_REPOSITORY_NAME   = "ServerRepository" ;
    public static final String INITIAL_NAME_SERVICE_NAME= "InitialNameService" ;
    public static final String TRANSACTION_CURRENT_NAME = "TransactionCurrent" ;
    public static final String DYN_ANY_FACTORY_NAME     = "DynAnyFactory" ;

    // New for Portable Interceptors
    public static final String PI_CURRENT_NAME          = "PICurrent" ;
    public static final String CODEC_FACTORY_NAME       = "CodecFactory" ;

    // Constants for ORBD DB ***********************************************************************

    public static final String DEFAULT_DB_DIR       = "orb.db" ;
    public static final String DEFAULT_DB_NAME      = "db" ;
    public static final String INITIAL_ORB_DB       = "initial.db" ;
    public static final String SERVER_LOG_DIR       = "logs" ;
    public static final String ORBID_DIR_BASE       = "orbids" ;
    public static final String ORBID_DB_FILE_NAME   = "orbids.db" ;

    // Constants for ThreadPool ********************************************************************

    // Default value for when inactive threads in the pool can stop running (ms)
    public static final int DEFAULT_INACTIVITY_TIMEOUT = 120000;
    // Default name of the threadpool
    public static final String THREADPOOL_DEFAULT_NAME = "default-threadpool";
    // Default name of the workqueue
    public static final String WORKQUEUE_DEFAULT_NAME = "default-workqueue";

    // Constants for minor code bases **************************************************************
    // This is the value that pre-Merlin Sun ORBs incorrectly used.  We preserve this
    // here for backwards compatibility, but note that the current ORB must never
    // create a BAD_PARAM system exception with this minor code.
    public static final int LEGACY_SUN_NOT_SERIALIZABLE = SUNVMCID.value + 1 ;

    // Code Set related *******************************************************

    // If we don't always send the code set context, there's a possibility
    // of failure when fragments of a smaller request are interleved with
    // those of a first request with other large service contexts.
    //
    public static final boolean DEFAULT_ALWAYS_SEND_CODESET_CTX = true;
    public static final String ALWAYS_SEND_CODESET_CTX_PROPERTY
        = SUN_PREFIX + "codeset.AlwaysSendCodeSetCtx";

    // Use byte order markers in streams when applicable?  This won't apply to
    // GIOP 1.1 due to limitations in the CDR encoding.
    public static final boolean DEFAULT_USE_BYTE_ORDER_MARKERS = true;
    public static final String USE_BOMS = SUN_PREFIX + "codeset.UseByteOrderMarkers";

    // Use byte order markers in encapsulations when applicable?
    public static final boolean DEFAULT_USE_BYTE_ORDER_MARKERS_IN_ENCAPS = false;
    public static final String USE_BOMS_IN_ENCAPS = SUN_PREFIX + "codeset.UseByteOrderMarkersInEncaps";

    // The CHAR_CODESETS and WCHAR_CODESETS allow the user to override the default
    // connection code sets.  The value should be a comma separated list of OSF
    // registry numbers.  The first number in the list will be the native code
    // set.
    //
    // Number can be specified as hex if preceded by 0x, otherwise they are
    // interpreted as decimal.
    //
    // Code sets that we accept currently (see core/OSFCodeSetRegistry):
    //
    // char/string:
    //
    // ISO8859-1 (Latin-1)     0x00010001
    // ISO646 (ASCII)          0x00010020
    // UTF-8                   0x05010001
    //
    // wchar/string:
    //
    // UTF-16                  0x00010109
    // UCS-2                   0x00010100
    // UTF-8                   0x05010001
    //
    // Note:  The ORB will let you assign any of the above values to
    // either of the following properties, but the above assignments
    // are the only ones that won't get you into trouble.
    public static final String CHAR_CODESETS = SUN_PREFIX + "codeset.charsets";
    public static final String WCHAR_CODESETS = SUN_PREFIX + "codeset.wcharsets";

    // Constants to make stream format version code easier to read
    public static final byte STREAM_FORMAT_VERSION_1 = (byte)1;
    public static final byte STREAM_FORMAT_VERSION_2 = (byte)2;
}

_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/orbutil/ORBConstants.java

    //***************** Constants for Logging ****************

    public static final String LOG_LEVEL_PROPERTY               = SUN_PREFIX + "ORBLogLevel";

    public static final String LOG_RESOURCE_FILE                =
        "com.sun.corba.se.impl.logging.LogStrings";

    // Constants for initial references *************************************************************

    public static final String TRANSIENT_NAME_SERVICE_NAME = "TNameService" ;
    public static final String PERSISTENT_NAME_SERVICE_NAME = "NameService" ;

    // A large Number to make sure that other ServerIds doesn't collide
    // with NameServer Persistent Server Id
    public static final String NAME_SERVICE_SERVER_ID   = "1000000" ;

    public static final String ROOT_POA_NAME            = "RootPOA" ;
    public static final String POA_CURRENT_NAME         = "POACurrent" ;
    public static final String SERVER_ACTIVATOR_NAME    = "ServerActivator" ;
    public static final String SERVER_LOCATOR_NAME      = "ServerLocator" ;
    public static final String SERVER_REPOSITORY_NAME   = "ServerRepository" ;
    public static final String INITIAL_NAME_SERVICE_NAME= "InitialNameService" ;
    public static final String TRANSACTION_CURRENT_NAME = "TransactionCurrent" ;
    public static final String DYN_ANY_FACTORY_NAME     = "DynAnyFactory" ;

    // New for Portable Interceptors
    public static final String PI_CURRENT_NAME          = "PICurrent" ;
    public static final String CODEC_FACTORY_NAME       = "CodecFactory" ;

    // Constants for ORBD DB ***********************************************************************

    public static final String DEFAULT_DB_DIR       = "orb.db" ;
    public static final String DEFAULT_DB_NAME      = "db" ;
    public static final String INITIAL_ORB_DB       = "initial.db" ;
    public static final String SERVER_LOG_DIR       = "logs" ;
    public static final String ORBID_DIR_BASE       = "orbids" ;
    public static final String ORBID_DB_FILE_NAME   = "orbids.db" ;

    // Constants for ThreadPool ********************************************************************

    // Default value for when inactive threads in the pool can stop running (ms)
    public static final int DEFAULT_INACTIVITY_TIMEOUT = 120000;
    // Default name of the threadpool
    public static final String THREADPOOL_DEFAULT_NAME = "default-threadpool";
    // Default name of the workqueue
    public static final String WORKQUEUE_DEFAULT_NAME = "default-workqueue";

    // Constants for minor code bases **************************************************************
    // This is the value that pre-Merlin Sun ORBs incorrectly used.  We preserve this
    // here for backwards compatibility, but note that the current ORB must never
    // create a BAD_PARAM system exception with this minor code.
    public static final int LEGACY_SUN_NOT_SERIALIZABLE = SUNVMCID.value + 1 ;

    // Code Set related *******************************************************

    // If we don't always send the code set context, there's a possibility
    // of failure when fragments of a smaller request are interleved with
    // those of a first request with other large service contexts.
    //
    public static final boolean DEFAULT_ALWAYS_SEND_CODESET_CTX = true;
    public static final String ALWAYS_SEND_CODESET_CTX_PROPERTY
        = SUN_PREFIX + "codeset.AlwaysSendCodeSetCtx";

    // Use byte order markers in streams when applicable?  This won't apply to
    // GIOP 1.1 due to limitations in the CDR encoding.
    public static final boolean DEFAULT_USE_BYTE_ORDER_MARKERS = true;
    public static final String USE_BOMS = SUN_PREFIX + "codeset.UseByteOrderMarkers";

    // Use byte order markers in encapsulations when applicable?
    public static final boolean DEFAULT_USE_BYTE_ORDER_MARKERS_IN_ENCAPS = false;
    public static final String USE_BOMS_IN_ENCAPS = SUN_PREFIX + "codeset.UseByteOrderMarkersInEncaps";

    // The CHAR_CODESETS and WCHAR_CODESETS allow the user to override the default
    // connection code sets.  The value should be a comma separated list of OSF
    // registry numbers.  The first number in the list will be the native code
    // set.
    //
    // Number can be specified as hex if preceded by 0x, otherwise they are
    // interpreted as decimal.
    //
    // Code sets that we accept currently (see core/OSFCodeSetRegistry):
    //
    // char/string:
    //
    // ISO8859-1 (Latin-1)     0x00010001
    // ISO646 (ASCII)          0x00010020
    // UTF-8                   0x05010001
    //
    // wchar/string:
    //
    // UTF-16                  0x00010109
    // UCS-2                   0x00010100
    // UTF-8                   0x05010001
    //
    // Note:  The ORB will let you assign any of the above values to
    // either of the following properties, but the above assignments
    // are the only ones that won't get you into trouble.
    public static final String CHAR_CODESETS = SUN_PREFIX + "codeset.charsets";
    public static final String WCHAR_CODESETS = SUN_PREFIX + "codeset.wcharsets";

    // Constants to make stream format version code easier to read
    public static final byte STREAM_FORMAT_VERSION_1 = (byte)1;
    public static final byte STREAM_FORMAT_VERSION_2 = (byte)2;
}

