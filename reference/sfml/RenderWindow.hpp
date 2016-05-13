_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderWindow.hpp

////////////////////////////////////////////////////////////
/// \class sf::RenderWindow
/// \ingroup graphics
///
/// sf::RenderWindow is the main class of the Graphics module.
/// It defines an OS window that can be painted using the other
/// classes of the graphics module.
///
/// sf::RenderWindow is derived from sf::Window, thus it inherits
/// all its features: events, window management, OpenGL rendering,
/// etc. See the documentation of sf::Window for a more complete
/// description of all these features, as well as code examples.
///
/// On top of that, sf::RenderWindow adds more features related to
/// 2D drawing with the graphics module (see its base class
/// sf::RenderTarget for more details).
/// Here is a typical rendering and event loop with a sf::RenderWindow:
///
/// \code
/// // Declare and create a new render-window
/// sf::RenderWindow window(sf::VideoMode(800, 600), "SFML window");
///
/// // Limit the framerate to 60 frames per second (this step is optional)
/// window.setFramerateLimit(60);
///
/// // The main loop - ends as soon as the window is closed
/// while (window.isOpen())
/// {
///    // Event processing
///    sf::Event event;
///    while (window.pollEvent(event))
///    {
///        // Request for closing the window
///        if (event.type == sf::Event::Closed)
///            window.close();
///    }
///
///    // Clear the whole window before rendering a new frame
///    window.clear();
///
///    // Draw some graphical entities
///    window.draw(sprite);
///    window.draw(circle);
///    window.draw(text);
///
///    // End the current frame and display its contents on screen
///    window.display();
/// }
/// \endcode
///
/// Like sf::Window, sf::RenderWindow is still able to render direct
/// OpenGL stuff. It is even possible to mix together OpenGL calls
/// and regular SFML drawing commands.
///
/// \code
/// // Create the render window
/// sf::RenderWindow window(sf::VideoMode(800, 600), "SFML OpenGL");
///
/// // Create a sprite and a text to display
/// sf::Sprite sprite;
/// sf::Text text;
/// ...
///
/// // Perform OpenGL initializations
/// glMatrixMode(GL_PROJECTION);
/// ...
///
/// // Start the rendering loop
/// while (window.isOpen())
/// {
///     // Process events
///     ...
///
///     // Draw a background sprite
///     window.pushGLStates();
///     window.draw(sprite);
///     window.popGLStates();
///
///     // Draw a 3D object using OpenGL
///     glBegin(GL_QUADS);
///         glVertex3f(...);
///         ...
///     glEnd();
///
///     // Draw text on top of the 3D object
///     window.pushGLStates();
///     window.draw(text);
///     window.popGLStates();
///
///     // Finally, display the rendered frame on screen
///     window.display();
/// }
/// \endcode
///
/// \see sf::Window, sf::RenderTarget, sf::RenderTexture, sf::View
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderWindow.hpp
    virtual bool activate(bool active);

    ////////////////////////////////////////////////////////////
    /// \brief Activate the target for rendering
    ///
    /// \param active True to make the target active, false to deactivate it
    ///
    /// \return True if the function succeeded
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderWindow.hpp
    virtual void onResize();

    ////////////////////////////////////////////////////////////
    /// \brief Function called after the window has been resized
    ///
    /// This function is called so that derived classes can
    /// perform custom actions when the size of the window changes.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderWindow.hpp
    virtual void onCreate();

    ////////////////////////////////////////////////////////////
    /// \brief Function called after the window has been created
    ///
    /// This function is called so that derived classes can
    /// perform their own specific initialization as soon as
    /// the window is created.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderWindow.hpp
    Image capture() const;

    ////////////////////////////////////////////////////////////
    /// \brief Copy the current contents of the window to an image
    ///
    /// This is a slow operation, whose main purpose is to make
    /// screenshots of the application. If you want to update an
    /// image with the contents of the window and then use it for
    /// drawing, you should rather use a sf::Texture and its
    /// update(Window&) function.
    /// You can also draw things directly to a texture with the
    /// sf::RenderTexture class.
    ///
    /// \return Image containing the captured contents
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderWindow.hpp
    virtual Vector2u getSize() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the size of the rendering region of the window
    ///
    /// The size doesn't include the titlebar and borders
    /// of the window.
    ///
    /// \return Size in pixels
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderWindow.hpp
    virtual ~RenderWindow();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    /// Closes the window and free all the resources attached to it.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderWindow.hpp
    explicit RenderWindow(WindowHandle handle, const ContextSettings& settings = ContextSettings());

    ////////////////////////////////////////////////////////////
    /// \brief Construct the window from an existing control
    ///
    /// Use this constructor if you want to create an SFML
    /// rendering area into an already existing control.
    ///
    /// The fourth parameter is an optional structure specifying
    /// advanced OpenGL context settings such as antialiasing,
    /// depth-buffer bits, etc. You shouldn't care about these
    /// parameters for a regular usage of the graphics module.
    ///
    /// \param handle   Platform-specific handle of the control
    /// \param settings Additional settings for the underlying OpenGL context
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderWindow.hpp
    RenderWindow(VideoMode mode, const String& title, Uint32 style = Style::Default, const ContextSettings& settings = ContextSettings());

    ////////////////////////////////////////////////////////////
    /// \brief Construct a new window
    ///
    /// This constructor creates the window with the size and pixel
    /// depth defined in \a mode. An optional style can be passed to
    /// customize the look and behaviour of the window (borders,
    /// title bar, resizable, closable, ...).
    ///
    /// The fourth parameter is an optional structure specifying
    /// advanced OpenGL context settings such as antialiasing,
    /// depth-buffer bits, etc. You shouldn't care about these
    /// parameters for a regular usage of the graphics module.
    ///
    /// \param mode     Video mode to use (defines the width, height and depth of the rendering area of the window)
    /// \param title    Title of the window
    /// \param style    Window style
    /// \param settings Additional settings for the underlying OpenGL context
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderWindow.hpp
    RenderWindow();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// This constructor doesn't actually create the window,
    /// use the other constructors or call "create" to do so.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderWindow.hpp
class SFML_GRAPHICS_API RenderWindow : public Window, public RenderTarget

////////////////////////////////////////////////////////////
/// \brief Window that can serve as a target for 2D drawing
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderWindow.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderWindow.hpp
#ifndef SFML_RENDERWINDOW_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderWindow.hpp
//

////////////////////////////////////////////////////////////
