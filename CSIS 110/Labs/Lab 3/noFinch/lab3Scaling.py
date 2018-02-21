# lab3Scaling.py:  scaling an image up (2x) and down (0.5x)

# Copies "source" onto "target" starting at position "targX, targY" in "target" 
# (code from book, Program 30)
def copy (source, target, targX, targY):
  targetX = targX
  for sourceX in range (0, getWidth(source)):
    targetY = targY
    for sourceY in range (0, getHeight(source)):
      px = getPixel (source, sourceX, sourceY)
      tx = getPixel (target, targetX, targetY)
      setColor (tx, getColor(px))
      targetY = targetY + 1
    targetX = targetX + 1

def shrink (source):
  
  # set up target picture
  target = makeEmptyPicture( getWidth(source)/2, getHeight(source)/2)
  
  # do the actual copying
  sourceX = 0
  for targetX in range (0, getWidth(source)/2):
    sourceY = 0
    for targetY in range (0, getHeight(source)/2):
      color = getColor (getPixel (source, sourceX, sourceY))
      setColor (getPixel (target, targetX, targetY), color)
      sourceY = sourceY + 2
    sourceX = sourceX + 2
  show (target)
  return (target)    
  
def grow (source):
  
  # set up target picture
  target = makeEmptyPicture( getWidth(source) * 2, getHeight(source) * 2)
  
  # do the actual copying
  sourceX = 0
  for targetX in range (0, getWidth(source) * 2):
    sourceY = 0
    for targetY in range (0, getHeight(source) * 2):
      color = getColor (getPixel (source, int(sourceX), int(sourceY)))
      setColor (getPixel (target, targetX, targetY), color)
      sourceY = sourceY + 0.5
    sourceX = sourceX + 0.5
  show (target)
  return (target)      

  

    
  
  