_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp

////////////////////////////////////////////////////////////
/// \class sf::Http
/// \ingroup network
///
/// sf::Http is a very simple HTTP client that allows you
/// to communicate with a web server. You can retrieve
/// web pages, send data to an interactive resource,
/// download a remote file, etc.
///
/// The HTTP client is split into 3 classes:
/// \li sf::Http::Request
/// \li sf::Http::Response
/// \li sf::Http
///
/// sf::Http::Request builds the request that will be
/// sent to the server. A request is made of:
/// \li a method (what you want to do)
/// \li a target URI (usually the name of the web page or file)
/// \li one or more header fields (options that you can pass to the server)
/// \li an optional body (for POST requests)
///
/// sf::Http::Response parse the response from the web server
/// and provides getters to read them. The response contains:
/// \li a status code
/// \li header fields (that may be answers to the ones that you requested)
/// \li a body, which contains the contents of the requested resource
///
/// sf::Http provides a simple function, SendRequest, to send a
/// sf::Http::Request and return the corresponding sf::Http::Response
/// from the server.
///
/// Usage example:
/// \code
/// // Create a new HTTP client
/// sf::Http http;
///
/// // We'll work on http://www.sfml-dev.org
/// http.setHost("http://www.sfml-dev.org");
///
/// // Prepare a request to get the 'features.php' page
/// sf::Http::Request request("features.php");
///
/// // Send the request
/// sf::Http::Response response = http.sendRequest(request);
///
/// // Check the status code and display the result
/// sf::Http::Response::Status status = response.getStatus();
/// if (status == sf::Http::Response::Ok)
/// {
///     std::cout << response.getBody() << std::endl;
/// }
/// else
/// {
///     std::cout << "Error " << status << std::endl;
/// }
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
};

    ////////////////////////////////////////////////////////////
    TcpSocket      m_connection; ///< Connection to the host
    IpAddress      m_host;       ///< Web host address
    std::string    m_hostName;   ///< Web host name
    unsigned short m_port;       ///< Port used for connection with host
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Response sendRequest(const Request& request, Time timeout = Time::Zero);

    ////////////////////////////////////////////////////////////
    /// \brief Send a HTTP request and return the server's response.
    ///
    /// You must have a valid host before sending a request (see setHost).
    /// Any missing mandatory header field in the request will be added
    /// with an appropriate value.
    /// Warning: this function waits for the server's response and may
    /// not return instantly; use a thread if you don't want to block your
    /// application, or use a timeout to limit the time to wait. A value
    /// of Time::Zero means that the client will use the system defaut timeout
    /// (which is usually pretty long).
    ///
    /// \param request Request to send
    /// \param timeout Maximum time to wait
    ///
    /// \return Server's response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    void setHost(const std::string& host, unsigned short port = 0);

    ////////////////////////////////////////////////////////////
    /// \brief Set the target host
    ///
    /// This function just stores the host address and port, it
    /// doesn't actually connect to it until you send a request.
    /// The port has a default value of 0, which means that the
    /// HTTP client will use the right port according to the
    /// protocol used (80 for HTTP, 443 for HTTPS). You should
    /// leave it like this unless you really need a port other
    /// than the standard one, or use an unknown protocol.
    ///
    /// \param host Web server to connect to
    /// \param port Port to use for connection
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Http(const std::string& host, unsigned short port = 0);

    ////////////////////////////////////////////////////////////
    /// \brief Construct the HTTP client with the target host
    ///
    /// This is equivalent to calling setHost(host, port).
    /// The port has a default value of 0, which means that the
    /// HTTP client will use the right port according to the
    /// protocol used (80 for HTTP, 443 for HTTPS). You should
    /// leave it like this unless you really need a port other
    /// than the standard one, or use an unknown protocol.
    ///
    /// \param host Web server to connect to
    /// \param port Port to use for connection
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Http();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    };

        ////////////////////////////////////////////////////////////
        FieldTable   m_fields;       ///< Fields of the header
        Status       m_status;       ///< Status code
        unsigned int m_majorVersion; ///< Major HTTP version
        unsigned int m_minorVersion; ///< Minor HTTP version
        std::string  m_body;         ///< Body of the response
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        typedef std::map<std::string, std::string> FieldTable;

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Types

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void parse(const std::string& data);

        ////////////////////////////////////////////////////////////
        /// \brief Construct the header from a response string
        ///
        /// This function is used by Http to build the response
        /// of a request.
        ///
        /// \param data Content of the response to parse
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        const std::string& getBody() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the body of the response
        ///
        /// The body of a response may contain:
        /// \li the requested page (for GET requests)
        /// \li a response from the server (for POST requests)
        /// \li nothing (for HEAD requests)
        /// \li an error message (in case of an error)
        ///
        /// \return The response body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        unsigned int getMinorHttpVersion() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the minor HTTP version number of the response
        ///
        /// \return Minor HTTP version number
        ///
        /// \see getMajorHttpVersion
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        unsigned int getMajorHttpVersion() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the major HTTP version number of the response
        ///
        /// \return Major HTTP version number
        ///
        /// \see getMinorHttpVersion
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Status getStatus() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the response status code
        ///
        /// The status code should be the first thing to be checked
        /// after receiving a response, it defines whether it is a
        /// success, a failure or anything else (see the Status
        /// enumeration).
        ///
        /// \return Status code of the response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        const std::string& getField(const std::string& field) const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the value of a field
        ///
        /// If the field \a field is not found in the response header,
        /// the empty string is returned. This function uses
        /// case-insensitive comparisons.
        ///
        /// \param field Name of the field to get
        ///
        /// \return Value of the field, or empty string if not found
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Response();

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// Constructs an empty response.
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        };

            InvalidResponse  = 1000, ///< Response is not a valid HTTP one
            ConnectionFailed = 1001  ///< Connection with server failed
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 10xx: SFML custom codes

            InternalServerError = 500, ///< The server encountered an unexpected error
            NotImplemented      = 501, ///< The server doesn't implement a requested feature
            BadGateway          = 502, ///< The gateway server has received an error from the source server
            ServiceNotAvailable = 503, ///< The server is temporarily unavailable (overloaded, in maintenance, ...)
            GatewayTimeout      = 504, ///< The gateway server couldn't receive a response from the source server
            VersionNotSupported = 505, ///< The server doesn't support the requested HTTP version
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 5xx: server error

            BadRequest          = 400, ///< The server couldn't understand the request (syntax error)
            Unauthorized        = 401, ///< The requested page needs an authentification to be accessed
            Forbidden           = 403, ///< The requested page cannot be accessed at all, even with authentification
            NotFound            = 404, ///< The requested page doesn't exist
            RangeNotSatisfiable = 407, ///< The server can't satisfy the partial GET request (with a "Range" header field)
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 4xx: client error

            MultipleChoices  = 300, ///< The requested page can be accessed from several locations
            MovedPermanently = 301, ///< The requested page has permanently moved to a new location
            MovedTemporarily = 302, ///< The requested page has temporarily moved to a new location
            NotModified      = 304, ///< For conditionnal requests, means the requested page hasn't changed and doesn't need to be refreshed
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 3xx: redirection

            Ok             = 200, ///< Most common code returned when operation was successful
            Created        = 201, ///< The resource has successfully been created
            Accepted       = 202, ///< The request has been accepted, but will be processed later by the server
            NoContent      = 204, ///< The server didn't send any data in return
            ResetContent   = 205, ///< The server informs the client that it should clear the view (form) that caused the request to be sent
            PartialContent = 206, ///< The server has sent a part of the resource, as a response to a partial GET request
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        enum Status

        ////////////////////////////////////////////////////////////
        /// \brief Enumerate all the valid status codes for a response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    class SFML_NETWORK_API Response

    ////////////////////////////////////////////////////////////
    /// \brief Define a HTTP response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    };

        ////////////////////////////////////////////////////////////
        FieldTable   m_fields;       ///< Fields of the header associated to their value
        Method       m_method;       ///< Method to use for the request
        std::string  m_uri;          ///< Target URI of the request
        unsigned int m_majorVersion; ///< Major HTTP version
        unsigned int m_minorVersion; ///< Minor HTTP version
        std::string  m_body;         ///< Body of the request
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        typedef std::map<std::string, std::string> FieldTable;

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Types

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        bool hasField(const std::string& field) const;

        ////////////////////////////////////////////////////////////
        /// \brief Check if the request defines a field
        ///
        /// This function uses case-insensitive comparisons.
        ///
        /// \param field Name of the field to test
        ///
        /// \return True if the field exists, false otherwise
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        std::string prepare() const;

        ////////////////////////////////////////////////////////////
        /// \brief Prepare the final request to send to the server
        ///
        /// This is used internally by Http before sending the
        /// request to the web server.
        ///
        /// \return String containing the request, ready to be sent
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setBody(const std::string& body);

        ////////////////////////////////////////////////////////////
        /// \brief Set the body of the request
        ///
        /// The body of a request is optional and only makes sense
        /// for POST requests. It is ignored for all other methods.
        /// The body is empty by default.
        ///
        /// \param body Content of the body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setHttpVersion(unsigned int major, unsigned int minor);

        ////////////////////////////////////////////////////////////
        /// \brief Set the HTTP version for the request
        ///
        /// The HTTP version is 1.0 by default.
        ///
        /// \param major Major HTTP version number
        /// \param minor Minor HTTP version number
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setUri(const std::string& uri);

        ////////////////////////////////////////////////////////////
        /// \brief Set the requested URI
        ///
        /// The URI is the resource (usually a web page or a file)
        /// that you want to get or post.
        /// The URI is "/" (the root page) by default.
        ///
        /// \param uri URI to request, relative to the host
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setMethod(Method method);

        ////////////////////////////////////////////////////////////
        /// \brief Set the request method
        ///
        /// See the Method enumeration for a complete list of all
        /// the availale methods.
        /// The method is Http::Request::Get by default.
        ///
        /// \param method Method to use for the request
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setField(const std::string& field, const std::string& value);

        ////////////////////////////////////////////////////////////
        /// \brief Set the value of a field
        ///
        /// The field is created if it doesn't exist. The name of
        /// the field is case insensitive.
        /// By default, a request doesn't contain any field (but the
        /// mandatory fields are added later by the HTTP client when
        /// sending the request).
        ///
        /// \param field Name of the field to set
        /// \param value Value of the field
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Request(const std::string& uri = "/", Method method = Get, const std::string& body = "");

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// This constructor creates a GET request, with the root
        /// URI ("/") and an empty body.
        ///
        /// \param uri    Target URI
        /// \param method Method to use for the request
        /// \param body   Content of the request's body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        };

            Get,  ///< Request in get mode, standard method to retrieve a page
            Post, ///< Request in post mode, usually to send data to a page
            Head  ///< Request a page's header only
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        enum Method

        ////////////////////////////////////////////////////////////
        /// \brief Enumerate the available HTTP methods for a request
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    class SFML_NETWORK_API Request

    ////////////////////////////////////////////////////////////
    /// \brief Define a HTTP request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
class SFML_NETWORK_API Http : NonCopyable

////////////////////////////////////////////////////////////
/// \brief A HTTP client
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
#ifndef SFML_HTTP_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp

