import ev3dev.ev3 as ev3
from time import sleep as _sleep
def setup():
    global rightMotor
    global leftMotor
    global touchingLeft
    global touchingRight
    global seeingRight
    global seeingLeft
    rightMotor = ev3.LargeMotor('outA')
    leftMotor = ev3.LargeMotor('outB')
    rightMotor.reset()
    leftMotor.reset()
    touchingLeft = False
    touchingRight = False
    seeingRight = False
    seeingLeft = False
def loop():
    ReadSensors()
    MoveBackward(4)
    MoveForward(6)
    while (True): 
        TurnRight(22)
    if Seeing():
        MoveBackward(1)
    elif SeeingRight():
        TurnLeft(45)
    elif Touching():
        MoveBackward(500)
    else: 
        MoveForward(500)

def main():
    setup()
    while not (ev3.ColorSensor().value() == 0) :
    	loop()
def moveForward(time):
    global rightMotor
    global leftMotor
    rightMotor.run_direct(duty_cycle_sp=75)
    leftMotor.run_direct(duty_cycle_sp=75)
    _sleep(time*0.001)
def moveBackward(time):
    global rightMotor
    global leftMotor
    rightMotor.run_direct(duty_cycle_sp=-75)
    leftMotor.run_direct(duty_cycle_sp=-75)
    _sleep(time*0.001)
def turnLeft(degrees):
    global rightMotor
    global leftMotor
    rightMotor.run_direct(duty_cycle_sp=37)
    leftMotor.run_direct(duty_cycle_sp=-37)
    initial = ev3.GyroSensor().value()
    while ev3.GyroSensor().value() < initial + degrees :
    	_sleep(0.001)
    rightMotor.reset()
    leftMotor.reset()
def turnRight(degrees):
    global rightMotor
    global leftMotor
    rightMotor.run_direct(duty_cycle_sp=-37)
    leftMotor.run_direct(duty_cycle_sp=37)
    initial = ev3.GyroSensor().value()
    while ev3.GyroSensor().value() > initial - degrees :
    	_sleep(0.001)
    rightMotor.reset()
    leftMotor.reset()
def idle(time):
    leftMotor.reset()
    rightMotor.reset()
    _sleep(time*0.001)
def ReadSensors():
    global touchingLeft
    global touchingRight
    global seeingLeft
    global seeingRight
    touchingLeft = ev3.TouchSensor().value()
    touchingRight = ev3.TouchSensor().value()
    seeingLeft = ev3.UltrasonicSensor().value() < 120
    seeingRight = ev3.UltrasonicSensor().value() < 120
def Touching():
    global touchingLeft
    global touchingRight
    return touchingLeft or touchingRight
def TouchingBoth():
    global touchingLeft
    global touchingRight
    return touchingLeft and touchingRight
def TouchingLeft():
    global touchingLeft
    return touchingLeft
def TouchingRight():
    global touchingRight
    return touchingRight
def Seeing():
    global seeingLeft
    global seeingRight
    return seeingLeft or seeingRight
def SeeingBoth():
    global seeingLeft
    global seeingRight
    return seeingLeft  and  seeingRight
def SeeingLeft():
    global seeingLeft
    return seeingLeft
def SeeingRight():
    global seeingRight
    return seeingRight
def MoveForward(time):
    moveForward(time)
def MoveBackward(time):
    moveBackward(time)
def TurnRight(degrees):
    turnRight(degrees)
def TurnLeft(degrees):
    turnLeft(degrees)
def Idle(time):
    idle(time)
main()