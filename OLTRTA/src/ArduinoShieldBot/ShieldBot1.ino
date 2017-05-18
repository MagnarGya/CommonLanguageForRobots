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
    servoRight.attach(12);
    servoLeft.attach(13);
    pinMode(8, OUTPUT);
    Blink();
    Serial.begin(9600);
}	
void loop(){
    ReadSensors();
    if (SeeingLeft()){
        TurnRight(45);
    }	
    else if (SeeingRight()){
        TurnLeft(45);
    }	
    else if (Touching()){
        MoveBackward(500);
    }	
    else {
        MoveForward(500);
    }	
}	

void moveForward(int time){
    servoRight.writeMicroseconds(1300);
    delay(time);
    servoLeft.writeMicroseconds(1500);
    servoRight.writeMicroseconds(1500);
    delay(5);
}	
void moveBackward(int time){
    servoRight.writeMicroseconds(1700);
    delay(time);
    servoLeft.writeMicroseconds(1500);
    servoRight.writeMicroseconds(1500);
    delay(5);
}	
void turnLeft(int degrees){
    servoRight.writeMicroseconds(1300);
    delay(degrees*5);
    servoLeft.writeMicroseconds(1500);
    servoRight.writeMicroseconds(1500);
    delay(5);
}	
void turnRight(int degrees){
    servoRight.writeMicroseconds(1700);
    delay(degrees*5);
    servoLeft.writeMicroseconds(1500);
    servoRight.writeMicroseconds(1500);
    delay(5);
}	
int InfraredSensor(int pin,int pout){
    delay(1);
    int ir = digitalRead(pin);
    return !(ir);
}	
int WhiskerSensor(int pin){
    int w = digitalRead(pin);
    return !(w);
}	
void idle(int time){
    servoRight.writeMicroseconds(1500);
    delay(time);
}	
void lightOn(int pout){
    digitalWrite(pout, HIGH);
}	
void lightOff(int pout){
    digitalWrite(pout, LOW);
}	
void ReadSensors(){
    touchingLeft = WhiskerSensor(10);
    touchingRight = WhiskerSensor(11);
    delay(10);
    seeingLeft = InfraredSensor(5, 4);
    delay(10);
    seeingRight = InfraredSensor(3, 2);
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
    lightOn(8);
}	
void LightOff(){
    lightOff(8);
}	
