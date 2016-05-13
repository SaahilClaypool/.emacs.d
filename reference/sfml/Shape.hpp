_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp

////////////////////////////////////////////////////////////
/// \class sf::Shape
/// \ingroup graphics
///
/// sf::Shape is a drawable class that allows to define and
/// display a custom convex shape on a render target.
/// It's only an abstract base, it needs to be specialized for
/// concrete types of shapes (circle, rectangle, convex polygon,
/// star, ...).
///
/// In addition to the attributes provided by the specialized
/// shape classes, a shape always has the following attributes:
/// \li a texture
/// \li a texture rectangle
/// \li a fill color
/// \li an outline color
/// \li an outline thickness
///
/// Each feature is optional, and can be disabled easily:
/// \li the texture can be null
/// \li the fill/outline colors can be sf::Color::Transparent
/// \li the outline thickness can be zero
///
/// You can write your own derived shape class, there are only
/// two virtual functions to override:
/// \li getPointCount must return the number of points of the shape
/// \li getPoint must return the points of the shape
///
/// \see sf::RectangleShape, sf::CircleShape, sf::ConvexShape, sf::Transformable
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
};

    const Texture* m_texture;          ///< Texture of the shape
    IntRect        m_textureRect;      ///< Rectangle defining the area of the source texture to display
    Color          m_fillColor;        ///< Fill color
    Color          m_outlineColor;     ///< Outline color
    float          m_outlineThickness; ///< Thickness of the shape's outline
    VertexArray    m_vertices;         ///< Vertex array containing the fill geometry
    VertexArray    m_outlineVertices;  ///< Vertex array containing the outline geometry
    FloatRect      m_insideBounds;     ///< Bounding rectangle of the inside (fill)
    FloatRect      m_bounds;           ///< Bounding rectangle of the whole shape (outline + fill)
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
    void updateOutlineColors();

    ////////////////////////////////////////////////////////////
    /// \brief Update the outline vertices' color
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
    void updateOutline();

    ////////////////////////////////////////////////////////////
    /// \brief Update the outline vertices' position
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
    void updateTexCoords();

    ////////////////////////////////////////////////////////////
    /// \brief Update the fill vertices' texture coordinates
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
    void updateFillColors();

    ////////////////////////////////////////////////////////////
    /// \brief Update the fill vertices' color
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
    virtual void draw(RenderTarget& target, RenderStates states) const;

    ////////////////////////////////////////////////////////////
    /// \brief Draw the shape to a render target
    ///
    /// \param target Render target to draw to
    /// \param states Current render states
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
    void update();

    ////////////////////////////////////////////////////////////
    /// \brief Recompute the internal geometry of the shape
    ///
    /// This function must be called by the derived class everytime
    /// the shape's points change (ie. the result of either
    /// getPointCount or getPoint is different).
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
    Shape();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
    FloatRect getGlobalBounds() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the global bounding rectangle of the entity
    ///
    /// The returned rectangle is in global coordinates, which means
    /// that it takes in account the transformations (translation,
    /// rotation, scale, ...) that are applied to the entity.
    /// In other words, this function returns the bounds of the
    /// sprite in the global 2D world's coordinate system.
    ///
    /// \return Global bounding rectangle of the entity
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
    FloatRect getLocalBounds() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the local bounding rectangle of the entity
    ///
    /// The returned rectangle is in local coordinates, which means
    /// that it ignores the transformations (translation, rotation,
    /// scale, ...) that are applied to the entity.
    /// In other words, this function returns the bounds of the
    /// entity in the entity's coordinate system.
    ///
    /// \return Local bounding rectangle of the entity
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
    virtual Vector2f getPoint(unsigned int index) const = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Get a point of the shape
    ///
    /// The result is undefined if \a index is out of the valid range.
    ///
    /// \param index Index of the point to get, in range [0 .. getPointCount() - 1]
    ///
    /// \return Index-th point of the shape
    ///
    /// \see getPointCount
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
    virtual unsigned int getPointCount() const = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Get the total number of points of the shape
    ///
    /// \return Number of points of the shape
    ///
    /// \see getPoint
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
    float getOutlineThickness() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the outline thickness of the shape
    ///
    /// \return Outline thickness of the shape
    ///
    /// \see setOutlineThickness
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
    const Color& getOutlineColor() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the outline color of the shape
    ///
    /// \return Outline color of the shape
    ///
    /// \see setOutlineColor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
    const Color& getFillColor() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the fill color of the shape
    ///
    /// \return Fill color of the shape
    ///
    /// \see setFillColor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
    const IntRect& getTextureRect() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the sub-rectangle of the texture displayed by the shape
    ///
    /// \return Texture rectangle of the shape
    ///
    /// \see setTextureRect
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
    const Texture* getTexture() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the source texture of the shape
    ///
    /// If the shape has no source texture, a NULL pointer is returned.
    /// The returned pointer is const, which means that you can't
    /// modify the texture when you retrieve it with this function.
    ///
    /// \return Pointer to the shape's texture
    ///
    /// \see setTexture
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
    void setOutlineThickness(float thickness);

    ////////////////////////////////////////////////////////////
    /// \brief Set the thickness of the shape's outline
    ///
    /// Note that negative values are allowed (so that the outline
    /// expands towards the center of the shape), and using zero
    /// disables the outline.
    /// By default, the outline thickness is 0.
    ///
    /// \param thickness New outline thickness
    ///
    /// \see getOutlineThickness
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
    void setOutlineColor(const Color& color);

    ////////////////////////////////////////////////////////////
    /// \brief Set the outline color of the shape
    ///
    /// By default, the shape's outline color is opaque white.
    ///
    /// \param color New outline color of the shape
    ///
    /// \see getOutlineColor, setFillColor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
    void setFillColor(const Color& color);

    ////////////////////////////////////////////////////////////
    /// \brief Set the fill color of the shape
    ///
    /// This color is modulated (multiplied) with the shape's
    /// texture if any. It can be used to colorize the shape,
    /// or change its global opacity.
    /// You can use sf::Color::Transparent to make the inside of
    /// the shape transparent, and have the outline alone.
    /// By default, the shape's fill color is opaque white.
    ///
    /// \param color New color of the shape
    ///
    /// \see getFillColor, setOutlineColor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
    void setTextureRect(const IntRect& rect);

    ////////////////////////////////////////////////////////////
    /// \brief Set the sub-rectangle of the texture that the shape will display
    ///
    /// The texture rect is useful when you don't want to display
    /// the whole texture, but rather a part of it.
    /// By default, the texture rect covers the entire texture.
    ///
    /// \param rect Rectangle defining the region of the texture to display
    ///
    /// \see getTextureRect, setTexture
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
    void setTexture(const Texture* texture, bool resetRect = false);

    ////////////////////////////////////////////////////////////
    /// \brief Change the source texture of the shape
    ///
    /// The \a texture argument refers to a texture that must
    /// exist as long as the shape uses it. Indeed, the shape
    /// doesn't store its own copy of the texture, but rather keeps
    /// a pointer to the one that you passed to this function.
    /// If the source texture is destroyed and the shape tries to
    /// use it, the behaviour is undefined.
    /// \a texture can be NULL to disable texturing.
    /// If \a resetRect is true, the TextureRect property of
    /// the shape is automatically adjusted to the size of the new
    /// texture. If it is false, the texture rect is left unchanged.
    ///
    /// \param texture   New texture
    /// \param resetRect Should the texture rect be reset to the size of the new texture?
    ///
    /// \see getTexture, setTextureRect
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
    virtual ~Shape();

    ////////////////////////////////////////////////////////////
    /// \brief Virtual destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
class SFML_GRAPHICS_API Shape : public Drawable, public Transformable

////////////////////////////////////////////////////////////
/// \brief Base class for textured shapes with outline
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
#ifndef SFML_SHAPE_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Graphics/Shape.hpp
//

////////////////////////////////////////////////////////////
