# lab3Mirrors.py:  horizontal and vertical mirroring

def mirrorHorizontal (source):
  height = getHeight (source)
  mirrorPoint = height / 2
  for x in range (0, getWidth (source)):
    for y in range (0, mirrorPoint):
      topPixel = getPixel (source, x, y)
      bottomPixel = getPixel (source, x, height - y - 1)
      color = getColor (topPixel)
      setColor (bottomPixel, color)
  repaint (source)    

def mirrorVertical (source):
  width = getWidth (source)
  mirrorPoint = width / 2
  for y in range (0, getHeight (source)):
    for x in range (0, mirrorPoint):
      leftPixel = getPixel (source, x, y)
      rightPixel = getPixel (source, width - x - 1, y)
      color = getColor (leftPixel)
      setColor (rightPixel, color)
  repaint (source)    
  
     
  