////////////////////////////////////////////////////////////
/// \class sf::Http
/// \ingroup network
///
/// sf::Http is a very simple HTTP client that allows you
/// to communicate with a web server. You can retrieve
/// web pages, send data to an interactive resource,
/// download a remote file, etc.
///
/// The HTTP client is split into 3 classes:
/// \li sf::Http::Request
/// \li sf::Http::Response
/// \li sf::Http
///
/// sf::Http::Request builds the request that will be
/// sent to the server. A request is made of:
/// \li a method (what you want to do)
/// \li a target URI (usually the name of the web page or file)
/// \li one or more header fields (options that you can pass to the server)
/// \li an optional body (for POST requests)
///
/// sf::Http::Response parse the response from the web server
/// and provides getters to read them. The response contains:
/// \li a status code
/// \li header fields (that may be answers to the ones that you requested)
/// \li a body, which contains the contents of the requested resource
///
/// sf::Http provides a simple function, SendRequest, to send a
/// sf::Http::Request and return the corresponding sf::Http::Response
/// from the server.
///
/// Usage example:
/// \code
/// // Create a new HTTP client
/// sf::Http http;
///
/// // We'll work on http://www.sfml-dev.org
/// http.setHost("http://www.sfml-dev.org");
///
/// // Prepare a request to get the 'features.php' page
/// sf::Http::Request request("features.php");
///
/// // Send the request
/// sf::Http::Response response = http.sendRequest(request);
///
/// // Check the status code and display the result
/// sf::Http::Response::Status status = response.getStatus();
/// if (status == sf::Http::Response::Ok)
/// {
///     std::cout << response.getBody() << std::endl;
/// }
/// else
/// {
///     std::cout << "Error " << status << std::endl;
/// }
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
};

    ////////////////////////////////////////////////////////////
    TcpSocket      m_connection; ///< Connection to the host
    IpAddress      m_host;       ///< Web host address
    std::string    m_hostName;   ///< Web host name
    unsigned short m_port;       ///< Port used for connection with host
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Response sendRequest(const Request& request, Time timeout = Time::Zero);

    ////////////////////////////////////////////////////////////
    /// \brief Send a HTTP request and return the server's response.
    ///
    /// You must have a valid host before sending a request (see setHost).
    /// Any missing mandatory header field in the request will be added
    /// with an appropriate value.
    /// Warning: this function waits for the server's response and may
    /// not return instantly; use a thread if you don't want to block your
    /// application, or use a timeout to limit the time to wait. A value
    /// of Time::Zero means that the client will use the system defaut timeout
    /// (which is usually pretty long).
    ///
    /// \param request Request to send
    /// \param timeout Maximum time to wait
    ///
    /// \return Server's response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    void setHost(const std::string& host, unsigned short port = 0);

    ////////////////////////////////////////////////////////////
    /// \brief Set the target host
    ///
    /// This function just stores the host address and port, it
    /// doesn't actually connect to it until you send a request.
    /// The port has a default value of 0, which means that the
    /// HTTP client will use the right port according to the
    /// protocol used (80 for HTTP, 443 for HTTPS). You should
    /// leave it like this unless you really need a port other
    /// than the standard one, or use an unknown protocol.
    ///
    /// \param host Web server to connect to
    /// \param port Port to use for connection
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Http(const std::string& host, unsigned short port = 0);

    ////////////////////////////////////////////////////////////
    /// \brief Construct the HTTP client with the target host
    ///
    /// This is equivalent to calling setHost(host, port).
    /// The port has a default value of 0, which means that the
    /// HTTP client will use the right port according to the
    /// protocol used (80 for HTTP, 443 for HTTPS). You should
    /// leave it like this unless you really need a port other
    /// than the standard one, or use an unknown protocol.
    ///
    /// \param host Web server to connect to
    /// \param port Port to use for connection
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Http();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    };

        ////////////////////////////////////////////////////////////
        FieldTable   m_fields;       ///< Fields of the header
        Status       m_status;       ///< Status code
        unsigned int m_majorVersion; ///< Major HTTP version
        unsigned int m_minorVersion; ///< Minor HTTP version
        std::string  m_body;         ///< Body of the response
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        typedef std::map<std::string, std::string> FieldTable;

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Types

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void parse(const std::string& data);

        ////////////////////////////////////////////////////////////
        /// \brief Construct the header from a response string
        ///
        /// This function is used by Http to build the response
        /// of a request.
        ///
        /// \param data Content of the response to parse
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        const std::string& getBody() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the body of the response
        ///
        /// The body of a response may contain:
        /// \li the requested page (for GET requests)
        /// \li a response from the server (for POST requests)
        /// \li nothing (for HEAD requests)
        /// \li an error message (in case of an error)
        ///
        /// \return The response body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        unsigned int getMinorHttpVersion() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the minor HTTP version number of the response
        ///
        /// \return Minor HTTP version number
        ///
        /// \see getMajorHttpVersion
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        unsigned int getMajorHttpVersion() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the major HTTP version number of the response
        ///
        /// \return Major HTTP version number
        ///
        /// \see getMinorHttpVersion
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Status getStatus() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the response status code
        ///
        /// The status code should be the first thing to be checked
        /// after receiving a response, it defines whether it is a
        /// success, a failure or anything else (see the Status
        /// enumeration).
        ///
        /// \return Status code of the response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        const std::string& getField(const std::string& field) const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the value of a field
        ///
        /// If the field \a field is not found in the response header,
        /// the empty string is returned. This function uses
        /// case-insensitive comparisons.
        ///
        /// \param field Name of the field to get
        ///
        /// \return Value of the field, or empty string if not found
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Response();

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// Constructs an empty response.
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        };

            InvalidResponse  = 1000, ///< Response is not a valid HTTP one
            ConnectionFailed = 1001  ///< Connection with server failed
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 10xx: SFML custom codes

            InternalServerError = 500, ///< The server encountered an unexpected error
            NotImplemented      = 501, ///< The server doesn't implement a requested feature
            BadGateway          = 502, ///< The gateway server has received an error from the source server
            ServiceNotAvailable = 503, ///< The server is temporarily unavailable (overloaded, in maintenance, ...)
            GatewayTimeout      = 504, ///< The gateway server couldn't receive a response from the source server
            VersionNotSupported = 505, ///< The server doesn't support the requested HTTP version
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 5xx: server error

            BadRequest          = 400, ///< The server couldn't understand the request (syntax error)
            Unauthorized        = 401, ///< The requested page needs an authentification to be accessed
            Forbidden           = 403, ///< The requested page cannot be accessed at all, even with authentification
            NotFound            = 404, ///< The requested page doesn't exist
            RangeNotSatisfiable = 407, ///< The server can't satisfy the partial GET request (with a "Range" header field)
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 4xx: client error

            MultipleChoices  = 300, ///< The requested page can be accessed from several locations
            MovedPermanently = 301, ///< The requested page has permanently moved to a new location
            MovedTemporarily = 302, ///< The requested page has temporarily moved to a new location
            NotModified      = 304, ///< For conditionnal requests, means the requested page hasn't changed and doesn't need to be refreshed
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 3xx: redirection

            Ok             = 200, ///< Most common code returned when operation was successful
            Created        = 201, ///< The resource has successfully been created
            Accepted       = 202, ///< The request has been accepted, but will be processed later by the server
            NoContent      = 204, ///< The server didn't send any data in return
            ResetContent   = 205, ///< The server informs the client that it should clear the view (form) that caused the request to be sent
            PartialContent = 206, ///< The server has sent a part of the resource, as a response to a partial GET request
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        enum Status

        ////////////////////////////////////////////////////////////
        /// \brief Enumerate all the valid status codes for a response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    class SFML_NETWORK_API Response

    ////////////////////////////////////////////////////////////
    /// \brief Define a HTTP response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    };

        ////////////////////////////////////////////////////////////
        FieldTable   m_fields;       ///< Fields of the header associated to their value
        Method       m_method;       ///< Method to use for the request
        std::string  m_uri;          ///< Target URI of the request
        unsigned int m_majorVersion; ///< Major HTTP version
        unsigned int m_minorVersion; ///< Minor HTTP version
        std::string  m_body;         ///< Body of the request
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        typedef std::map<std::string, std::string> FieldTable;

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Types

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        bool hasField(const std::string& field) const;

        ////////////////////////////////////////////////////////////
        /// \brief Check if the request defines a field
        ///
        /// This function uses case-insensitive comparisons.
        ///
        /// \param field Name of the field to test
        ///
        /// \return True if the field exists, false otherwise
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        std::string prepare() const;

        ////////////////////////////////////////////////////////////
        /// \brief Prepare the final request to send to the server
        ///
        /// This is used internally by Http before sending the
        /// request to the web server.
        ///
        /// \return String containing the request, ready to be sent
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setBody(const std::string& body);

        ////////////////////////////////////////////////////////////
        /// \brief Set the body of the request
        ///
        /// The body of a request is optional and only makes sense
        /// for POST requests. It is ignored for all other methods.
        /// The body is empty by default.
        ///
        /// \param body Content of the body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setHttpVersion(unsigned int major, unsigned int minor);

        ////////////////////////////////////////////////////////////
        /// \brief Set the HTTP version for the request
        ///
        /// The HTTP version is 1.0 by default.
        ///
        /// \param major Major HTTP version number
        /// \param minor Minor HTTP version number
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setUri(const std::string& uri);

        ////////////////////////////////////////////////////////////
        /// \brief Set the requested URI
        ///
        /// The URI is the resource (usually a web page or a file)
        /// that you want to get or post.
        /// The URI is "/" (the root page) by default.
        ///
        /// \param uri URI to request, relative to the host
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setMethod(Method method);

        ////////////////////////////////////////////////////////////
        /// \brief Set the request method
        ///
        /// See the Method enumeration for a complete list of all
        /// the availale methods.
        /// The method is Http::Request::Get by default.
        ///
        /// \param method Method to use for the request
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setField(const std::string& field, const std::string& value);

        ////////////////////////////////////////////////////////////
        /// \brief Set the value of a field
        ///
        /// The field is created if it doesn't exist. The name of
        /// the field is case insensitive.
        /// By default, a request doesn't contain any field (but the
        /// mandatory fields are added later by the HTTP client when
        /// sending the request).
        ///
        /// \param field Name of the field to set
        /// \param value Value of the field
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Request(const std::string& uri = "/", Method method = Get, const std::string& body = "");

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// This constructor creates a GET request, with the root
        /// URI ("/") and an empty body.
        ///
        /// \param uri    Target URI
        /// \param method Method to use for the request
        /// \param body   Content of the request's body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        };

            Get,  ///< Request in get mode, standard method to retrieve a page
            Post, ///< Request in post mode, usually to send data to a page
            Head  ///< Request a page's header only
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        enum Method

        ////////////////////////////////////////////////////////////
        /// \brief Enumerate the available HTTP methods for a request
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    class SFML_NETWORK_API Request

    ////////////////////////////////////////////////////////////
    /// \brief Define a HTTP request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
class SFML_NETWORK_API Http : NonCopyable

////////////////////////////////////////////////////////////
/// \brief A HTTP client
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
#ifndef SFML_HTTP_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp

