#include <Servo.h>;
#include <SPI.h>;
#include <Pixy.h>;
Pixy pixy;
Servo servoRight;
Servo servoLeft;
int touchingLeft;
int touchingRight;
int seeingLeft;
int seeingRight;
void setup(){
    servoRight.attach(ServoRight);
    servoLeft.attach(ServoLeft);
    pinMode(LED, OUTPUT);
    Blink();
    Serial.begin(9600);
    pixy.init();
}	
void loop(){
    LightOn();
    ReadSensors();
    if (FoundObject()){
        
    }	
    else if (SeeingBoth()){
        MoveBackward(100);
    }	
    else if (SeeingLeft()){
        TurnRight(90);
    }	
    else if (SeeingRight()){
        TurnLeft(90);
    }	
    else {
        MoveForward(300);
    }	
    LightOff();
}	

void ReadSensors(){
    touchingLeft = WhiskerSensor(LeftWhisker);
    touchingRight = WhiskerSensor(RightWhisker);
    delay(10);
    seeingLeft = InfraredSensor(LeftInfraredSensor, LeftInfraredEmitter);
    delay(10);
    seeingRight = InfraredSensor(RightInfraredSensor, RightInfraredEmitter);
    scan();
}	
bool Touching(){
    return (touchingLeft || touchingRight);
}	
bool TouchingBoth(){
    return (touchingLeft && touchingRight);
}	
bool TouchingLeft(){
    return touchingLeft;
}	
bool TouchingRight(){
    return touchingRight;
}	
bool Seeing(){
    return (seeingLeft || seeingRight);
}	
bool SeeingBoth(){
    return (seeingLeft && seeingRight);
}	
bool SeeingLeft(){
    return seeingLeft;
}	
bool SeeingRight(){
    return seeingRight;
}	
void MoveForward(int time){
    moveForward(time);
}	
void MoveBackward(int time){
    moveBackward(time);
}	
void TurnRight(int degrees){
    turnRight(degrees);
}	
void TurnLeft(int degrees){
    turnLeft(degrees);
}	
void Idle(int time){
    idle(time);
}	
void LightOn(){
    lightOn(LED);
}	
void LightOff(){
    lightOff(LED);
}	
bool FoundObject(){
    return pixy.blocks[0]!=null;
}	
