_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp

////////////////////////////////////////////////////////////
/// \class sf::Ftp
/// \ingroup network
///
/// sf::Ftp is a very simple FTP client that allows you
/// to communicate with a FTP server. The FTP protocol allows
/// you to manipulate a remote file system (list files,
/// upload, download, create, remove, ...).
///
/// Using the FTP client consists of 4 parts:
/// \li Connecting to the FTP server
/// \li Logging in (either as a registered user or anonymously)
/// \li Sending commands to the server
/// \li Disconnecting (this part can be done implicitely by the destructor)
///
/// Every command returns a FTP response, which contains the
/// status code as well as a message from the server. Some
/// commands such as getWorkingDirectory and getDirectoryListing
/// return additional data, and use a class derived from
/// sf::Ftp::Response to provide this data.
///
/// All commands, especially upload and download, may take some
/// time to complete. This is important to know if you don't want
/// to block your application while the server is completing
/// the task.
///
/// Usage example:
/// \code
/// // Create a new FTP client
/// sf::Ftp ftp;
///
/// // Connect to the server
/// sf::Ftp::Response response = ftp.connect("ftp://ftp.myserver.com");
/// if (response.isOk())
///     std::cout << "Connected" << std::endl;
///
/// // Log in
/// response = ftp.login("laurent", "dF6Zm89D");
/// if (response.isOk())
///     std::cout << "Logged in" << std::endl;
///
/// // Print the working directory
/// sf::Ftp::DirectoryResponse directory = ftp.getWorkingDirectory();
/// if (directory.isOk())
///     std::cout << "Working directory: " << directory.getDirectory() << std::endl;
///
/// // Create a new directory
/// response = ftp.createDirectory("files");
/// if (response.isOk())
///     std::cout << "Created new directory" << std::endl;
///
/// // Upload a file to this new directory
/// response = ftp.upload("local-path/file.txt", "files", sf::Ftp::Ascii);
/// if (response.isOk())
///     std::cout << "File uploaded" << std::endl;
///
/// // Disconnect from the server (optional)
/// ftp.disconnect();
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
};

    ////////////////////////////////////////////////////////////
    TcpSocket m_commandSocket; ///< Socket holding the control connection with the server
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class DataChannel;

    ////////////////////////////////////////////////////////////
    /// \brief Utility class for exchanging datas with the server
    ///        on the data channel
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response getResponse();

    ////////////////////////////////////////////////////////////
    /// \brief Receive a response from the server
    ///
    /// This function must be called after each call to
    /// SendCommand that expects a response.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response sendCommand(const std::string& command, const std::string& parameter = "");

    ////////////////////////////////////////////////////////////
    /// \brief Send a command to the FTP server
    ///
    /// \param command   Command to send
    /// \param parameter Command parameter
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response upload(const std::string& localFile, const std::string& remotePath, TransferMode mode = Binary);

    ////////////////////////////////////////////////////////////
    /// \brief Upload a file to the server
    ///
    /// The name of the local file is relative to the current
    /// working directory of your application, and the
    /// remote path is relative to the current directory of the
    /// FTP server.
    ///
    /// \param localFile  Path of the local file to upload
    /// \param remotePath Where to put to file on the server
    /// \param mode       Transfer mode
    ///
    /// \return Server response to the request
    ///
    /// \see download
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response download(const std::string& remoteFile, const std::string& localPath, TransferMode mode = Binary);

    ////////////////////////////////////////////////////////////
    /// \brief Download a file from the server
    ///
    /// The filename of the distant file is relative to the
    /// current working directory of the server, and the local
    /// destination path is relative to the current directory
    /// of your application.
    ///
    /// \param remoteFile Filename of the distant file to download
    /// \param localPath  Where to put to file on the local computer
    /// \param mode       Transfer mode
    ///
    /// \return Server response to the request
    ///
    /// \see upload
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response deleteFile(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Remove an existing file
    ///
    /// The file name must be relative to the current working
    /// directory.
    /// Use this function with caution, the file will be
    /// removed permanently!
    ///
    /// \param name File to remove
    ///
    /// \return Server response to the request
    ///
    /// \see renameFile
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response renameFile(const std::string& file, const std::string& newName);

    ////////////////////////////////////////////////////////////
    /// \brief Rename an existing file
    ///
    /// The filenames must be relative to the current working
    /// directory.
    ///
    /// \param file    File to rename
    /// \param newName New name of the file
    ///
    /// \return Server response to the request
    ///
    /// \see deleteFile
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response deleteDirectory(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Remove an existing directory
    ///
    /// The directory to remove must be relative to the
    /// current working directory.
    /// Use this function with caution, the directory will
    /// be removed permanently!
    ///
    /// \param name Name of the directory to remove
    ///
    /// \return Server response to the request
    ///
    /// \see createDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response createDirectory(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Create a new directory
    ///
    /// The new directory is created as a child of the current
    /// working directory.
    ///
    /// \param name Name of the directory to create
    ///
    /// \return Server response to the request
    ///
    /// \see deleteDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response parentDirectory();

    ////////////////////////////////////////////////////////////
    /// \brief Go to the parent directory of the current one
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, getDirectoryListing, changeDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response changeDirectory(const std::string& directory);

    ////////////////////////////////////////////////////////////
    /// \brief Change the current working directory
    ///
    /// The new directory must be relative to the current one.
    ///
    /// \param directory New working directory
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, getDirectoryListing, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    ListingResponse getDirectoryListing(const std::string& directory = "");

    ////////////////////////////////////////////////////////////
    /// \brief Get the contents of the given directory
    ///
    /// This function retrieves the sub-directories and files
    /// contained in the given directory. It is not recursive.
    /// The \a directory parameter is relative to the current
    /// working directory.
    ///
    /// \param directory Directory to list
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, changeDirectory, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    DirectoryResponse getWorkingDirectory();

    ////////////////////////////////////////////////////////////
    /// \brief Get the current working directory
    ///
    /// The working directory is the root path for subsequent
    /// operations involving directories and/or filenames.
    ///
    /// \return Server response to the request
    ///
    /// \see getDirectoryListing, changeDirectory, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response keepAlive();

    ////////////////////////////////////////////////////////////
    /// \brief Send a null command to keep the connection alive
    ///
    /// This command is useful because the server may close the
    /// connection automatically if no command is sent.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response login(const std::string& name, const std::string& password);

    ////////////////////////////////////////////////////////////
    /// \brief Log in using a username and a password
    ///
    /// Logging in is mandatory after connecting to the server.
    /// Users that are not logged in cannot perform any operation.
    ///
    /// \param name     User name
    /// \param password Password
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response login();

    ////////////////////////////////////////////////////////////
    /// \brief Log in using an anonymous account
    ///
    /// Logging in is mandatory after connecting to the server.
    /// Users that are not logged in cannot perform any operation.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response disconnect();

    ////////////////////////////////////////////////////////////
    /// \brief Close the connection with the server
    ///
    /// \return Server response to the request
    ///
    /// \see connect
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response connect(const IpAddress& server, unsigned short port = 21, Time timeout = Time::Zero);

    ////////////////////////////////////////////////////////////
    /// \brief Connect to the specified FTP server
    ///
    /// The port has a default value of 21, which is the standard
    /// port used by the FTP protocol. You shouldn't use a different
    /// value, unless you really know what you do.
    /// This function tries to connect to the server so it may take
    /// a while to complete, especially if the server is not
    /// reachable. To avoid blocking your application for too long,
    /// you can use a timeout. The default value, Time::Zero, means that the
    /// system timeout will be used (which is usually pretty long).
    ///
    /// \param server  Name or address of the FTP server to connect to
    /// \param port    Port used for the connection
    /// \param timeout Maximum time to wait
    ///
    /// \return Server response to the request
    ///
    /// \see disconnect
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    ~Ftp();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// Automatically closes the connection with the server if
    /// it is still opened.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        std::vector<std::string> m_listing; ///< Directory/file names extracted from the data
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::vector<std::string>& getListing() const;

        ////////////////////////////////////////////////////////////
        /// \brief Return the array of directory/file names
        ///
        /// \return Array containing the requested listing
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        ListingResponse(const Response& response, const std::vector<char>& data);

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// \param response  Source response
        /// \param data      Data containing the raw listing
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API ListingResponse : public Response

    ////////////////////////////////////////////////////////////
    /// \brief Specialization of FTP response returning a
    ///        filename lisiting
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        std::string m_directory; ///< Directory extracted from the response message
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::string& getDirectory() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the directory returned in the response
        ///
        /// \return Directory name
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        DirectoryResponse(const Response& response);

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// \param response Source response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API DirectoryResponse : public Response

    ////////////////////////////////////////////////////////////
    /// \brief Specialization of FTP response returning a directory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        Status      m_status;  ///< Status code returned from the server
        std::string m_message; ///< Last message received from the server
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::string& getMessage() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the full message contained in the response
        ///
        /// \return The response message
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        Status getStatus() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the status code of the response
        ///
        /// \return Status code
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        bool isOk() const;

        ////////////////////////////////////////////////////////////
        /// \brief Check if the status code means a success
        ///
        /// This function is defined for convenience, it is
        /// equivalent to testing if the status code is < 400.
        ///
        /// \return True if the status is a success, false if it is a failure
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        explicit Response(Status code = InvalidResponse, const std::string& message = "");

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// This constructor is used by the FTP client to build
        /// the response.
        ///
        /// \param code    Response status code
        /// \param message Response message
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        };

            InvalidResponse  = 1000, ///< Response is not a valid FTP one
            ConnectionFailed = 1001, ///< Connection with server failed
            ConnectionClosed = 1002, ///< Connection with server closed
            InvalidFile      = 1003  ///< Invalid file to upload / download
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 10xx: SFML custom codes

            CommandUnknown          = 500, ///< Syntax error, command unrecognized
            ParametersUnknown       = 501, ///< Syntax error in parameters or arguments
            CommandNotImplemented   = 502, ///< Command not implemented
            BadCommandSequence      = 503, ///< Bad sequence of commands
            ParameterNotImplemented = 504, ///< Command not implemented for that parameter
            NotLoggedIn             = 530, ///< Not logged in
            NeedAccountToStore      = 532, ///< Need account for storing files
            FileUnavailable         = 550, ///< Requested action not taken, file unavailable
            PageTypeUnknown         = 551, ///< Requested action aborted, page type unknown
            NotEnoughMemory         = 552, ///< Requested file action aborted, exceeded storage allocation
            FilenameNotAllowed      = 553, ///< Requested action not taken, file name not allowed
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 5xx: the command was not accepted and

            ServiceUnavailable        = 421, ///< Service not available, closing control connection
            DataConnectionUnavailable = 425, ///< Can't open data connection
            TransferAborted           = 426, ///< Connection closed, transfer aborted
            FileActionAborted         = 450, ///< Requested file action not taken
            LocalError                = 451, ///< Requested action aborted, local error in processing
            InsufficientStorageSpace  = 452, ///< Requested action not taken; insufficient storage space in system, file unavailable
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 4xx: the command was not accepted and the requested action did not take place,

            NeedPassword       = 331, ///< User name ok, need password
            NeedAccountToLogIn = 332, ///< Need account for login
            NeedInformation    = 350, ///< Requested file action pending further information
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 3xx: the command has been accepted, but the requested action

            Ok                    = 200, ///< Command ok
            PointlessCommand      = 202, ///< Command not implemented
            SystemStatus          = 211, ///< System status, or system help reply
            DirectoryStatus       = 212, ///< Directory status
            FileStatus            = 213, ///< File status
            HelpMessage           = 214, ///< Help message
            SystemType            = 215, ///< NAME system type, where NAME is an official system name from the list in the Assigned Numbers document
            ServiceReady          = 220, ///< Service ready for new user
            ClosingConnection     = 221, ///< Service closing control connection
            DataConnectionOpened  = 225, ///< Data connection open, no transfer in progress
            ClosingDataConnection = 226, ///< Closing data connection, requested file action successful
            EnteringPassiveMode   = 227, ///< Entering passive mode
            LoggedIn              = 230, ///< User logged in, proceed. Logged out if appropriate
            FileActionOk          = 250, ///< Requested file action ok
            DirectoryOk           = 257, ///< PATHNAME created
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 2xx: the requested action has been successfully completed

            RestartMarkerReply          = 110, ///< Restart marker reply
            ServiceReadySoon            = 120, ///< Service ready in N minutes
            DataConnectionAlreadyOpened = 125, ///< Data connection already opened, transfer starting
            OpeningDataConnection       = 150, ///< File status ok, about to open data connection
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        enum Status

        ////////////////////////////////////////////////////////////
        /// \brief Status codes possibly returned by a FTP response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API Response

    ////////////////////////////////////////////////////////////
    /// \brief Define a FTP response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        Binary, ///< Binary mode (file is transfered as a sequence of bytes)
        Ascii,  ///< Text mode using ASCII encoding
        Ebcdic  ///< Text mode using EBCDIC encoding
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    enum TransferMode

    ////////////////////////////////////////////////////////////
    /// \brief Enumeration of transfer modes
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
class SFML_NETWORK_API Ftp : NonCopyable

////////////////////////////////////////////////////////////
/// \brief A FTP client
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
#ifndef SFML_FTP_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp

////////////////////////////////////////////////////////////
/// \class sf::Ftp
/// \ingroup network
///
/// sf::Ftp is a very simple FTP client that allows you
/// to communicate with a FTP server. The FTP protocol allows
/// you to manipulate a remote file system (list files,
/// upload, download, create, remove, ...).
///
/// Using the FTP client consists of 4 parts:
/// \li Connecting to the FTP server
/// \li Logging in (either as a registered user or anonymously)
/// \li Sending commands to the server
/// \li Disconnecting (this part can be done implicitely by the destructor)
///
/// Every command returns a FTP response, which contains the
/// status code as well as a message from the server. Some
/// commands such as getWorkingDirectory and getDirectoryListing
/// return additional data, and use a class derived from
/// sf::Ftp::Response to provide this data.
///
/// All commands, especially upload and download, may take some
/// time to complete. This is important to know if you don't want
/// to block your application while the server is completing
/// the task.
///
/// Usage example:
/// \code
/// // Create a new FTP client
/// sf::Ftp ftp;
///
/// // Connect to the server
/// sf::Ftp::Response response = ftp.connect("ftp://ftp.myserver.com");
/// if (response.isOk())
///     std::cout << "Connected" << std::endl;
///
/// // Log in
/// response = ftp.login("laurent", "dF6Zm89D");
/// if (response.isOk())
///     std::cout << "Logged in" << std::endl;
///
/// // Print the working directory
/// sf::Ftp::DirectoryResponse directory = ftp.getWorkingDirectory();
/// if (directory.isOk())
///     std::cout << "Working directory: " << directory.getDirectory() << std::endl;
///
/// // Create a new directory
/// response = ftp.createDirectory("files");
/// if (response.isOk())
///     std::cout << "Created new directory" << std::endl;
///
/// // Upload a file to this new directory
/// response = ftp.upload("local-path/file.txt", "files", sf::Ftp::Ascii);
/// if (response.isOk())
///     std::cout << "File uploaded" << std::endl;
///
/// // Disconnect from the server (optional)
/// ftp.disconnect();
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
};

    ////////////////////////////////////////////////////////////
    TcpSocket m_commandSocket; ///< Socket holding the control connection with the server
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class DataChannel;

    ////////////////////////////////////////////////////////////
    /// \brief Utility class for exchanging datas with the server
    ///        on the data channel
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response getResponse();

    ////////////////////////////////////////////////////////////
    /// \brief Receive a response from the server
    ///
    /// This function must be called after each call to
    /// SendCommand that expects a response.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response sendCommand(const std::string& command, const std::string& parameter = "");

    ////////////////////////////////////////////////////////////
    /// \brief Send a command to the FTP server
    ///
    /// \param command   Command to send
    /// \param parameter Command parameter
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response upload(const std::string& localFile, const std::string& remotePath, TransferMode mode = Binary);

    ////////////////////////////////////////////////////////////
    /// \brief Upload a file to the server
    ///
    /// The name of the local file is relative to the current
    /// working directory of your application, and the
    /// remote path is relative to the current directory of the
    /// FTP server.
    ///
    /// \param localFile  Path of the local file to upload
    /// \param remotePath Where to put to file on the server
    /// \param mode       Transfer mode
    ///
    /// \return Server response to the request
    ///
    /// \see download
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response download(const std::string& remoteFile, const std::string& localPath, TransferMode mode = Binary);

    ////////////////////////////////////////////////////////////
    /// \brief Download a file from the server
    ///
    /// The filename of the distant file is relative to the
    /// current working directory of the server, and the local
    /// destination path is relative to the current directory
    /// of your application.
    ///
    /// \param remoteFile Filename of the distant file to download
    /// \param localPath  Where to put to file on the local computer
    /// \param mode       Transfer mode
    ///
    /// \return Server response to the request
    ///
    /// \see upload
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response deleteFile(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Remove an existing file
    ///
    /// The file name must be relative to the current working
    /// directory.
    /// Use this function with caution, the file will be
    /// removed permanently!
    ///
    /// \param name File to remove
    ///
    /// \return Server response to the request
    ///
    /// \see renameFile
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response renameFile(const std::string& file, const std::string& newName);

    ////////////////////////////////////////////////////////////
    /// \brief Rename an existing file
    ///
    /// The filenames must be relative to the current working
    /// directory.
    ///
    /// \param file    File to rename
    /// \param newName New name of the file
    ///
    /// \return Server response to the request
    ///
    /// \see deleteFile
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response deleteDirectory(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Remove an existing directory
    ///
    /// The directory to remove must be relative to the
    /// current working directory.
    /// Use this function with caution, the directory will
    /// be removed permanently!
    ///
    /// \param name Name of the directory to remove
    ///
    /// \return Server response to the request
    ///
    /// \see createDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response createDirectory(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Create a new directory
    ///
    /// The new directory is created as a child of the current
    /// working directory.
    ///
    /// \param name Name of the directory to create
    ///
    /// \return Server response to the request
    ///
    /// \see deleteDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response parentDirectory();

    ////////////////////////////////////////////////////////////
    /// \brief Go to the parent directory of the current one
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, getDirectoryListing, changeDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response changeDirectory(const std::string& directory);

    ////////////////////////////////////////////////////////////
    /// \brief Change the current working directory
    ///
    /// The new directory must be relative to the current one.
    ///
    /// \param directory New working directory
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, getDirectoryListing, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    ListingResponse getDirectoryListing(const std::string& directory = "");

    ////////////////////////////////////////////////////////////
    /// \brief Get the contents of the given directory
    ///
    /// This function retrieves the sub-directories and files
    /// contained in the given directory. It is not recursive.
    /// The \a directory parameter is relative to the current
    /// working directory.
    ///
    /// \param directory Directory to list
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, changeDirectory, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    DirectoryResponse getWorkingDirectory();

    ////////////////////////////////////////////////////////////
    /// \brief Get the current working directory
    ///
    /// The working directory is the root path for subsequent
    /// operations involving directories and/or filenames.
    ///
    /// \return Server response to the request
    ///
    /// \see getDirectoryListing, changeDirectory, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response keepAlive();

    ////////////////////////////////////////////////////////////
    /// \brief Send a null command to keep the connection alive
    ///
    /// This command is useful because the server may close the
    /// connection automatically if no command is sent.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response login(const std::string& name, const std::string& password);

    ////////////////////////////////////////////////////////////
    /// \brief Log in using a username and a password
    ///
    /// Logging in is mandatory after connecting to the server.
    /// Users that are not logged in cannot perform any operation.
    ///
    /// \param name     User name
    /// \param password Password
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response login();

    ////////////////////////////////////////////////////////////
    /// \brief Log in using an anonymous account
    ///
    /// Logging in is mandatory after connecting to the server.
    /// Users that are not logged in cannot perform any operation.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response disconnect();

    ////////////////////////////////////////////////////////////
    /// \brief Close the connection with the server
    ///
    /// \return Server response to the request
    ///
    /// \see connect
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response connect(const IpAddress& server, unsigned short port = 21, Time timeout = Time::Zero);

    ////////////////////////////////////////////////////////////
    /// \brief Connect to the specified FTP server
    ///
    /// The port has a default value of 21, which is the standard
    /// port used by the FTP protocol. You shouldn't use a different
    /// value, unless you really know what you do.
    /// This function tries to connect to the server so it may take
    /// a while to complete, especially if the server is not
    /// reachable. To avoid blocking your application for too long,
    /// you can use a timeout. The default value, Time::Zero, means that the
    /// system timeout will be used (which is usually pretty long).
    ///
    /// \param server  Name or address of the FTP server to connect to
    /// \param port    Port used for the connection
    /// \param timeout Maximum time to wait
    ///
    /// \return Server response to the request
    ///
    /// \see disconnect
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    ~Ftp();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// Automatically closes the connection with the server if
    /// it is still opened.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        std::vector<std::string> m_listing; ///< Directory/file names extracted from the data
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::vector<std::string>& getListing() const;

        ////////////////////////////////////////////////////////////
        /// \brief Return the array of directory/file names
        ///
        /// \return Array containing the requested listing
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        ListingResponse(const Response& response, const std::vector<char>& data);

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// \param response  Source response
        /// \param data      Data containing the raw listing
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API ListingResponse : public Response

    ////////////////////////////////////////////////////////////
    /// \brief Specialization of FTP response returning a
    ///        filename lisiting
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        std::string m_directory; ///< Directory extracted from the response message
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::string& getDirectory() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the directory returned in the response
        ///
        /// \return Directory name
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        DirectoryResponse(const Response& response);

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// \param response Source response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API DirectoryResponse : public Response

    ////////////////////////////////////////////////////////////
    /// \brief Specialization of FTP response returning a directory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        Status      m_status;  ///< Status code returned from the server
        std::string m_message; ///< Last message received from the server
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::string& getMessage() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the full message contained in the response
        ///
        /// \return The response message
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        Status getStatus() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the status code of the response
        ///
        /// \return Status code
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        bool isOk() const;

        ////////////////////////////////////////////////////////////
        /// \brief Check if the status code means a success
        ///
        /// This function is defined for convenience, it is
        /// equivalent to testing if the status code is < 400.
        ///
        /// \return True if the status is a success, false if it is a failure
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        explicit Response(Status code = InvalidResponse, const std::string& message = "");

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// This constructor is used by the FTP client to build
        /// the response.
        ///
        /// \param code    Response status code
        /// \param message Response message
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        };

            InvalidResponse  = 1000, ///< Response is not a valid FTP one
            ConnectionFailed = 1001, ///< Connection with server failed
            ConnectionClosed = 1002, ///< Connection with server closed
            InvalidFile      = 1003  ///< Invalid file to upload / download
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 10xx: SFML custom codes

            CommandUnknown          = 500, ///< Syntax error, command unrecognized
            ParametersUnknown       = 501, ///< Syntax error in parameters or arguments
            CommandNotImplemented   = 502, ///< Command not implemented
            BadCommandSequence      = 503, ///< Bad sequence of commands
            ParameterNotImplemented = 504, ///< Command not implemented for that parameter
            NotLoggedIn             = 530, ///< Not logged in
            NeedAccountToStore      = 532, ///< Need account for storing files
            FileUnavailable         = 550, ///< Requested action not taken, file unavailable
            PageTypeUnknown         = 551, ///< Requested action aborted, page type unknown
            NotEnoughMemory         = 552, ///< Requested file action aborted, exceeded storage allocation
            FilenameNotAllowed      = 553, ///< Requested action not taken, file name not allowed
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 5xx: the command was not accepted and

            ServiceUnavailable        = 421, ///< Service not available, closing control connection
            DataConnectionUnavailable = 425, ///< Can't open data connection
            TransferAborted           = 426, ///< Connection closed, transfer aborted
            FileActionAborted         = 450, ///< Requested file action not taken
            LocalError                = 451, ///< Requested action aborted, local error in processing
            InsufficientStorageSpace  = 452, ///< Requested action not taken; insufficient storage space in system, file unavailable
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 4xx: the command was not accepted and the requested action did not take place,

            NeedPassword       = 331, ///< User name ok, need password
            NeedAccountToLogIn = 332, ///< Need account for login
            NeedInformation    = 350, ///< Requested file action pending further information
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 3xx: the command has been accepted, but the requested action

            Ok                    = 200, ///< Command ok
            PointlessCommand      = 202, ///< Command not implemented
            SystemStatus          = 211, ///< System status, or system help reply
            DirectoryStatus       = 212, ///< Directory status
            FileStatus            = 213, ///< File status
            HelpMessage           = 214, ///< Help message
            SystemType            = 215, ///< NAME system type, where NAME is an official system name from the list in the Assigned Numbers document
            ServiceReady          = 220, ///< Service ready for new user
            ClosingConnection     = 221, ///< Service closing control connection
            DataConnectionOpened  = 225, ///< Data connection open, no transfer in progress
            ClosingDataConnection = 226, ///< Closing data connection, requested file action successful
            EnteringPassiveMode   = 227, ///< Entering passive mode
            LoggedIn              = 230, ///< User logged in, proceed. Logged out if appropriate
            FileActionOk          = 250, ///< Requested file action ok
            DirectoryOk           = 257, ///< PATHNAME created
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 2xx: the requested action has been successfully completed

            RestartMarkerReply          = 110, ///< Restart marker reply
            ServiceReadySoon            = 120, ///< Service ready in N minutes
            DataConnectionAlreadyOpened = 125, ///< Data connection already opened, transfer starting
            OpeningDataConnection       = 150, ///< File status ok, about to open data connection
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        enum Status

        ////////////////////////////////////////////////////////////
        /// \brief Status codes possibly returned by a FTP response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API Response

    ////////////////////////////////////////////////////////////
    /// \brief Define a FTP response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        Binary, ///< Binary mode (file is transfered as a sequence of bytes)
        Ascii,  ///< Text mode using ASCII encoding
        Ebcdic  ///< Text mode using EBCDIC encoding
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    enum TransferMode

    ////////////////////////////////////////////////////////////
    /// \brief Enumeration of transfer modes
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
class SFML_NETWORK_API Ftp : NonCopyable

////////////////////////////////////////////////////////////
/// \brief A FTP client
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
#ifndef SFML_FTP_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp

////////////////////////////////////////////////////////////
/// \class sf::Ftp
/// \ingroup network
///
/// sf::Ftp is a very simple FTP client that allows you
/// to communicate with a FTP server. The FTP protocol allows
/// you to manipulate a remote file system (list files,
/// upload, download, create, remove, ...).
///
/// Using the FTP client consists of 4 parts:
/// \li Connecting to the FTP server
/// \li Logging in (either as a registered user or anonymously)
/// \li Sending commands to the server
/// \li Disconnecting (this part can be done implicitely by the destructor)
///
/// Every command returns a FTP response, which contains the
/// status code as well as a message from the server. Some
/// commands such as getWorkingDirectory and getDirectoryListing
/// return additional data, and use a class derived from
/// sf::Ftp::Response to provide this data.
///
/// All commands, especially upload and download, may take some
/// time to complete. This is important to know if you don't want
/// to block your application while the server is completing
/// the task.
///
/// Usage example:
/// \code
/// // Create a new FTP client
/// sf::Ftp ftp;
///
/// // Connect to the server
/// sf::Ftp::Response response = ftp.connect("ftp://ftp.myserver.com");
/// if (response.isOk())
///     std::cout << "Connected" << std::endl;
///
/// // Log in
/// response = ftp.login("laurent", "dF6Zm89D");
/// if (response.isOk())
///     std::cout << "Logged in" << std::endl;
///
/// // Print the working directory
/// sf::Ftp::DirectoryResponse directory = ftp.getWorkingDirectory();
/// if (directory.isOk())
///     std::cout << "Working directory: " << directory.getDirectory() << std::endl;
///
/// // Create a new directory
/// response = ftp.createDirectory("files");
/// if (response.isOk())
///     std::cout << "Created new directory" << std::endl;
///
/// // Upload a file to this new directory
/// response = ftp.upload("local-path/file.txt", "files", sf::Ftp::Ascii);
/// if (response.isOk())
///     std::cout << "File uploaded" << std::endl;
///
/// // Disconnect from the server (optional)
/// ftp.disconnect();
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
};

    ////////////////////////////////////////////////////////////
    TcpSocket m_commandSocket; ///< Socket holding the control connection with the server
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class DataChannel;

    ////////////////////////////////////////////////////////////
    /// \brief Utility class for exchanging datas with the server
    ///        on the data channel
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response getResponse();

    ////////////////////////////////////////////////////////////
    /// \brief Receive a response from the server
    ///
    /// This function must be called after each call to
    /// SendCommand that expects a response.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response sendCommand(const std::string& command, const std::string& parameter = "");

    ////////////////////////////////////////////////////////////
    /// \brief Send a command to the FTP server
    ///
    /// \param command   Command to send
    /// \param parameter Command parameter
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response upload(const std::string& localFile, const std::string& remotePath, TransferMode mode = Binary);

    ////////////////////////////////////////////////////////////
    /// \brief Upload a file to the server
    ///
    /// The name of the local file is relative to the current
    /// working directory of your application, and the
    /// remote path is relative to the current directory of the
    /// FTP server.
    ///
    /// \param localFile  Path of the local file to upload
    /// \param remotePath Where to put to file on the server
    /// \param mode       Transfer mode
    ///
    /// \return Server response to the request
    ///
    /// \see download
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response download(const std::string& remoteFile, const std::string& localPath, TransferMode mode = Binary);

    ////////////////////////////////////////////////////////////
    /// \brief Download a file from the server
    ///
    /// The filename of the distant file is relative to the
    /// current working directory of the server, and the local
    /// destination path is relative to the current directory
    /// of your application.
    ///
    /// \param remoteFile Filename of the distant file to download
    /// \param localPath  Where to put to file on the local computer
    /// \param mode       Transfer mode
    ///
    /// \return Server response to the request
    ///
    /// \see upload
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response deleteFile(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Remove an existing file
    ///
    /// The file name must be relative to the current working
    /// directory.
    /// Use this function with caution, the file will be
    /// removed permanently!
    ///
    /// \param name File to remove
    ///
    /// \return Server response to the request
    ///
    /// \see renameFile
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response renameFile(const std::string& file, const std::string& newName);

    ////////////////////////////////////////////////////////////
    /// \brief Rename an existing file
    ///
    /// The filenames must be relative to the current working
    /// directory.
    ///
    /// \param file    File to rename
    /// \param newName New name of the file
    ///
    /// \return Server response to the request
    ///
    /// \see deleteFile
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response deleteDirectory(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Remove an existing directory
    ///
    /// The directory to remove must be relative to the
    /// current working directory.
    /// Use this function with caution, the directory will
    /// be removed permanently!
    ///
    /// \param name Name of the directory to remove
    ///
    /// \return Server response to the request
    ///
    /// \see createDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response createDirectory(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Create a new directory
    ///
    /// The new directory is created as a child of the current
    /// working directory.
    ///
    /// \param name Name of the directory to create
    ///
    /// \return Server response to the request
    ///
    /// \see deleteDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response parentDirectory();

    ////////////////////////////////////////////////////////////
    /// \brief Go to the parent directory of the current one
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, getDirectoryListing, changeDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response changeDirectory(const std::string& directory);

    ////////////////////////////////////////////////////////////
    /// \brief Change the current working directory
    ///
    /// The new directory must be relative to the current one.
    ///
    /// \param directory New working directory
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, getDirectoryListing, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    ListingResponse getDirectoryListing(const std::string& directory = "");

    ////////////////////////////////////////////////////////////
    /// \brief Get the contents of the given directory
    ///
    /// This function retrieves the sub-directories and files
    /// contained in the given directory. It is not recursive.
    /// The \a directory parameter is relative to the current
    /// working directory.
    ///
    /// \param directory Directory to list
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, changeDirectory, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    DirectoryResponse getWorkingDirectory();

    ////////////////////////////////////////////////////////////
    /// \brief Get the current working directory
    ///
    /// The working directory is the root path for subsequent
    /// operations involving directories and/or filenames.
    ///
    /// \return Server response to the request
    ///
    /// \see getDirectoryListing, changeDirectory, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response keepAlive();

    ////////////////////////////////////////////////////////////
    /// \brief Send a null command to keep the connection alive
    ///
    /// This command is useful because the server may close the
    /// connection automatically if no command is sent.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response login(const std::string& name, const std::string& password);

    ////////////////////////////////////////////////////////////
    /// \brief Log in using a username and a password
    ///
    /// Logging in is mandatory after connecting to the server.
    /// Users that are not logged in cannot perform any operation.
    ///
    /// \param name     User name
    /// \param password Password
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response login();

    ////////////////////////////////////////////////////////////
    /// \brief Log in using an anonymous account
    ///
    /// Logging in is mandatory after connecting to the server.
    /// Users that are not logged in cannot perform any operation.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response disconnect();

    ////////////////////////////////////////////////////////////
    /// \brief Close the connection with the server
    ///
    /// \return Server response to the request
    ///
    /// \see connect
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response connect(const IpAddress& server, unsigned short port = 21, Time timeout = Time::Zero);

    ////////////////////////////////////////////////////////////
    /// \brief Connect to the specified FTP server
    ///
    /// The port has a default value of 21, which is the standard
    /// port used by the FTP protocol. You shouldn't use a different
    /// value, unless you really know what you do.
    /// This function tries to connect to the server so it may take
    /// a while to complete, especially if the server is not
    /// reachable. To avoid blocking your application for too long,
    /// you can use a timeout. The default value, Time::Zero, means that the
    /// system timeout will be used (which is usually pretty long).
    ///
    /// \param server  Name or address of the FTP server to connect to
    /// \param port    Port used for the connection
    /// \param timeout Maximum time to wait
    ///
    /// \return Server response to the request
    ///
    /// \see disconnect
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    ~Ftp();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// Automatically closes the connection with the server if
    /// it is still opened.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        std::vector<std::string> m_listing; ///< Directory/file names extracted from the data
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::vector<std::string>& getListing() const;

        ////////////////////////////////////////////////////////////
        /// \brief Return the array of directory/file names
        ///
        /// \return Array containing the requested listing
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        ListingResponse(const Response& response, const std::vector<char>& data);

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// \param response  Source response
        /// \param data      Data containing the raw listing
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API ListingResponse : public Response

    ////////////////////////////////////////////////////////////
    /// \brief Specialization of FTP response returning a
    ///        filename lisiting
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        std::string m_directory; ///< Directory extracted from the response message
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::string& getDirectory() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the directory returned in the response
        ///
        /// \return Directory name
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        DirectoryResponse(const Response& response);

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// \param response Source response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API DirectoryResponse : public Response

    ////////////////////////////////////////////////////////////
    /// \brief Specialization of FTP response returning a directory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        Status      m_status;  ///< Status code returned from the server
        std::string m_message; ///< Last message received from the server
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::string& getMessage() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the full message contained in the response
        ///
        /// \return The response message
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        Status getStatus() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the status code of the response
        ///
        /// \return Status code
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        bool isOk() const;

        ////////////////////////////////////////////////////////////
        /// \brief Check if the status code means a success
        ///
        /// This function is defined for convenience, it is
        /// equivalent to testing if the status code is < 400.
        ///
        /// \return True if the status is a success, false if it is a failure
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        explicit Response(Status code = InvalidResponse, const std::string& message = "");

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// This constructor is used by the FTP client to build
        /// the response.
        ///
        /// \param code    Response status code
        /// \param message Response message
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        };

            InvalidResponse  = 1000, ///< Response is not a valid FTP one
            ConnectionFailed = 1001, ///< Connection with server failed
            ConnectionClosed = 1002, ///< Connection with server closed
            InvalidFile      = 1003  ///< Invalid file to upload / download
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 10xx: SFML custom codes

            CommandUnknown          = 500, ///< Syntax error, command unrecognized
            ParametersUnknown       = 501, ///< Syntax error in parameters or arguments
            CommandNotImplemented   = 502, ///< Command not implemented
            BadCommandSequence      = 503, ///< Bad sequence of commands
            ParameterNotImplemented = 504, ///< Command not implemented for that parameter
            NotLoggedIn             = 530, ///< Not logged in
            NeedAccountToStore      = 532, ///< Need account for storing files
            FileUnavailable         = 550, ///< Requested action not taken, file unavailable
            PageTypeUnknown         = 551, ///< Requested action aborted, page type unknown
            NotEnoughMemory         = 552, ///< Requested file action aborted, exceeded storage allocation
            FilenameNotAllowed      = 553, ///< Requested action not taken, file name not allowed
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 5xx: the command was not accepted and

            ServiceUnavailable        = 421, ///< Service not available, closing control connection
            DataConnectionUnavailable = 425, ///< Can't open data connection
            TransferAborted           = 426, ///< Connection closed, transfer aborted
            FileActionAborted         = 450, ///< Requested file action not taken
            LocalError                = 451, ///< Requested action aborted, local error in processing
            InsufficientStorageSpace  = 452, ///< Requested action not taken; insufficient storage space in system, file unavailable
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 4xx: the command was not accepted and the requested action did not take place,

            NeedPassword       = 331, ///< User name ok, need password
            NeedAccountToLogIn = 332, ///< Need account for login
            NeedInformation    = 350, ///< Requested file action pending further information
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 3xx: the command has been accepted, but the requested action

            Ok                    = 200, ///< Command ok
            PointlessCommand      = 202, ///< Command not implemented
            SystemStatus          = 211, ///< System status, or system help reply
            DirectoryStatus       = 212, ///< Directory status
            FileStatus            = 213, ///< File status
            HelpMessage           = 214, ///< Help message
            SystemType            = 215, ///< NAME system type, where NAME is an official system name from the list in the Assigned Numbers document
            ServiceReady          = 220, ///< Service ready for new user
            ClosingConnection     = 221, ///< Service closing control connection
            DataConnectionOpened  = 225, ///< Data connection open, no transfer in progress
            ClosingDataConnection = 226, ///< Closing data connection, requested file action successful
            EnteringPassiveMode   = 227, ///< Entering passive mode
            LoggedIn              = 230, ///< User logged in, proceed. Logged out if appropriate
            FileActionOk          = 250, ///< Requested file action ok
            DirectoryOk           = 257, ///< PATHNAME created
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 2xx: the requested action has been successfully completed

            RestartMarkerReply          = 110, ///< Restart marker reply
            ServiceReadySoon            = 120, ///< Service ready in N minutes
            DataConnectionAlreadyOpened = 125, ///< Data connection already opened, transfer starting
            OpeningDataConnection       = 150, ///< File status ok, about to open data connection
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        enum Status

        ////////////////////////////////////////////////////////////
        /// \brief Status codes possibly returned by a FTP response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API Response

    ////////////////////////////////////////////////////////////
    /// \brief Define a FTP response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        Binary, ///< Binary mode (file is transfered as a sequence of bytes)
        Ascii,  ///< Text mode using ASCII encoding
        Ebcdic  ///< Text mode using EBCDIC encoding
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    enum TransferMode

    ////////////////////////////////////////////////////////////
    /// \brief Enumeration of transfer modes
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
class SFML_NETWORK_API Ftp : NonCopyable

////////////////////////////////////////////////////////////
/// \brief A FTP client
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
#ifndef SFML_FTP_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp

////////////////////////////////////////////////////////////
/// \class sf::Ftp
/// \ingroup network
///
/// sf::Ftp is a very simple FTP client that allows you
/// to communicate with a FTP server. The FTP protocol allows
/// you to manipulate a remote file system (list files,
/// upload, download, create, remove, ...).
///
/// Using the FTP client consists of 4 parts:
/// \li Connecting to the FTP server
/// \li Logging in (either as a registered user or anonymously)
/// \li Sending commands to the server
/// \li Disconnecting (this part can be done implicitely by the destructor)
///
/// Every command returns a FTP response, which contains the
/// status code as well as a message from the server. Some
/// commands such as getWorkingDirectory and getDirectoryListing
/// return additional data, and use a class derived from
/// sf::Ftp::Response to provide this data.
///
/// All commands, especially upload and download, may take some
/// time to complete. This is important to know if you don't want
/// to block your application while the server is completing
/// the task.
///
/// Usage example:
/// \code
/// // Create a new FTP client
/// sf::Ftp ftp;
///
/// // Connect to the server
/// sf::Ftp::Response response = ftp.connect("ftp://ftp.myserver.com");
/// if (response.isOk())
///     std::cout << "Connected" << std::endl;
///
/// // Log in
/// response = ftp.login("laurent", "dF6Zm89D");
/// if (response.isOk())
///     std::cout << "Logged in" << std::endl;
///
/// // Print the working directory
/// sf::Ftp::DirectoryResponse directory = ftp.getWorkingDirectory();
/// if (directory.isOk())
///     std::cout << "Working directory: " << directory.getDirectory() << std::endl;
///
/// // Create a new directory
/// response = ftp.createDirectory("files");
/// if (response.isOk())
///     std::cout << "Created new directory" << std::endl;
///
/// // Upload a file to this new directory
/// response = ftp.upload("local-path/file.txt", "files", sf::Ftp::Ascii);
/// if (response.isOk())
///     std::cout << "File uploaded" << std::endl;
///
/// // Disconnect from the server (optional)
/// ftp.disconnect();
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
};

    ////////////////////////////////////////////////////////////
    TcpSocket m_commandSocket; ///< Socket holding the control connection with the server
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class DataChannel;

    ////////////////////////////////////////////////////////////
    /// \brief Utility class for exchanging datas with the server
    ///        on the data channel
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response getResponse();

    ////////////////////////////////////////////////////////////
    /// \brief Receive a response from the server
    ///
    /// This function must be called after each call to
    /// SendCommand that expects a response.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response sendCommand(const std::string& command, const std::string& parameter = "");

    ////////////////////////////////////////////////////////////
    /// \brief Send a command to the FTP server
    ///
    /// \param command   Command to send
    /// \param parameter Command parameter
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response upload(const std::string& localFile, const std::string& remotePath, TransferMode mode = Binary);

    ////////////////////////////////////////////////////////////
    /// \brief Upload a file to the server
    ///
    /// The name of the local file is relative to the current
    /// working directory of your application, and the
    /// remote path is relative to the current directory of the
    /// FTP server.
    ///
    /// \param localFile  Path of the local file to upload
    /// \param remotePath Where to put to file on the server
    /// \param mode       Transfer mode
    ///
    /// \return Server response to the request
    ///
    /// \see download
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response download(const std::string& remoteFile, const std::string& localPath, TransferMode mode = Binary);

    ////////////////////////////////////////////////////////////
    /// \brief Download a file from the server
    ///
    /// The filename of the distant file is relative to the
    /// current working directory of the server, and the local
    /// destination path is relative to the current directory
    /// of your application.
    ///
    /// \param remoteFile Filename of the distant file to download
    /// \param localPath  Where to put to file on the local computer
    /// \param mode       Transfer mode
    ///
    /// \return Server response to the request
    ///
    /// \see upload
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response deleteFile(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Remove an existing file
    ///
    /// The file name must be relative to the current working
    /// directory.
    /// Use this function with caution, the file will be
    /// removed permanently!
    ///
    /// \param name File to remove
    ///
    /// \return Server response to the request
    ///
    /// \see renameFile
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response renameFile(const std::string& file, const std::string& newName);

    ////////////////////////////////////////////////////////////
    /// \brief Rename an existing file
    ///
    /// The filenames must be relative to the current working
    /// directory.
    ///
    /// \param file    File to rename
    /// \param newName New name of the file
    ///
    /// \return Server response to the request
    ///
    /// \see deleteFile
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response deleteDirectory(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Remove an existing directory
    ///
    /// The directory to remove must be relative to the
    /// current working directory.
    /// Use this function with caution, the directory will
    /// be removed permanently!
    ///
    /// \param name Name of the directory to remove
    ///
    /// \return Server response to the request
    ///
    /// \see createDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response createDirectory(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Create a new directory
    ///
    /// The new directory is created as a child of the current
    /// working directory.
    ///
    /// \param name Name of the directory to create
    ///
    /// \return Server response to the request
    ///
    /// \see deleteDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response parentDirectory();

    ////////////////////////////////////////////////////////////
    /// \brief Go to the parent directory of the current one
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, getDirectoryListing, changeDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response changeDirectory(const std::string& directory);

    ////////////////////////////////////////////////////////////
    /// \brief Change the current working directory
    ///
    /// The new directory must be relative to the current one.
    ///
    /// \param directory New working directory
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, getDirectoryListing, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    ListingResponse getDirectoryListing(const std::string& directory = "");

    ////////////////////////////////////////////////////////////
    /// \brief Get the contents of the given directory
    ///
    /// This function retrieves the sub-directories and files
    /// contained in the given directory. It is not recursive.
    /// The \a directory parameter is relative to the current
    /// working directory.
    ///
    /// \param directory Directory to list
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, changeDirectory, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    DirectoryResponse getWorkingDirectory();

    ////////////////////////////////////////////////////////////
    /// \brief Get the current working directory
    ///
    /// The working directory is the root path for subsequent
    /// operations involving directories and/or filenames.
    ///
    /// \return Server response to the request
    ///
    /// \see getDirectoryListing, changeDirectory, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response keepAlive();

    ////////////////////////////////////////////////////////////
    /// \brief Send a null command to keep the connection alive
    ///
    /// This command is useful because the server may close the
    /// connection automatically if no command is sent.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response login(const std::string& name, const std::string& password);

    ////////////////////////////////////////////////////////////
    /// \brief Log in using a username and a password
    ///
    /// Logging in is mandatory after connecting to the server.
    /// Users that are not logged in cannot perform any operation.
    ///
    /// \param name     User name
    /// \param password Password
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response login();

    ////////////////////////////////////////////////////////////
    /// \brief Log in using an anonymous account
    ///
    /// Logging in is mandatory after connecting to the server.
    /// Users that are not logged in cannot perform any operation.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response disconnect();

    ////////////////////////////////////////////////////////////
    /// \brief Close the connection with the server
    ///
    /// \return Server response to the request
    ///
    /// \see connect
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response connect(const IpAddress& server, unsigned short port = 21, Time timeout = Time::Zero);

    ////////////////////////////////////////////////////////////
    /// \brief Connect to the specified FTP server
    ///
    /// The port has a default value of 21, which is the standard
    /// port used by the FTP protocol. You shouldn't use a different
    /// value, unless you really know what you do.
    /// This function tries to connect to the server so it may take
    /// a while to complete, especially if the server is not
    /// reachable. To avoid blocking your application for too long,
    /// you can use a timeout. The default value, Time::Zero, means that the
    /// system timeout will be used (which is usually pretty long).
    ///
    /// \param server  Name or address of the FTP server to connect to
    /// \param port    Port used for the connection
    /// \param timeout Maximum time to wait
    ///
    /// \return Server response to the request
    ///
    /// \see disconnect
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    ~Ftp();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// Automatically closes the connection with the server if
    /// it is still opened.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        std::vector<std::string> m_listing; ///< Directory/file names extracted from the data
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::vector<std::string>& getListing() const;

        ////////////////////////////////////////////////////////////
        /// \brief Return the array of directory/file names
        ///
        /// \return Array containing the requested listing
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        ListingResponse(const Response& response, const std::vector<char>& data);

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// \param response  Source response
        /// \param data      Data containing the raw listing
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API ListingResponse : public Response

    ////////////////////////////////////////////////////////////
    /// \brief Specialization of FTP response returning a
    ///        filename lisiting
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        std::string m_directory; ///< Directory extracted from the response message
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::string& getDirectory() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the directory returned in the response
        ///
        /// \return Directory name
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        DirectoryResponse(const Response& response);

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// \param response Source response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API DirectoryResponse : public Response

    ////////////////////////////////////////////////////////////
    /// \brief Specialization of FTP response returning a directory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        Status      m_status;  ///< Status code returned from the server
        std::string m_message; ///< Last message received from the server
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::string& getMessage() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the full message contained in the response
        ///
        /// \return The response message
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        Status getStatus() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the status code of the response
        ///
        /// \return Status code
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        bool isOk() const;

        ////////////////////////////////////////////////////////////
        /// \brief Check if the status code means a success
        ///
        /// This function is defined for convenience, it is
        /// equivalent to testing if the status code is < 400.
        ///
        /// \return True if the status is a success, false if it is a failure
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        explicit Response(Status code = InvalidResponse, const std::string& message = "");

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// This constructor is used by the FTP client to build
        /// the response.
        ///
        /// \param code    Response status code
        /// \param message Response message
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        };

            InvalidResponse  = 1000, ///< Response is not a valid FTP one
            ConnectionFailed = 1001, ///< Connection with server failed
            ConnectionClosed = 1002, ///< Connection with server closed
            InvalidFile      = 1003  ///< Invalid file to upload / download
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 10xx: SFML custom codes

            CommandUnknown          = 500, ///< Syntax error, command unrecognized
            ParametersUnknown       = 501, ///< Syntax error in parameters or arguments
            CommandNotImplemented   = 502, ///< Command not implemented
            BadCommandSequence      = 503, ///< Bad sequence of commands
            ParameterNotImplemented = 504, ///< Command not implemented for that parameter
            NotLoggedIn             = 530, ///< Not logged in
            NeedAccountToStore      = 532, ///< Need account for storing files
            FileUnavailable         = 550, ///< Requested action not taken, file unavailable
            PageTypeUnknown         = 551, ///< Requested action aborted, page type unknown
            NotEnoughMemory         = 552, ///< Requested file action aborted, exceeded storage allocation
            FilenameNotAllowed      = 553, ///< Requested action not taken, file name not allowed
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 5xx: the command was not accepted and

            ServiceUnavailable        = 421, ///< Service not available, closing control connection
            DataConnectionUnavailable = 425, ///< Can't open data connection
            TransferAborted           = 426, ///< Connection closed, transfer aborted
            FileActionAborted         = 450, ///< Requested file action not taken
            LocalError                = 451, ///< Requested action aborted, local error in processing
            InsufficientStorageSpace  = 452, ///< Requested action not taken; insufficient storage space in system, file unavailable
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 4xx: the command was not accepted and the requested action did not take place,

            NeedPassword       = 331, ///< User name ok, need password
            NeedAccountToLogIn = 332, ///< Need account for login
            NeedInformation    = 350, ///< Requested file action pending further information
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 3xx: the command has been accepted, but the requested action

            Ok                    = 200, ///< Command ok
            PointlessCommand      = 202, ///< Command not implemented
            SystemStatus          = 211, ///< System status, or system help reply
            DirectoryStatus       = 212, ///< Directory status
            FileStatus            = 213, ///< File status
            HelpMessage           = 214, ///< Help message
            SystemType            = 215, ///< NAME system type, where NAME is an official system name from the list in the Assigned Numbers document
            ServiceReady          = 220, ///< Service ready for new user
            ClosingConnection     = 221, ///< Service closing control connection
            DataConnectionOpened  = 225, ///< Data connection open, no transfer in progress
            ClosingDataConnection = 226, ///< Closing data connection, requested file action successful
            EnteringPassiveMode   = 227, ///< Entering passive mode
            LoggedIn              = 230, ///< User logged in, proceed. Logged out if appropriate
            FileActionOk          = 250, ///< Requested file action ok
            DirectoryOk           = 257, ///< PATHNAME created
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 2xx: the requested action has been successfully completed

            RestartMarkerReply          = 110, ///< Restart marker reply
            ServiceReadySoon            = 120, ///< Service ready in N minutes
            DataConnectionAlreadyOpened = 125, ///< Data connection already opened, transfer starting
            OpeningDataConnection       = 150, ///< File status ok, about to open data connection
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        enum Status

        ////////////////////////////////////////////////////////////
        /// \brief Status codes possibly returned by a FTP response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API Response

    ////////////////////////////////////////////////////////////
    /// \brief Define a FTP response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        Binary, ///< Binary mode (file is transfered as a sequence of bytes)
        Ascii,  ///< Text mode using ASCII encoding
        Ebcdic  ///< Text mode using EBCDIC encoding
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    enum TransferMode

    ////////////////////////////////////////////////////////////
    /// \brief Enumeration of transfer modes
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
class SFML_NETWORK_API Ftp : NonCopyable

////////////////////////////////////////////////////////////
/// \brief A FTP client
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
#ifndef SFML_FTP_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp

////////////////////////////////////////////////////////////
/// \class sf::Ftp
/// \ingroup network
///
/// sf::Ftp is a very simple FTP client that allows you
/// to communicate with a FTP server. The FTP protocol allows
/// you to manipulate a remote file system (list files,
/// upload, download, create, remove, ...).
///
/// Using the FTP client consists of 4 parts:
/// \li Connecting to the FTP server
/// \li Logging in (either as a registered user or anonymously)
/// \li Sending commands to the server
/// \li Disconnecting (this part can be done implicitely by the destructor)
///
/// Every command returns a FTP response, which contains the
/// status code as well as a message from the server. Some
/// commands such as getWorkingDirectory and getDirectoryListing
/// return additional data, and use a class derived from
/// sf::Ftp::Response to provide this data.
///
/// All commands, especially upload and download, may take some
/// time to complete. This is important to know if you don't want
/// to block your application while the server is completing
/// the task.
///
/// Usage example:
/// \code
/// // Create a new FTP client
/// sf::Ftp ftp;
///
/// // Connect to the server
/// sf::Ftp::Response response = ftp.connect("ftp://ftp.myserver.com");
/// if (response.isOk())
///     std::cout << "Connected" << std::endl;
///
/// // Log in
/// response = ftp.login("laurent", "dF6Zm89D");
/// if (response.isOk())
///     std::cout << "Logged in" << std::endl;
///
/// // Print the working directory
/// sf::Ftp::DirectoryResponse directory = ftp.getWorkingDirectory();
/// if (directory.isOk())
///     std::cout << "Working directory: " << directory.getDirectory() << std::endl;
///
/// // Create a new directory
/// response = ftp.createDirectory("files");
/// if (response.isOk())
///     std::cout << "Created new directory" << std::endl;
///
/// // Upload a file to this new directory
/// response = ftp.upload("local-path/file.txt", "files", sf::Ftp::Ascii);
/// if (response.isOk())
///     std::cout << "File uploaded" << std::endl;
///
/// // Disconnect from the server (optional)
/// ftp.disconnect();
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
};

    ////////////////////////////////////////////////////////////
    TcpSocket m_commandSocket; ///< Socket holding the control connection with the server
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class DataChannel;

    ////////////////////////////////////////////////////////////
    /// \brief Utility class for exchanging datas with the server
    ///        on the data channel
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response getResponse();

    ////////////////////////////////////////////////////////////
    /// \brief Receive a response from the server
    ///
    /// This function must be called after each call to
    /// SendCommand that expects a response.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response sendCommand(const std::string& command, const std::string& parameter = "");

    ////////////////////////////////////////////////////////////
    /// \brief Send a command to the FTP server
    ///
    /// \param command   Command to send
    /// \param parameter Command parameter
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response upload(const std::string& localFile, const std::string& remotePath, TransferMode mode = Binary);

    ////////////////////////////////////////////////////////////
    /// \brief Upload a file to the server
    ///
    /// The name of the local file is relative to the current
    /// working directory of your application, and the
    /// remote path is relative to the current directory of the
    /// FTP server.
    ///
    /// \param localFile  Path of the local file to upload
    /// \param remotePath Where to put to file on the server
    /// \param mode       Transfer mode
    ///
    /// \return Server response to the request
    ///
    /// \see download
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response download(const std::string& remoteFile, const std::string& localPath, TransferMode mode = Binary);

    ////////////////////////////////////////////////////////////
    /// \brief Download a file from the server
    ///
    /// The filename of the distant file is relative to the
    /// current working directory of the server, and the local
    /// destination path is relative to the current directory
    /// of your application.
    ///
    /// \param remoteFile Filename of the distant file to download
    /// \param localPath  Where to put to file on the local computer
    /// \param mode       Transfer mode
    ///
    /// \return Server response to the request
    ///
    /// \see upload
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response deleteFile(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Remove an existing file
    ///
    /// The file name must be relative to the current working
    /// directory.
    /// Use this function with caution, the file will be
    /// removed permanently!
    ///
    /// \param name File to remove
    ///
    /// \return Server response to the request
    ///
    /// \see renameFile
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response renameFile(const std::string& file, const std::string& newName);

    ////////////////////////////////////////////////////////////
    /// \brief Rename an existing file
    ///
    /// The filenames must be relative to the current working
    /// directory.
    ///
    /// \param file    File to rename
    /// \param newName New name of the file
    ///
    /// \return Server response to the request
    ///
    /// \see deleteFile
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response deleteDirectory(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Remove an existing directory
    ///
    /// The directory to remove must be relative to the
    /// current working directory.
    /// Use this function with caution, the directory will
    /// be removed permanently!
    ///
    /// \param name Name of the directory to remove
    ///
    /// \return Server response to the request
    ///
    /// \see createDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response createDirectory(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Create a new directory
    ///
    /// The new directory is created as a child of the current
    /// working directory.
    ///
    /// \param name Name of the directory to create
    ///
    /// \return Server response to the request
    ///
    /// \see deleteDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response parentDirectory();

    ////////////////////////////////////////////////////////////
    /// \brief Go to the parent directory of the current one
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, getDirectoryListing, changeDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response changeDirectory(const std::string& directory);

    ////////////////////////////////////////////////////////////
    /// \brief Change the current working directory
    ///
    /// The new directory must be relative to the current one.
    ///
    /// \param directory New working directory
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, getDirectoryListing, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    ListingResponse getDirectoryListing(const std::string& directory = "");

    ////////////////////////////////////////////////////////////
    /// \brief Get the contents of the given directory
    ///
    /// This function retrieves the sub-directories and files
    /// contained in the given directory. It is not recursive.
    /// The \a directory parameter is relative to the current
    /// working directory.
    ///
    /// \param directory Directory to list
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, changeDirectory, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    DirectoryResponse getWorkingDirectory();

    ////////////////////////////////////////////////////////////
    /// \brief Get the current working directory
    ///
    /// The working directory is the root path for subsequent
    /// operations involving directories and/or filenames.
    ///
    /// \return Server response to the request
    ///
    /// \see getDirectoryListing, changeDirectory, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response keepAlive();

    ////////////////////////////////////////////////////////////
    /// \brief Send a null command to keep the connection alive
    ///
    /// This command is useful because the server may close the
    /// connection automatically if no command is sent.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response login(const std::string& name, const std::string& password);

    ////////////////////////////////////////////////////////////
    /// \brief Log in using a username and a password
    ///
    /// Logging in is mandatory after connecting to the server.
    /// Users that are not logged in cannot perform any operation.
    ///
    /// \param name     User name
    /// \param password Password
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response login();

    ////////////////////////////////////////////////////////////
    /// \brief Log in using an anonymous account
    ///
    /// Logging in is mandatory after connecting to the server.
    /// Users that are not logged in cannot perform any operation.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response disconnect();

    ////////////////////////////////////////////////////////////
    /// \brief Close the connection with the server
    ///
    /// \return Server response to the request
    ///
    /// \see connect
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response connect(const IpAddress& server, unsigned short port = 21, Time timeout = Time::Zero);

    ////////////////////////////////////////////////////////////
    /// \brief Connect to the specified FTP server
    ///
    /// The port has a default value of 21, which is the standard
    /// port used by the FTP protocol. You shouldn't use a different
    /// value, unless you really know what you do.
    /// This function tries to connect to the server so it may take
    /// a while to complete, especially if the server is not
    /// reachable. To avoid blocking your application for too long,
    /// you can use a timeout. The default value, Time::Zero, means that the
    /// system timeout will be used (which is usually pretty long).
    ///
    /// \param server  Name or address of the FTP server to connect to
    /// \param port    Port used for the connection
    /// \param timeout Maximum time to wait
    ///
    /// \return Server response to the request
    ///
    /// \see disconnect
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    ~Ftp();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// Automatically closes the connection with the server if
    /// it is still opened.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        std::vector<std::string> m_listing; ///< Directory/file names extracted from the data
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::vector<std::string>& getListing() const;

        ////////////////////////////////////////////////////////////
        /// \brief Return the array of directory/file names
        ///
        /// \return Array containing the requested listing
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        ListingResponse(const Response& response, const std::vector<char>& data);

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// \param response  Source response
        /// \param data      Data containing the raw listing
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API ListingResponse : public Response

    ////////////////////////////////////////////////////////////
    /// \brief Specialization of FTP response returning a
    ///        filename lisiting
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        std::string m_directory; ///< Directory extracted from the response message
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::string& getDirectory() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the directory returned in the response
        ///
        /// \return Directory name
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        DirectoryResponse(const Response& response);

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// \param response Source response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API DirectoryResponse : public Response

    ////////////////////////////////////////////////////////////
    /// \brief Specialization of FTP response returning a directory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        Status      m_status;  ///< Status code returned from the server
        std::string m_message; ///< Last message received from the server
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::string& getMessage() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the full message contained in the response
        ///
        /// \return The response message
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        Status getStatus() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the status code of the response
        ///
        /// \return Status code
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        bool isOk() const;

        ////////////////////////////////////////////////////////////
        /// \brief Check if the status code means a success
        ///
        /// This function is defined for convenience, it is
        /// equivalent to testing if the status code is < 400.
        ///
        /// \return True if the status is a success, false if it is a failure
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        explicit Response(Status code = InvalidResponse, const std::string& message = "");

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// This constructor is used by the FTP client to build
        /// the response.
        ///
        /// \param code    Response status code
        /// \param message Response message
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        };

            InvalidResponse  = 1000, ///< Response is not a valid FTP one
            ConnectionFailed = 1001, ///< Connection with server failed
            ConnectionClosed = 1002, ///< Connection with server closed
            InvalidFile      = 1003  ///< Invalid file to upload / download
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 10xx: SFML custom codes

            CommandUnknown          = 500, ///< Syntax error, command unrecognized
            ParametersUnknown       = 501, ///< Syntax error in parameters or arguments
            CommandNotImplemented   = 502, ///< Command not implemented
            BadCommandSequence      = 503, ///< Bad sequence of commands
            ParameterNotImplemented = 504, ///< Command not implemented for that parameter
            NotLoggedIn             = 530, ///< Not logged in
            NeedAccountToStore      = 532, ///< Need account for storing files
            FileUnavailable         = 550, ///< Requested action not taken, file unavailable
            PageTypeUnknown         = 551, ///< Requested action aborted, page type unknown
            NotEnoughMemory         = 552, ///< Requested file action aborted, exceeded storage allocation
            FilenameNotAllowed      = 553, ///< Requested action not taken, file name not allowed
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 5xx: the command was not accepted and

            ServiceUnavailable        = 421, ///< Service not available, closing control connection
            DataConnectionUnavailable = 425, ///< Can't open data connection
            TransferAborted           = 426, ///< Connection closed, transfer aborted
            FileActionAborted         = 450, ///< Requested file action not taken
            LocalError                = 451, ///< Requested action aborted, local error in processing
            InsufficientStorageSpace  = 452, ///< Requested action not taken; insufficient storage space in system, file unavailable
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 4xx: the command was not accepted and the requested action did not take place,

            NeedPassword       = 331, ///< User name ok, need password
            NeedAccountToLogIn = 332, ///< Need account for login
            NeedInformation    = 350, ///< Requested file action pending further information
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 3xx: the command has been accepted, but the requested action

            Ok                    = 200, ///< Command ok
            PointlessCommand      = 202, ///< Command not implemented
            SystemStatus          = 211, ///< System status, or system help reply
            DirectoryStatus       = 212, ///< Directory status
            FileStatus            = 213, ///< File status
            HelpMessage           = 214, ///< Help message
            SystemType            = 215, ///< NAME system type, where NAME is an official system name from the list in the Assigned Numbers document
            ServiceReady          = 220, ///< Service ready for new user
            ClosingConnection     = 221, ///< Service closing control connection
            DataConnectionOpened  = 225, ///< Data connection open, no transfer in progress
            ClosingDataConnection = 226, ///< Closing data connection, requested file action successful
            EnteringPassiveMode   = 227, ///< Entering passive mode
            LoggedIn              = 230, ///< User logged in, proceed. Logged out if appropriate
            FileActionOk          = 250, ///< Requested file action ok
            DirectoryOk           = 257, ///< PATHNAME created
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 2xx: the requested action has been successfully completed

            RestartMarkerReply          = 110, ///< Restart marker reply
            ServiceReadySoon            = 120, ///< Service ready in N minutes
            DataConnectionAlreadyOpened = 125, ///< Data connection already opened, transfer starting
            OpeningDataConnection       = 150, ///< File status ok, about to open data connection
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        enum Status

        ////////////////////////////////////////////////////////////
        /// \brief Status codes possibly returned by a FTP response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API Response

    ////////////////////////////////////////////////////////////
    /// \brief Define a FTP response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        Binary, ///< Binary mode (file is transfered as a sequence of bytes)
        Ascii,  ///< Text mode using ASCII encoding
        Ebcdic  ///< Text mode using EBCDIC encoding
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    enum TransferMode

    ////////////////////////////////////////////////////////////
    /// \brief Enumeration of transfer modes
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
class SFML_NETWORK_API Ftp : NonCopyable

////////////////////////////////////////////////////////////
/// \brief A FTP client
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
#ifndef SFML_FTP_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp

////////////////////////////////////////////////////////////
/// \class sf::Ftp
/// \ingroup network
///
/// sf::Ftp is a very simple FTP client that allows you
/// to communicate with a FTP server. The FTP protocol allows
/// you to manipulate a remote file system (list files,
/// upload, download, create, remove, ...).
///
/// Using the FTP client consists of 4 parts:
/// \li Connecting to the FTP server
/// \li Logging in (either as a registered user or anonymously)
/// \li Sending commands to the server
/// \li Disconnecting (this part can be done implicitely by the destructor)
///
/// Every command returns a FTP response, which contains the
/// status code as well as a message from the server. Some
/// commands such as getWorkingDirectory and getDirectoryListing
/// return additional data, and use a class derived from
/// sf::Ftp::Response to provide this data.
///
/// All commands, especially upload and download, may take some
/// time to complete. This is important to know if you don't want
/// to block your application while the server is completing
/// the task.
///
/// Usage example:
/// \code
/// // Create a new FTP client
/// sf::Ftp ftp;
///
/// // Connect to the server
/// sf::Ftp::Response response = ftp.connect("ftp://ftp.myserver.com");
/// if (response.isOk())
///     std::cout << "Connected" << std::endl;
///
/// // Log in
/// response = ftp.login("laurent", "dF6Zm89D");
/// if (response.isOk())
///     std::cout << "Logged in" << std::endl;
///
/// // Print the working directory
/// sf::Ftp::DirectoryResponse directory = ftp.getWorkingDirectory();
/// if (directory.isOk())
///     std::cout << "Working directory: " << directory.getDirectory() << std::endl;
///
/// // Create a new directory
/// response = ftp.createDirectory("files");
/// if (response.isOk())
///     std::cout << "Created new directory" << std::endl;
///
/// // Upload a file to this new directory
/// response = ftp.upload("local-path/file.txt", "files", sf::Ftp::Ascii);
/// if (response.isOk())
///     std::cout << "File uploaded" << std::endl;
///
/// // Disconnect from the server (optional)
/// ftp.disconnect();
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
};

    ////////////////////////////////////////////////////////////
    TcpSocket m_commandSocket; ///< Socket holding the control connection with the server
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class DataChannel;

    ////////////////////////////////////////////////////////////
    /// \brief Utility class for exchanging datas with the server
    ///        on the data channel
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response getResponse();

    ////////////////////////////////////////////////////////////
    /// \brief Receive a response from the server
    ///
    /// This function must be called after each call to
    /// SendCommand that expects a response.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response sendCommand(const std::string& command, const std::string& parameter = "");

    ////////////////////////////////////////////////////////////
    /// \brief Send a command to the FTP server
    ///
    /// \param command   Command to send
    /// \param parameter Command parameter
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response upload(const std::string& localFile, const std::string& remotePath, TransferMode mode = Binary);

    ////////////////////////////////////////////////////////////
    /// \brief Upload a file to the server
    ///
    /// The name of the local file is relative to the current
    /// working directory of your application, and the
    /// remote path is relative to the current directory of the
    /// FTP server.
    ///
    /// \param localFile  Path of the local file to upload
    /// \param remotePath Where to put to file on the server
    /// \param mode       Transfer mode
    ///
    /// \return Server response to the request
    ///
    /// \see download
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response download(const std::string& remoteFile, const std::string& localPath, TransferMode mode = Binary);

    ////////////////////////////////////////////////////////////
    /// \brief Download a file from the server
    ///
    /// The filename of the distant file is relative to the
    /// current working directory of the server, and the local
    /// destination path is relative to the current directory
    /// of your application.
    ///
    /// \param remoteFile Filename of the distant file to download
    /// \param localPath  Where to put to file on the local computer
    /// \param mode       Transfer mode
    ///
    /// \return Server response to the request
    ///
    /// \see upload
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response deleteFile(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Remove an existing file
    ///
    /// The file name must be relative to the current working
    /// directory.
    /// Use this function with caution, the file will be
    /// removed permanently!
    ///
    /// \param name File to remove
    ///
    /// \return Server response to the request
    ///
    /// \see renameFile
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response renameFile(const std::string& file, const std::string& newName);

    ////////////////////////////////////////////////////////////
    /// \brief Rename an existing file
    ///
    /// The filenames must be relative to the current working
    /// directory.
    ///
    /// \param file    File to rename
    /// \param newName New name of the file
    ///
    /// \return Server response to the request
    ///
    /// \see deleteFile
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response deleteDirectory(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Remove an existing directory
    ///
    /// The directory to remove must be relative to the
    /// current working directory.
    /// Use this function with caution, the directory will
    /// be removed permanently!
    ///
    /// \param name Name of the directory to remove
    ///
    /// \return Server response to the request
    ///
    /// \see createDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response createDirectory(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Create a new directory
    ///
    /// The new directory is created as a child of the current
    /// working directory.
    ///
    /// \param name Name of the directory to create
    ///
    /// \return Server response to the request
    ///
    /// \see deleteDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response parentDirectory();

    ////////////////////////////////////////////////////////////
    /// \brief Go to the parent directory of the current one
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, getDirectoryListing, changeDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response changeDirectory(const std::string& directory);

    ////////////////////////////////////////////////////////////
    /// \brief Change the current working directory
    ///
    /// The new directory must be relative to the current one.
    ///
    /// \param directory New working directory
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, getDirectoryListing, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    ListingResponse getDirectoryListing(const std::string& directory = "");

    ////////////////////////////////////////////////////////////
    /// \brief Get the contents of the given directory
    ///
    /// This function retrieves the sub-directories and files
    /// contained in the given directory. It is not recursive.
    /// The \a directory parameter is relative to the current
    /// working directory.
    ///
    /// \param directory Directory to list
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, changeDirectory, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    DirectoryResponse getWorkingDirectory();

    ////////////////////////////////////////////////////////////
    /// \brief Get the current working directory
    ///
    /// The working directory is the root path for subsequent
    /// operations involving directories and/or filenames.
    ///
    /// \return Server response to the request
    ///
    /// \see getDirectoryListing, changeDirectory, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response keepAlive();

    ////////////////////////////////////////////////////////////
    /// \brief Send a null command to keep the connection alive
    ///
    /// This command is useful because the server may close the
    /// connection automatically if no command is sent.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response login(const std::string& name, const std::string& password);

    ////////////////////////////////////////////////////////////
    /// \brief Log in using a username and a password
    ///
    /// Logging in is mandatory after connecting to the server.
    /// Users that are not logged in cannot perform any operation.
    ///
    /// \param name     User name
    /// \param password Password
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response login();

    ////////////////////////////////////////////////////////////
    /// \brief Log in using an anonymous account
    ///
    /// Logging in is mandatory after connecting to the server.
    /// Users that are not logged in cannot perform any operation.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response disconnect();

    ////////////////////////////////////////////////////////////
    /// \brief Close the connection with the server
    ///
    /// \return Server response to the request
    ///
    /// \see connect
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response connect(const IpAddress& server, unsigned short port = 21, Time timeout = Time::Zero);

    ////////////////////////////////////////////////////////////
    /// \brief Connect to the specified FTP server
    ///
    /// The port has a default value of 21, which is the standard
    /// port used by the FTP protocol. You shouldn't use a different
    /// value, unless you really know what you do.
    /// This function tries to connect to the server so it may take
    /// a while to complete, especially if the server is not
    /// reachable. To avoid blocking your application for too long,
    /// you can use a timeout. The default value, Time::Zero, means that the
    /// system timeout will be used (which is usually pretty long).
    ///
    /// \param server  Name or address of the FTP server to connect to
    /// \param port    Port used for the connection
    /// \param timeout Maximum time to wait
    ///
    /// \return Server response to the request
    ///
    /// \see disconnect
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    ~Ftp();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// Automatically closes the connection with the server if
    /// it is still opened.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        std::vector<std::string> m_listing; ///< Directory/file names extracted from the data
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::vector<std::string>& getListing() const;

        ////////////////////////////////////////////////////////////
        /// \brief Return the array of directory/file names
        ///
        /// \return Array containing the requested listing
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        ListingResponse(const Response& response, const std::vector<char>& data);

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// \param response  Source response
        /// \param data      Data containing the raw listing
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API ListingResponse : public Response

    ////////////////////////////////////////////////////////////
    /// \brief Specialization of FTP response returning a
    ///        filename lisiting
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        std::string m_directory; ///< Directory extracted from the response message
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::string& getDirectory() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the directory returned in the response
        ///
        /// \return Directory name
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        DirectoryResponse(const Response& response);

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// \param response Source response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API DirectoryResponse : public Response

    ////////////////////////////////////////////////////////////
    /// \brief Specialization of FTP response returning a directory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        Status      m_status;  ///< Status code returned from the server
        std::string m_message; ///< Last message received from the server
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::string& getMessage() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the full message contained in the response
        ///
        /// \return The response message
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        Status getStatus() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the status code of the response
        ///
        /// \return Status code
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        bool isOk() const;

        ////////////////////////////////////////////////////////////
        /// \brief Check if the status code means a success
        ///
        /// This function is defined for convenience, it is
        /// equivalent to testing if the status code is < 400.
        ///
        /// \return True if the status is a success, false if it is a failure
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        explicit Response(Status code = InvalidResponse, const std::string& message = "");

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// This constructor is used by the FTP client to build
        /// the response.
        ///
        /// \param code    Response status code
        /// \param message Response message
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        };

            InvalidResponse  = 1000, ///< Response is not a valid FTP one
            ConnectionFailed = 1001, ///< Connection with server failed
            ConnectionClosed = 1002, ///< Connection with server closed
            InvalidFile      = 1003  ///< Invalid file to upload / download
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 10xx: SFML custom codes

            CommandUnknown          = 500, ///< Syntax error, command unrecognized
            ParametersUnknown       = 501, ///< Syntax error in parameters or arguments
            CommandNotImplemented   = 502, ///< Command not implemented
            BadCommandSequence      = 503, ///< Bad sequence of commands
            ParameterNotImplemented = 504, ///< Command not implemented for that parameter
            NotLoggedIn             = 530, ///< Not logged in
            NeedAccountToStore      = 532, ///< Need account for storing files
            FileUnavailable         = 550, ///< Requested action not taken, file unavailable
            PageTypeUnknown         = 551, ///< Requested action aborted, page type unknown
            NotEnoughMemory         = 552, ///< Requested file action aborted, exceeded storage allocation
            FilenameNotAllowed      = 553, ///< Requested action not taken, file name not allowed
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 5xx: the command was not accepted and

            ServiceUnavailable        = 421, ///< Service not available, closing control connection
            DataConnectionUnavailable = 425, ///< Can't open data connection
            TransferAborted           = 426, ///< Connection closed, transfer aborted
            FileActionAborted         = 450, ///< Requested file action not taken
            LocalError                = 451, ///< Requested action aborted, local error in processing
            InsufficientStorageSpace  = 452, ///< Requested action not taken; insufficient storage space in system, file unavailable
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 4xx: the command was not accepted and the requested action did not take place,

            NeedPassword       = 331, ///< User name ok, need password
            NeedAccountToLogIn = 332, ///< Need account for login
            NeedInformation    = 350, ///< Requested file action pending further information
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 3xx: the command has been accepted, but the requested action

            Ok                    = 200, ///< Command ok
            PointlessCommand      = 202, ///< Command not implemented
            SystemStatus          = 211, ///< System status, or system help reply
            DirectoryStatus       = 212, ///< Directory status
            FileStatus            = 213, ///< File status
            HelpMessage           = 214, ///< Help message
            SystemType            = 215, ///< NAME system type, where NAME is an official system name from the list in the Assigned Numbers document
            ServiceReady          = 220, ///< Service ready for new user
            ClosingConnection     = 221, ///< Service closing control connection
            DataConnectionOpened  = 225, ///< Data connection open, no transfer in progress
            ClosingDataConnection = 226, ///< Closing data connection, requested file action successful
            EnteringPassiveMode   = 227, ///< Entering passive mode
            LoggedIn              = 230, ///< User logged in, proceed. Logged out if appropriate
            FileActionOk          = 250, ///< Requested file action ok
            DirectoryOk           = 257, ///< PATHNAME created
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 2xx: the requested action has been successfully completed

            RestartMarkerReply          = 110, ///< Restart marker reply
            ServiceReadySoon            = 120, ///< Service ready in N minutes
            DataConnectionAlreadyOpened = 125, ///< Data connection already opened, transfer starting
            OpeningDataConnection       = 150, ///< File status ok, about to open data connection
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        enum Status

        ////////////////////////////////////////////////////////////
        /// \brief Status codes possibly returned by a FTP response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API Response

    ////////////////////////////////////////////////////////////
    /// \brief Define a FTP response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        Binary, ///< Binary mode (file is transfered as a sequence of bytes)
        Ascii,  ///< Text mode using ASCII encoding
        Ebcdic  ///< Text mode using EBCDIC encoding
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    enum TransferMode

    ////////////////////////////////////////////////////////////
    /// \brief Enumeration of transfer modes
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
class SFML_NETWORK_API Ftp : NonCopyable

////////////////////////////////////////////////////////////
/// \brief A FTP client
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
#ifndef SFML_FTP_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp

////////////////////////////////////////////////////////////
/// \class sf::Ftp
/// \ingroup network
///
/// sf::Ftp is a very simple FTP client that allows you
/// to communicate with a FTP server. The FTP protocol allows
/// you to manipulate a remote file system (list files,
/// upload, download, create, remove, ...).
///
/// Using the FTP client consists of 4 parts:
/// \li Connecting to the FTP server
/// \li Logging in (either as a registered user or anonymously)
/// \li Sending commands to the server
/// \li Disconnecting (this part can be done implicitely by the destructor)
///
/// Every command returns a FTP response, which contains the
/// status code as well as a message from the server. Some
/// commands such as getWorkingDirectory and getDirectoryListing
/// return additional data, and use a class derived from
/// sf::Ftp::Response to provide this data.
///
/// All commands, especially upload and download, may take some
/// time to complete. This is important to know if you don't want
/// to block your application while the server is completing
/// the task.
///
/// Usage example:
/// \code
/// // Create a new FTP client
/// sf::Ftp ftp;
///
/// // Connect to the server
/// sf::Ftp::Response response = ftp.connect("ftp://ftp.myserver.com");
/// if (response.isOk())
///     std::cout << "Connected" << std::endl;
///
/// // Log in
/// response = ftp.login("laurent", "dF6Zm89D");
/// if (response.isOk())
///     std::cout << "Logged in" << std::endl;
///
/// // Print the working directory
/// sf::Ftp::DirectoryResponse directory = ftp.getWorkingDirectory();
/// if (directory.isOk())
///     std::cout << "Working directory: " << directory.getDirectory() << std::endl;
///
/// // Create a new directory
/// response = ftp.createDirectory("files");
/// if (response.isOk())
///     std::cout << "Created new directory" << std::endl;
///
/// // Upload a file to this new directory
/// response = ftp.upload("local-path/file.txt", "files", sf::Ftp::Ascii);
/// if (response.isOk())
///     std::cout << "File uploaded" << std::endl;
///
/// // Disconnect from the server (optional)
/// ftp.disconnect();
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
};

    ////////////////////////////////////////////////////////////
    TcpSocket m_commandSocket; ///< Socket holding the control connection with the server
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class DataChannel;

    ////////////////////////////////////////////////////////////
    /// \brief Utility class for exchanging datas with the server
    ///        on the data channel
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response getResponse();

    ////////////////////////////////////////////////////////////
    /// \brief Receive a response from the server
    ///
    /// This function must be called after each call to
    /// SendCommand that expects a response.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response sendCommand(const std::string& command, const std::string& parameter = "");

    ////////////////////////////////////////////////////////////
    /// \brief Send a command to the FTP server
    ///
    /// \param command   Command to send
    /// \param parameter Command parameter
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response upload(const std::string& localFile, const std::string& remotePath, TransferMode mode = Binary);

    ////////////////////////////////////////////////////////////
    /// \brief Upload a file to the server
    ///
    /// The name of the local file is relative to the current
    /// working directory of your application, and the
    /// remote path is relative to the current directory of the
    /// FTP server.
    ///
    /// \param localFile  Path of the local file to upload
    /// \param remotePath Where to put to file on the server
    /// \param mode       Transfer mode
    ///
    /// \return Server response to the request
    ///
    /// \see download
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response download(const std::string& remoteFile, const std::string& localPath, TransferMode mode = Binary);

    ////////////////////////////////////////////////////////////
    /// \brief Download a file from the server
    ///
    /// The filename of the distant file is relative to the
    /// current working directory of the server, and the local
    /// destination path is relative to the current directory
    /// of your application.
    ///
    /// \param remoteFile Filename of the distant file to download
    /// \param localPath  Where to put to file on the local computer
    /// \param mode       Transfer mode
    ///
    /// \return Server response to the request
    ///
    /// \see upload
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response deleteFile(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Remove an existing file
    ///
    /// The file name must be relative to the current working
    /// directory.
    /// Use this function with caution, the file will be
    /// removed permanently!
    ///
    /// \param name File to remove
    ///
    /// \return Server response to the request
    ///
    /// \see renameFile
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response renameFile(const std::string& file, const std::string& newName);

    ////////////////////////////////////////////////////////////
    /// \brief Rename an existing file
    ///
    /// The filenames must be relative to the current working
    /// directory.
    ///
    /// \param file    File to rename
    /// \param newName New name of the file
    ///
    /// \return Server response to the request
    ///
    /// \see deleteFile
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response deleteDirectory(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Remove an existing directory
    ///
    /// The directory to remove must be relative to the
    /// current working directory.
    /// Use this function with caution, the directory will
    /// be removed permanently!
    ///
    /// \param name Name of the directory to remove
    ///
    /// \return Server response to the request
    ///
    /// \see createDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response createDirectory(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Create a new directory
    ///
    /// The new directory is created as a child of the current
    /// working directory.
    ///
    /// \param name Name of the directory to create
    ///
    /// \return Server response to the request
    ///
    /// \see deleteDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response parentDirectory();

    ////////////////////////////////////////////////////////////
    /// \brief Go to the parent directory of the current one
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, getDirectoryListing, changeDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response changeDirectory(const std::string& directory);

    ////////////////////////////////////////////////////////////
    /// \brief Change the current working directory
    ///
    /// The new directory must be relative to the current one.
    ///
    /// \param directory New working directory
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, getDirectoryListing, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    ListingResponse getDirectoryListing(const std::string& directory = "");

    ////////////////////////////////////////////////////////////
    /// \brief Get the contents of the given directory
    ///
    /// This function retrieves the sub-directories and files
    /// contained in the given directory. It is not recursive.
    /// The \a directory parameter is relative to the current
    /// working directory.
    ///
    /// \param directory Directory to list
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, changeDirectory, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    DirectoryResponse getWorkingDirectory();

    ////////////////////////////////////////////////////////////
    /// \brief Get the current working directory
    ///
    /// The working directory is the root path for subsequent
    /// operations involving directories and/or filenames.
    ///
    /// \return Server response to the request
    ///
    /// \see getDirectoryListing, changeDirectory, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response keepAlive();

    ////////////////////////////////////////////////////////////
    /// \brief Send a null command to keep the connection alive
    ///
    /// This command is useful because the server may close the
    /// connection automatically if no command is sent.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response login(const std::string& name, const std::string& password);

    ////////////////////////////////////////////////////////////
    /// \brief Log in using a username and a password
    ///
    /// Logging in is mandatory after connecting to the server.
    /// Users that are not logged in cannot perform any operation.
    ///
    /// \param name     User name
    /// \param password Password
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response login();

    ////////////////////////////////////////////////////////////
    /// \brief Log in using an anonymous account
    ///
    /// Logging in is mandatory after connecting to the server.
    /// Users that are not logged in cannot perform any operation.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response disconnect();

    ////////////////////////////////////////////////////////////
    /// \brief Close the connection with the server
    ///
    /// \return Server response to the request
    ///
    /// \see connect
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response connect(const IpAddress& server, unsigned short port = 21, Time timeout = Time::Zero);

    ////////////////////////////////////////////////////////////
    /// \brief Connect to the specified FTP server
    ///
    /// The port has a default value of 21, which is the standard
    /// port used by the FTP protocol. You shouldn't use a different
    /// value, unless you really know what you do.
    /// This function tries to connect to the server so it may take
    /// a while to complete, especially if the server is not
    /// reachable. To avoid blocking your application for too long,
    /// you can use a timeout. The default value, Time::Zero, means that the
    /// system timeout will be used (which is usually pretty long).
    ///
    /// \param server  Name or address of the FTP server to connect to
    /// \param port    Port used for the connection
    /// \param timeout Maximum time to wait
    ///
    /// \return Server response to the request
    ///
    /// \see disconnect
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    ~Ftp();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// Automatically closes the connection with the server if
    /// it is still opened.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        std::vector<std::string> m_listing; ///< Directory/file names extracted from the data
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::vector<std::string>& getListing() const;

        ////////////////////////////////////////////////////////////
        /// \brief Return the array of directory/file names
        ///
        /// \return Array containing the requested listing
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        ListingResponse(const Response& response, const std::vector<char>& data);

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// \param response  Source response
        /// \param data      Data containing the raw listing
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API ListingResponse : public Response

    ////////////////////////////////////////////////////////////
    /// \brief Specialization of FTP response returning a
    ///        filename lisiting
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        std::string m_directory; ///< Directory extracted from the response message
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::string& getDirectory() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the directory returned in the response
        ///
        /// \return Directory name
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        DirectoryResponse(const Response& response);

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// \param response Source response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API DirectoryResponse : public Response

    ////////////////////////////////////////////////////////////
    /// \brief Specialization of FTP response returning a directory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        Status      m_status;  ///< Status code returned from the server
        std::string m_message; ///< Last message received from the server
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::string& getMessage() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the full message contained in the response
        ///
        /// \return The response message
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        Status getStatus() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the status code of the response
        ///
        /// \return Status code
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        bool isOk() const;

        ////////////////////////////////////////////////////////////
        /// \brief Check if the status code means a success
        ///
        /// This function is defined for convenience, it is
        /// equivalent to testing if the status code is < 400.
        ///
        /// \return True if the status is a success, false if it is a failure
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        explicit Response(Status code = InvalidResponse, const std::string& message = "");

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// This constructor is used by the FTP client to build
        /// the response.
        ///
        /// \param code    Response status code
        /// \param message Response message
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        };

            InvalidResponse  = 1000, ///< Response is not a valid FTP one
            ConnectionFailed = 1001, ///< Connection with server failed
            ConnectionClosed = 1002, ///< Connection with server closed
            InvalidFile      = 1003  ///< Invalid file to upload / download
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 10xx: SFML custom codes

            CommandUnknown          = 500, ///< Syntax error, command unrecognized
            ParametersUnknown       = 501, ///< Syntax error in parameters or arguments
            CommandNotImplemented   = 502, ///< Command not implemented
            BadCommandSequence      = 503, ///< Bad sequence of commands
            ParameterNotImplemented = 504, ///< Command not implemented for that parameter
            NotLoggedIn             = 530, ///< Not logged in
            NeedAccountToStore      = 532, ///< Need account for storing files
            FileUnavailable         = 550, ///< Requested action not taken, file unavailable
            PageTypeUnknown         = 551, ///< Requested action aborted, page type unknown
            NotEnoughMemory         = 552, ///< Requested file action aborted, exceeded storage allocation
            FilenameNotAllowed      = 553, ///< Requested action not taken, file name not allowed
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 5xx: the command was not accepted and

            ServiceUnavailable        = 421, ///< Service not available, closing control connection
            DataConnectionUnavailable = 425, ///< Can't open data connection
            TransferAborted           = 426, ///< Connection closed, transfer aborted
            FileActionAborted         = 450, ///< Requested file action not taken
            LocalError                = 451, ///< Requested action aborted, local error in processing
            InsufficientStorageSpace  = 452, ///< Requested action not taken; insufficient storage space in system, file unavailable
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 4xx: the command was not accepted and the requested action did not take place,

            NeedPassword       = 331, ///< User name ok, need password
            NeedAccountToLogIn = 332, ///< Need account for login
            NeedInformation    = 350, ///< Requested file action pending further information
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 3xx: the command has been accepted, but the requested action

            Ok                    = 200, ///< Command ok
            PointlessCommand      = 202, ///< Command not implemented
            SystemStatus          = 211, ///< System status, or system help reply
            DirectoryStatus       = 212, ///< Directory status
            FileStatus            = 213, ///< File status
            HelpMessage           = 214, ///< Help message
            SystemType            = 215, ///< NAME system type, where NAME is an official system name from the list in the Assigned Numbers document
            ServiceReady          = 220, ///< Service ready for new user
            ClosingConnection     = 221, ///< Service closing control connection
            DataConnectionOpened  = 225, ///< Data connection open, no transfer in progress
            ClosingDataConnection = 226, ///< Closing data connection, requested file action successful
            EnteringPassiveMode   = 227, ///< Entering passive mode
            LoggedIn              = 230, ///< User logged in, proceed. Logged out if appropriate
            FileActionOk          = 250, ///< Requested file action ok
            DirectoryOk           = 257, ///< PATHNAME created
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 2xx: the requested action has been successfully completed

            RestartMarkerReply          = 110, ///< Restart marker reply
            ServiceReadySoon            = 120, ///< Service ready in N minutes
            DataConnectionAlreadyOpened = 125, ///< Data connection already opened, transfer starting
            OpeningDataConnection       = 150, ///< File status ok, about to open data connection
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        enum Status

        ////////////////////////////////////////////////////////////
        /// \brief Status codes possibly returned by a FTP response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API Response

    ////////////////////////////////////////////////////////////
    /// \brief Define a FTP response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        Binary, ///< Binary mode (file is transfered as a sequence of bytes)
        Ascii,  ///< Text mode using ASCII encoding
        Ebcdic  ///< Text mode using EBCDIC encoding
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    enum TransferMode

    ////////////////////////////////////////////////////////////
    /// \brief Enumeration of transfer modes
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
class SFML_NETWORK_API Ftp : NonCopyable

////////////////////////////////////////////////////////////
/// \brief A FTP client
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
#ifndef SFML_FTP_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp

////////////////////////////////////////////////////////////
/// \class sf::Ftp
/// \ingroup network
///
/// sf::Ftp is a very simple FTP client that allows you
/// to communicate with a FTP server. The FTP protocol allows
/// you to manipulate a remote file system (list files,
/// upload, download, create, remove, ...).
///
/// Using the FTP client consists of 4 parts:
/// \li Connecting to the FTP server
/// \li Logging in (either as a registered user or anonymously)
/// \li Sending commands to the server
/// \li Disconnecting (this part can be done implicitely by the destructor)
///
/// Every command returns a FTP response, which contains the
/// status code as well as a message from the server. Some
/// commands such as getWorkingDirectory and getDirectoryListing
/// return additional data, and use a class derived from
/// sf::Ftp::Response to provide this data.
///
/// All commands, especially upload and download, may take some
/// time to complete. This is important to know if you don't want
/// to block your application while the server is completing
/// the task.
///
/// Usage example:
/// \code
/// // Create a new FTP client
/// sf::Ftp ftp;
///
/// // Connect to the server
/// sf::Ftp::Response response = ftp.connect("ftp://ftp.myserver.com");
/// if (response.isOk())
///     std::cout << "Connected" << std::endl;
///
/// // Log in
/// response = ftp.login("laurent", "dF6Zm89D");
/// if (response.isOk())
///     std::cout << "Logged in" << std::endl;
///
/// // Print the working directory
/// sf::Ftp::DirectoryResponse directory = ftp.getWorkingDirectory();
/// if (directory.isOk())
///     std::cout << "Working directory: " << directory.getDirectory() << std::endl;
///
/// // Create a new directory
/// response = ftp.createDirectory("files");
/// if (response.isOk())
///     std::cout << "Created new directory" << std::endl;
///
/// // Upload a file to this new directory
/// response = ftp.upload("local-path/file.txt", "files", sf::Ftp::Ascii);
/// if (response.isOk())
///     std::cout << "File uploaded" << std::endl;
///
/// // Disconnect from the server (optional)
/// ftp.disconnect();
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
};

    ////////////////////////////////////////////////////////////
    TcpSocket m_commandSocket; ///< Socket holding the control connection with the server
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class DataChannel;

    ////////////////////////////////////////////////////////////
    /// \brief Utility class for exchanging datas with the server
    ///        on the data channel
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response getResponse();

    ////////////////////////////////////////////////////////////
    /// \brief Receive a response from the server
    ///
    /// This function must be called after each call to
    /// SendCommand that expects a response.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response sendCommand(const std::string& command, const std::string& parameter = "");

    ////////////////////////////////////////////////////////////
    /// \brief Send a command to the FTP server
    ///
    /// \param command   Command to send
    /// \param parameter Command parameter
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response upload(const std::string& localFile, const std::string& remotePath, TransferMode mode = Binary);

    ////////////////////////////////////////////////////////////
    /// \brief Upload a file to the server
    ///
    /// The name of the local file is relative to the current
    /// working directory of your application, and the
    /// remote path is relative to the current directory of the
    /// FTP server.
    ///
    /// \param localFile  Path of the local file to upload
    /// \param remotePath Where to put to file on the server
    /// \param mode       Transfer mode
    ///
    /// \return Server response to the request
    ///
    /// \see download
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response download(const std::string& remoteFile, const std::string& localPath, TransferMode mode = Binary);

    ////////////////////////////////////////////////////////////
    /// \brief Download a file from the server
    ///
    /// The filename of the distant file is relative to the
    /// current working directory of the server, and the local
    /// destination path is relative to the current directory
    /// of your application.
    ///
    /// \param remoteFile Filename of the distant file to download
    /// \param localPath  Where to put to file on the local computer
    /// \param mode       Transfer mode
    ///
    /// \return Server response to the request
    ///
    /// \see upload
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response deleteFile(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Remove an existing file
    ///
    /// The file name must be relative to the current working
    /// directory.
    /// Use this function with caution, the file will be
    /// removed permanently!
    ///
    /// \param name File to remove
    ///
    /// \return Server response to the request
    ///
    /// \see renameFile
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response renameFile(const std::string& file, const std::string& newName);

    ////////////////////////////////////////////////////////////
    /// \brief Rename an existing file
    ///
    /// The filenames must be relative to the current working
    /// directory.
    ///
    /// \param file    File to rename
    /// \param newName New name of the file
    ///
    /// \return Server response to the request
    ///
    /// \see deleteFile
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response deleteDirectory(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Remove an existing directory
    ///
    /// The directory to remove must be relative to the
    /// current working directory.
    /// Use this function with caution, the directory will
    /// be removed permanently!
    ///
    /// \param name Name of the directory to remove
    ///
    /// \return Server response to the request
    ///
    /// \see createDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response createDirectory(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Create a new directory
    ///
    /// The new directory is created as a child of the current
    /// working directory.
    ///
    /// \param name Name of the directory to create
    ///
    /// \return Server response to the request
    ///
    /// \see deleteDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response parentDirectory();

    ////////////////////////////////////////////////////////////
    /// \brief Go to the parent directory of the current one
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, getDirectoryListing, changeDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response changeDirectory(const std::string& directory);

    ////////////////////////////////////////////////////////////
    /// \brief Change the current working directory
    ///
    /// The new directory must be relative to the current one.
    ///
    /// \param directory New working directory
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, getDirectoryListing, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    ListingResponse getDirectoryListing(const std::string& directory = "");

    ////////////////////////////////////////////////////////////
    /// \brief Get the contents of the given directory
    ///
    /// This function retrieves the sub-directories and files
    /// contained in the given directory. It is not recursive.
    /// The \a directory parameter is relative to the current
    /// working directory.
    ///
    /// \param directory Directory to list
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, changeDirectory, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    DirectoryResponse getWorkingDirectory();

    ////////////////////////////////////////////////////////////
    /// \brief Get the current working directory
    ///
    /// The working directory is the root path for subsequent
    /// operations involving directories and/or filenames.
    ///
    /// \return Server response to the request
    ///
    /// \see getDirectoryListing, changeDirectory, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response keepAlive();

    ////////////////////////////////////////////////////////////
    /// \brief Send a null command to keep the connection alive
    ///
    /// This command is useful because the server may close the
    /// connection automatically if no command is sent.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response login(const std::string& name, const std::string& password);

    ////////////////////////////////////////////////////////////
    /// \brief Log in using a username and a password
    ///
    /// Logging in is mandatory after connecting to the server.
    /// Users that are not logged in cannot perform any operation.
    ///
    /// \param name     User name
    /// \param password Password
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response login();

    ////////////////////////////////////////////////////////////
    /// \brief Log in using an anonymous account
    ///
    /// Logging in is mandatory after connecting to the server.
    /// Users that are not logged in cannot perform any operation.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response disconnect();

    ////////////////////////////////////////////////////////////
    /// \brief Close the connection with the server
    ///
    /// \return Server response to the request
    ///
    /// \see connect
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response connect(const IpAddress& server, unsigned short port = 21, Time timeout = Time::Zero);

    ////////////////////////////////////////////////////////////
    /// \brief Connect to the specified FTP server
    ///
    /// The port has a default value of 21, which is the standard
    /// port used by the FTP protocol. You shouldn't use a different
    /// value, unless you really know what you do.
    /// This function tries to connect to the server so it may take
    /// a while to complete, especially if the server is not
    /// reachable. To avoid blocking your application for too long,
    /// you can use a timeout. The default value, Time::Zero, means that the
    /// system timeout will be used (which is usually pretty long).
    ///
    /// \param server  Name or address of the FTP server to connect to
    /// \param port    Port used for the connection
    /// \param timeout Maximum time to wait
    ///
    /// \return Server response to the request
    ///
    /// \see disconnect
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    ~Ftp();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// Automatically closes the connection with the server if
    /// it is still opened.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        std::vector<std::string> m_listing; ///< Directory/file names extracted from the data
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::vector<std::string>& getListing() const;

        ////////////////////////////////////////////////////////////
        /// \brief Return the array of directory/file names
        ///
        /// \return Array containing the requested listing
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        ListingResponse(const Response& response, const std::vector<char>& data);

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// \param response  Source response
        /// \param data      Data containing the raw listing
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API ListingResponse : public Response

    ////////////////////////////////////////////////////////////
    /// \brief Specialization of FTP response returning a
    ///        filename lisiting
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        std::string m_directory; ///< Directory extracted from the response message
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::string& getDirectory() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the directory returned in the response
        ///
        /// \return Directory name
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        DirectoryResponse(const Response& response);

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// \param response Source response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API DirectoryResponse : public Response

    ////////////////////////////////////////////////////////////
    /// \brief Specialization of FTP response returning a directory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        Status      m_status;  ///< Status code returned from the server
        std::string m_message; ///< Last message received from the server
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::string& getMessage() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the full message contained in the response
        ///
        /// \return The response message
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        Status getStatus() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the status code of the response
        ///
        /// \return Status code
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        bool isOk() const;

        ////////////////////////////////////////////////////////////
        /// \brief Check if the status code means a success
        ///
        /// This function is defined for convenience, it is
        /// equivalent to testing if the status code is < 400.
        ///
        /// \return True if the status is a success, false if it is a failure
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        explicit Response(Status code = InvalidResponse, const std::string& message = "");

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// This constructor is used by the FTP client to build
        /// the response.
        ///
        /// \param code    Response status code
        /// \param message Response message
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        };

            InvalidResponse  = 1000, ///< Response is not a valid FTP one
            ConnectionFailed = 1001, ///< Connection with server failed
            ConnectionClosed = 1002, ///< Connection with server closed
            InvalidFile      = 1003  ///< Invalid file to upload / download
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 10xx: SFML custom codes

            CommandUnknown          = 500, ///< Syntax error, command unrecognized
            ParametersUnknown       = 501, ///< Syntax error in parameters or arguments
            CommandNotImplemented   = 502, ///< Command not implemented
            BadCommandSequence      = 503, ///< Bad sequence of commands
            ParameterNotImplemented = 504, ///< Command not implemented for that parameter
            NotLoggedIn             = 530, ///< Not logged in
            NeedAccountToStore      = 532, ///< Need account for storing files
            FileUnavailable         = 550, ///< Requested action not taken, file unavailable
            PageTypeUnknown         = 551, ///< Requested action aborted, page type unknown
            NotEnoughMemory         = 552, ///< Requested file action aborted, exceeded storage allocation
            FilenameNotAllowed      = 553, ///< Requested action not taken, file name not allowed
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 5xx: the command was not accepted and

            ServiceUnavailable        = 421, ///< Service not available, closing control connection
            DataConnectionUnavailable = 425, ///< Can't open data connection
            TransferAborted           = 426, ///< Connection closed, transfer aborted
            FileActionAborted         = 450, ///< Requested file action not taken
            LocalError                = 451, ///< Requested action aborted, local error in processing
            InsufficientStorageSpace  = 452, ///< Requested action not taken; insufficient storage space in system, file unavailable
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 4xx: the command was not accepted and the requested action did not take place,

            NeedPassword       = 331, ///< User name ok, need password
            NeedAccountToLogIn = 332, ///< Need account for login
            NeedInformation    = 350, ///< Requested file action pending further information
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 3xx: the command has been accepted, but the requested action

            Ok                    = 200, ///< Command ok
            PointlessCommand      = 202, ///< Command not implemented
            SystemStatus          = 211, ///< System status, or system help reply
            DirectoryStatus       = 212, ///< Directory status
            FileStatus            = 213, ///< File status
            HelpMessage           = 214, ///< Help message
            SystemType            = 215, ///< NAME system type, where NAME is an official system name from the list in the Assigned Numbers document
            ServiceReady          = 220, ///< Service ready for new user
            ClosingConnection     = 221, ///< Service closing control connection
            DataConnectionOpened  = 225, ///< Data connection open, no transfer in progress
            ClosingDataConnection = 226, ///< Closing data connection, requested file action successful
            EnteringPassiveMode   = 227, ///< Entering passive mode
            LoggedIn              = 230, ///< User logged in, proceed. Logged out if appropriate
            FileActionOk          = 250, ///< Requested file action ok
            DirectoryOk           = 257, ///< PATHNAME created
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 2xx: the requested action has been successfully completed

            RestartMarkerReply          = 110, ///< Restart marker reply
            ServiceReadySoon            = 120, ///< Service ready in N minutes
            DataConnectionAlreadyOpened = 125, ///< Data connection already opened, transfer starting
            OpeningDataConnection       = 150, ///< File status ok, about to open data connection
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        enum Status

        ////////////////////////////////////////////////////////////
        /// \brief Status codes possibly returned by a FTP response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API Response

    ////////////////////////////////////////////////////////////
    /// \brief Define a FTP response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        Binary, ///< Binary mode (file is transfered as a sequence of bytes)
        Ascii,  ///< Text mode using ASCII encoding
        Ebcdic  ///< Text mode using EBCDIC encoding
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    enum TransferMode

    ////////////////////////////////////////////////////////////
    /// \brief Enumeration of transfer modes
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
class SFML_NETWORK_API Ftp : NonCopyable

////////////////////////////////////////////////////////////
/// \brief A FTP client
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
#ifndef SFML_FTP_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp

////////////////////////////////////////////////////////////
/// \class sf::Ftp
/// \ingroup network
///
/// sf::Ftp is a very simple FTP client that allows you
/// to communicate with a FTP server. The FTP protocol allows
/// you to manipulate a remote file system (list files,
/// upload, download, create, remove, ...).
///
/// Using the FTP client consists of 4 parts:
/// \li Connecting to the FTP server
/// \li Logging in (either as a registered user or anonymously)
/// \li Sending commands to the server
/// \li Disconnecting (this part can be done implicitely by the destructor)
///
/// Every command returns a FTP response, which contains the
/// status code as well as a message from the server. Some
/// commands such as getWorkingDirectory and getDirectoryListing
/// return additional data, and use a class derived from
/// sf::Ftp::Response to provide this data.
///
/// All commands, especially upload and download, may take some
/// time to complete. This is important to know if you don't want
/// to block your application while the server is completing
/// the task.
///
/// Usage example:
/// \code
/// // Create a new FTP client
/// sf::Ftp ftp;
///
/// // Connect to the server
/// sf::Ftp::Response response = ftp.connect("ftp://ftp.myserver.com");
/// if (response.isOk())
///     std::cout << "Connected" << std::endl;
///
/// // Log in
/// response = ftp.login("laurent", "dF6Zm89D");
/// if (response.isOk())
///     std::cout << "Logged in" << std::endl;
///
/// // Print the working directory
/// sf::Ftp::DirectoryResponse directory = ftp.getWorkingDirectory();
/// if (directory.isOk())
///     std::cout << "Working directory: " << directory.getDirectory() << std::endl;
///
/// // Create a new directory
/// response = ftp.createDirectory("files");
/// if (response.isOk())
///     std::cout << "Created new directory" << std::endl;
///
/// // Upload a file to this new directory
/// response = ftp.upload("local-path/file.txt", "files", sf::Ftp::Ascii);
/// if (response.isOk())
///     std::cout << "File uploaded" << std::endl;
///
/// // Disconnect from the server (optional)
/// ftp.disconnect();
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
};

    ////////////////////////////////////////////////////////////
    TcpSocket m_commandSocket; ///< Socket holding the control connection with the server
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class DataChannel;

    ////////////////////////////////////////////////////////////
    /// \brief Utility class for exchanging datas with the server
    ///        on the data channel
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response getResponse();

    ////////////////////////////////////////////////////////////
    /// \brief Receive a response from the server
    ///
    /// This function must be called after each call to
    /// SendCommand that expects a response.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response sendCommand(const std::string& command, const std::string& parameter = "");

    ////////////////////////////////////////////////////////////
    /// \brief Send a command to the FTP server
    ///
    /// \param command   Command to send
    /// \param parameter Command parameter
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response upload(const std::string& localFile, const std::string& remotePath, TransferMode mode = Binary);

    ////////////////////////////////////////////////////////////
    /// \brief Upload a file to the server
    ///
    /// The name of the local file is relative to the current
    /// working directory of your application, and the
    /// remote path is relative to the current directory of the
    /// FTP server.
    ///
    /// \param localFile  Path of the local file to upload
    /// \param remotePath Where to put to file on the server
    /// \param mode       Transfer mode
    ///
    /// \return Server response to the request
    ///
    /// \see download
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response download(const std::string& remoteFile, const std::string& localPath, TransferMode mode = Binary);

    ////////////////////////////////////////////////////////////
    /// \brief Download a file from the server
    ///
    /// The filename of the distant file is relative to the
    /// current working directory of the server, and the local
    /// destination path is relative to the current directory
    /// of your application.
    ///
    /// \param remoteFile Filename of the distant file to download
    /// \param localPath  Where to put to file on the local computer
    /// \param mode       Transfer mode
    ///
    /// \return Server response to the request
    ///
    /// \see upload
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response deleteFile(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Remove an existing file
    ///
    /// The file name must be relative to the current working
    /// directory.
    /// Use this function with caution, the file will be
    /// removed permanently!
    ///
    /// \param name File to remove
    ///
    /// \return Server response to the request
    ///
    /// \see renameFile
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response renameFile(const std::string& file, const std::string& newName);

    ////////////////////////////////////////////////////////////
    /// \brief Rename an existing file
    ///
    /// The filenames must be relative to the current working
    /// directory.
    ///
    /// \param file    File to rename
    /// \param newName New name of the file
    ///
    /// \return Server response to the request
    ///
    /// \see deleteFile
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response deleteDirectory(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Remove an existing directory
    ///
    /// The directory to remove must be relative to the
    /// current working directory.
    /// Use this function with caution, the directory will
    /// be removed permanently!
    ///
    /// \param name Name of the directory to remove
    ///
    /// \return Server response to the request
    ///
    /// \see createDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response createDirectory(const std::string& name);

    ////////////////////////////////////////////////////////////
    /// \brief Create a new directory
    ///
    /// The new directory is created as a child of the current
    /// working directory.
    ///
    /// \param name Name of the directory to create
    ///
    /// \return Server response to the request
    ///
    /// \see deleteDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response parentDirectory();

    ////////////////////////////////////////////////////////////
    /// \brief Go to the parent directory of the current one
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, getDirectoryListing, changeDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response changeDirectory(const std::string& directory);

    ////////////////////////////////////////////////////////////
    /// \brief Change the current working directory
    ///
    /// The new directory must be relative to the current one.
    ///
    /// \param directory New working directory
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, getDirectoryListing, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    ListingResponse getDirectoryListing(const std::string& directory = "");

    ////////////////////////////////////////////////////////////
    /// \brief Get the contents of the given directory
    ///
    /// This function retrieves the sub-directories and files
    /// contained in the given directory. It is not recursive.
    /// The \a directory parameter is relative to the current
    /// working directory.
    ///
    /// \param directory Directory to list
    ///
    /// \return Server response to the request
    ///
    /// \see getWorkingDirectory, changeDirectory, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    DirectoryResponse getWorkingDirectory();

    ////////////////////////////////////////////////////////////
    /// \brief Get the current working directory
    ///
    /// The working directory is the root path for subsequent
    /// operations involving directories and/or filenames.
    ///
    /// \return Server response to the request
    ///
    /// \see getDirectoryListing, changeDirectory, parentDirectory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response keepAlive();

    ////////////////////////////////////////////////////////////
    /// \brief Send a null command to keep the connection alive
    ///
    /// This command is useful because the server may close the
    /// connection automatically if no command is sent.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response login(const std::string& name, const std::string& password);

    ////////////////////////////////////////////////////////////
    /// \brief Log in using a username and a password
    ///
    /// Logging in is mandatory after connecting to the server.
    /// Users that are not logged in cannot perform any operation.
    ///
    /// \param name     User name
    /// \param password Password
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response login();

    ////////////////////////////////////////////////////////////
    /// \brief Log in using an anonymous account
    ///
    /// Logging in is mandatory after connecting to the server.
    /// Users that are not logged in cannot perform any operation.
    ///
    /// \return Server response to the request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response disconnect();

    ////////////////////////////////////////////////////////////
    /// \brief Close the connection with the server
    ///
    /// \return Server response to the request
    ///
    /// \see connect
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    Response connect(const IpAddress& server, unsigned short port = 21, Time timeout = Time::Zero);

    ////////////////////////////////////////////////////////////
    /// \brief Connect to the specified FTP server
    ///
    /// The port has a default value of 21, which is the standard
    /// port used by the FTP protocol. You shouldn't use a different
    /// value, unless you really know what you do.
    /// This function tries to connect to the server so it may take
    /// a while to complete, especially if the server is not
    /// reachable. To avoid blocking your application for too long,
    /// you can use a timeout. The default value, Time::Zero, means that the
    /// system timeout will be used (which is usually pretty long).
    ///
    /// \param server  Name or address of the FTP server to connect to
    /// \param port    Port used for the connection
    /// \param timeout Maximum time to wait
    ///
    /// \return Server response to the request
    ///
    /// \see disconnect
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    ~Ftp();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// Automatically closes the connection with the server if
    /// it is still opened.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        std::vector<std::string> m_listing; ///< Directory/file names extracted from the data
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::vector<std::string>& getListing() const;

        ////////////////////////////////////////////////////////////
        /// \brief Return the array of directory/file names
        ///
        /// \return Array containing the requested listing
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        ListingResponse(const Response& response, const std::vector<char>& data);

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// \param response  Source response
        /// \param data      Data containing the raw listing
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API ListingResponse : public Response

    ////////////////////////////////////////////////////////////
    /// \brief Specialization of FTP response returning a
    ///        filename lisiting
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        std::string m_directory; ///< Directory extracted from the response message
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::string& getDirectory() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the directory returned in the response
        ///
        /// \return Directory name
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        DirectoryResponse(const Response& response);

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// \param response Source response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API DirectoryResponse : public Response

    ////////////////////////////////////////////////////////////
    /// \brief Specialization of FTP response returning a directory
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        ////////////////////////////////////////////////////////////
        Status      m_status;  ///< Status code returned from the server
        std::string m_message; ///< Last message received from the server
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        const std::string& getMessage() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the full message contained in the response
        ///
        /// \return The response message
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        Status getStatus() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the status code of the response
        ///
        /// \return Status code
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        bool isOk() const;

        ////////////////////////////////////////////////////////////
        /// \brief Check if the status code means a success
        ///
        /// This function is defined for convenience, it is
        /// equivalent to testing if the status code is < 400.
        ///
        /// \return True if the status is a success, false if it is a failure
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        explicit Response(Status code = InvalidResponse, const std::string& message = "");

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// This constructor is used by the FTP client to build
        /// the response.
        ///
        /// \param code    Response status code
        /// \param message Response message
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        };

            InvalidResponse  = 1000, ///< Response is not a valid FTP one
            ConnectionFailed = 1001, ///< Connection with server failed
            ConnectionClosed = 1002, ///< Connection with server closed
            InvalidFile      = 1003  ///< Invalid file to upload / download
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 10xx: SFML custom codes

            CommandUnknown          = 500, ///< Syntax error, command unrecognized
            ParametersUnknown       = 501, ///< Syntax error in parameters or arguments
            CommandNotImplemented   = 502, ///< Command not implemented
            BadCommandSequence      = 503, ///< Bad sequence of commands
            ParameterNotImplemented = 504, ///< Command not implemented for that parameter
            NotLoggedIn             = 530, ///< Not logged in
            NeedAccountToStore      = 532, ///< Need account for storing files
            FileUnavailable         = 550, ///< Requested action not taken, file unavailable
            PageTypeUnknown         = 551, ///< Requested action aborted, page type unknown
            NotEnoughMemory         = 552, ///< Requested file action aborted, exceeded storage allocation
            FilenameNotAllowed      = 553, ///< Requested action not taken, file name not allowed
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 5xx: the command was not accepted and

            ServiceUnavailable        = 421, ///< Service not available, closing control connection
            DataConnectionUnavailable = 425, ///< Can't open data connection
            TransferAborted           = 426, ///< Connection closed, transfer aborted
            FileActionAborted         = 450, ///< Requested file action not taken
            LocalError                = 451, ///< Requested action aborted, local error in processing
            InsufficientStorageSpace  = 452, ///< Requested action not taken; insufficient storage space in system, file unavailable
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 4xx: the command was not accepted and the requested action did not take place,

            NeedPassword       = 331, ///< User name ok, need password
            NeedAccountToLogIn = 332, ///< Need account for login
            NeedInformation    = 350, ///< Requested file action pending further information
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 3xx: the command has been accepted, but the requested action

            Ok                    = 200, ///< Command ok
            PointlessCommand      = 202, ///< Command not implemented
            SystemStatus          = 211, ///< System status, or system help reply
            DirectoryStatus       = 212, ///< Directory status
            FileStatus            = 213, ///< File status
            HelpMessage           = 214, ///< Help message
            SystemType            = 215, ///< NAME system type, where NAME is an official system name from the list in the Assigned Numbers document
            ServiceReady          = 220, ///< Service ready for new user
            ClosingConnection     = 221, ///< Service closing control connection
            DataConnectionOpened  = 225, ///< Data connection open, no transfer in progress
            ClosingDataConnection = 226, ///< Closing data connection, requested file action successful
            EnteringPassiveMode   = 227, ///< Entering passive mode
            LoggedIn              = 230, ///< User logged in, proceed. Logged out if appropriate
            FileActionOk          = 250, ///< Requested file action ok
            DirectoryOk           = 257, ///< PATHNAME created
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
            // 2xx: the requested action has been successfully completed

            RestartMarkerReply          = 110, ///< Restart marker reply
            ServiceReadySoon            = 120, ///< Service ready in N minutes
            DataConnectionAlreadyOpened = 125, ///< Data connection already opened, transfer starting
            OpeningDataConnection       = 150, ///< File status ok, about to open data connection
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
        enum Status

        ////////////////////////////////////////////////////////////
        /// \brief Status codes possibly returned by a FTP response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    class SFML_NETWORK_API Response

    ////////////////////////////////////////////////////////////
    /// \brief Define a FTP response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    };

        Binary, ///< Binary mode (file is transfered as a sequence of bytes)
        Ascii,  ///< Text mode using ASCII encoding
        Ebcdic  ///< Text mode using EBCDIC encoding
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
    enum TransferMode

    ////////////////////////////////////////////////////////////
    /// \brief Enumeration of transfer modes
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
class SFML_NETWORK_API Ftp : NonCopyable

////////////////////////////////////////////////////////////
/// \brief A FTP client
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
#ifndef SFML_FTP_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Ftp.hpp
//

////////////////////////////////////////////////////////////