////////////////////////////////////////////////////////////
/// \class sf::Http
/// \ingroup network
///
/// sf::Http is a very simple HTTP client that allows you
/// to communicate with a web server. You can retrieve
/// web pages, send data to an interactive resource,
/// download a remote file, etc.
///
/// The HTTP client is split into 3 classes:
/// \li sf::Http::Request
/// \li sf::Http::Response
/// \li sf::Http
///
/// sf::Http::Request builds the request that will be
/// sent to the server. A request is made of:
/// \li a method (what you want to do)
/// \li a target URI (usually the name of the web page or file)
/// \li one or more header fields (options that you can pass to the server)
/// \li an optional body (for POST requests)
///
/// sf::Http::Response parse the response from the web server
/// and provides getters to read them. The response contains:
/// \li a status code
/// \li header fields (that may be answers to the ones that you requested)
/// \li a body, which contains the contents of the requested resource
///
/// sf::Http provides a simple function, SendRequest, to send a
/// sf::Http::Request and return the corresponding sf::Http::Response
/// from the server.
///
/// Usage example:
/// \code
/// // Create a new HTTP client
/// sf::Http http;
///
/// // We'll work on http://www.sfml-dev.org
/// http.setHost("http://www.sfml-dev.org");
///
/// // Prepare a request to get the 'features.php' page
/// sf::Http::Request request("features.php");
///
/// // Send the request
/// sf::Http::Response response = http.sendRequest(request);
///
/// // Check the status code and display the result
/// sf::Http::Response::Status status = response.getStatus();
/// if (status == sf::Http::Response::Ok)
/// {
///     std::cout << response.getBody() << std::endl;
/// }
/// else
/// {
///     std::cout << "Error " << status << std::endl;
/// }
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
};

    ////////////////////////////////////////////////////////////
    TcpSocket      m_connection; ///< Connection to the host
    IpAddress      m_host;       ///< Web host address
    std::string    m_hostName;   ///< Web host name
    unsigned short m_port;       ///< Port used for connection with host
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Response sendRequest(const Request& request, Time timeout = Time::Zero);

    ////////////////////////////////////////////////////////////
    /// \brief Send a HTTP request and return the server's response.
    ///
    /// You must have a valid host before sending a request (see setHost).
    /// Any missing mandatory header field in the request will be added
    /// with an appropriate value.
    /// Warning: this function waits for the server's response and may
    /// not return instantly; use a thread if you don't want to block your
    /// application, or use a timeout to limit the time to wait. A value
    /// of Time::Zero means that the client will use the system defaut timeout
    /// (which is usually pretty long).
    ///
    /// \param request Request to send
    /// \param timeout Maximum time to wait
    ///
    /// \return Server's response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    void setHost(const std::string& host, unsigned short port = 0);

    ////////////////////////////////////////////////////////////
    /// \brief Set the target host
    ///
    /// This function just stores the host address and port, it
    /// doesn't actually connect to it until you send a request.
    /// The port has a default value of 0, which means that the
    /// HTTP client will use the right port according to the
    /// protocol used (80 for HTTP, 443 for HTTPS). You should
    /// leave it like this unless you really need a port other
    /// than the standard one, or use an unknown protocol.
    ///
    /// \param host Web server to connect to
    /// \param port Port to use for connection
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Http(const std::string& host, unsigned short port = 0);

    ////////////////////////////////////////////////////////////
    /// \brief Construct the HTTP client with the target host
    ///
    /// This is equivalent to calling setHost(host, port).
    /// The port has a default value of 0, which means that the
    /// HTTP client will use the right port according to the
    /// protocol used (80 for HTTP, 443 for HTTPS). You should
    /// leave it like this unless you really need a port other
    /// than the standard one, or use an unknown protocol.
    ///
    /// \param host Web server to connect to
    /// \param port Port to use for connection
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Http();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    };

        ////////////////////////////////////////////////////////////
        FieldTable   m_fields;       ///< Fields of the header
        Status       m_status;       ///< Status code
        unsigned int m_majorVersion; ///< Major HTTP version
        unsigned int m_minorVersion; ///< Minor HTTP version
        std::string  m_body;         ///< Body of the response
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        typedef std::map<std::string, std::string> FieldTable;

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Types

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void parse(const std::string& data);

        ////////////////////////////////////////////////////////////
        /// \brief Construct the header from a response string
        ///
        /// This function is used by Http to build the response
        /// of a request.
        ///
        /// \param data Content of the response to parse
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        const std::string& getBody() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the body of the response
        ///
        /// The body of a response may contain:
        /// \li the requested page (for GET requests)
        /// \li a response from the server (for POST requests)
        /// \li nothing (for HEAD requests)
        /// \li an error message (in case of an error)
        ///
        /// \return The response body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        unsigned int getMinorHttpVersion() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the minor HTTP version number of the response
        ///
        /// \return Minor HTTP version number
        ///
        /// \see getMajorHttpVersion
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        unsigned int getMajorHttpVersion() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the major HTTP version number of the response
        ///
        /// \return Major HTTP version number
        ///
        /// \see getMinorHttpVersion
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Status getStatus() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the response status code
        ///
        /// The status code should be the first thing to be checked
        /// after receiving a response, it defines whether it is a
        /// success, a failure or anything else (see the Status
        /// enumeration).
        ///
        /// \return Status code of the response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        const std::string& getField(const std::string& field) const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the value of a field
        ///
        /// If the field \a field is not found in the response header,
        /// the empty string is returned. This function uses
        /// case-insensitive comparisons.
        ///
        /// \param field Name of the field to get
        ///
        /// \return Value of the field, or empty string if not found
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Response();

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// Constructs an empty response.
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        };

            InvalidResponse  = 1000, ///< Response is not a valid HTTP one
            ConnectionFailed = 1001  ///< Connection with server failed
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 10xx: SFML custom codes

            InternalServerError = 500, ///< The server encountered an unexpected error
            NotImplemented      = 501, ///< The server doesn't implement a requested feature
            BadGateway          = 502, ///< The gateway server has received an error from the source server
            ServiceNotAvailable = 503, ///< The server is temporarily unavailable (overloaded, in maintenance, ...)
            GatewayTimeout      = 504, ///< The gateway server couldn't receive a response from the source server
            VersionNotSupported = 505, ///< The server doesn't support the requested HTTP version
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 5xx: server error

            BadRequest          = 400, ///< The server couldn't understand the request (syntax error)
            Unauthorized        = 401, ///< The requested page needs an authentification to be accessed
            Forbidden           = 403, ///< The requested page cannot be accessed at all, even with authentification
            NotFound            = 404, ///< The requested page doesn't exist
            RangeNotSatisfiable = 407, ///< The server can't satisfy the partial GET request (with a "Range" header field)
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 4xx: client error

            MultipleChoices  = 300, ///< The requested page can be accessed from several locations
            MovedPermanently = 301, ///< The requested page has permanently moved to a new location
            MovedTemporarily = 302, ///< The requested page has temporarily moved to a new location
            NotModified      = 304, ///< For conditionnal requests, means the requested page hasn't changed and doesn't need to be refreshed
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 3xx: redirection

            Ok             = 200, ///< Most common code returned when operation was successful
            Created        = 201, ///< The resource has successfully been created
            Accepted       = 202, ///< The request has been accepted, but will be processed later by the server
            NoContent      = 204, ///< The server didn't send any data in return
            ResetContent   = 205, ///< The server informs the client that it should clear the view (form) that caused the request to be sent
            PartialContent = 206, ///< The server has sent a part of the resource, as a response to a partial GET request
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        enum Status

        ////////////////////////////////////////////////////////////
        /// \brief Enumerate all the valid status codes for a response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    class SFML_NETWORK_API Response

    ////////////////////////////////////////////////////////////
    /// \brief Define a HTTP response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    };

        ////////////////////////////////////////////////////////////
        FieldTable   m_fields;       ///< Fields of the header associated to their value
        Method       m_method;       ///< Method to use for the request
        std::string  m_uri;          ///< Target URI of the request
        unsigned int m_majorVersion; ///< Major HTTP version
        unsigned int m_minorVersion; ///< Minor HTTP version
        std::string  m_body;         ///< Body of the request
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        typedef std::map<std::string, std::string> FieldTable;

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Types

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        bool hasField(const std::string& field) const;

        ////////////////////////////////////////////////////////////
        /// \brief Check if the request defines a field
        ///
        /// This function uses case-insensitive comparisons.
        ///
        /// \param field Name of the field to test
        ///
        /// \return True if the field exists, false otherwise
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        std::string prepare() const;

        ////////////////////////////////////////////////////////////
        /// \brief Prepare the final request to send to the server
        ///
        /// This is used internally by Http before sending the
        /// request to the web server.
        ///
        /// \return String containing the request, ready to be sent
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setBody(const std::string& body);

        ////////////////////////////////////////////////////////////
        /// \brief Set the body of the request
        ///
        /// The body of a request is optional and only makes sense
        /// for POST requests. It is ignored for all other methods.
        /// The body is empty by default.
        ///
        /// \param body Content of the body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setHttpVersion(unsigned int major, unsigned int minor);

        ////////////////////////////////////////////////////////////
        /// \brief Set the HTTP version for the request
        ///
        /// The HTTP version is 1.0 by default.
        ///
        /// \param major Major HTTP version number
        /// \param minor Minor HTTP version number
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setUri(const std::string& uri);

        ////////////////////////////////////////////////////////////
        /// \brief Set the requested URI
        ///
        /// The URI is the resource (usually a web page or a file)
        /// that you want to get or post.
        /// The URI is "/" (the root page) by default.
        ///
        /// \param uri URI to request, relative to the host
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setMethod(Method method);

        ////////////////////////////////////////////////////////////
        /// \brief Set the request method
        ///
        /// See the Method enumeration for a complete list of all
        /// the availale methods.
        /// The method is Http::Request::Get by default.
        ///
        /// \param method Method to use for the request
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setField(const std::string& field, const std::string& value);

        ////////////////////////////////////////////////////////////
        /// \brief Set the value of a field
        ///
        /// The field is created if it doesn't exist. The name of
        /// the field is case insensitive.
        /// By default, a request doesn't contain any field (but the
        /// mandatory fields are added later by the HTTP client when
        /// sending the request).
        ///
        /// \param field Name of the field to set
        /// \param value Value of the field
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Request(const std::string& uri = "/", Method method = Get, const std::string& body = "");

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// This constructor creates a GET request, with the root
        /// URI ("/") and an empty body.
        ///
        /// \param uri    Target URI
        /// \param method Method to use for the request
        /// \param body   Content of the request's body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        };

            Get,  ///< Request in get mode, standard method to retrieve a page
            Post, ///< Request in post mode, usually to send data to a page
            Head  ///< Request a page's header only
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        enum Method

        ////////////////////////////////////////////////////////////
        /// \brief Enumerate the available HTTP methods for a request
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    class SFML_NETWORK_API Request

    ////////////////////////////////////////////////////////////
    /// \brief Define a HTTP request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
class SFML_NETWORK_API Http : NonCopyable

////////////////////////////////////////////////////////////
/// \brief A HTTP client
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
#ifndef SFML_HTTP_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp

