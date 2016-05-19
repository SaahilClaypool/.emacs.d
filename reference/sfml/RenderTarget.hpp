_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp

////////////////////////////////////////////////////////////
/// \class sf::RenderTarget
/// \ingroup graphics
///
/// sf::RenderTarget defines the common behaviour of all the
/// 2D render targets usable in the graphics module. It makes
/// it possible to draw 2D entities like sprites, shapes, text
/// without using any OpenGL command directly.
///
/// A sf::RenderTarget is also able to use views (sf::View),
/// which are a kind of 2D cameras. With views you can globally
/// scroll, rotate or zoom everything that is drawn,
/// without having to transform every single entity. See the
/// documentation of sf::View for more details and sample pieces of
/// code about this class.
///
/// On top of that, render targets are still able to render direct
/// OpenGL stuff. It is even possible to mix together OpenGL calls
/// and regular SFML drawing commands. When doing so, make sure that
/// OpenGL states are not messed up by calling the
/// pushGLStates/popGLStates functions.
///
/// \see sf::RenderWindow, sf::RenderTexture, sf::View
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
};

    ////////////////////////////////////////////////////////////
    View        m_defaultView; ///< Default view
    View        m_view;        ///< Current view
    StatesCache m_cache;       ///< Render states cache
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    };

        bool      glStatesSet;    ///< Are our internal GL states set yet?
        bool      viewChanged;    ///< Has the current view changed since last draw?
        BlendMode lastBlendMode;  ///< Cached blending mode
        Uint64    lastTextureId;  ///< Cached texture
        bool      useVertexCache; ///< Did we previously use the vertex cache?
        Vertex    vertexCache[VertexCacheSize]; ///< Pre-transformed vertices cache
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    struct StatesCache

    ////////////////////////////////////////////////////////////
    /// \brief Render states cache
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    virtual bool activate(bool active) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Activate the target for rendering
    ///
    /// This function must be implemented by derived classes to make
    /// their OpenGL context current; it is called by the base class
    /// everytime it's going to use OpenGL calls.
    ///
    /// \param active True to make the target active, false to deactivate it
    ///
    /// \return True if the function succeeded
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void applyShader(const Shader* shader);

    ////////////////////////////////////////////////////////////
    /// \brief Apply a new shader
    ///
    /// \param shader Shader to apply
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void applyTexture(const Texture* texture);

    ////////////////////////////////////////////////////////////
    /// \brief Apply a new texture
    ///
    /// \param texture Texture to apply
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void applyTransform(const Transform& transform);

    ////////////////////////////////////////////////////////////
    /// \brief Apply a new transform
    ///
    /// \param transform Transform to apply
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void applyBlendMode(BlendMode mode);

    ////////////////////////////////////////////////////////////
    /// \brief Apply a new blending mode
    ///
    /// \param mode Blending mode to apply
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void applyCurrentView();

    ////////////////////////////////////////////////////////////
    /// \brief Apply the current view
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void initialize();

    ////////////////////////////////////////////////////////////
    /// \brief Performs the common initialization step after creation
    ///
    /// The derived classes must call this function after the
    /// target is created and ready for drawing.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    RenderTarget();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void resetGLStates();

    ////////////////////////////////////////////////////////////
    /// \brief Reset the internal OpenGL states so that the target is ready for drawing
    ///
    /// This function can be used when you mix SFML drawing
    /// and direct OpenGL rendering, if you choose not to use
    /// pushGLStates/popGLStates. It makes sure that all OpenGL
    /// states needed by SFML are set, so that subsequent draw()
    /// calls will work as expected.
    ///
    /// Example:
    /// \code
    /// // OpenGL code here...
    /// glPushAttrib(...);
    /// window.resetGLStates();
    /// window.draw(...);
    /// window.draw(...);
    /// glPopAttrib(...);
    /// // OpenGL code here...
    /// \endcode
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void popGLStates();

    ////////////////////////////////////////////////////////////
    /// \brief Restore the previously saved OpenGL render states and matrices
    ///
    /// See the description of pushGLStates to get a detailed
    /// description of these functions.
    ///
    /// \see pushGLStates
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void pushGLStates();

    ////////////////////////////////////////////////////////////
    /// \brief Save the current OpenGL render states and matrices
    ///
    /// This function can be used when you mix SFML drawing
    /// and direct OpenGL rendering. Combined with PopGLStates,
    /// it ensures that:
    /// \li SFML's internal states are not messed up by your OpenGL code
    /// \li your OpenGL states are not modified by a call to a SFML function
    ///
    /// More specifically, it must be used around code that
    /// calls Draw functions. Example:
    /// \code
    /// // OpenGL code here...
    /// window.pushGLStates();
    /// window.draw(...);
    /// window.draw(...);
    /// window.popGLStates();
    /// // OpenGL code here...
    /// \endcode
    ///
    /// Note that this function is quite expensive: it saves all the
    /// possible OpenGL states and matrices, even the ones you
    /// don't care about. Therefore it should be used wisely.
    /// It is provided for convenience, but the best results will
    /// be achieved if you handle OpenGL states yourself (because
    /// you know which states have really changed, and need to be
    /// saved and restored). Take a look at the ResetGLStates
    /// function if you do so.
    ///
    /// \see popGLStates
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    virtual Vector2u getSize() const = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Return the size of the rendering region of the target
    ///
    /// \return Size in pixels
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void draw(const Vertex* vertices, unsigned int vertexCount,
              PrimitiveType type, const RenderStates& states = RenderStates::Default);

    ////////////////////////////////////////////////////////////
    /// \brief Draw primitives defined by an array of vertices
    ///
    /// \param vertices    Pointer to the vertices
    /// \param vertexCount Number of vertices in the array
    /// \param type        Type of primitives to draw
    /// \param states      Render states to use for drawing
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void draw(const Drawable& drawable, const RenderStates& states = RenderStates::Default);

    ////////////////////////////////////////////////////////////
    /// \brief Draw a drawable object to the render-target
    ///
    /// \param drawable Object to draw
    /// \param states   Render states to use for drawing
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    Vector2i mapCoordsToPixel(const Vector2f& point, const View& view) const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert a point from world coordinates to target coordinates
    ///
    /// This function finds the pixel of the render-target that matches
    /// the given 2D point. In other words, it goes through the same process
    /// as the graphics card, to compute the final position of a rendered point.
    ///
    /// Initially, both coordinate systems (world units and target pixels)
    /// match perfectly. But if you define a custom view or resize your
    /// render-target, this assertion is not true anymore, ie. a point
    /// located at (150, 75) in your 2D world may map to the pixel
    /// (10, 50) of your render-target -- if the view is translated by (140, 25).
    ///
    /// This version uses a custom view for calculations, see the other
    /// overload of the function if you want to use the current view of the
    /// render-target.
    ///
    /// \param point Point to convert
    /// \param view The view to use for converting the point
    ///
    /// \return The converted point, in target coordinates (pixels)
    ///
    /// \see mapPixelToCoords
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    Vector2i mapCoordsToPixel(const Vector2f& point) const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert a point from world coordinates to target
    ///        coordinates, using the current view
    ///
    /// This function is an overload of the mapCoordsToPixel
    /// function that implicitely uses the current view.
    /// It is equivalent to:
    /// \code
    /// target.mapCoordsToPixel(point, target.getView());
    /// \endcode
    ///
    /// \param point Point to convert
    ///
    /// \return The converted point, in target coordinates (pixels)
    ///
    /// \see mapPixelToCoords
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    Vector2f mapPixelToCoords(const Vector2i& point, const View& view) const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert a point from target coordinates to world coordinates
    ///
    /// This function finds the 2D position that matches the
    /// given pixel of the render-target. In other words, it does
    /// the inverse of what the graphics card does, to find the
    /// initial position of a rendered pixel.
    ///
    /// Initially, both coordinate systems (world units and target pixels)
    /// match perfectly. But if you define a custom view or resize your
    /// render-target, this assertion is not true anymore, ie. a point
    /// located at (10, 50) in your render-target may map to the point
    /// (150, 75) in your 2D world -- if the view is translated by (140, 25).
    ///
    /// For render-windows, this function is typically used to find
    /// which point (or object) is located below the mouse cursor.
    ///
    /// This version uses a custom view for calculations, see the other
    /// overload of the function if you want to use the current view of the
    /// render-target.
    ///
    /// \param point Pixel to convert
    /// \param view The view to use for converting the point
    ///
    /// \return The converted point, in "world" units
    ///
    /// \see mapCoordsToPixel
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    Vector2f mapPixelToCoords(const Vector2i& point) const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert a point from target coordinates to world
    ///        coordinates, using the current view
    ///
    /// This function is an overload of the mapPixelToCoords
    /// function that implicitely uses the current view.
    /// It is equivalent to:
    /// \code
    /// target.mapPixelToCoords(point, target.getView());
    /// \endcode
    ///
    /// \param point Pixel to convert
    ///
    /// \return The converted point, in "world" coordinates
    ///
    /// \see mapCoordsToPixel
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    IntRect getViewport(const View& view) const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the viewport of a view, applied to this render target
    ///
    /// The viewport is defined in the view as a ratio, this function
    /// simply applies this ratio to the current dimensions of the
    /// render target to calculate the pixels rectangle that the viewport
    /// actually covers in the target.
    ///
    /// \param view The view for which we want to compute the viewport
    ///
    /// \return Viewport rectangle, expressed in pixels
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    const View& getDefaultView() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the default view of the render target
    ///
    /// The default view has the initial size of the render target,
    /// and never changes after the target has been created.
    ///
    /// \return The default view of the render target
    ///
    /// \see setView, getView
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    const View& getView() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the view currently in use in the render target
    ///
    /// \return The view object that is currently used
    ///
    /// \see setView, getDefaultView
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void setView(const View& view);

    ////////////////////////////////////////////////////////////
    /// \brief Change the current active view
    ///
    /// The view is like a 2D camera, it controls which part of
    /// the 2D scene is visible, and how it is viewed in the
    /// render-target.
    /// The new view will affect everything that is drawn, until
    /// another view is set.
    /// The render target keeps its own copy of the view object,
    /// so it is not necessary to keep the original one alive
    /// after calling this function.
    /// To restore the original view of the target, you can pass
    /// the result of getDefaultView() to this function.
    ///
    /// \param view New view to use
    ///
    /// \see getView, getDefaultView
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void clear(const Color& color = Color(0, 0, 0, 255));

    ////////////////////////////////////////////////////////////
    /// \brief Clear the entire target with a single color
    ///
    /// This function is usually called once every frame,
    /// to clear the previous contents of the target.
    ///
    /// \param color Fill color to use to clear the render target
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    virtual ~RenderTarget();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
class SFML_GRAPHICS_API RenderTarget : NonCopyable

