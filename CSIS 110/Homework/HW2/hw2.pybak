# Matthew Pigliavento, October 3, 2015, hw2.py, this program creates a collage of four images
# (original, negative, grayscale, and line drawing), then mirrors it horizontally

# Transforms image in to its negative 
def negative(picture):
  for pixel in getPixels(picture):
    r = getRed(pixel)
    g = getGreen (pixel)
    b = getBlue(pixel)
    nucolor = makeColor(255-r, 255-g, 255-b)
    setColor (pixel, nucolor)

# Mirrors image horizontally 
def mirrorHorizontal(source):
  mirrorpoint = int(getHeight(source)/2)
  for yOffset in range(0,mirrorpoint):
    for x in range(1,getWidth(source)):
      pbottom = getPixel(source,x,yOffset+mirrorpoint)
      ptop = getPixel(source,x,mirrorpoint-yOffset)
      setColor(pbottom,getColor(ptop))

# Converts image to grayscale        
def grayScale(picture):
  for p in getPixels(picture):
    intensity = (getRed(p)+getGreen(p)+getBlue(p))/3
    setColor(p,makeColor(intensity,intensity,intensity))   

# Converts image in to a line drawing        
def edge(source):
  for px in getPixels(source):
    x = getX(px)
    y = getY(px)
    if y < getHeight(source)-1 and x < getWidth(source)-1:
      sum = getRed(px)+getGreen(px)+getBlue(px)
      botrt = getPixel(source,x+1,y+1)
      sum2 = getRed(botrt)+getGreen(botrt)+getBlue(botrt)
      diff = abs(sum2-sum)
      newcolor = makeColor(diff,diff,diff)
      setColor(px,newcolor)    
    
# Creates a collage of four versions of "snake.jpg", then mirrors horizontally  
def createCollage():
  # Creates an empty canvas, 4x width and 2x height of original
  canvas = makeEmptyPicture (1200, 600)

  # Copies original image into the blank canvas
  orig = makePicture (getMediaPath("snake.jpg"))
  copyInto (orig, canvas, 0, 0)
  
  # Converts original image to negative        
  negative (orig)
  copyInto (orig, canvas, 300, 0)
  
  # Converts original image to grayscale
  grayScale(orig)
  copyInto (orig, canvas, 600, 0)
  
  # Converts original image to a line drawing
  edge(orig)
  copyInto (orig, canvas, 900, 0)
    
  # Mirrors across horizontal axis
  mirrorHorizontal (canvas)

  # Displays finished collage
  show (canvas)
  