////////////////////////////////////////////////////////////
/// \class sf::Http
/// \ingroup network
///
/// sf::Http is a very simple HTTP client that allows you
/// to communicate with a web server. You can retrieve
/// web pages, send data to an interactive resource,
/// download a remote file, etc.
///
/// The HTTP client is split into 3 classes:
/// \li sf::Http::Request
/// \li sf::Http::Response
/// \li sf::Http
///
/// sf::Http::Request builds the request that will be
/// sent to the server. A request is made of:
/// \li a method (what you want to do)
/// \li a target URI (usually the name of the web page or file)
/// \li one or more header fields (options that you can pass to the server)
/// \li an optional body (for POST requests)
///
/// sf::Http::Response parse the response from the web server
/// and provides getters to read them. The response contains:
/// \li a status code
/// \li header fields (that may be answers to the ones that you requested)
/// \li a body, which contains the contents of the requested resource
///
/// sf::Http provides a simple function, SendRequest, to send a
/// sf::Http::Request and return the corresponding sf::Http::Response
/// from the server.
///
/// Usage example:
/// \code
/// // Create a new HTTP client
/// sf::Http http;
///
/// // We'll work on http://www.sfml-dev.org
/// http.setHost("http://www.sfml-dev.org");
///
/// // Prepare a request to get the 'features.php' page
/// sf::Http::Request request("features.php");
///
/// // Send the request
/// sf::Http::Response response = http.sendRequest(request);
///
/// // Check the status code and display the result
/// sf::Http::Response::Status status = response.getStatus();
/// if (status == sf::Http::Response::Ok)
/// {
///     std::cout << response.getBody() << std::endl;
/// }
/// else
/// {
///     std::cout << "Error " << status << std::endl;
/// }
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
};

    ////////////////////////////////////////////////////////////
    TcpSocket      m_connection; ///< Connection to the host
    IpAddress      m_host;       ///< Web host address
    std::string    m_hostName;   ///< Web host name
    unsigned short m_port;       ///< Port used for connection with host
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Response sendRequest(const Request& request, Time timeout = Time::Zero);

    ////////////////////////////////////////////////////////////
    /// \brief Send a HTTP request and return the server's response.
    ///
    /// You must have a valid host before sending a request (see setHost).
    /// Any missing mandatory header field in the request will be added
    /// with an appropriate value.
    /// Warning: this function waits for the server's response and may
    /// not return instantly; use a thread if you don't want to block your
    /// application, or use a timeout to limit the time to wait. A value
    /// of Time::Zero means that the client will use the system defaut timeout
    /// (which is usually pretty long).
    ///
    /// \param request Request to send
    /// \param timeout Maximum time to wait
    ///
    /// \return Server's response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    void setHost(const std::string& host, unsigned short port = 0);

    ////////////////////////////////////////////////////////////
    /// \brief Set the target host
    ///
    /// This function just stores the host address and port, it
    /// doesn't actually connect to it until you send a request.
    /// The port has a default value of 0, which means that the
    /// HTTP client will use the right port according to the
    /// protocol used (80 for HTTP, 443 for HTTPS). You should
    /// leave it like this unless you really need a port other
    /// than the standard one, or use an unknown protocol.
    ///
    /// \param host Web server to connect to
    /// \param port Port to use for connection
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Http(const std::string& host, unsigned short port = 0);

    ////////////////////////////////////////////////////////////
    /// \brief Construct the HTTP client with the target host
    ///
    /// This is equivalent to calling setHost(host, port).
    /// The port has a default value of 0, which means that the
    /// HTTP client will use the right port according to the
    /// protocol used (80 for HTTP, 443 for HTTPS). You should
    /// leave it like this unless you really need a port other
    /// than the standard one, or use an unknown protocol.
    ///
    /// \param host Web server to connect to
    /// \param port Port to use for connection
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Http();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    };

        ////////////////////////////////////////////////////////////
        FieldTable   m_fields;       ///< Fields of the header
        Status       m_status;       ///< Status code
        unsigned int m_majorVersion; ///< Major HTTP version
        unsigned int m_minorVersion; ///< Minor HTTP version
        std::string  m_body;         ///< Body of the response
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        typedef std::map<std::string, std::string> FieldTable;

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Types

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void parse(const std::string& data);

        ////////////////////////////////////////////////////////////
        /// \brief Construct the header from a response string
        ///
        /// This function is used by Http to build the response
        /// of a request.
        ///
        /// \param data Content of the response to parse
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        const std::string& getBody() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the body of the response
        ///
        /// The body of a response may contain:
        /// \li the requested page (for GET requests)
        /// \li a response from the server (for POST requests)
        /// \li nothing (for HEAD requests)
        /// \li an error message (in case of an error)
        ///
        /// \return The response body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        unsigned int getMinorHttpVersion() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the minor HTTP version number of the response
        ///
        /// \return Minor HTTP version number
        ///
        /// \see getMajorHttpVersion
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        unsigned int getMajorHttpVersion() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the major HTTP version number of the response
        ///
        /// \return Major HTTP version number
        ///
        /// \see getMinorHttpVersion
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Status getStatus() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the response status code
        ///
        /// The status code should be the first thing to be checked
        /// after receiving a response, it defines whether it is a
        /// success, a failure or anything else (see the Status
        /// enumeration).
        ///
        /// \return Status code of the response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        const std::string& getField(const std::string& field) const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the value of a field
        ///
        /// If the field \a field is not found in the response header,
        /// the empty string is returned. This function uses
        /// case-insensitive comparisons.
        ///
        /// \param field Name of the field to get
        ///
        /// \return Value of the field, or empty string if not found
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Response();

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// Constructs an empty response.
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        };

            InvalidResponse  = 1000, ///< Response is not a valid HTTP one
            ConnectionFailed = 1001  ///< Connection with server failed
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 10xx: SFML custom codes

            InternalServerError = 500, ///< The server encountered an unexpected error
            NotImplemented      = 501, ///< The server doesn't implement a requested feature
            BadGateway          = 502, ///< The gateway server has received an error from the source server
            ServiceNotAvailable = 503, ///< The server is temporarily unavailable (overloaded, in maintenance, ...)
            GatewayTimeout      = 504, ///< The gateway server couldn't receive a response from the source server
            VersionNotSupported = 505, ///< The server doesn't support the requested HTTP version
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 5xx: server error

            BadRequest          = 400, ///< The server couldn't understand the request (syntax error)
            Unauthorized        = 401, ///< The requested page needs an authentification to be accessed
            Forbidden           = 403, ///< The requested page cannot be accessed at all, even with authentification
            NotFound            = 404, ///< The requested page doesn't exist
            RangeNotSatisfiable = 407, ///< The server can't satisfy the partial GET request (with a "Range" header field)
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 4xx: client error

            MultipleChoices  = 300, ///< The requested page can be accessed from several locations
            MovedPermanently = 301, ///< The requested page has permanently moved to a new location
            MovedTemporarily = 302, ///< The requested page has temporarily moved to a new location
            NotModified      = 304, ///< For conditionnal requests, means the requested page hasn't changed and doesn't need to be refreshed
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 3xx: redirection

            Ok             = 200, ///< Most common code returned when operation was successful
            Created        = 201, ///< The resource has successfully been created
            Accepted       = 202, ///< The request has been accepted, but will be processed later by the server
            NoContent      = 204, ///< The server didn't send any data in return
            ResetContent   = 205, ///< The server informs the client that it should clear the view (form) that caused the request to be sent
            PartialContent = 206, ///< The server has sent a part of the resource, as a response to a partial GET request
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        enum Status

        ////////////////////////////////////////////////////////////
        /// \brief Enumerate all the valid status codes for a response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    class SFML_NETWORK_API Response

    ////////////////////////////////////////////////////////////
    /// \brief Define a HTTP response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    };

        ////////////////////////////////////////////////////////////
        FieldTable   m_fields;       ///< Fields of the header associated to their value
        Method       m_method;       ///< Method to use for the request
        std::string  m_uri;          ///< Target URI of the request
        unsigned int m_majorVersion; ///< Major HTTP version
        unsigned int m_minorVersion; ///< Minor HTTP version
        std::string  m_body;         ///< Body of the request
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        typedef std::map<std::string, std::string> FieldTable;

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Types

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        bool hasField(const std::string& field) const;

        ////////////////////////////////////////////////////////////
        /// \brief Check if the request defines a field
        ///
        /// This function uses case-insensitive comparisons.
        ///
        /// \param field Name of the field to test
        ///
        /// \return True if the field exists, false otherwise
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        std::string prepare() const;

        ////////////////////////////////////////////////////////////
        /// \brief Prepare the final request to send to the server
        ///
        /// This is used internally by Http before sending the
        /// request to the web server.
        ///
        /// \return String containing the request, ready to be sent
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setBody(const std::string& body);

        ////////////////////////////////////////////////////////////
        /// \brief Set the body of the request
        ///
        /// The body of a request is optional and only makes sense
        /// for POST requests. It is ignored for all other methods.
        /// The body is empty by default.
        ///
        /// \param body Content of the body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setHttpVersion(unsigned int major, unsigned int minor);

        ////////////////////////////////////////////////////////////
        /// \brief Set the HTTP version for the request
        ///
        /// The HTTP version is 1.0 by default.
        ///
        /// \param major Major HTTP version number
        /// \param minor Minor HTTP version number
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setUri(const std::string& uri);

        ////////////////////////////////////////////////////////////
        /// \brief Set the requested URI
        ///
        /// The URI is the resource (usually a web page or a file)
        /// that you want to get or post.
        /// The URI is "/" (the root page) by default.
        ///
        /// \param uri URI to request, relative to the host
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setMethod(Method method);

        ////////////////////////////////////////////////////////////
        /// \brief Set the request method
        ///
        /// See the Method enumeration for a complete list of all
        /// the availale methods.
        /// The method is Http::Request::Get by default.
        ///
        /// \param method Method to use for the request
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setField(const std::string& field, const std::string& value);

        ////////////////////////////////////////////////////////////
        /// \brief Set the value of a field
        ///
        /// The field is created if it doesn't exist. The name of
        /// the field is case insensitive.
        /// By default, a request doesn't contain any field (but the
        /// mandatory fields are added later by the HTTP client when
        /// sending the request).
        ///
        /// \param field Name of the field to set
        /// \param value Value of the field
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Request(const std::string& uri = "/", Method method = Get, const std::string& body = "");

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// This constructor creates a GET request, with the root
        /// URI ("/") and an empty body.
        ///
        /// \param uri    Target URI
        /// \param method Method to use for the request
        /// \param body   Content of the request's body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        };

            Get,  ///< Request in get mode, standard method to retrieve a page
            Post, ///< Request in post mode, usually to send data to a page
            Head  ///< Request a page's header only
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        enum Method

        ////////////////////////////////////////////////////////////
        /// \brief Enumerate the available HTTP methods for a request
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    class SFML_NETWORK_API Request

    ////////////////////////////////////////////////////////////
    /// \brief Define a HTTP request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
class SFML_NETWORK_API Http : NonCopyable

////////////////////////////////////////////////////////////
/// \brief A HTTP client
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
#ifndef SFML_HTTP_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp

////////////////////////////////////////////////////////////
/// \class sf::Http
/// \ingroup network
///
/// sf::Http is a very simple HTTP client that allows you
/// to communicate with a web server. You can retrieve
/// web pages, send data to an interactive resource,
/// download a remote file, etc.
///
/// The HTTP client is split into 3 classes:
/// \li sf::Http::Request
/// \li sf::Http::Response
/// \li sf::Http
///
/// sf::Http::Request builds the request that will be
/// sent to the server. A request is made of:
/// \li a method (what you want to do)
/// \li a target URI (usually the name of the web page or file)
/// \li one or more header fields (options that you can pass to the server)
/// \li an optional body (for POST requests)
///
/// sf::Http::Response parse the response from the web server
/// and provides getters to read them. The response contains:
/// \li a status code
/// \li header fields (that may be answers to the ones that you requested)
/// \li a body, which contains the contents of the requested resource
///
/// sf::Http provides a simple function, SendRequest, to send a
/// sf::Http::Request and return the corresponding sf::Http::Response
/// from the server.
///
/// Usage example:
/// \code
/// // Create a new HTTP client
/// sf::Http http;
///
/// // We'll work on http://www.sfml-dev.org
/// http.setHost("http://www.sfml-dev.org");
///
/// // Prepare a request to get the 'features.php' page
/// sf::Http::Request request("features.php");
///
/// // Send the request
/// sf::Http::Response response = http.sendRequest(request);
///
/// // Check the status code and display the result
/// sf::Http::Response::Status status = response.getStatus();
/// if (status == sf::Http::Response::Ok)
/// {
///     std::cout << response.getBody() << std::endl;
/// }
/// else
/// {
///     std::cout << "Error " << status << std::endl;
/// }
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
};

    ////////////////////////////////////////////////////////////
    TcpSocket      m_connection; ///< Connection to the host
    IpAddress      m_host;       ///< Web host address
    std::string    m_hostName;   ///< Web host name
    unsigned short m_port;       ///< Port used for connection with host
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Response sendRequest(const Request& request, Time timeout = Time::Zero);

    ////////////////////////////////////////////////////////////
    /// \brief Send a HTTP request and return the server's response.
    ///
    /// You must have a valid host before sending a request (see setHost).
    /// Any missing mandatory header field in the request will be added
    /// with an appropriate value.
    /// Warning: this function waits for the server's response and may
    /// not return instantly; use a thread if you don't want to block your
    /// application, or use a timeout to limit the time to wait. A value
    /// of Time::Zero means that the client will use the system defaut timeout
    /// (which is usually pretty long).
    ///
    /// \param request Request to send
    /// \param timeout Maximum time to wait
    ///
    /// \return Server's response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    void setHost(const std::string& host, unsigned short port = 0);

    ////////////////////////////////////////////////////////////
    /// \brief Set the target host
    ///
    /// This function just stores the host address and port, it
    /// doesn't actually connect to it until you send a request.
    /// The port has a default value of 0, which means that the
    /// HTTP client will use the right port according to the
    /// protocol used (80 for HTTP, 443 for HTTPS). You should
    /// leave it like this unless you really need a port other
    /// than the standard one, or use an unknown protocol.
    ///
    /// \param host Web server to connect to
    /// \param port Port to use for connection
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Http(const std::string& host, unsigned short port = 0);

    ////////////////////////////////////////////////////////////
    /// \brief Construct the HTTP client with the target host
    ///
    /// This is equivalent to calling setHost(host, port).
    /// The port has a default value of 0, which means that the
    /// HTTP client will use the right port according to the
    /// protocol used (80 for HTTP, 443 for HTTPS). You should
    /// leave it like this unless you really need a port other
    /// than the standard one, or use an unknown protocol.
    ///
    /// \param host Web server to connect to
    /// \param port Port to use for connection
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Http();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    };

        ////////////////////////////////////////////////////////////
        FieldTable   m_fields;       ///< Fields of the header
        Status       m_status;       ///< Status code
        unsigned int m_majorVersion; ///< Major HTTP version
        unsigned int m_minorVersion; ///< Minor HTTP version
        std::string  m_body;         ///< Body of the response
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        typedef std::map<std::string, std::string> FieldTable;

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Types

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void parse(const std::string& data);

        ////////////////////////////////////////////////////////////
        /// \brief Construct the header from a response string
        ///
        /// This function is used by Http to build the response
        /// of a request.
        ///
        /// \param data Content of the response to parse
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        const std::string& getBody() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the body of the response
        ///
        /// The body of a response may contain:
        /// \li the requested page (for GET requests)
        /// \li a response from the server (for POST requests)
        /// \li nothing (for HEAD requests)
        /// \li an error message (in case of an error)
        ///
        /// \return The response body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        unsigned int getMinorHttpVersion() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the minor HTTP version number of the response
        ///
        /// \return Minor HTTP version number
        ///
        /// \see getMajorHttpVersion
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        unsigned int getMajorHttpVersion() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the major HTTP version number of the response
        ///
        /// \return Major HTTP version number
        ///
        /// \see getMinorHttpVersion
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Status getStatus() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the response status code
        ///
        /// The status code should be the first thing to be checked
        /// after receiving a response, it defines whether it is a
        /// success, a failure or anything else (see the Status
        /// enumeration).
        ///
        /// \return Status code of the response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        const std::string& getField(const std::string& field) const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the value of a field
        ///
        /// If the field \a field is not found in the response header,
        /// the empty string is returned. This function uses
        /// case-insensitive comparisons.
        ///
        /// \param field Name of the field to get
        ///
        /// \return Value of the field, or empty string if not found
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Response();

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// Constructs an empty response.
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        };

            InvalidResponse  = 1000, ///< Response is not a valid HTTP one
            ConnectionFailed = 1001  ///< Connection with server failed
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 10xx: SFML custom codes

            InternalServerError = 500, ///< The server encountered an unexpected error
            NotImplemented      = 501, ///< The server doesn't implement a requested feature
            BadGateway          = 502, ///< The gateway server has received an error from the source server
            ServiceNotAvailable = 503, ///< The server is temporarily unavailable (overloaded, in maintenance, ...)
            GatewayTimeout      = 504, ///< The gateway server couldn't receive a response from the source server
            VersionNotSupported = 505, ///< The server doesn't support the requested HTTP version
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 5xx: server error

            BadRequest          = 400, ///< The server couldn't understand the request (syntax error)
            Unauthorized        = 401, ///< The requested page needs an authentification to be accessed
            Forbidden           = 403, ///< The requested page cannot be accessed at all, even with authentification
            NotFound            = 404, ///< The requested page doesn't exist
            RangeNotSatisfiable = 407, ///< The server can't satisfy the partial GET request (with a "Range" header field)
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 4xx: client error

            MultipleChoices  = 300, ///< The requested page can be accessed from several locations
            MovedPermanently = 301, ///< The requested page has permanently moved to a new location
            MovedTemporarily = 302, ///< The requested page has temporarily moved to a new location
            NotModified      = 304, ///< For conditionnal requests, means the requested page hasn't changed and doesn't need to be refreshed
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 3xx: redirection

            Ok             = 200, ///< Most common code returned when operation was successful
            Created        = 201, ///< The resource has successfully been created
            Accepted       = 202, ///< The request has been accepted, but will be processed later by the server
            NoContent      = 204, ///< The server didn't send any data in return
            ResetContent   = 205, ///< The server informs the client that it should clear the view (form) that caused the request to be sent
            PartialContent = 206, ///< The server has sent a part of the resource, as a response to a partial GET request
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        enum Status

        ////////////////////////////////////////////////////////////
        /// \brief Enumerate all the valid status codes for a response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    class SFML_NETWORK_API Response

    ////////////////////////////////////////////////////////////
    /// \brief Define a HTTP response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    };

        ////////////////////////////////////////////////////////////
        FieldTable   m_fields;       ///< Fields of the header associated to their value
        Method       m_method;       ///< Method to use for the request
        std::string  m_uri;          ///< Target URI of the request
        unsigned int m_majorVersion; ///< Major HTTP version
        unsigned int m_minorVersion; ///< Minor HTTP version
        std::string  m_body;         ///< Body of the request
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        typedef std::map<std::string, std::string> FieldTable;

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Types

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        bool hasField(const std::string& field) const;

        ////////////////////////////////////////////////////////////
        /// \brief Check if the request defines a field
        ///
        /// This function uses case-insensitive comparisons.
        ///
        /// \param field Name of the field to test
        ///
        /// \return True if the field exists, false otherwise
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        std::string prepare() const;

        ////////////////////////////////////////////////////////////
        /// \brief Prepare the final request to send to the server
        ///
        /// This is used internally by Http before sending the
        /// request to the web server.
        ///
        /// \return String containing the request, ready to be sent
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setBody(const std::string& body);

        ////////////////////////////////////////////////////////////
        /// \brief Set the body of the request
        ///
        /// The body of a request is optional and only makes sense
        /// for POST requests. It is ignored for all other methods.
        /// The body is empty by default.
        ///
        /// \param body Content of the body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setHttpVersion(unsigned int major, unsigned int minor);

        ////////////////////////////////////////////////////////////
        /// \brief Set the HTTP version for the request
        ///
        /// The HTTP version is 1.0 by default.
        ///
        /// \param major Major HTTP version number
        /// \param minor Minor HTTP version number
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setUri(const std::string& uri);

        ////////////////////////////////////////////////////////////
        /// \brief Set the requested URI
        ///
        /// The URI is the resource (usually a web page or a file)
        /// that you want to get or post.
        /// The URI is "/" (the root page) by default.
        ///
        /// \param uri URI to request, relative to the host
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setMethod(Method method);

        ////////////////////////////////////////////////////////////
        /// \brief Set the request method
        ///
        /// See the Method enumeration for a complete list of all
        /// the availale methods.
        /// The method is Http::Request::Get by default.
        ///
        /// \param method Method to use for the request
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setField(const std::string& field, const std::string& value);

        ////////////////////////////////////////////////////////////
        /// \brief Set the value of a field
        ///
        /// The field is created if it doesn't exist. The name of
        /// the field is case insensitive.
        /// By default, a request doesn't contain any field (but the
        /// mandatory fields are added later by the HTTP client when
        /// sending the request).
        ///
        /// \param field Name of the field to set
        /// \param value Value of the field
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Request(const std::string& uri = "/", Method method = Get, const std::string& body = "");

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// This constructor creates a GET request, with the root
        /// URI ("/") and an empty body.
        ///
        /// \param uri    Target URI
        /// \param method Method to use for the request
        /// \param body   Content of the request's body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        };

            Get,  ///< Request in get mode, standard method to retrieve a page
            Post, ///< Request in post mode, usually to send data to a page
            Head  ///< Request a page's header only
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        enum Method

        ////////////////////////////////////////////////////////////
        /// \brief Enumerate the available HTTP methods for a request
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    class SFML_NETWORK_API Request

    ////////////////////////////////////////////////////////////
    /// \brief Define a HTTP request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
