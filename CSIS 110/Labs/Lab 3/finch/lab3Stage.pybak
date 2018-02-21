# Matt Curtin, Matt Pigliavento 

import edu.cmu.ri.createlab.terk.robot.finch.Finch as Finch

  
def dancing(Donald):
   # Dance the same sequence of moves twice
   for i in range (0,2):
    # Donald should make 4 different movements here
    
    # the following line will make myFinch move forward for 1 second.
    Donald.setWheelVelocities(255, 255, 1000)
    
    # the following line will make myFinch move forward for 1 second.
    Donald.setWheelVelocities(-255, -255, 2000)
    
    # the following line will make Squirtle (myFinch) turn about 90 degrees left.
    Donald.setWheelVelocities(-255, 255, 400)
    
    # the following line will make myFinch move forward for 1 second.
    Donald.setWheelVelocities(255, 255, 1000)
    
    printNow("dancing")
    
def singing(Donald):
  # Have will say the same thing twice
  for i in range (0,2):
     # Have Donald say "Come With Me If You Want To Live" then sleep for three seconds
     Donald.saySomething("Come With me If You Want To Live")
     
     Donald.sleep(3000)
     
     printNow("singing")
    
def acting(Donald):
  # Do the same thing 3 times 
  for i in range(0,3):
    # use buzz, setLED once each
    # Donald's beak glows green
    Donald.setLED(0,255,0)
    
    # Makes Donald buzz at 262 Hz for 2 seconds then sleep for 3 seconds
    Donald.buzz(262, 2000)
    
    Donald.sleep(3000)
    
    printNow("acting")
    
# Main function; should call the other 3 functions
def performance():
  #  Create a finch
  Donald = Finch()
  
  # Dance, sing, and act:
  
  dancing(Donald)
  
  
  singing(Donald)
  
  
  acting(Donald)
  
  # Shut down the finch
  Donald.quit()