////////////////////////////////////////////////////////////
/// \brief Base class for all render targets (window, texture, ...)
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
#include <SFML/Graphics/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
#ifndef SFML_RENDERTARGET_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp

////////////////////////////////////////////////////////////
/// \class sf::RenderTarget
/// \ingroup graphics
///
/// sf::RenderTarget defines the common behaviour of all the
/// 2D render targets usable in the graphics module. It makes
/// it possible to draw 2D entities like sprites, shapes, text
/// without using any OpenGL command directly.
///
/// A sf::RenderTarget is also able to use views (sf::View),
/// which are a kind of 2D cameras. With views you can globally
/// scroll, rotate or zoom everything that is drawn,
/// without having to transform every single entity. See the
/// documentation of sf::View for more details and sample pieces of
/// code about this class.
///
/// On top of that, render targets are still able to render direct
/// OpenGL stuff. It is even possible to mix together OpenGL calls
/// and regular SFML drawing commands. When doing so, make sure that
/// OpenGL states are not messed up by calling the
/// pushGLStates/popGLStates functions.
///
/// \see sf::RenderWindow, sf::RenderTexture, sf::View
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
};

    ////////////////////////////////////////////////////////////
    View        m_defaultView; ///< Default view
    View        m_view;        ///< Current view
    StatesCache m_cache;       ///< Render states cache
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    };

        bool      glStatesSet;    ///< Are our internal GL states set yet?
        bool      viewChanged;    ///< Has the current view changed since last draw?
        BlendMode lastBlendMode;  ///< Cached blending mode
        Uint64    lastTextureId;  ///< Cached texture
        bool      useVertexCache; ///< Did we previously use the vertex cache?
        Vertex    vertexCache[VertexCacheSize]; ///< Pre-transformed vertices cache
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    struct StatesCache

    ////////////////////////////////////////////////////////////
    /// \brief Render states cache
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    virtual bool activate(bool active) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Activate the target for rendering
    ///
    /// This function must be implemented by derived classes to make
    /// their OpenGL context current; it is called by the base class
    /// everytime it's going to use OpenGL calls.
    ///
    /// \param active True to make the target active, false to deactivate it
    ///
    /// \return True if the function succeeded
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void applyShader(const Shader* shader);

    ////////////////////////////////////////////////////////////
    /// \brief Apply a new shader
    ///
    /// \param shader Shader to apply
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void applyTexture(const Texture* texture);

    ////////////////////////////////////////////////////////////
    /// \brief Apply a new texture
    ///
    /// \param texture Texture to apply
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void applyTransform(const Transform& transform);

    ////////////////////////////////////////////////////////////
    /// \brief Apply a new transform
    ///
    /// \param transform Transform to apply
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void applyBlendMode(BlendMode mode);

    ////////////////////////////////////////////////////////////
    /// \brief Apply a new blending mode
    ///
    /// \param mode Blending mode to apply
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void applyCurrentView();

    ////////////////////////////////////////////////////////////
    /// \brief Apply the current view
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void initialize();

    ////////////////////////////////////////////////////////////
    /// \brief Performs the common initialization step after creation
    ///
    /// The derived classes must call this function after the
    /// target is created and ready for drawing.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    RenderTarget();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void resetGLStates();

    ////////////////////////////////////////////////////////////
    /// \brief Reset the internal OpenGL states so that the target is ready for drawing
    ///
    /// This function can be used when you mix SFML drawing
    /// and direct OpenGL rendering, if you choose not to use
    /// pushGLStates/popGLStates. It makes sure that all OpenGL
    /// states needed by SFML are set, so that subsequent draw()
    /// calls will work as expected.
    ///
    /// Example:
    /// \code
    /// // OpenGL code here...
    /// glPushAttrib(...);
    /// window.resetGLStates();
    /// window.draw(...);
    /// window.draw(...);
    /// glPopAttrib(...);
    /// // OpenGL code here...
    /// \endcode
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void popGLStates();

    ////////////////////////////////////////////////////////////
    /// \brief Restore the previously saved OpenGL render states and matrices
    ///
    /// See the description of pushGLStates to get a detailed
    /// description of these functions.
    ///
    /// \see pushGLStates
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void pushGLStates();

    ////////////////////////////////////////////////////////////
    /// \brief Save the current OpenGL render states and matrices
    ///
    /// This function can be used when you mix SFML drawing
    /// and direct OpenGL rendering. Combined with PopGLStates,
    /// it ensures that:
    /// \li SFML's internal states are not messed up by your OpenGL code
    /// \li your OpenGL states are not modified by a call to a SFML function
    ///
    /// More specifically, it must be used around code that
    /// calls Draw functions. Example:
    /// \code
    /// // OpenGL code here...
    /// window.pushGLStates();
    /// window.draw(...);
    /// window.draw(...);
    /// window.popGLStates();
    /// // OpenGL code here...
    /// \endcode
    ///
    /// Note that this function is quite expensive: it saves all the
    /// possible OpenGL states and matrices, even the ones you
    /// don't care about. Therefore it should be used wisely.
    /// It is provided for convenience, but the best results will
    /// be achieved if you handle OpenGL states yourself (because
    /// you know which states have really changed, and need to be
    /// saved and restored). Take a look at the ResetGLStates
    /// function if you do so.
    ///
    /// \see popGLStates
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    virtual Vector2u getSize() const = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Return the size of the rendering region of the target
    ///
    /// \return Size in pixels
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void draw(const Vertex* vertices, unsigned int vertexCount,
              PrimitiveType type, const RenderStates& states = RenderStates::Default);

    ////////////////////////////////////////////////////////////
    /// \brief Draw primitives defined by an array of vertices
    ///
    /// \param vertices    Pointer to the vertices
    /// \param vertexCount Number of vertices in the array
    /// \param type        Type of primitives to draw
    /// \param states      Render states to use for drawing
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void draw(const Drawable& drawable, const RenderStates& states = RenderStates::Default);

    ////////////////////////////////////////////////////////////
    /// \brief Draw a drawable object to the render-target
    ///
    /// \param drawable Object to draw
    /// \param states   Render states to use for drawing
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    Vector2i mapCoordsToPixel(const Vector2f& point, const View& view) const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert a point from world coordinates to target coordinates
    ///
    /// This function finds the pixel of the render-target that matches
    /// the given 2D point. In other words, it goes through the same process
    /// as the graphics card, to compute the final position of a rendered point.
    ///
    /// Initially, both coordinate systems (world units and target pixels)
    /// match perfectly. But if you define a custom view or resize your
    /// render-target, this assertion is not true anymore, ie. a point
    /// located at (150, 75) in your 2D world may map to the pixel
    /// (10, 50) of your render-target -- if the view is translated by (140, 25).
    ///
    /// This version uses a custom view for calculations, see the other
    /// overload of the function if you want to use the current view of the
    /// render-target.
    ///
    /// \param point Point to convert
    /// \param view The view to use for converting the point
    ///
    /// \return The converted point, in target coordinates (pixels)
    ///
    /// \see mapPixelToCoords
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    Vector2i mapCoordsToPixel(const Vector2f& point) const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert a point from world coordinates to target
    ///        coordinates, using the current view
    ///
    /// This function is an overload of the mapCoordsToPixel
    /// function that implicitely uses the current view.
    /// It is equivalent to:
    /// \code
    /// target.mapCoordsToPixel(point, target.getView());
    /// \endcode
    ///
    /// \param point Point to convert
    ///
    /// \return The converted point, in target coordinates (pixels)
    ///
    /// \see mapPixelToCoords
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    Vector2f mapPixelToCoords(const Vector2i& point, const View& view) const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert a point from target coordinates to world coordinates
    ///
    /// This function finds the 2D position that matches the
    /// given pixel of the render-target. In other words, it does
    /// the inverse of what the graphics card does, to find the
    /// initial position of a rendered pixel.
    ///
    /// Initially, both coordinate systems (world units and target pixels)
    /// match perfectly. But if you define a custom view or resize your
    /// render-target, this assertion is not true anymore, ie. a point
    /// located at (10, 50) in your render-target may map to the point
    /// (150, 75) in your 2D world -- if the view is translated by (140, 25).
    ///
    /// For render-windows, this function is typically used to find
    /// which point (or object) is located below the mouse cursor.
    ///
    /// This version uses a custom view for calculations, see the other
    /// overload of the function if you want to use the current view of the
    /// render-target.
    ///
    /// \param point Pixel to convert
    /// \param view The view to use for converting the point
    ///
    /// \return The converted point, in "world" units
    ///
    /// \see mapCoordsToPixel
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    Vector2f mapPixelToCoords(const Vector2i& point) const;

    ////////////////////////////////////////////////////////////
    /// \brief Convert a point from target coordinates to world
    ///        coordinates, using the current view
    ///
    /// This function is an overload of the mapPixelToCoords
    /// function that implicitely uses the current view.
    /// It is equivalent to:
    /// \code
    /// target.mapPixelToCoords(point, target.getView());
    /// \endcode
    ///
    /// \param point Pixel to convert
    ///
    /// \return The converted point, in "world" coordinates
    ///
    /// \see mapCoordsToPixel
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    IntRect getViewport(const View& view) const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the viewport of a view, applied to this render target
    ///
    /// The viewport is defined in the view as a ratio, this function
    /// simply applies this ratio to the current dimensions of the
    /// render target to calculate the pixels rectangle that the viewport
    /// actually covers in the target.
    ///
    /// \param view The view for which we want to compute the viewport
    ///
    /// \return Viewport rectangle, expressed in pixels
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    const View& getDefaultView() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the default view of the render target
    ///
    /// The default view has the initial size of the render target,
    /// and never changes after the target has been created.
    ///
    /// \return The default view of the render target
    ///
    /// \see setView, getView
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    const View& getView() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the view currently in use in the render target
    ///
    /// \return The view object that is currently used
    ///
    /// \see setView, getDefaultView
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void setView(const View& view);

    ////////////////////////////////////////////////////////////
    /// \brief Change the current active view
    ///
    /// The view is like a 2D camera, it controls which part of
    /// the 2D scene is visible, and how it is viewed in the
    /// render-target.
    /// The new view will affect everything that is drawn, until
    /// another view is set.
    /// The render target keeps its own copy of the view object,
    /// so it is not necessary to keep the original one alive
    /// after calling this function.
    /// To restore the original view of the target, you can pass
    /// the result of getDefaultView() to this function.
    ///
    /// \param view New view to use
    ///
    /// \see getView, getDefaultView
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    void clear(const Color& color = Color(0, 0, 0, 255));

    ////////////////////////////////////////////////////////////
    /// \brief Clear the entire target with a single color
    ///
    /// This function is usually called once every frame,
    /// to clear the previous contents of the target.
    ///
    /// \param color Fill color to use to clear the render target
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
    virtual ~RenderTarget();

    ////////////////////////////////////////////////////////////
    /// \brief Destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
class SFML_GRAPHICS_API RenderTarget : NonCopyable

////////////////////////////////////////////////////////////
/// \brief Base class for all render targets (window, texture, ...)
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
#include <SFML/Graphics/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
#ifndef SFML_RENDERTARGET_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/RenderTarget.hpp
//

////////////////////////////////////////////////////////////