class SFML_NETWORK_API Http : NonCopyable

////////////////////////////////////////////////////////////
/// \brief A HTTP client
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
#ifndef SFML_HTTP_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp

////////////////////////////////////////////////////////////
/// \class sf::Http
/// \ingroup network
///
/// sf::Http is a very simple HTTP client that allows you
/// to communicate with a web server. You can retrieve
/// web pages, send data to an interactive resource,
/// download a remote file, etc.
///
/// The HTTP client is split into 3 classes:
/// \li sf::Http::Request
/// \li sf::Http::Response
/// \li sf::Http
///
/// sf::Http::Request builds the request that will be
/// sent to the server. A request is made of:
/// \li a method (what you want to do)
/// \li a target URI (usually the name of the web page or file)
/// \li one or more header fields (options that you can pass to the server)
/// \li an optional body (for POST requests)
///
/// sf::Http::Response parse the response from the web server
/// and provides getters to read them. The response contains:
/// \li a status code
/// \li header fields (that may be answers to the ones that you requested)
/// \li a body, which contains the contents of the requested resource
///
/// sf::Http provides a simple function, SendRequest, to send a
/// sf::Http::Request and return the corresponding sf::Http::Response
/// from the server.
///
/// Usage example:
/// \code
/// // Create a new HTTP client
/// sf::Http http;
///
/// // We'll work on http://www.sfml-dev.org
/// http.setHost("http://www.sfml-dev.org");
///
/// // Prepare a request to get the 'features.php' page
/// sf::Http::Request request("features.php");
///
/// // Send the request
/// sf::Http::Response response = http.sendRequest(request);
///
/// // Check the status code and display the result
/// sf::Http::Response::Status status = response.getStatus();
/// if (status == sf::Http::Response::Ok)
/// {
///     std::cout << response.getBody() << std::endl;
/// }
/// else
/// {
///     std::cout << "Error " << status << std::endl;
/// }
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
};

    ////////////////////////////////////////////////////////////
    TcpSocket      m_connection; ///< Connection to the host
    IpAddress      m_host;       ///< Web host address
    std::string    m_hostName;   ///< Web host name
    unsigned short m_port;       ///< Port used for connection with host
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Response sendRequest(const Request& request, Time timeout = Time::Zero);

    ////////////////////////////////////////////////////////////
    /// \brief Send a HTTP request and return the server's response.
    ///
    /// You must have a valid host before sending a request (see setHost).
    /// Any missing mandatory header field in the request will be added
    /// with an appropriate value.
    /// Warning: this function waits for the server's response and may
    /// not return instantly; use a thread if you don't want to block your
    /// application, or use a timeout to limit the time to wait. A value
    /// of Time::Zero means that the client will use the system defaut timeout
    /// (which is usually pretty long).
    ///
    /// \param request Request to send
    /// \param timeout Maximum time to wait
    ///
    /// \return Server's response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    void setHost(const std::string& host, unsigned short port = 0);

    ////////////////////////////////////////////////////////////
    /// \brief Set the target host
    ///
    /// This function just stores the host address and port, it
    /// doesn't actually connect to it until you send a request.
    /// The port has a default value of 0, which means that the
    /// HTTP client will use the right port according to the
    /// protocol used (80 for HTTP, 443 for HTTPS). You should
    /// leave it like this unless you really need a port other
    /// than the standard one, or use an unknown protocol.
    ///
    /// \param host Web server to connect to
    /// \param port Port to use for connection
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Http(const std::string& host, unsigned short port = 0);

    ////////////////////////////////////////////////////////////
    /// \brief Construct the HTTP client with the target host
    ///
    /// This is equivalent to calling setHost(host, port).
    /// The port has a default value of 0, which means that the
    /// HTTP client will use the right port according to the
    /// protocol used (80 for HTTP, 443 for HTTPS). You should
    /// leave it like this unless you really need a port other
    /// than the standard one, or use an unknown protocol.
    ///
    /// \param host Web server to connect to
    /// \param port Port to use for connection
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Http();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    };

        ////////////////////////////////////////////////////////////
        FieldTable   m_fields;       ///< Fields of the header
        Status       m_status;       ///< Status code
        unsigned int m_majorVersion; ///< Major HTTP version
        unsigned int m_minorVersion; ///< Minor HTTP version
        std::string  m_body;         ///< Body of the response
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        typedef std::map<std::string, std::string> FieldTable;

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Types

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void parse(const std::string& data);

        ////////////////////////////////////////////////////////////
        /// \brief Construct the header from a response string
        ///
        /// This function is used by Http to build the response
        /// of a request.
        ///
        /// \param data Content of the response to parse
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        const std::string& getBody() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the body of the response
        ///
        /// The body of a response may contain:
        /// \li the requested page (for GET requests)
        /// \li a response from the server (for POST requests)
        /// \li nothing (for HEAD requests)
        /// \li an error message (in case of an error)
        ///
        /// \return The response body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        unsigned int getMinorHttpVersion() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the minor HTTP version number of the response
        ///
        /// \return Minor HTTP version number
        ///
        /// \see getMajorHttpVersion
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        unsigned int getMajorHttpVersion() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the major HTTP version number of the response
        ///
        /// \return Major HTTP version number
        ///
        /// \see getMinorHttpVersion
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Status getStatus() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the response status code
        ///
        /// The status code should be the first thing to be checked
        /// after receiving a response, it defines whether it is a
        /// success, a failure or anything else (see the Status
        /// enumeration).
        ///
        /// \return Status code of the response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        const std::string& getField(const std::string& field) const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the value of a field
        ///
        /// If the field \a field is not found in the response header,
        /// the empty string is returned. This function uses
        /// case-insensitive comparisons.
        ///
        /// \param field Name of the field to get
        ///
        /// \return Value of the field, or empty string if not found
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Response();

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// Constructs an empty response.
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        };

            InvalidResponse  = 1000, ///< Response is not a valid HTTP one
            ConnectionFailed = 1001  ///< Connection with server failed
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 10xx: SFML custom codes

            InternalServerError = 500, ///< The server encountered an unexpected error
            NotImplemented      = 501, ///< The server doesn't implement a requested feature
            BadGateway          = 502, ///< The gateway server has received an error from the source server
            ServiceNotAvailable = 503, ///< The server is temporarily unavailable (overloaded, in maintenance, ...)
            GatewayTimeout      = 504, ///< The gateway server couldn't receive a response from the source server
            VersionNotSupported = 505, ///< The server doesn't support the requested HTTP version
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 5xx: server error

            BadRequest          = 400, ///< The server couldn't understand the request (syntax error)
            Unauthorized        = 401, ///< The requested page needs an authentification to be accessed
            Forbidden           = 403, ///< The requested page cannot be accessed at all, even with authentification
            NotFound            = 404, ///< The requested page doesn't exist
            RangeNotSatisfiable = 407, ///< The server can't satisfy the partial GET request (with a "Range" header field)
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 4xx: client error

            MultipleChoices  = 300, ///< The requested page can be accessed from several locations
            MovedPermanently = 301, ///< The requested page has permanently moved to a new location
            MovedTemporarily = 302, ///< The requested page has temporarily moved to a new location
            NotModified      = 304, ///< For conditionnal requests, means the requested page hasn't changed and doesn't need to be refreshed
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 3xx: redirection

            Ok             = 200, ///< Most common code returned when operation was successful
            Created        = 201, ///< The resource has successfully been created
            Accepted       = 202, ///< The request has been accepted, but will be processed later by the server
            NoContent      = 204, ///< The server didn't send any data in return
            ResetContent   = 205, ///< The server informs the client that it should clear the view (form) that caused the request to be sent
            PartialContent = 206, ///< The server has sent a part of the resource, as a response to a partial GET request
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        enum Status

        ////////////////////////////////////////////////////////////
        /// \brief Enumerate all the valid status codes for a response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    class SFML_NETWORK_API Response

    ////////////////////////////////////////////////////////////
    /// \brief Define a HTTP response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    };

        ////////////////////////////////////////////////////////////
        FieldTable   m_fields;       ///< Fields of the header associated to their value
        Method       m_method;       ///< Method to use for the request
        std::string  m_uri;          ///< Target URI of the request
        unsigned int m_majorVersion; ///< Major HTTP version
        unsigned int m_minorVersion; ///< Minor HTTP version
        std::string  m_body;         ///< Body of the request
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        typedef std::map<std::string, std::string> FieldTable;

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Types

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        bool hasField(const std::string& field) const;

        ////////////////////////////////////////////////////////////
        /// \brief Check if the request defines a field
        ///
        /// This function uses case-insensitive comparisons.
        ///
        /// \param field Name of the field to test
        ///
        /// \return True if the field exists, false otherwise
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        std::string prepare() const;

        ////////////////////////////////////////////////////////////
        /// \brief Prepare the final request to send to the server
        ///
        /// This is used internally by Http before sending the
        /// request to the web server.
        ///
        /// \return String containing the request, ready to be sent
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setBody(const std::string& body);

        ////////////////////////////////////////////////////////////
        /// \brief Set the body of the request
        ///
        /// The body of a request is optional and only makes sense
        /// for POST requests. It is ignored for all other methods.
        /// The body is empty by default.
        ///
        /// \param body Content of the body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setHttpVersion(unsigned int major, unsigned int minor);

        ////////////////////////////////////////////////////////////
        /// \brief Set the HTTP version for the request
        ///
        /// The HTTP version is 1.0 by default.
        ///
        /// \param major Major HTTP version number
        /// \param minor Minor HTTP version number
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setUri(const std::string& uri);

        ////////////////////////////////////////////////////////////
        /// \brief Set the requested URI
        ///
        /// The URI is the resource (usually a web page or a file)
        /// that you want to get or post.
        /// The URI is "/" (the root page) by default.
        ///
        /// \param uri URI to request, relative to the host
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setMethod(Method method);

        ////////////////////////////////////////////////////////////
        /// \brief Set the request method
        ///
        /// See the Method enumeration for a complete list of all
        /// the availale methods.
        /// The method is Http::Request::Get by default.
        ///
        /// \param method Method to use for the request
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setField(const std::string& field, const std::string& value);

        ////////////////////////////////////////////////////////////
        /// \brief Set the value of a field
        ///
        /// The field is created if it doesn't exist. The name of
        /// the field is case insensitive.
        /// By default, a request doesn't contain any field (but the
        /// mandatory fields are added later by the HTTP client when
        /// sending the request).
        ///
        /// \param field Name of the field to set
        /// \param value Value of the field
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Request(const std::string& uri = "/", Method method = Get, const std::string& body = "");

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// This constructor creates a GET request, with the root
        /// URI ("/") and an empty body.
        ///
        /// \param uri    Target URI
        /// \param method Method to use for the request
        /// \param body   Content of the request's body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        };

            Get,  ///< Request in get mode, standard method to retrieve a page
            Post, ///< Request in post mode, usually to send data to a page
            Head  ///< Request a page's header only
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        enum Method

        ////////////////////////////////////////////////////////////
        /// \brief Enumerate the available HTTP methods for a request
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    class SFML_NETWORK_API Request

    ////////////////////////////////////////////////////////////
    /// \brief Define a HTTP request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
