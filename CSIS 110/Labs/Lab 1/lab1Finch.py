# Names: Matthew Pigliavento, Sean O'Connor

# the following line is required for the Finch to work
import edu.cmu.ri.createlab.terk.robot.finch.Finch as Finch

# movements, lab 1

def moveFinch():
  # the following line creates a Finch, called myFinch, for Python to use
  myFinch = Finch()
  
  # the following line will make myFinch move forward for 1 second. 
  myFinch.setWheelVelocities(255,255,1000)
  
  # the following line will make myFinch move backwards for 2 second. 
  myFinch.setWheelVelocities(-255,-255,2000)
  
  #the following line will make Squirtle (myFinch) turn about 90 degrees left.
  myFinch.setWheelVelocities(-255,255,400)
  
  # the following line will make myFinch move forward for 1 second. 
  myFinch.setWheelVelocities(255,255,1000)
  
  # Always quit the Finch before the program ends
  myFinch.quit()

