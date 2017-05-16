import ev3dev.ev3 as ev3
LargeMotor rightMotor
LargeMotor leftMotor
boolean touchingLeft
boolean touchingRight
boolean seeingLeft
boolean seeingRight
def setup():
    rightMotor = ev3.LargeMotor('outA')
    leftMotor = ev3.LargeMotor('outB')
          
def loop():
    

def moveForward(int time):
    rightMotor.run_timed(time_sp=time, duty_cycle_sp=75)
    leftMotor.run_timed(time_sp=time, duty_cycle_sp=75)
def moveBackward(int time):
    leftMotor.run_timed(time_sp=time, duty_cycle_sp=-75)
def turnLeft(int degrees):
    leftMotor.run_timed(time_sp=1000, duty_cycle_sp=-75)
def turnRight(int degrees):
    leftMotor.run_timed(time_sp=1000, duty_cycle_sp=75)
def idle(int time):
    leftMotor.run_timed(time_sp=time, duty_cycle_sp=0)
def ReadSensors():
    touchingLeft = ev3.TouchSensor().is_pressed()
    touchingRight = ev3.TouchSensor().is_pressed()
    seeingLeft = ev3.UltrasonicSensor().distance_centimeters() < 5
    seeingRight = ev3.UltrasonicSensor().distance_centimeters() < 5
def Touching():
    return touchingLeft || touchingRight
def TouchingBoth():
    return touchingLeft && touchingRight
def TouchingLeft():
    return touchingLeft
def TouchingRight():
    return touchingRight
def Seeing():
    return seeingLeft || seeingRight
def SeeingBoth():
    return seeingLeft && seeingRight
def SeeingLeft():
    return seeingLeft
def SeeingRight():
    return seeingRight
def MoveForward(int time):
    moveForward(time)
def MoveBackward(int time):
    moveBackward(time)
def TurnRight(int degrees):
    turnRight(degrees)
def TurnLeft(int degrees):
    turnLeft(degrees)
def Idle(int time):
    idle(time)