class SFML_NETWORK_API Http : NonCopyable

////////////////////////////////////////////////////////////
/// \brief A HTTP client
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
#ifndef SFML_HTTP_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp

////////////////////////////////////////////////////////////
/// \class sf::Http
/// \ingroup network
///
/// sf::Http is a very simple HTTP client that allows you
/// to communicate with a web server. You can retrieve
/// web pages, send data to an interactive resource,
/// download a remote file, etc.
///
/// The HTTP client is split into 3 classes:
/// \li sf::Http::Request
/// \li sf::Http::Response
/// \li sf::Http
///
/// sf::Http::Request builds the request that will be
/// sent to the server. A request is made of:
/// \li a method (what you want to do)
/// \li a target URI (usually the name of the web page or file)
/// \li one or more header fields (options that you can pass to the server)
/// \li an optional body (for POST requests)
///
/// sf::Http::Response parse the response from the web server
/// and provides getters to read them. The response contains:
/// \li a status code
/// \li header fields (that may be answers to the ones that you requested)
/// \li a body, which contains the contents of the requested resource
///
/// sf::Http provides a simple function, SendRequest, to send a
/// sf::Http::Request and return the corresponding sf::Http::Response
/// from the server.
///
/// Usage example:
/// \code
/// // Create a new HTTP client
/// sf::Http http;
///
/// // We'll work on http://www.sfml-dev.org
/// http.setHost("http://www.sfml-dev.org");
///
/// // Prepare a request to get the 'features.php' page
/// sf::Http::Request request("features.php");
///
/// // Send the request
/// sf::Http::Response response = http.sendRequest(request);
///
/// // Check the status code and display the result
/// sf::Http::Response::Status status = response.getStatus();
/// if (status == sf::Http::Response::Ok)
/// {
///     std::cout << response.getBody() << std::endl;
/// }
/// else
/// {
///     std::cout << "Error " << status << std::endl;
/// }
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
};

    ////////////////////////////////////////////////////////////
    TcpSocket      m_connection; ///< Connection to the host
    IpAddress      m_host;       ///< Web host address
    std::string    m_hostName;   ///< Web host name
    unsigned short m_port;       ///< Port used for connection with host
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Response sendRequest(const Request& request, Time timeout = Time::Zero);

    ////////////////////////////////////////////////////////////
    /// \brief Send a HTTP request and return the server's response.
    ///
    /// You must have a valid host before sending a request (see setHost).
    /// Any missing mandatory header field in the request will be added
    /// with an appropriate value.
    /// Warning: this function waits for the server's response and may
    /// not return instantly; use a thread if you don't want to block your
    /// application, or use a timeout to limit the time to wait. A value
    /// of Time::Zero means that the client will use the system defaut timeout
    /// (which is usually pretty long).
    ///
    /// \param request Request to send
    /// \param timeout Maximum time to wait
    ///
    /// \return Server's response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    void setHost(const std::string& host, unsigned short port = 0);

    ////////////////////////////////////////////////////////////
    /// \brief Set the target host
    ///
    /// This function just stores the host address and port, it
    /// doesn't actually connect to it until you send a request.
    /// The port has a default value of 0, which means that the
    /// HTTP client will use the right port according to the
    /// protocol used (80 for HTTP, 443 for HTTPS). You should
    /// leave it like this unless you really need a port other
    /// than the standard one, or use an unknown protocol.
    ///
    /// \param host Web server to connect to
    /// \param port Port to use for connection
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Http(const std::string& host, unsigned short port = 0);

    ////////////////////////////////////////////////////////////
    /// \brief Construct the HTTP client with the target host
    ///
    /// This is equivalent to calling setHost(host, port).
    /// The port has a default value of 0, which means that the
    /// HTTP client will use the right port according to the
    /// protocol used (80 for HTTP, 443 for HTTPS). You should
    /// leave it like this unless you really need a port other
    /// than the standard one, or use an unknown protocol.
    ///
    /// \param host Web server to connect to
    /// \param port Port to use for connection
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Http();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    };

        ////////////////////////////////////////////////////////////
        FieldTable   m_fields;       ///< Fields of the header
        Status       m_status;       ///< Status code
        unsigned int m_majorVersion; ///< Major HTTP version
        unsigned int m_minorVersion; ///< Minor HTTP version
        std::string  m_body;         ///< Body of the response
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        typedef std::map<std::string, std::string> FieldTable;

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Types

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void parse(const std::string& data);

        ////////////////////////////////////////////////////////////
        /// \brief Construct the header from a response string
        ///
        /// This function is used by Http to build the response
        /// of a request.
        ///
        /// \param data Content of the response to parse
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        const std::string& getBody() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the body of the response
        ///
        /// The body of a response may contain:
        /// \li the requested page (for GET requests)
        /// \li a response from the server (for POST requests)
        /// \li nothing (for HEAD requests)
        /// \li an error message (in case of an error)
        ///
        /// \return The response body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        unsigned int getMinorHttpVersion() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the minor HTTP version number of the response
        ///
        /// \return Minor HTTP version number
        ///
        /// \see getMajorHttpVersion
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        unsigned int getMajorHttpVersion() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the major HTTP version number of the response
        ///
        /// \return Major HTTP version number
        ///
        /// \see getMinorHttpVersion
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Status getStatus() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the response status code
        ///
        /// The status code should be the first thing to be checked
        /// after receiving a response, it defines whether it is a
        /// success, a failure or anything else (see the Status
        /// enumeration).
        ///
        /// \return Status code of the response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        const std::string& getField(const std::string& field) const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the value of a field
        ///
        /// If the field \a field is not found in the response header,
        /// the empty string is returned. This function uses
        /// case-insensitive comparisons.
        ///
        /// \param field Name of the field to get
        ///
        /// \return Value of the field, or empty string if not found
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Response();

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// Constructs an empty response.
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        };

            InvalidResponse  = 1000, ///< Response is not a valid HTTP one
            ConnectionFailed = 1001  ///< Connection with server failed
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 10xx: SFML custom codes

            InternalServerError = 500, ///< The server encountered an unexpected error
            NotImplemented      = 501, ///< The server doesn't implement a requested feature
            BadGateway          = 502, ///< The gateway server has received an error from the source server
            ServiceNotAvailable = 503, ///< The server is temporarily unavailable (overloaded, in maintenance, ...)
            GatewayTimeout      = 504, ///< The gateway server couldn't receive a response from the source server
            VersionNotSupported = 505, ///< The server doesn't support the requested HTTP version
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 5xx: server error

            BadRequest          = 400, ///< The server couldn't understand the request (syntax error)
            Unauthorized        = 401, ///< The requested page needs an authentification to be accessed
            Forbidden           = 403, ///< The requested page cannot be accessed at all, even with authentification
            NotFound            = 404, ///< The requested page doesn't exist
            RangeNotSatisfiable = 407, ///< The server can't satisfy the partial GET request (with a "Range" header field)
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 4xx: client error

            MultipleChoices  = 300, ///< The requested page can be accessed from several locations
            MovedPermanently = 301, ///< The requested page has permanently moved to a new location
            MovedTemporarily = 302, ///< The requested page has temporarily moved to a new location
            NotModified      = 304, ///< For conditionnal requests, means the requested page hasn't changed and doesn't need to be refreshed
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 3xx: redirection

            Ok             = 200, ///< Most common code returned when operation was successful
            Created        = 201, ///< The resource has successfully been created
            Accepted       = 202, ///< The request has been accepted, but will be processed later by the server
            NoContent      = 204, ///< The server didn't send any data in return
            ResetContent   = 205, ///< The server informs the client that it should clear the view (form) that caused the request to be sent
            PartialContent = 206, ///< The server has sent a part of the resource, as a response to a partial GET request
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        enum Status

        ////////////////////////////////////////////////////////////
        /// \brief Enumerate all the valid status codes for a response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    class SFML_NETWORK_API Response

    ////////////////////////////////////////////////////////////
    /// \brief Define a HTTP response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    };

        ////////////////////////////////////////////////////////////
        FieldTable   m_fields;       ///< Fields of the header associated to their value
        Method       m_method;       ///< Method to use for the request
        std::string  m_uri;          ///< Target URI of the request
        unsigned int m_majorVersion; ///< Major HTTP version
        unsigned int m_minorVersion; ///< Minor HTTP version
        std::string  m_body;         ///< Body of the request
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        typedef std::map<std::string, std::string> FieldTable;

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Types

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        bool hasField(const std::string& field) const;

        ////////////////////////////////////////////////////////////
        /// \brief Check if the request defines a field
        ///
        /// This function uses case-insensitive comparisons.
        ///
        /// \param field Name of the field to test
        ///
        /// \return True if the field exists, false otherwise
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        std::string prepare() const;

        ////////////////////////////////////////////////////////////
        /// \brief Prepare the final request to send to the server
        ///
        /// This is used internally by Http before sending the
        /// request to the web server.
        ///
        /// \return String containing the request, ready to be sent
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setBody(const std::string& body);

        ////////////////////////////////////////////////////////////
        /// \brief Set the body of the request
        ///
        /// The body of a request is optional and only makes sense
        /// for POST requests. It is ignored for all other methods.
        /// The body is empty by default.
        ///
        /// \param body Content of the body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setHttpVersion(unsigned int major, unsigned int minor);

        ////////////////////////////////////////////////////////////
        /// \brief Set the HTTP version for the request
        ///
        /// The HTTP version is 1.0 by default.
        ///
        /// \param major Major HTTP version number
        /// \param minor Minor HTTP version number
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setUri(const std::string& uri);

        ////////////////////////////////////////////////////////////
        /// \brief Set the requested URI
        ///
        /// The URI is the resource (usually a web page or a file)
        /// that you want to get or post.
        /// The URI is "/" (the root page) by default.
        ///
        /// \param uri URI to request, relative to the host
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setMethod(Method method);

        ////////////////////////////////////////////////////////////
        /// \brief Set the request method
        ///
        /// See the Method enumeration for a complete list of all
        /// the availale methods.
        /// The method is Http::Request::Get by default.
        ///
        /// \param method Method to use for the request
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setField(const std::string& field, const std::string& value);

        ////////////////////////////////////////////////////////////
        /// \brief Set the value of a field
        ///
        /// The field is created if it doesn't exist. The name of
        /// the field is case insensitive.
        /// By default, a request doesn't contain any field (but the
        /// mandatory fields are added later by the HTTP client when
        /// sending the request).
        ///
        /// \param field Name of the field to set
        /// \param value Value of the field
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Request(const std::string& uri = "/", Method method = Get, const std::string& body = "");

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// This constructor creates a GET request, with the root
        /// URI ("/") and an empty body.
        ///
        /// \param uri    Target URI
        /// \param method Method to use for the request
        /// \param body   Content of the request's body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        };

            Get,  ///< Request in get mode, standard method to retrieve a page
            Post, ///< Request in post mode, usually to send data to a page
            Head  ///< Request a page's header only
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        enum Method

        ////////////////////////////////////////////////////////////
        /// \brief Enumerate the available HTTP methods for a request
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    class SFML_NETWORK_API Request

    ////////////////////////////////////////////////////////////
    /// \brief Define a HTTP request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
class SFML_NETWORK_API Http : NonCopyable

////////////////////////////////////////////////////////////
/// \brief A HTTP client
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
#ifndef SFML_HTTP_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp

////////////////////////////////////////////////////////////
/// \class sf::Http
/// \ingroup network
///
/// sf::Http is a very simple HTTP client that allows you
/// to communicate with a web server. You can retrieve
/// web pages, send data to an interactive resource,
/// download a remote file, etc.
///
/// The HTTP client is split into 3 classes:
/// \li sf::Http::Request
/// \li sf::Http::Response
/// \li sf::Http
///
/// sf::Http::Request builds the request that will be
/// sent to the server. A request is made of:
/// \li a method (what you want to do)
/// \li a target URI (usually the name of the web page or file)
/// \li one or more header fields (options that you can pass to the server)
/// \li an optional body (for POST requests)
///
/// sf::Http::Response parse the response from the web server
/// and provides getters to read them. The response contains:
/// \li a status code
/// \li header fields (that may be answers to the ones that you requested)
/// \li a body, which contains the contents of the requested resource
///
/// sf::Http provides a simple function, SendRequest, to send a
/// sf::Http::Request and return the corresponding sf::Http::Response
/// from the server.
///
/// Usage example:
/// \code
/// // Create a new HTTP client
/// sf::Http http;
///
/// // We'll work on http://www.sfml-dev.org
/// http.setHost("http://www.sfml-dev.org");
///
/// // Prepare a request to get the 'features.php' page
/// sf::Http::Request request("features.php");
///
/// // Send the request
/// sf::Http::Response response = http.sendRequest(request);
///
/// // Check the status code and display the result
/// sf::Http::Response::Status status = response.getStatus();
/// if (status == sf::Http::Response::Ok)
/// {
///     std::cout << response.getBody() << std::endl;
/// }
/// else
/// {
///     std::cout << "Error " << status << std::endl;
/// }
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
};

    ////////////////////////////////////////////////////////////
    TcpSocket      m_connection; ///< Connection to the host
    IpAddress      m_host;       ///< Web host address
    std::string    m_hostName;   ///< Web host name
    unsigned short m_port;       ///< Port used for connection with host
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Response sendRequest(const Request& request, Time timeout = Time::Zero);

    ////////////////////////////////////////////////////////////
    /// \brief Send a HTTP request and return the server's response.
    ///
    /// You must have a valid host before sending a request (see setHost).
    /// Any missing mandatory header field in the request will be added
    /// with an appropriate value.
    /// Warning: this function waits for the server's response and may
    /// not return instantly; use a thread if you don't want to block your
    /// application, or use a timeout to limit the time to wait. A value
    /// of Time::Zero means that the client will use the system defaut timeout
    /// (which is usually pretty long).
    ///
    /// \param request Request to send
    /// \param timeout Maximum time to wait
    ///
    /// \return Server's response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    void setHost(const std::string& host, unsigned short port = 0);

    ////////////////////////////////////////////////////////////
    /// \brief Set the target host
    ///
    /// This function just stores the host address and port, it
    /// doesn't actually connect to it until you send a request.
    /// The port has a default value of 0, which means that the
    /// HTTP client will use the right port according to the
    /// protocol used (80 for HTTP, 443 for HTTPS). You should
    /// leave it like this unless you really need a port other
    /// than the standard one, or use an unknown protocol.
    ///
    /// \param host Web server to connect to
    /// \param port Port to use for connection
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Http(const std::string& host, unsigned short port = 0);

    ////////////////////////////////////////////////////////////
    /// \brief Construct the HTTP client with the target host
    ///
    /// This is equivalent to calling setHost(host, port).
    /// The port has a default value of 0, which means that the
    /// HTTP client will use the right port according to the
    /// protocol used (80 for HTTP, 443 for HTTPS). You should
    /// leave it like this unless you really need a port other
    /// than the standard one, or use an unknown protocol.
    ///
    /// \param host Web server to connect to
    /// \param port Port to use for connection
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Http();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    };

        ////////////////////////////////////////////////////////////
        FieldTable   m_fields;       ///< Fields of the header
        Status       m_status;       ///< Status code
        unsigned int m_majorVersion; ///< Major HTTP version
        unsigned int m_minorVersion; ///< Minor HTTP version
        std::string  m_body;         ///< Body of the response
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        typedef std::map<std::string, std::string> FieldTable;

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Types

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void parse(const std::string& data);

        ////////////////////////////////////////////////////////////
        /// \brief Construct the header from a response string
        ///
        /// This function is used by Http to build the response
        /// of a request.
        ///
        /// \param data Content of the response to parse
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        const std::string& getBody() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the body of the response
        ///
        /// The body of a response may contain:
        /// \li the requested page (for GET requests)
        /// \li a response from the server (for POST requests)
        /// \li nothing (for HEAD requests)
        /// \li an error message (in case of an error)
        ///
        /// \return The response body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        unsigned int getMinorHttpVersion() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the minor HTTP version number of the response
        ///
        /// \return Minor HTTP version number
        ///
        /// \see getMajorHttpVersion
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        unsigned int getMajorHttpVersion() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the major HTTP version number of the response
        ///
        /// \return Major HTTP version number
        ///
        /// \see getMinorHttpVersion
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Status getStatus() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the response status code
        ///
        /// The status code should be the first thing to be checked
        /// after receiving a response, it defines whether it is a
        /// success, a failure or anything else (see the Status
        /// enumeration).
        ///
        /// \return Status code of the response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        const std::string& getField(const std::string& field) const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the value of a field
        ///
        /// If the field \a field is not found in the response header,
        /// the empty string is returned. This function uses
        /// case-insensitive comparisons.
        ///
        /// \param field Name of the field to get
        ///
        /// \return Value of the field, or empty string if not found
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Response();

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// Constructs an empty response.
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        };

            InvalidResponse  = 1000, ///< Response is not a valid HTTP one
            ConnectionFailed = 1001  ///< Connection with server failed
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 10xx: SFML custom codes

            InternalServerError = 500, ///< The server encountered an unexpected error
            NotImplemented      = 501, ///< The server doesn't implement a requested feature
            BadGateway          = 502, ///< The gateway server has received an error from the source server
            ServiceNotAvailable = 503, ///< The server is temporarily unavailable (overloaded, in maintenance, ...)
            GatewayTimeout      = 504, ///< The gateway server couldn't receive a response from the source server
            VersionNotSupported = 505, ///< The server doesn't support the requested HTTP version
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 5xx: server error

            BadRequest          = 400, ///< The server couldn't understand the request (syntax error)
            Unauthorized        = 401, ///< The requested page needs an authentification to be accessed
            Forbidden           = 403, ///< The requested page cannot be accessed at all, even with authentification
            NotFound            = 404, ///< The requested page doesn't exist
            RangeNotSatisfiable = 407, ///< The server can't satisfy the partial GET request (with a "Range" header field)
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 4xx: client error

            MultipleChoices  = 300, ///< The requested page can be accessed from several locations
            MovedPermanently = 301, ///< The requested page has permanently moved to a new location
            MovedTemporarily = 302, ///< The requested page has temporarily moved to a new location
            NotModified      = 304, ///< For conditionnal requests, means the requested page hasn't changed and doesn't need to be refreshed
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 3xx: redirection

            Ok             = 200, ///< Most common code returned when operation was successful
            Created        = 201, ///< The resource has successfully been created
            Accepted       = 202, ///< The request has been accepted, but will be processed later by the server
            NoContent      = 204, ///< The server didn't send any data in return
            ResetContent   = 205, ///< The server informs the client that it should clear the view (form) that caused the request to be sent
            PartialContent = 206, ///< The server has sent a part of the resource, as a response to a partial GET request
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        enum Status

        ////////////////////////////////////////////////////////////
        /// \brief Enumerate all the valid status codes for a response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    class SFML_NETWORK_API Response

    ////////////////////////////////////////////////////////////
    /// \brief Define a HTTP response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    };

        ////////////////////////////////////////////////////////////
        FieldTable   m_fields;       ///< Fields of the header associated to their value
        Method       m_method;       ///< Method to use for the request
        std::string  m_uri;          ///< Target URI of the request
        unsigned int m_majorVersion; ///< Major HTTP version
        unsigned int m_minorVersion; ///< Minor HTTP version
        std::string  m_body;         ///< Body of the request
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        typedef std::map<std::string, std::string> FieldTable;

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Types

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        bool hasField(const std::string& field) const;

        ////////////////////////////////////////////////////////////
        /// \brief Check if the request defines a field
        ///
        /// This function uses case-insensitive comparisons.
        ///
        /// \param field Name of the field to test
        ///
        /// \return True if the field exists, false otherwise
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        std::string prepare() const;

        ////////////////////////////////////////////////////////////
        /// \brief Prepare the final request to send to the server
        ///
        /// This is used internally by Http before sending the
        /// request to the web server.
        ///
        /// \return String containing the request, ready to be sent
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setBody(const std::string& body);

        ////////////////////////////////////////////////////////////
        /// \brief Set the body of the request
        ///
        /// The body of a request is optional and only makes sense
        /// for POST requests. It is ignored for all other methods.
        /// The body is empty by default.
        ///
        /// \param body Content of the body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setHttpVersion(unsigned int major, unsigned int minor);

        ////////////////////////////////////////////////////////////
        /// \brief Set the HTTP version for the request
        ///
        /// The HTTP version is 1.0 by default.
        ///
        /// \param major Major HTTP version number
        /// \param minor Minor HTTP version number
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setUri(const std::string& uri);

        ////////////////////////////////////////////////////////////
        /// \brief Set the requested URI
        ///
        /// The URI is the resource (usually a web page or a file)
        /// that you want to get or post.
        /// The URI is "/" (the root page) by default.
        ///
        /// \param uri URI to request, relative to the host
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setMethod(Method method);

        ////////////////////////////////////////////////////////////
        /// \brief Set the request method
        ///
        /// See the Method enumeration for a complete list of all
        /// the availale methods.
        /// The method is Http::Request::Get by default.
        ///
        /// \param method Method to use for the request
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setField(const std::string& field, const std::string& value);

        ////////////////////////////////////////////////////////////
        /// \brief Set the value of a field
        ///
        /// The field is created if it doesn't exist. The name of
        /// the field is case insensitive.
        /// By default, a request doesn't contain any field (but the
        /// mandatory fields are added later by the HTTP client when
        /// sending the request).
        ///
        /// \param field Name of the field to set
        /// \param value Value of the field
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Request(const std::string& uri = "/", Method method = Get, const std::string& body = "");

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// This constructor creates a GET request, with the root
        /// URI ("/") and an empty body.
        ///
        /// \param uri    Target URI
        /// \param method Method to use for the request
        /// \param body   Content of the request's body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        };

            Get,  ///< Request in get mode, standard method to retrieve a page
            Post, ///< Request in post mode, usually to send data to a page
            Head  ///< Request a page's header only
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        enum Method

        ////////////////////////////////////////////////////////////
        /// \brief Enumerate the available HTTP methods for a request
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    class SFML_NETWORK_API Request

    ////////////////////////////////////////////////////////////
    /// \brief Define a HTTP request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
class SFML_NETWORK_API Http : NonCopyable

////////////////////////////////////////////////////////////
/// \brief A HTTP client
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
#ifndef SFML_HTTP_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp

////////////////////////////////////////////////////////////
/// \class sf::Http
/// \ingroup network
///
/// sf::Http is a very simple HTTP client that allows you
/// to communicate with a web server. You can retrieve
/// web pages, send data to an interactive resource,
/// download a remote file, etc.
///
/// The HTTP client is split into 3 classes:
/// \li sf::Http::Request
/// \li sf::Http::Response
/// \li sf::Http
///
/// sf::Http::Request builds the request that will be
/// sent to the server. A request is made of:
/// \li a method (what you want to do)
/// \li a target URI (usually the name of the web page or file)
/// \li one or more header fields (options that you can pass to the server)
/// \li an optional body (for POST requests)
///
/// sf::Http::Response parse the response from the web server
/// and provides getters to read them. The response contains:
/// \li a status code
/// \li header fields (that may be answers to the ones that you requested)
/// \li a body, which contains the contents of the requested resource
///
/// sf::Http provides a simple function, SendRequest, to send a
/// sf::Http::Request and return the corresponding sf::Http::Response
/// from the server.
///
/// Usage example:
/// \code
/// // Create a new HTTP client
/// sf::Http http;
///
/// // We'll work on http://www.sfml-dev.org
/// http.setHost("http://www.sfml-dev.org");
///
/// // Prepare a request to get the 'features.php' page
/// sf::Http::Request request("features.php");
///
/// // Send the request
/// sf::Http::Response response = http.sendRequest(request);
///
/// // Check the status code and display the result
/// sf::Http::Response::Status status = response.getStatus();
/// if (status == sf::Http::Response::Ok)
/// {
///     std::cout << response.getBody() << std::endl;
/// }
/// else
/// {
///     std::cout << "Error " << status << std::endl;
/// }
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
};

    ////////////////////////////////////////////////////////////
    TcpSocket      m_connection; ///< Connection to the host
    IpAddress      m_host;       ///< Web host address
    std::string    m_hostName;   ///< Web host name
    unsigned short m_port;       ///< Port used for connection with host
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Response sendRequest(const Request& request, Time timeout = Time::Zero);

    ////////////////////////////////////////////////////////////
    /// \brief Send a HTTP request and return the server's response.
    ///
    /// You must have a valid host before sending a request (see setHost).
    /// Any missing mandatory header field in the request will be added
    /// with an appropriate value.
    /// Warning: this function waits for the server's response and may
    /// not return instantly; use a thread if you don't want to block your
    /// application, or use a timeout to limit the time to wait. A value
    /// of Time::Zero means that the client will use the system defaut timeout
    /// (which is usually pretty long).
    ///
    /// \param request Request to send
    /// \param timeout Maximum time to wait
    ///
    /// \return Server's response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    void setHost(const std::string& host, unsigned short port = 0);

    ////////////////////////////////////////////////////////////
    /// \brief Set the target host
    ///
    /// This function just stores the host address and port, it
    /// doesn't actually connect to it until you send a request.
    /// The port has a default value of 0, which means that the
    /// HTTP client will use the right port according to the
    /// protocol used (80 for HTTP, 443 for HTTPS). You should
    /// leave it like this unless you really need a port other
    /// than the standard one, or use an unknown protocol.
    ///
    /// \param host Web server to connect to
    /// \param port Port to use for connection
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Http(const std::string& host, unsigned short port = 0);

    ////////////////////////////////////////////////////////////
    /// \brief Construct the HTTP client with the target host
    ///
    /// This is equivalent to calling setHost(host, port).
    /// The port has a default value of 0, which means that the
    /// HTTP client will use the right port according to the
    /// protocol used (80 for HTTP, 443 for HTTPS). You should
    /// leave it like this unless you really need a port other
    /// than the standard one, or use an unknown protocol.
    ///
    /// \param host Web server to connect to
    /// \param port Port to use for connection
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    Http();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    };

        ////////////////////////////////////////////////////////////
        FieldTable   m_fields;       ///< Fields of the header
        Status       m_status;       ///< Status code
        unsigned int m_majorVersion; ///< Major HTTP version
        unsigned int m_minorVersion; ///< Minor HTTP version
        std::string  m_body;         ///< Body of the response
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        typedef std::map<std::string, std::string> FieldTable;

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Types

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void parse(const std::string& data);

        ////////////////////////////////////////////////////////////
        /// \brief Construct the header from a response string
        ///
        /// This function is used by Http to build the response
        /// of a request.
        ///
        /// \param data Content of the response to parse
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        const std::string& getBody() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the body of the response
        ///
        /// The body of a response may contain:
        /// \li the requested page (for GET requests)
        /// \li a response from the server (for POST requests)
        /// \li nothing (for HEAD requests)
        /// \li an error message (in case of an error)
        ///
        /// \return The response body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        unsigned int getMinorHttpVersion() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the minor HTTP version number of the response
        ///
        /// \return Minor HTTP version number
        ///
        /// \see getMajorHttpVersion
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        unsigned int getMajorHttpVersion() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the major HTTP version number of the response
        ///
        /// \return Major HTTP version number
        ///
        /// \see getMinorHttpVersion
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Status getStatus() const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the response status code
        ///
        /// The status code should be the first thing to be checked
        /// after receiving a response, it defines whether it is a
        /// success, a failure or anything else (see the Status
        /// enumeration).
        ///
        /// \return Status code of the response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        const std::string& getField(const std::string& field) const;

        ////////////////////////////////////////////////////////////
        /// \brief Get the value of a field
        ///
        /// If the field \a field is not found in the response header,
        /// the empty string is returned. This function uses
        /// case-insensitive comparisons.
        ///
        /// \param field Name of the field to get
        ///
        /// \return Value of the field, or empty string if not found
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Response();

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// Constructs an empty response.
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        };

            InvalidResponse  = 1000, ///< Response is not a valid HTTP one
            ConnectionFailed = 1001  ///< Connection with server failed
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 10xx: SFML custom codes

            InternalServerError = 500, ///< The server encountered an unexpected error
            NotImplemented      = 501, ///< The server doesn't implement a requested feature
            BadGateway          = 502, ///< The gateway server has received an error from the source server
            ServiceNotAvailable = 503, ///< The server is temporarily unavailable (overloaded, in maintenance, ...)
            GatewayTimeout      = 504, ///< The gateway server couldn't receive a response from the source server
            VersionNotSupported = 505, ///< The server doesn't support the requested HTTP version
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 5xx: server error

            BadRequest          = 400, ///< The server couldn't understand the request (syntax error)
            Unauthorized        = 401, ///< The requested page needs an authentification to be accessed
            Forbidden           = 403, ///< The requested page cannot be accessed at all, even with authentification
            NotFound            = 404, ///< The requested page doesn't exist
            RangeNotSatisfiable = 407, ///< The server can't satisfy the partial GET request (with a "Range" header field)
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 4xx: client error

            MultipleChoices  = 300, ///< The requested page can be accessed from several locations
            MovedPermanently = 301, ///< The requested page has permanently moved to a new location
            MovedTemporarily = 302, ///< The requested page has temporarily moved to a new location
            NotModified      = 304, ///< For conditionnal requests, means the requested page hasn't changed and doesn't need to be refreshed
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
            // 3xx: redirection

            Ok             = 200, ///< Most common code returned when operation was successful
            Created        = 201, ///< The resource has successfully been created
            Accepted       = 202, ///< The request has been accepted, but will be processed later by the server
            NoContent      = 204, ///< The server didn't send any data in return
            ResetContent   = 205, ///< The server informs the client that it should clear the view (form) that caused the request to be sent
            PartialContent = 206, ///< The server has sent a part of the resource, as a response to a partial GET request
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        enum Status

        ////////////////////////////////////////////////////////////
        /// \brief Enumerate all the valid status codes for a response
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    class SFML_NETWORK_API Response

    ////////////////////////////////////////////////////////////
    /// \brief Define a HTTP response
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    };

        ////////////////////////////////////////////////////////////
        FieldTable   m_fields;       ///< Fields of the header associated to their value
        Method       m_method;       ///< Method to use for the request
        std::string  m_uri;          ///< Target URI of the request
        unsigned int m_majorVersion; ///< Major HTTP version
        unsigned int m_minorVersion; ///< Minor HTTP version
        std::string  m_body;         ///< Body of the request
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Member data

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        typedef std::map<std::string, std::string> FieldTable;

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        // Types

        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        bool hasField(const std::string& field) const;

        ////////////////////////////////////////////////////////////
        /// \brief Check if the request defines a field
        ///
        /// This function uses case-insensitive comparisons.
        ///
        /// \param field Name of the field to test
        ///
        /// \return True if the field exists, false otherwise
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        std::string prepare() const;

        ////////////////////////////////////////////////////////////
        /// \brief Prepare the final request to send to the server
        ///
        /// This is used internally by Http before sending the
        /// request to the web server.
        ///
        /// \return String containing the request, ready to be sent
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setBody(const std::string& body);

        ////////////////////////////////////////////////////////////
        /// \brief Set the body of the request
        ///
        /// The body of a request is optional and only makes sense
        /// for POST requests. It is ignored for all other methods.
        /// The body is empty by default.
        ///
        /// \param body Content of the body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setHttpVersion(unsigned int major, unsigned int minor);

        ////////////////////////////////////////////////////////////
        /// \brief Set the HTTP version for the request
        ///
        /// The HTTP version is 1.0 by default.
        ///
        /// \param major Major HTTP version number
        /// \param minor Minor HTTP version number
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setUri(const std::string& uri);

        ////////////////////////////////////////////////////////////
        /// \brief Set the requested URI
        ///
        /// The URI is the resource (usually a web page or a file)
        /// that you want to get or post.
        /// The URI is "/" (the root page) by default.
        ///
        /// \param uri URI to request, relative to the host
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setMethod(Method method);

        ////////////////////////////////////////////////////////////
        /// \brief Set the request method
        ///
        /// See the Method enumeration for a complete list of all
        /// the availale methods.
        /// The method is Http::Request::Get by default.
        ///
        /// \param method Method to use for the request
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        void setField(const std::string& field, const std::string& value);

        ////////////////////////////////////////////////////////////
        /// \brief Set the value of a field
        ///
        /// The field is created if it doesn't exist. The name of
        /// the field is case insensitive.
        /// By default, a request doesn't contain any field (but the
        /// mandatory fields are added later by the HTTP client when
        /// sending the request).
        ///
        /// \param field Name of the field to set
        /// \param value Value of the field
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        Request(const std::string& uri = "/", Method method = Get, const std::string& body = "");

        ////////////////////////////////////////////////////////////
        /// \brief Default constructor
        ///
        /// This constructor creates a GET request, with the root
        /// URI ("/") and an empty body.
        ///
        /// \param uri    Target URI
        /// \param method Method to use for the request
        /// \param body   Content of the request's body
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        };

            Get,  ///< Request in get mode, standard method to retrieve a page
            Post, ///< Request in post mode, usually to send data to a page
            Head  ///< Request a page's header only
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
        enum Method

        ////////////////////////////////////////////////////////////
        /// \brief Enumerate the available HTTP methods for a request
        ///
        ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
    class SFML_NETWORK_API Request

    ////////////////////////////////////////////////////////////
    /// \brief Define a HTTP request
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
class SFML_NETWORK_API Http : NonCopyable

////////////////////////////////////////////////////////////
/// \brief A HTTP client
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
#ifndef SFML_HTTP_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/Http.hpp
//

////////////////////////////////////////////////////////////
